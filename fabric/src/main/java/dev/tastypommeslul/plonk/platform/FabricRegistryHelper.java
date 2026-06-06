package dev.tastypommeslul.plonk.platform;

import dev.tastypommeslul.plonk.Constants;
import dev.tastypommeslul.plonk.platform.services.IRegistryHelper;
import dev.tastypommeslul.plonk.platform.services.RegistryHandle;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class FabricRegistryHelper implements IRegistryHelper {
    @Override
    public <T extends Item> RegistryHandle<T> registerItem(String name, Function<Item.Properties, T> item) {
        ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, Constants.id(name));
        Identifier id = itemKey.identifier();

        T registered = Registry.register(BuiltInRegistries.ITEM, id, item.apply(new Item.Properties().setId(itemKey)));

        return new RegistryHandle<>() {
            @Override
            public Identifier id() {
                return id;
            }

            @Override
            public T get() {
                return registered;
            }
        };
    }
}
