package dev.tastypommeslul.plonk;

import dev.tastypommeslul.plonk.init.ModBlocks;
import dev.tastypommeslul.plonk.init.ModCreativeModeTabs;
import dev.tastypommeslul.plonk.init.ModItems;
import dev.tastypommeslul.plonk.platform.Services;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Items;

public class PlonkCommon {
    public static void init() {
        ModItems.init();
        ModBlocks.init();
        ModCreativeModeTabs.init();

        Constants.LOG.info("Hello from Common init on {}! we are currently in a {} environment!", Services.PLATFORM.getPlatformName(), Services.PLATFORM.getEnvironmentName());
        Constants.LOG.info("The ID for diamonds is {}", BuiltInRegistries.ITEM.getKey(Items.DIAMOND));

        if (Services.PLATFORM.isModLoaded("examplemod")) {
            Constants.LOG.info("Hello to examplemod");
        }
    }
}