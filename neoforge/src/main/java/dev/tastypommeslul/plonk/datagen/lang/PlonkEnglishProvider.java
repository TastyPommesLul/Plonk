package dev.tastypommeslul.plonk.datagen.lang;

import dev.tastypommeslul.plonk.Constants;
import dev.tastypommeslul.plonk.init.ModCreativeModeTabs;
import dev.tastypommeslul.plonk.init.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.contents.TranslatableContents;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class PlonkEnglishProvider extends LanguageProvider {
    public PlonkEnglishProvider(PackOutput output) {
        super(output, Constants.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add(ModItems.RAW_ROSE_GOLD.get(), "Raw Rose Gold");
        add(ModItems.ROSE_GOLD_INGOT.get(), "Rose Gold Ingot");
        add(ModItems.ROSE_GOLD_NUGGET.get(), "Rose Gold Nugget");
        add(ModItems.ROSE_GOLD_SWORD.get(), "Rose Gold Sword");
        add(ModItems.ROSE_GOLD_PICKAXE.get(), "Rose Gold Pickaxe");
        add(ModItems.ROSE_GOLD_AXE.get(), "Rose Gold Axe");
        add(ModItems.ROSE_GOLD_SHOVEL.get(), "Rose Gold Shovel");
        add(ModItems.ROSE_GOLD_HOE.get(), "Rose Gold Hoe");
        add(ModItems.ROSE_GOLD_SPEAR.get(), "Rose Gold Spear");
        add(ModItems.ROSE_GOLD_APPLE.get(), "Rose Gold Apple");

        add(ModCreativeModeTabs.PLONK_MATERIALS.get().getDisplayName(), "Plonk Minerals");
        add(ModCreativeModeTabs.PLONK_TOOLS_ARMOR.get().getDisplayName(), "Plonk Tools & Armor");
    }

    private void add(Component component, String value) {
        if (component.getContents() instanceof TranslatableContents translatableContents) {
            add(translatableContents.getKey(), value);
        }
    }
}
