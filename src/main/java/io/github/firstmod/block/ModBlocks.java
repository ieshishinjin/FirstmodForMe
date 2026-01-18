package io.github.firstmod.block;

import io.github.firstmod.firstmod;
import io.github.firstmod.item.Moditems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, firstmod.MOD_ID);
    public static final RegistryObject<Block> Kingdom =
            registerBlock("Kingdom",()-> new Block(BlockBehaviour.Properties.of().strength(1.5F,3.0F)));
    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        Moditems.Items.register(name,()-> new BlockItem(block.get(),new Item.Properties()));
    }
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> BLOCK = BLOCKS.register(name, block);
        registerBlockItem(name, BLOCK);
        return BLOCK;
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
