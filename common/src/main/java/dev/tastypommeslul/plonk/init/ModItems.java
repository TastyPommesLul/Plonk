package dev.tastypommeslul.plonk.init;

import dev.tastypommeslul.plonk.platform.Services;
import dev.tastypommeslul.plonk.platform.util.RegistryHandle;
import net.minecraft.world.item.*;
import net.minecraft.world.item.equipment.ArmorType;

public class ModItems {

    public static final RegistryHandle<Item> RAW_ROSE_GOLD = Services.REGISTRY.registerItem("raw_rose_gold", Item::new);
    public static final RegistryHandle<Item> ROSE_GOLD_INGOT = Services.REGISTRY.registerItem("rose_gold_ingot", Item::new);
    public static final RegistryHandle<Item> ROSE_GOLD_NUGGET = Services.REGISTRY.registerItem("rose_gold_nugget", Item::new);

    public static final RegistryHandle<Item> ROSE_GOLD_SWORD = Services.REGISTRY.registerItem("rose_gold_sword",
            properties -> new Item(properties.sword(ModToolMaterials.ROSE_GOLD_TOOLMATERIAL, 3.0f, -2.3f)));
    public static final RegistryHandle<Item> ROSE_GOLD_PICKAXE = Services.REGISTRY.registerItem("rose_gold_pickaxe",
            properties -> new Item(properties.pickaxe(ModToolMaterials.ROSE_GOLD_TOOLMATERIAL, 1.0f, -2.8f)));
    public static final RegistryHandle<Item> ROSE_GOLD_AXE = Services.REGISTRY.registerItem("rose_gold_axe",
            properties -> new AxeItem(ModToolMaterials.ROSE_GOLD_TOOLMATERIAL, 6.0f, -2.9f, properties));
    public static final RegistryHandle<Item> ROSE_GOLD_SHOVEL = Services.REGISTRY.registerItem("rose_gold_shovel",
            properties -> new ShovelItem(ModToolMaterials.ROSE_GOLD_TOOLMATERIAL, 1.5f, -3.0f, properties));
    public static final RegistryHandle<Item> ROSE_GOLD_HOE = Services.REGISTRY.registerItem("rose_gold_hoe",
            properties -> new HoeItem(ModToolMaterials.ROSE_GOLD_TOOLMATERIAL, -2f, -1f, properties));
    public static final RegistryHandle<Item> ROSE_GOLD_SPEAR = Services.REGISTRY.registerItem("rose_gold_spear",
            properties -> new Item(properties.spear(ModToolMaterials.ROSE_GOLD_TOOLMATERIAL,
                    0.95F, 0.95F, 0.6F, 2.5F, 11.0F,
                    6.75F, 5.1F, 11.25F, 4.6F)));
    public static final RegistryHandle<Item> ROSE_GOLD_APPLE = Services.REGISTRY.registerItem("rose_gold_apple",
            properties -> new Item(properties.food(ModFoods.ROSE_GOLD_APPLE_FOOD, ModFoods.ROSE_GOLD_APPLE_CONSUMABLE)));

    public static final RegistryHandle<Item> ROSE_GOLD_HELMET = Services.REGISTRY.registerItem("rose_gold_helmet",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.ROSE_GOLD_MATERIAL, ArmorType.HELMET)
                    .durability(ArmorType.HELMET.getDurability(ModArmorMaterials.ROSE_GOLD_BASE_DURABILITY))));
    public static final RegistryHandle<Item> ROSE_GOLD_CHESTPLATE = Services.REGISTRY.registerItem("rose_gold_chestplate",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.ROSE_GOLD_MATERIAL, ArmorType.CHESTPLATE)
                    .durability(ArmorType.HELMET.getDurability(ModArmorMaterials.ROSE_GOLD_BASE_DURABILITY))));
    public static final RegistryHandle<Item> ROSE_GOLD_LEGGINGS = Services.REGISTRY.registerItem("rose_gold_leggings",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.ROSE_GOLD_MATERIAL, ArmorType.LEGGINGS)
                    .durability(ArmorType.HELMET.getDurability(ModArmorMaterials.ROSE_GOLD_BASE_DURABILITY))));
    public static final RegistryHandle<Item> ROSE_GOLD_BOOTS = Services.REGISTRY.registerItem("rose_gold_boots",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.ROSE_GOLD_MATERIAL, ArmorType.BOOTS)
                    .durability(ArmorType.HELMET.getDurability(ModArmorMaterials.ROSE_GOLD_BASE_DURABILITY))));


    public static void init() {}
}
