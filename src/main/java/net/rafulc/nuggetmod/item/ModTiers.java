package net.rafulc.nuggetmod.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier Nugget = new ForgeTier(4, 2031, 9.5f,
            5f, 23, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.Nugget.get()));
}
