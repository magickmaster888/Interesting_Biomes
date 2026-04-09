package net.magickmaster.InterestingBiomes.item;

import net.magickmaster.InterestingBiomes.InterestingBiomes;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.lang.model.util.ElementKindVisitor6;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, InterestingBiomes.MOD_ID);
    public static final RegistryObject<Item> Stinger = ITEMS.register("stinger",
            ()-> new Item(new Item.Properties()));

    public static void register (IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
