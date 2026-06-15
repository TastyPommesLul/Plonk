package dev.tastypommeslul.plonk.init;

import dev.tastypommeslul.plonk.platform.Services;
import dev.tastypommeslul.plonk.platform.util.RegistryHandle;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {

    public static final RegistryHandle<CreativeModeTab> PLONK_MATERIALS = Services.REGISTRY.registerSimpleCreativeTab("plonk_materials",
            () -> new ItemStack(ModItems.ROSE_GOLD_INGOT.get()), entries -> {
        entries.accept(ModItems.RAW_ROSE_GOLD);
        entries.accept(ModItems.ROSE_GOLD_INGOT);
        entries.accept(ModItems.ROSE_GOLD_NUGGET);
    });

    public static final RegistryHandle<CreativeModeTab> PLONK_TOOLS_ARMOR = Services.REGISTRY.registerSimpleCreativeTab("plonk_tools_armor",
            () -> new ItemStack(ModItems.ROSE_GOLD_SWORD.get()), entries -> {
       entries.accept(ModItems.ROSE_GOLD_SWORD);
       entries.accept(ModItems.ROSE_GOLD_PICKAXE);
       entries.accept(ModItems.ROSE_GOLD_AXE);
       entries.accept(ModItems.ROSE_GOLD_SHOVEL);
       entries.accept(ModItems.ROSE_GOLD_HOE);
       entries.accept(ModItems.ROSE_GOLD_SPEAR);
    });

    public static void init() {}
}
