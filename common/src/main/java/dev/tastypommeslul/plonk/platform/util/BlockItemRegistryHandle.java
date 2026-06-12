package dev.tastypommeslul.plonk.platform.util;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;

public record BlockItemRegistryHandle<T extends Block>(
        RegistryHandle<T> block,
        RegistryHandle<? extends BlockItem> item
) {}
