package net.magickmaster.InterestingBiomes.creativetab;

import net.magickmaster.InterestingBiomes.InterestingBiomes;
import net.magickmaster.InterestingBiomes.blocks.ModBlocks;
import net.magickmaster.InterestingBiomes.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.awt.*;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab>CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, InterestingBiomes.MOD_ID);

    public static final RegistryObject<CreativeModeTab>Interesting_Biomes_TAB = CREATIVE_MODE_TABS.register("interesting_biomes_tab",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.Stinger.get()))
                    .title(Component.translatable("creativetab.interestingbiomes.interesting_biomes"))
                    .displayItems((itemDisplayParameters, output)->{
                        output.accept(ModItems.Stinger.get());
                        output.accept(ModBlocks.Dew_Drop.get());
                        output.accept(ModItems.Fur_Scrap.get());

                    }).build());


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
