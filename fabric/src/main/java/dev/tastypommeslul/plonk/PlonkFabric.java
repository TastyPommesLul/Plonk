package dev.tastypommeslul.plonk;

import dev.tastypommeslul.plonk.util.creative.CreativeMods;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;

public class PlonkFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {
        Constants.LOG.info("Hello Fabric world!");
        PlonkCommon.init();

        CreativeMods.getModifications().forEach((tabKey, entries) -> {
            CreativeModeTabEvents.modifyOutputEvent(tabKey).register(event -> {
                for (var entry : entries) {
                    switch (entry) {
                        case CreativeMods.TabEntry.After e  -> event.insertAfter(e.anchor().get(), e.toInsert().get());
                        case CreativeMods.TabEntry.Before e -> event.insertBefore(e.anchor().get(), e.toInsert().get());
                        case CreativeMods.TabEntry.Append e -> event.accept(e.toInsert().get());
                        case CreativeMods.TabEntry.Prepend e -> event.prepend(e.toInsert().get());
                    }
                }
            });
        });
    }
}
