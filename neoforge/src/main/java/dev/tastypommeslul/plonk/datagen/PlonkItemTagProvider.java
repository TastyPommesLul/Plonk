package dev.tastypommeslul.plonk.datagen;

import dev.tastypommeslul.plonk.Constants;
import dev.tastypommeslul.plonk.init.ModItems;
import dev.tastypommeslul.plonk.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.ItemTags;
import net.neoforged.neoforge.common.data.ItemTagsProvider;

import java.util.concurrent.CompletableFuture;

public class PlonkItemTagProvider extends ItemTagsProvider {
    public PlonkItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, Constants.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        tag(ModTags.Items.REPAIRS_ROSE_GOLD)
                .add(ModItems.ROSE_GOLD_INGOT.get());

        tag(ItemTags.SWORDS).add(ModItems.ROSE_GOLD_SWORD.get());
        tag(ItemTags.PICKAXES).add(ModItems.ROSE_GOLD_PICKAXE.get());
        tag(ItemTags.AXES).add(ModItems.ROSE_GOLD_AXE.get());
        tag(ItemTags.SHOVELS).add(ModItems.ROSE_GOLD_SHOVEL.get());
        tag(ItemTags.HOES).add(ModItems.ROSE_GOLD_HOE.get());
        tag(ItemTags.SPEARS).add(ModItems.ROSE_GOLD_SPEAR.get());

        tag(ItemTags.HEAD_ARMOR).add(ModItems.ROSE_GOLD_HELMET.get());
        tag(ItemTags.CHEST_ARMOR).add(ModItems.ROSE_GOLD_CHESTPLATE.get());
        tag(ItemTags.LEG_ARMOR).add(ModItems.ROSE_GOLD_LEGGINGS.get());
        tag(ItemTags.FOOT_ARMOR).add(ModItems.ROSE_GOLD_BOOTS.get());

        tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.ROSE_GOLD_HELMET.get())
                .add(ModItems.ROSE_GOLD_CHESTPLATE.get())
                .add(ModItems.ROSE_GOLD_LEGGINGS.get())
                .add(ModItems.ROSE_GOLD_BOOTS.get());

        tag(ItemTags.TRIM_MATERIALS).add(ModItems.ROSE_GOLD_INGOT.get());
    }
}
