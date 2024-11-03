package net.foundwiz.largemeals.common.registries;

import net.foundwiz.largemeals.LargeMeals;
import net.foundwiz.largemeals.common.FoodValues;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.common.item.ConsumableItem;

import java.util.function.Supplier;

import static vectorwing.farmersdelight.common.registry.ModItems.*;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LargeMeals.MOD_ID);
    public static RegistryObject<Item> registerWithTab(String name, Supplier<Item> supplier) {
        RegistryObject<Item> block = ITEMS.register(name, supplier);
        CREATIVE_TAB_ITEMS.add(block);
        return block;
    }

    //Foodstuffs
    public static final RegistryObject<Item> RAW_MUTTON_RACK = registerWithTab("raw_mutton_rack",
            () -> new Item(foodItem(FoodValues.RAW_MUTTON_RACK)));
    public static final RegistryObject<Item> COOKED_MUTTON_RACK = registerWithTab("cooked_mutton_rack",
            () -> new Item(foodItem(FoodValues.COOKED_MUTTON_RACK)));

    //Soups and Stews
    public static final RegistryObject<Item> PUFFERFISH_BROTH = registerWithTab("pufferfish_broth",
            () -> new ConsumableItem(bowlFoodItem(FoodValues.PUFFERFISH_BROTH), true));
    public static final RegistryObject<Item> POTATO_SOUP = registerWithTab("potato_soup",
            () -> new ConsumableItem(bowlFoodItem(FoodValues.POTATO_SOUP), true));
    public static final RegistryObject<Item> RED_SOUP = registerWithTab("red_soup",
            () -> new ConsumableItem(bowlFoodItem(FoodValues.RED_SOUP), true));
    public static final RegistryObject<Item> TOMATO_EGG_SOUP = registerWithTab("tomato_egg_soup",
            () -> new ConsumableItem(bowlFoodItem(FoodValues.TOMATO_EGG_SOUP), true));

    //Plated Meals
    public static final RegistryObject<Item> COD_DELUXE = registerWithTab("cod_deluxe",
            () -> new ConsumableItem(bowlFoodItem(FoodValues.COD_DELUXE), true));
    public static final RegistryObject<Item> HEARTY_LUNCH = registerWithTab("hearty_lunch",
            () -> new ConsumableItem(bowlFoodItem(FoodValues.HEARTY_LUNCH), true));
    public static final RegistryObject<Item> CHICKEN_CURRY = registerWithTab("chicken_curry",
            () -> new ConsumableItem(bowlFoodItem(FoodValues.CHICKEN_CURRY), true));
    public static final RegistryObject<Item> PASTA_WITH_MUSHROOM_SAUCE = registerWithTab("pasta_with_mushroom_sauce",
            () -> new ConsumableItem(bowlFoodItem(FoodValues.PASTA_WITH_MUSHROOM_SAUCE), true));

    //Feasts
    public static final RegistryObject<Item> OMURICE_BLOCK = registerWithTab("omurice_block",
            () -> new BlockItem(ModBlocks.OMURICE_BLOCK.get(), basicItem().stacksTo(1)));
    public static final RegistryObject<Item> OMURICE = registerWithTab("omurice",
            () -> new ConsumableItem(bowlFoodItem(FoodValues.OMURICE), true));
    public static final RegistryObject<Item> MUSHROOM_POT_PIE_BLOCK = registerWithTab("mushroom_pot_pie_block",
            () -> new BlockItem(ModBlocks.MUSHROOM_POT_PIE_BLOCK.get(), basicItem().stacksTo(1)));
    public static final RegistryObject<Item> MUSHROOM_POT_PIE = registerWithTab("mushroom_pot_pie",
            () -> new ConsumableItem(bowlFoodItem(FoodValues.MUSHROOM_POT_PIE), true));
    public static final RegistryObject<Item> ROASTED_MUTTON_RACK_BLOCK = registerWithTab("roasted_mutton_rack_block",
            () -> new BlockItem(ModBlocks.ROASTED_MUTTON_RACK_BLOCK.get(), basicItem().stacksTo(1)));
    public static final RegistryObject<Item> ROASTED_MUTTON_RACK = registerWithTab("roasted_mutton_rack",
            () -> new ConsumableItem(bowlFoodItem(FoodValues.ROASTED_MUTTON_RACK), true));

    //Sweets
    public static final RegistryObject<Item> SWEET_BERRY_CUSTARD = registerWithTab("sweet_berry_custard",
            () -> new ConsumableItem(foodItem(FoodValues.SWEET_BERRY_CUSTARD).craftRemainder(Items.GLASS_BOTTLE).stacksTo(16)));
    public static final RegistryObject<Item> RICE_PUDDING = registerWithTab("rice_pudding",
            () -> new ConsumableItem(bowlFoodItem(FoodValues.RICE_PUDDING), true));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}