package dev.tastypommeslul.plonk.datagen;

import dev.tastypommeslul.plonk.init.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.packs.VanillaRecipeProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.level.ItemLike;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class PlonkRecipeProvider extends RecipeProvider {
    protected static List<ItemLike> SMELTABLE_ROSE_GOLD =
            List.of(ModItems.ROSE_GOLD_SWORD.get(), ModItems.ROSE_GOLD_PICKAXE.get(), ModItems.ROSE_GOLD_AXE.get(),
                    ModItems.ROSE_GOLD_SHOVEL.get(), ModItems.ROSE_GOLD_HOE.get(), ModItems.ROSE_GOLD_SPEAR.get());
    protected PlonkRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    @Override
    protected void buildRecipes() {
        oreSmelting(List.of(ModItems.RAW_ROSE_GOLD.get()), RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.ROSE_GOLD_INGOT.get(), 1.0f, 200, "rose_gold");
        oreSmelting(SMELTABLE_ROSE_GOLD, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.ROSE_GOLD_NUGGET.get(), 1.0f, 200, "rose_gold");
        oreBlasting(List.of(ModItems.RAW_ROSE_GOLD.get()), RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.ROSE_GOLD_INGOT.get(), 1.0f, 100, "rose_gold");

        shaped(RecipeCategory.TOOLS, ModItems.ROSE_GOLD_SWORD.get())
                .pattern("M")
                .pattern("M")
                .pattern("S")
                .define('S', Items.STICK)
                .define('M', ModItems.ROSE_GOLD_INGOT.get())
                .unlockedBy(getHasName(ModItems.ROSE_GOLD_INGOT.get()), has(ModItems.ROSE_GOLD_INGOT.get()))
                .save(output);
        shaped(RecipeCategory.TOOLS, ModItems.ROSE_GOLD_PICKAXE.get())
                .pattern("MMM")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('M', ModItems.ROSE_GOLD_INGOT.get())
                .unlockedBy(getHasName(ModItems.ROSE_GOLD_INGOT.get()), has(ModItems.ROSE_GOLD_INGOT.get()))
                .save(output);
        shaped(RecipeCategory.TOOLS, ModItems.ROSE_GOLD_AXE.get())
                .pattern("MM ")
                .pattern("MS ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('M', ModItems.ROSE_GOLD_INGOT.get())
                .unlockedBy(getHasName(ModItems.ROSE_GOLD_INGOT.get()), has(ModItems.ROSE_GOLD_INGOT.get()))
                .save(output);
        shaped(RecipeCategory.TOOLS, ModItems.ROSE_GOLD_SHOVEL.get())
                .pattern(" M ")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('M', ModItems.ROSE_GOLD_INGOT.get())
                .unlockedBy(getHasName(ModItems.ROSE_GOLD_INGOT.get()), has(ModItems.ROSE_GOLD_INGOT.get()))
                .save(output);
        shaped(RecipeCategory.TOOLS, ModItems.ROSE_GOLD_HOE.get())
                .pattern(" MM")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('M', ModItems.ROSE_GOLD_INGOT.get())
                .unlockedBy(getHasName(ModItems.ROSE_GOLD_INGOT.get()), has(ModItems.ROSE_GOLD_INGOT.get()))
                .save(output);
        shaped(RecipeCategory.TOOLS, ModItems.ROSE_GOLD_SPEAR.get())
                .pattern("  M")
                .pattern(" S ")
                .pattern("S  ")
                .define('S', Items.STICK)
                .define('M', ModItems.ROSE_GOLD_INGOT.get())
                .unlockedBy(getHasName(ModItems.ROSE_GOLD_INGOT.get()), has(ModItems.ROSE_GOLD_INGOT.get()))
                .save(output);

        shapeless(RecipeCategory.MISC, ModItems.ROSE_GOLD_NUGGET.get(), 9)
                .requires(ModItems.ROSE_GOLD_INGOT.get(), 1)
                .unlockedBy(getHasName(ModItems.ROSE_GOLD_INGOT.get()), has(ModItems.ROSE_GOLD_INGOT.get()))
                .save(output);
        shapeless(RecipeCategory.MISC, ModItems.ROSE_GOLD_INGOT.get())
                .requires(ModItems.ROSE_GOLD_NUGGET.get(), 9)
                .unlockedBy(getHasName(ModItems.ROSE_GOLD_NUGGET.get()), has(ModItems.ROSE_GOLD_NUGGET.get()))
                .save(output);

        shapeless(RecipeCategory.MISC, ModItems.RAW_ROSE_GOLD.get(), 4)
                .requires(Items.RAW_COPPER, 4)
                .requires(Items.RAW_GOLD, 4)
                .unlockedBy(getHasName(Items.RAW_COPPER), has(Items.RAW_COPPER))
                .unlockedBy(getHasName(Items.RAW_GOLD), has(Items.RAW_GOLD))
                .save(output);

        shaped(RecipeCategory.FOOD, ModItems.ROSE_GOLD_APPLE.get())
                .pattern("MMM")
                .pattern("MAM")
                .pattern("MMM")
                .define('M', ModItems.ROSE_GOLD_INGOT.get())
                .define('A', Items.APPLE)
                .unlockedBy(getHasName(Items.APPLE), has(Items.APPLE))
                .unlockedBy(getHasName(ModItems.ROSE_GOLD_INGOT.get()), has(ModItems.ROSE_GOLD_INGOT.get()))
                .group("rose_gold_apple")
                .save(output);
        shaped(RecipeCategory.FOOD, ModItems.ROSE_GOLD_APPLE.get())
                .pattern("MMM")
                .pattern("MAM")
                .pattern("MMM")
                .define('M', Items.COPPER_INGOT)
                .define('A', Items.GOLDEN_APPLE)
                .unlockedBy(getHasName(Items.GOLDEN_APPLE), has(Items.GOLDEN_APPLE))
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                .group("rose_gold_apple")
                .save(output, "rose_gold_apple_from_gold_apple");
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
