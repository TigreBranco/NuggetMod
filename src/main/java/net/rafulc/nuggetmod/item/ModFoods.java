package net.rafulc.nuggetmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties Nugget = (new FoodProperties.Builder()).fast().nutrition(9).saturationMod(0.9F).meat().build();
    public static final FoodProperties Douradinho = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.2F).effect(new MobEffectInstance(MobEffects.HUNGER, 750, 1), 1F).meat().build();
}
