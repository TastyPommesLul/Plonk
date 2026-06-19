package dev.tastypommeslul.plonk;

import dev.tastypommeslul.plonk.datagen.*;
import dev.tastypommeslul.plonk.datagen.lang.PlonkLanguageProvider;
import net.neoforged.neoforge.data.event.GatherDataEvent;

public final class PlonkDatagen {
    private PlonkDatagen() {}

    public static void onGatherClientData(GatherDataEvent.Client event) {
        event.createProvider(PlonkModelProvider::new);
        event.createProvider(PlonkDatapackProvider::new);
        event.createProvider(PlonkBlockTagProvider::new);
        event.createProvider(PlonkItemTagProvider::new);
        event.createProvider(PlonkLootTableProvider::new);
        event.createProvider(PlonkRecipeProvider.Runner::new);
        event.createProvider(PlonkEquipmentAssetProvider::new);
        event.createProvider((output) -> new PlonkLanguageProvider(output, PlonkLanguageProvider.Language.ENGLISH));
    }
}
