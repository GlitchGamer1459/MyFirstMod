package com.redacted.firstmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab FIRST_MOD_TAB = new CreativeModeTab("firstModTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ADAMANTIUM_INGOT.get());
        }
    };
}
