package dev.tastypommeslul.plonk;

import dev.tastypommeslul.plonk.init.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class PlonkFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {
        Constants.LOG.info("Hello Fabric world!");
        PlonkCommon.init();

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(event -> {
            event.insertAfter(new ItemStack(Items.RAW_GOLD), new ItemStack(ModItems.RAW_ROSE_GOLD.get()));
            event.insertAfter(new ItemStack(Items.GOLD_NUGGET), new ItemStack(ModItems.ROSE_GOLD_NUGGET.get()));
            event.insertAfter(new ItemStack(Items.GOLD_INGOT), new ItemStack(ModItems.ROSE_GOLD_INGOT.get()));
        });

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(event -> {
            event.insertAfter(new ItemStack(Items.GOLDEN_HOE), new ItemStack(ModItems.ROSE_GOLD_SHOVEL.get()));
            event.insertAfter(new ItemStack(ModItems.ROSE_GOLD_SHOVEL.get()), new ItemStack(ModItems.ROSE_GOLD_PICKAXE.get()));
            event.insertAfter(new ItemStack(ModItems.ROSE_GOLD_PICKAXE.get()), new ItemStack(ModItems.ROSE_GOLD_AXE.get()));
            event.insertAfter(new ItemStack(ModItems.ROSE_GOLD_AXE.get()), new ItemStack(ModItems.ROSE_GOLD_HOE.get()));
        });

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.COMBAT).register(event -> {
            event.insertAfter(new ItemStack(Items.GOLDEN_SWORD), new ItemStack(ModItems.ROSE_GOLD_SWORD.get()));
            event.insertAfter(new ItemStack(Items.GOLDEN_SPEAR), new ItemStack(ModItems.ROSE_GOLD_SPEAR.get()));
            event.insertAfter(new ItemStack(Items.GOLDEN_AXE), new ItemStack(ModItems.ROSE_GOLD_AXE.get()));
        });

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.FOOD_AND_DRINKS).register(event -> {
            event.insertAfter(new ItemStack(Items.GOLDEN_APPLE), new ItemStack(ModItems.ROSE_GOLD_APPLE.get()));
        });
    }
}
