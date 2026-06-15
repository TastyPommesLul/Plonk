package dev.tastypommeslul.plonk.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.SmeltingRecipe;
import net.minecraft.world.level.ItemLike;

import java.util.concurrent.CompletableFuture;

public class PlonkRecipeProvider extends RecipeProvider {
    protected PlonkRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    @Override
    protected void buildRecipes() {

    }

    private void multiSmelt(ItemLike input, ItemLike result, RecipeCategory recipeCategory,
                            CookingBookCategory cookingBookCategory, int exp, int cookingTime, SmeltingRecipeFactory factory) {
        SimpleCookingRecipeBuilder.generic(Ingredient.of(input), recipeCategory, cookingBookCategory,
                        result, exp, cookingTime,
                        (commonInfo, cookingBookInfo, ingredient, itemStackTemplate, v, i) -> new SmeltingRecipe(
                                commonInfo, cookingBookInfo, ingredient, factory.create(itemStackTemplate), v, i
                        ))
                .unlockedBy(getHasName(Items.ITEM_FRAME), has(Items.ITEM_FRAME))
                .save(output);
    }

    @FunctionalInterface
    interface SmeltingRecipeFactory {
        ItemStackTemplate create(ItemStackTemplate template);
    }

    public static class Runner extends RecipeProvider.Runner {

        public Runner(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> registries) {
            super(packOutput, registries);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
            return new PlonkRecipeProvider(provider, recipeOutput);
        }

        @Override
        public String getName() {
            return "Plonk";
        }
    }
}
