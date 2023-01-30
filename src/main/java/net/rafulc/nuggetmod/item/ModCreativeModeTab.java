package net.rafulc.nuggetmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab NUGGET_TAB = new CreativeModeTab("nuggettab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.Nugget.get());
        }
    };
}
