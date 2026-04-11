package net.magickmaster.InterestingBiomes.item;

import net.magickmaster.InterestingBiomes.InterestingBiomes;
import net.minecraft.world.item.ArmorItem;
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

    public static final RegistryObject<Item> Fur_Scrap = ITEMS.register("furscrap",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Fur_Cloak = ITEMS.register("fur_cloak",
            ()-> new ArmorItem(ModArmorMaterials.Fur_Armour_material, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(24))));

    public static void register (IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
