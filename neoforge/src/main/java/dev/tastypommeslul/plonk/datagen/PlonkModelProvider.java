package dev.tastypommeslul.plonk.datagen;

import dev.tastypommeslul.plonk.Constants;
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

    }
}
