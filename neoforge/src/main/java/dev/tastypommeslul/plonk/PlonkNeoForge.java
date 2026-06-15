package dev.tastypommeslul.plonk;


import dev.tastypommeslul.plonk.init.ModItems;
import dev.tastypommeslul.plonk.platform.NeoForgeRegistryHelper;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

import java.util.List;

@Mod(Constants.MOD_ID)
public class PlonkNeoForge {

    public PlonkNeoForge(IEventBus eventBus) {
        NeoForgeRegistryHelper.register(eventBus);
        PlonkCommon.init();

        eventBus.addListener(this::addCreative);
        eventBus.addListener(PlonkDatagen::onGatherClientData);
    }

    public void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.insertAfter(new ItemStack(Items.RAW_GOLD), new ItemStack(ModItems.RAW_ROSE_GOLD.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(Items.GOLD_NUGGET), new ItemStack(ModItems.ROSE_GOLD_NUGGET.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(Items.GOLD_INGOT), new ItemStack(ModItems.ROSE_GOLD_INGOT.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.insertAfter(new ItemStack(Items.GOLDEN_HOE), new ItemStack(ModItems.ROSE_GOLD_SHOVEL.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(ModItems.ROSE_GOLD_SHOVEL.get()), new ItemStack(ModItems.ROSE_GOLD_PICKAXE.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(ModItems.ROSE_GOLD_PICKAXE.get()), new ItemStack(ModItems.ROSE_GOLD_AXE.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(ModItems.ROSE_GOLD_AXE.get()), new ItemStack(ModItems.ROSE_GOLD_HOE.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
        if (event.getTabKey() == CreativeModeTabs.COMBAT) {
            event.insertAfter(new ItemStack(Items.GOLDEN_SWORD), new ItemStack(ModItems.ROSE_GOLD_SWORD.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(Items.GOLDEN_SPEAR), new ItemStack(ModItems.ROSE_GOLD_SPEAR.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(Items.GOLDEN_AXE), new ItemStack(ModItems.ROSE_GOLD_AXE.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
        if (event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
            event.insertAfter(new ItemStack(Items.GOLDEN_APPLE), new ItemStack(ModItems.ROSE_GOLD_APPLE.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
    }

}