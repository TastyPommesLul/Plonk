package dev.tastypommeslul.plonk.datagen.lang;

import dev.tastypommeslul.plonk.Constants;
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

    }

    private void add(Component component, String value) {
        if (component.getContents() instanceof TranslatableContents translatableContents) {
            add(translatableContents.getKey(), value);
        }
    }
}
