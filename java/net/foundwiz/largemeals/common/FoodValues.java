package net.foundwiz.largemeals.common;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import vectorwing.farmersdelight.common.registry.ModEffects;

import static vectorwing.farmersdelight.common.FoodValues.*;

public class FoodValues {
    //Basic Foods
    public static final FoodProperties RAW_MUTTON_RACK = (new FoodProperties.Builder())
            .nutrition(5).saturationMod(0.3f).meat().build();
    public static final FoodProperties COOKED_MUTTON_RACK = (new FoodProperties.Builder())
            .nutrition(10).saturationMod(0.8f).meat().build();

    //Bowl Foods
    public static final FoodProperties PUFFERFISH_BROTH = (new FoodProperties.Builder())
            .nutrition(8).saturationMod(0.7f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), SHORT_DURATION, 0), 1.0F).build();
    public static final FoodProperties POTATO_SOUP = (new FoodProperties.Builder())
            .nutrition(10    ).saturationMod(0.6f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), MEDIUM_DURATION, 0), 1.0F).build();
    public static final FoodProperties RED_SOUP = (new FoodProperties.Builder())
            .nutrition(10    ).saturationMod(0.6f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), MEDIUM_DURATION, 0), 1.0F).build();
    public static final FoodProperties TOMATO_EGG_SOUP = (new FoodProperties.Builder())
            .nutrition(10    ).saturationMod(0.6f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), MEDIUM_DURATION, 0), 1.0F).build();

    //Plated Foods
    public static final FoodProperties COD_DELUXE = (new FoodProperties.Builder())
            .nutrition(12).saturationMod(0.8f)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), MEDIUM_DURATION, 0), 1.0F).build();
    public static final FoodProperties HEARTY_LUNCH = (new FoodProperties.Builder())
            .nutrition(12).saturationMod(0.8f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 100, 0), 1.0F)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), MEDIUM_DURATION, 0), 1.0F).build();
    public static final FoodProperties CHICKEN_CURRY = (new FoodProperties.Builder())
            .nutrition(12).saturationMod(0.8f)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), MEDIUM_DURATION, 0), 1.0F).build();
    public static final FoodProperties PASTA_WITH_MUSHROOM_SAUCE = (new FoodProperties.Builder())
            .nutrition(12).saturationMod(0.8f)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), MEDIUM_DURATION, 0), 1.0F).build();

    //Feasts
    public static final FoodProperties OMURICE = (new FoodProperties.Builder())
            .nutrition(12).saturationMod(0.8f)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), LONG_DURATION, 0), 1.0F).build();
    public static final FoodProperties MUSHROOM_POT_PIE = (new FoodProperties.Builder())
            .nutrition(12).saturationMod(0.8f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), LONG_DURATION, 0), 1.0F).build();
    public static final FoodProperties ROASTED_MUTTON_RACK = (new FoodProperties.Builder())
            .nutrition(14).saturationMod(0.75f)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), LONG_DURATION, 0), 1.0F).build();

    //Sweets
    public static final FoodProperties SWEET_BERRY_CUSTARD = (new FoodProperties.Builder())
            .nutrition(7).saturationMod(0.6f).alwaysEat()
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION , 100, 0), 1.0F).build();
    public static final FoodProperties RICE_PUDDING = (new FoodProperties.Builder())
            .nutrition(7).saturationMod(0.6f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION , 100, 0), 1.0F).build();
}