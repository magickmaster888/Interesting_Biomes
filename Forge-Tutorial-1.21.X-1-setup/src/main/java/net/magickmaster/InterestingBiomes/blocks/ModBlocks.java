package net.magickmaster.InterestingBiomes.blocks;

import net.magickmaster.InterestingBiomes.InterestingBiomes;
import net.magickmaster.InterestingBiomes.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, InterestingBiomes.MOD_ID);

    public static final RegistryObject<Block>Dew_Drop = registerBlock("dew_drop",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .instabreak().sound(SoundType.AMETHYST)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T>block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    //register block items:
    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T>block){
        ModItems.ITEMS.register(name,()-> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
