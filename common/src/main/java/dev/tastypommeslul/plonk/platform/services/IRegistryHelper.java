package dev.tastypommeslul.plonk.platform.services;

import dev.tastypommeslul.plonk.Constants;
import dev.tastypommeslul.plonk.platform.util.BlockItemRegistryHandle;
import dev.tastypommeslul.plonk.platform.util.RegistryHandle;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public interface IRegistryHelper {

    default <T extends Block> BlockItemRegistryHandle<T> registerBlockWithItem(String name, Function<BlockBehaviour.Properties, T> block) {
        return registerBlockWithItem(name, block, BlockItem::new);
    }

    default <T extends Block> BlockItemRegistryHandle<T> registerBlockWithItem(String name, Function<BlockBehaviour.Properties, T> block, BiFunction<Block, Item.Properties, BlockItem> item) {
        RegistryHandle<T> blockHandle = registerBlock(name, block);
        RegistryHandle<BlockItem> itemHandle = registerBlockItem(name, blockHandle, item);
        return new BlockItemRegistryHandle<>(blockHandle, itemHandle);
    }
    <T extends Item> RegistryHandle<T> registerItem(String name, Function<Item.Properties, T> item);

    <T extends BlockItem> RegistryHandle<T> registerBlockItem(String name, RegistryHandle<? extends Block> block, BiFunction<Block, Item.Properties, T> item);
    <T extends Block> RegistryHandle<T> registerBlock(String name, Function<BlockBehaviour.Properties, T> block);

    RegistryHandle<CreativeModeTab> registerCreativeTab(String name, Supplier<ItemStack> icon, Consumer<CreativeTabOutput> entries);

    static ResourceKey<Block> blockKey(String name) {
        return ResourceKey.create(Registries.BLOCK, Constants.id(name));
    }

    static ResourceKey<Item> itemKey(String name) {
        return ResourceKey.create(Registries.ITEM, Constants.id(name));
    }

    @FunctionalInterface
    interface CreativeTabOutput {
        void accept(ItemLike itemLike);
    }
}
