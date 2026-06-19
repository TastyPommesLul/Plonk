package dev.tastypommeslul.plonk.init;

import dev.tastypommeslul.plonk.Constants;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.Util;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.trim.MaterialAssetGroup;
import net.minecraft.world.item.equipment.trim.TrimMaterial;

public class ModTrimMaterials {
    public static final ResourceKey<TrimMaterial> ROSE_GOLD =
            ResourceKey.create(Registries.TRIM_MATERIAL, Constants.id("rose_gold"));

    public static void bootstrap(BootstrapContext<TrimMaterial> context) {
        register(context, ROSE_GOLD, ModItems.ROSE_GOLD_INGOT.get(), Style.EMPTY.withColor(TextColor.parseColor("#ebb1b1").getOrThrow()));
    }

    private static void register(BootstrapContext<TrimMaterial> context, ResourceKey<TrimMaterial> trimKey, Item item,
                                 Style style) {
        TrimMaterial trimmaterial = new TrimMaterial(MaterialAssetGroup.create("bismuth"),
                Component.translatable(Util.makeDescriptionId("trim_material", trimKey.identifier())).withStyle(style));
        context.register(trimKey, trimmaterial);
    }
}
