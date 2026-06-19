package dev.tastypommeslul.plonk.init;

import com.google.common.collect.Maps;
import dev.tastypommeslul.plonk.Constants;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;

import java.util.Map;

public class ModArmorMaterials {
    public static final int ROSE_GOLD_BASE_DURABILITY = 18;
    public static final ResourceKey<EquipmentAsset> ROSE_GOLD_MATERIAL_KEY = ResourceKey.create(EquipmentAssets.ROOT_ID, Constants.id("rose_gold"));

    public static final ArmorMaterial ROSE_GOLD_MATERIAL = new ArmorMaterial(
            ROSE_GOLD_BASE_DURABILITY,
            makeDefense(3, 6, 7, 3, 6),
            20,
            SoundEvents.ARMOR_EQUIP_IRON,
            0.0F,
            0.0F,
            ItemTags.REPAIRS_IRON_ARMOR,
            ROSE_GOLD_MATERIAL_KEY
    );

    private static Map<ArmorType, Integer> makeDefense(int boots, int legs, int chest, int helm, int body) {
        return Maps.newEnumMap(
                Map.of(ArmorType.BOOTS, boots, ArmorType.LEGGINGS, legs, ArmorType.CHESTPLATE, chest, ArmorType.HELMET, helm, ArmorType.BODY, body)
        );
    }
}
