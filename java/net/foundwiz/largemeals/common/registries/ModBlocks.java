package net.foundwiz.largemeals.common.registries;

import net.foundwiz.largemeals.LargeMeals;
import net.foundwiz.largemeals.common.blocks.MushroomPotPieBlock;
import net.foundwiz.largemeals.common.blocks.OmuriceBlock;
import net.foundwiz.largemeals.common.blocks.RoastedMuttonRackBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, LargeMeals.MOD_ID);

    //Feasts
    public static final RegistryObject<Block> OMURICE_BLOCK = BLOCKS.register("omurice_block",
            () -> new OmuriceBlock(Block.Properties.copy(Blocks.CAKE), ModItems.OMURICE, true));
    public static final RegistryObject<Block> MUSHROOM_POT_PIE_BLOCK = BLOCKS.register("mushroom_pot_pie_block",
            () -> new MushroomPotPieBlock(Block.Properties.copy(Blocks.CAKE), ModItems.MUSHROOM_POT_PIE, true));
    public static final RegistryObject<Block> ROASTED_MUTTON_RACK_BLOCK = BLOCKS.register("roasted_mutton_rack_block",
            () -> new RoastedMuttonRackBlock(Block.Properties.copy(Blocks.CAKE), ModItems.ROASTED_MUTTON_RACK, true));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}