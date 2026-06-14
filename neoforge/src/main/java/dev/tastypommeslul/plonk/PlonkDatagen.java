package dev.tastypommeslul.plonk;

import dev.tastypommeslul.plonk.datagen.PlonkBlockTagProvider;
import dev.tastypommeslul.plonk.datagen.PlonkLootTableProvider;
import dev.tastypommeslul.plonk.datagen.PlonkModelProvider;
import dev.tastypommeslul.plonk.datagen.lang.PlonkEnglishProvider;
import net.neoforged.neoforge.data.event.GatherDataEvent;

public final class PlonkDatagen {
    private PlonkDatagen() {}

    public static void onGatherClientData(GatherDataEvent.Client event) {
        event.createProvider(PlonkModelProvider::new);
        event.createProvider(PlonkEnglishProvider::new);
        event.createProvider(PlonkBlockTagProvider::new);
        event.createProvider(PlonkLootTableProvider::new);
    }
}
