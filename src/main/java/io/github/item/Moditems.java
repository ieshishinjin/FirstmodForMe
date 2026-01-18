package io.github.item;

import io.github.firstmod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Moditems {
    public static final DeferredRegister<Item> Items=
            DeferredRegister.create(ForgeRegistries.ITEMS, firstmod.MOD_ID );
    public static final RegistryObject<Item> Queen =
            Items.register("queen",() ->new Item(new Item.Properties()));
    public static final RegistryObject<Item> King =
            Items.register("king",() ->new Item(new Item.Properties()));
    public static final RegistryObject<Item> Prince =
            Items.register("princess/prince",() ->new Item(new Item.Properties()));
    public static void register(IEventBus eventBus) {

        Items.register(eventBus);
    }
}
