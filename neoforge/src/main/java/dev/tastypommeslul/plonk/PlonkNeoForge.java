package dev.tastypommeslul.plonk;


import dev.tastypommeslul.plonk.platform.NeoForgeRegistryHelper;
import dev.tastypommeslul.plonk.util.creative.CreativeMods;
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
        List<CreativeMods.TabEntry> entries =
                CreativeMods.getModifications().get(event.getTabKey());

        if (entries == null) return;

        for (var entry : entries) {
            switch (entry) {
                case CreativeMods.TabEntry.After e  -> event.insertAfter(e.anchor().get(), e.toInsert().get(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                case CreativeMods.TabEntry.Before e -> event.insertBefore(e.anchor().get(), e.toInsert().get(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                case CreativeMods.TabEntry.Append e -> event.accept(e.toInsert().get(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                case CreativeMods.TabEntry.Prepend e -> event.insertFirst(e.toInsert().get(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            }
        }
    }

}