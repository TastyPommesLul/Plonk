package dev.tastypommeslul.plonk;

import dev.tastypommeslul.plonk.init.ModBlocks;
import dev.tastypommeslul.plonk.init.ModCreativeModeTabs;
import dev.tastypommeslul.plonk.init.ModItems;
import dev.tastypommeslul.plonk.platform.Services;
import dev.tastypommeslul.plonk.util.creative.CreativeMods;
import dev.tastypommeslul.plonk.util.creative.VanillaTabs;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class PlonkCommon {
    public static void init() {
        ModItems.init();
        ModBlocks.init();
        ModCreativeModeTabs.init();

        initCreativeTabs();
    }

    public static void initCreativeTabs() {
        CreativeMods.insertAfter(VanillaTabs.INGREDIENTS,
                () -> new ItemStack(Items.RAW_GOLD), () -> new ItemStack(ModItems.RAW_ROSE_GOLD.get()));
        CreativeMods.insertAfter(VanillaTabs.INGREDIENTS,
                () -> new ItemStack(Items.GOLD_INGOT), () -> new ItemStack(ModItems.ROSE_GOLD_INGOT.get()));
        CreativeMods.insertAfter(VanillaTabs.INGREDIENTS,
                () -> new ItemStack(Items.GOLD_NUGGET), () -> new ItemStack(ModItems.ROSE_GOLD_NUGGET.get()));

        CreativeMods.insertAfter(VanillaTabs.COMBAT,
                () -> new ItemStack(Items.GOLDEN_SWORD), () -> new ItemStack(ModItems.ROSE_GOLD_SWORD.get()));
        CreativeMods.insertAfter(VanillaTabs.COMBAT,
                () -> new ItemStack(Items.GOLDEN_SPEAR), () -> new ItemStack(ModItems.ROSE_GOLD_SPEAR.get()));
        CreativeMods.insertAfter(VanillaTabs.COMBAT,
                () -> new ItemStack(Items.GOLDEN_AXE), () -> new ItemStack(ModItems.ROSE_GOLD_AXE.get()));

        CreativeMods.insertAfter(VanillaTabs.TOOLS_AND_UTILITIES,
                () -> new ItemStack(Items.GOLDEN_HOE), () -> new ItemStack(ModItems.ROSE_GOLD_SHOVEL.get()));
        CreativeMods.insertAfter(VanillaTabs.TOOLS_AND_UTILITIES,
                () -> new ItemStack(ModItems.ROSE_GOLD_SHOVEL.get()), () -> new ItemStack(ModItems.ROSE_GOLD_PICKAXE.get()));
        CreativeMods.insertAfter(VanillaTabs.TOOLS_AND_UTILITIES,
                () -> new ItemStack(ModItems.ROSE_GOLD_PICKAXE.get()), () -> new ItemStack(ModItems.ROSE_GOLD_AXE.get()));
        CreativeMods.insertAfter(VanillaTabs.TOOLS_AND_UTILITIES,
                () -> new ItemStack(ModItems.ROSE_GOLD_AXE.get()), () -> new ItemStack(ModItems.ROSE_GOLD_HOE.get()));


        CreativeMods.insertAfter(VanillaTabs.COMBAT,
                () -> new ItemStack(Items.GOLDEN_BOOTS), () -> new ItemStack(ModItems.ROSE_GOLD_HELMET.get()));
        CreativeMods.insertAfter(VanillaTabs.COMBAT,
                () -> new ItemStack(ModItems.ROSE_GOLD_HELMET.get()), () -> new ItemStack(ModItems.ROSE_GOLD_CHESTPLATE.get()));
        CreativeMods.insertAfter(VanillaTabs.COMBAT,
                () -> new ItemStack(ModItems.ROSE_GOLD_CHESTPLATE.get()), () -> new ItemStack(ModItems.ROSE_GOLD_LEGGINGS.get()));
        CreativeMods.insertAfter(VanillaTabs.COMBAT,
                () -> new ItemStack(ModItems.ROSE_GOLD_LEGGINGS.get()), () -> new ItemStack(ModItems.ROSE_GOLD_BOOTS.get()));

        CreativeMods.insertAfter(VanillaTabs.FOOD_AND_DRINKS,
                () -> new ItemStack(Items.GOLDEN_APPLE), () -> new ItemStack(ModItems.ROSE_GOLD_APPLE.get()));
    }
}