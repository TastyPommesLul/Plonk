package dev.tastypommeslul.plonk.util.creative;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class CreativeMods {

    public sealed interface TabEntry permits TabEntry.After, TabEntry.Before, TabEntry.Append, TabEntry.Prepend {
        record After(Supplier<ItemStack> anchor, Supplier<ItemStack> toInsert)  implements TabEntry {}
        record Before(Supplier<ItemStack> anchor, Supplier<ItemStack> toInsert) implements TabEntry {}
        record Append(Supplier<ItemStack> toInsert)                             implements TabEntry {}
        record Prepend(Supplier<ItemStack> toInsert)                             implements TabEntry {}
    }

    private static final Map<ResourceKey<CreativeModeTab>, List<TabEntry>> MODIFICATIONS = new LinkedHashMap<>();

    public static void insertAfter(ResourceKey<CreativeModeTab> tab, Supplier<ItemStack> anchor, Supplier<ItemStack> toInsert) {
        add(tab, new TabEntry.After(anchor, toInsert));
    }

    public static void insertBefore(ResourceKey<CreativeModeTab> tab, Supplier<ItemStack> anchor, Supplier<ItemStack> toInsert) {
        add(tab, new TabEntry.Before(anchor, toInsert));
    }

    public static void accept(ResourceKey<CreativeModeTab> tab, Supplier<ItemStack> toInsert) {
        add(tab, new TabEntry.Append(toInsert));
    }

    public static void prepend(ResourceKey<CreativeModeTab> tab, Supplier<ItemStack> toInsert) {
        add(tab, new TabEntry.Prepend(toInsert));
    }

    private static void add(ResourceKey<CreativeModeTab> tab, TabEntry entry) {
        MODIFICATIONS.computeIfAbsent(tab, k -> new ArrayList<>()).add(entry);
    }

    public static Map<ResourceKey<CreativeModeTab>, List<TabEntry>> getModifications() {
        return MODIFICATIONS;
    }
}
