package dev.tastypommeslul.plonk.util;

import dev.tastypommeslul.plonk.Constants;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public interface ModTags {
    interface Items {
        TagKey<Item> REPAIRS_ROSE_GOLD = create("repairs_rose_gold");

        private static TagKey<Item> create(String name) {
            return TagKey.create(Registries.ITEM, Constants.id(name));
        }
    }
    interface Blocks {

        private static TagKey<Block> create(String name) {
            return TagKey.create(Registries.BLOCK, Constants.id(name));
        }
    }
}
