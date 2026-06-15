package dev.tastypommeslul.plonk;

import dev.tastypommeslul.plonk.datagen.*;
import dev.tastypommeslul.plonk.datagen.lang.PlonkEnglishProvider;
import net.neoforged.neoforge.data.event.GatherDataEvent;

public final class PlonkDatagen {
    private PlonkDatagen() {}

    public static void onGatherClientData(GatherDataEvent.Client event) {
        event.createProvider(PlonkModelProvider::new);
        event.createProvider(PlonkEnglishProvider::new);
        event.createProvider(PlonkBlockTagProvider::new);
        event.createProvider(PlonkItemTagProvider::new);
        event.createProvider(PlonkLootTableProvider::new);
        event.createProvider(PlonkRecipeProvider.Runner::new);
    }
}
