package dev.tastypommeslul.plonk.platform.services;

import net.minecraft.world.item.Item;

import java.util.function.Function;

public interface IRegistryHelper {
    <T extends Item> RegistryHandle<T> registerItem(String name, Function<Item.Properties, T> item);
}
