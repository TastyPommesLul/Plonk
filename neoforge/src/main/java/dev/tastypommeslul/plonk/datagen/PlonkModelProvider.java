package dev.tastypommeslul.plonk.datagen;

import dev.tastypommeslul.plonk.Constants;
import dev.tastypommeslul.plonk.init.ModArmorMaterials;
import dev.tastypommeslul.plonk.init.ModItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;

public class PlonkModelProvider extends ModelProvider {
    public PlonkModelProvider(PackOutput output) {
        super(output, Constants.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        itemModels.generateFlatItem(ModItems.RAW_ROSE_GOLD.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.ROSE_GOLD_INGOT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.ROSE_GOLD_NUGGET.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.ROSE_GOLD_APPLE.get(), ModelTemplates.FLAT_ITEM);

        itemModels.generateTrimmableItem(ModItems.ROSE_GOLD_HELMET.get(), ModArmorMaterials.ROSE_GOLD_MATERIAL_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModels.generateTrimmableItem(ModItems.ROSE_GOLD_CHESTPLATE.get(), ModArmorMaterials.ROSE_GOLD_MATERIAL_KEY, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModels.generateTrimmableItem(ModItems.ROSE_GOLD_LEGGINGS.get(), ModArmorMaterials.ROSE_GOLD_MATERIAL_KEY, ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModels.generateTrimmableItem(ModItems.ROSE_GOLD_BOOTS.get(), ModArmorMaterials.ROSE_GOLD_MATERIAL_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);

        itemModels.generateFlatItem(ModItems.ROSE_GOLD_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.ROSE_GOLD_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.ROSE_GOLD_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.ROSE_GOLD_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.ROSE_GOLD_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateSpear(ModItems.ROSE_GOLD_SPEAR.get());

    }
}
