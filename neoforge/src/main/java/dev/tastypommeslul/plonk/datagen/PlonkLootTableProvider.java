package dev.tastypommeslul.plonk.datagen;

import dev.tastypommeslul.plonk.platform.NeoForgeRegistryHelper;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import org.jspecify.annotations.NonNull;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class PlonkLootTableProvider extends LootTableProvider {
    public PlonkLootTableProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(
                output,
                Set.of(),
                List.of(
                        new SubProviderEntry(PlonkBlockLootTableSubProvider::new, LootContextParamSets.BLOCK)
                ),
                registries
        );
    }

    private static final class PlonkBlockLootTableSubProvider extends BlockLootSubProvider {
        public PlonkBlockLootTableSubProvider(HolderLookup.Provider registries) {
            super(Set.of(), FeatureFlags.DEFAULT_FLAGS, registries);
        }

        @Override
        protected void generate() {

        }

        @Override
        protected @NonNull Iterable<Block> getKnownBlocks() {
            return NeoForgeRegistryHelper.BLOCKS.getEntries()
                    .stream()
                    .map(entry -> (Block) entry.value())
                    .toList();
        }
    }
}
