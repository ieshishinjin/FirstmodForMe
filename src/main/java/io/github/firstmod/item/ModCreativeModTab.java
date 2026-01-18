package io.github.firstmod.item;

import io.github.firstmod.block.ModBlocks;
import io.github.firstmod.firstmod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.rmi.registry.Registry;

public class ModCreativeModTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, firstmod.MOD_ID);
    public static final RegistryObject<CreativeModeTab> firstmodTab =
            CREATIVE_MODE_TAB.register("firstmod_tab",()->CreativeModeTab.builder()
                    .icon(()->new ItemStack(Moditems.Queen.get()))
                    .title(Component.translatable("itemGrop.first_tab"))
                    .displayItems((pParameters, pOutput) -> {
                                pOutput.accept(Moditems.King.get());
                                pOutput.accept(Moditems.Queen.get());
                                pOutput.accept(Moditems.Prince.get());
                                pOutput.accept(Items.APPLE);
                                pOutput.accept(Items.DIAMOND);
                                pOutput.accept(ModBlocks.Kingdom.get());

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }

}
