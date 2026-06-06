package dev.tastypommeslul.plonk;


import dev.tastypommeslul.plonk.platform.NeoForgeRegistryHelper;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class PlonkNeoForge {

    public PlonkNeoForge(IEventBus eventBus) {
        NeoForgeRegistryHelper.register(eventBus);
        PlonkCommon.init();
    }
}