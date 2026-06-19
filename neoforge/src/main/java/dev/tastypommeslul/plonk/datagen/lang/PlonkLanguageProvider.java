package dev.tastypommeslul.plonk.datagen.lang;

import dev.tastypommeslul.plonk.Constants;
import dev.tastypommeslul.plonk.init.ModCreativeModeTabs;
import dev.tastypommeslul.plonk.init.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.contents.TranslatableContents;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class PlonkLanguageProvider extends LanguageProvider {
    private final Language language;
    public PlonkLanguageProvider(PackOutput output, Language language) {
        super(output, Constants.MOD_ID, language.getLangCode());
        this.language = language;
    }

    @Override
    protected void addTranslations() {
        add(ModItems.RAW_ROSE_GOLD.get(), switch (language) {
            case ENGLISH -> "Raw Rose Gold";
        });
        add(ModItems.ROSE_GOLD_INGOT.get(), switch (language) {
            case ENGLISH -> "Rose Gold Ingot";
        });
        add(ModItems.ROSE_GOLD_NUGGET.get(), switch (language) {
            case ENGLISH -> "Rose Gold Nugget";
        });
        add(ModItems.ROSE_GOLD_SWORD.get(), switch (language) {
            case ENGLISH -> "Rose Gold Sword";
        });
        add(ModItems.ROSE_GOLD_PICKAXE.get(), switch (language) {
            case ENGLISH -> "Rose Gold Pickaxe";
        });
        add(ModItems.ROSE_GOLD_AXE.get(), switch (language) {
            case ENGLISH -> "Rose Gold Axe";
        });
        add(ModItems.ROSE_GOLD_SHOVEL.get(), switch (language) {
            case ENGLISH -> "Rose Gold Shovel";
        });
        add(ModItems.ROSE_GOLD_HOE.get(), switch (language) {
            case ENGLISH -> "Rose Gold Hoe";
        });
        add(ModItems.ROSE_GOLD_SPEAR.get(), switch (language) {
            case ENGLISH -> "Rose Gold Spear";
        });
        add(ModItems.ROSE_GOLD_APPLE.get(), switch (language) {
            case ENGLISH -> "Rose Gold Apple";
        });

        add(ModItems.ROSE_GOLD_HELMET.get(), switch (language) {
            case ENGLISH -> "Rose Gold Helmet";
        });
        add(ModItems.ROSE_GOLD_CHESTPLATE.get(), switch (language) {
            case ENGLISH -> "Rose Gold Chestplate";
        });
        add(ModItems.ROSE_GOLD_LEGGINGS.get(), switch (language) {
            case ENGLISH -> "Rose Gold Leggings";
        });
        add(ModItems.ROSE_GOLD_BOOTS.get(), switch (language) {
            case ENGLISH -> "Rose Gold Boots";
        });

        add(ModCreativeModeTabs.PLONK_MATERIALS.get().getDisplayName(), switch (language) {
            case ENGLISH -> "Plonk Minerals";
        });
        add(ModCreativeModeTabs.PLONK_TOOLS_ARMOR.get().getDisplayName(), switch (language) {
            case ENGLISH -> "Plonk Tools & Armor";
        });
        add("trim_material.plonk.rose_gold", switch (language) {
            case ENGLISH -> "Rose Gold Material";
        });
    }

    private void add(Component component, String value) {
        if (component.getContents() instanceof TranslatableContents translatableContents) {
            add(translatableContents.getKey(), value);
        }
    }

    public enum Language {
        ENGLISH("en_us");

        private final String langCode;
        Language(String langCode) {
            this.langCode = langCode;
        }

        public String getLangCode() {
            return this.langCode;
        }
    }
}
