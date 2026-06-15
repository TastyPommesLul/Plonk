package dev.tastypommeslul.plonk.init;

import dev.tastypommeslul.plonk.util.ModTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.ToolMaterial;

public class ModToolMaterials {
    public static final ToolMaterial ROSE_GOLD_TOOLMATERIAL = new ToolMaterial(
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            300,
            7.0f,
            2.5f,
            22,
            ModTags.Items.REPAIRS_ROSE_GOLD
    );
}
