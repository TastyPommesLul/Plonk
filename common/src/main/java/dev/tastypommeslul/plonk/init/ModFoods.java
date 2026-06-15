package dev.tastypommeslul.plonk.init;

import dev.tastypommeslul.plonk.util.Ticks;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;

import java.util.List;

public interface ModFoods {
    FoodProperties ROSE_GOLD_APPLE_FOOD = new FoodProperties.Builder().nutrition(4).saturationModifier(1.2F).alwaysEdible().build();

    Consumable ROSE_GOLD_APPLE_CONSUMABLE = Consumable.builder()
            .onConsume(new ApplyStatusEffectsConsumeEffect(List.of(new MobEffectInstance(MobEffects.REGENERATION, Ticks.fromSeconds(10), 1),
                    new MobEffectInstance(MobEffects.ABSORPTION, Ticks.fromMinutes(1.5), 1)))).build();
}
