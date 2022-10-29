package cn.suifeng.ikun.world.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class FoodList {
    public static final FoodProperties LITCHI = (new FoodProperties.Builder()).nutrition(6).saturationMod(0.3F).effect(new MobEffectInstance(MobEffects.REGENERATION,500,1),1.0F).build();
}