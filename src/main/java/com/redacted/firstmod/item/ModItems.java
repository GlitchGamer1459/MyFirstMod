package com.redacted.firstmod.item;

import com.redacted.firstmod.FirstMod;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FirstMod.MOD_ID);

    public static final RegistryObject<Item> ADAMANTIUM_INGOT = ITEMS.register("adamantium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FIRST_MOD_TAB)));

    public static final RegistryObject<Item> RAW_ADAMANTIUM = ITEMS.register("raw_adamantium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FIRST_MOD_TAB)));

    public static final RegistryObject<Item> ADAMANTIUM_NUGGET = ITEMS.register("adamantium_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FIRST_MOD_TAB)));

    public static final RegistryObject<Item> UNOBTANIUM_SWORD = ITEMS.register("unobtanium_sword",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FIRST_MOD_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
