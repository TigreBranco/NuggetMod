package net.rafulc.nuggetmod.item;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.SwordItem;
import net.rafulc.nuggetmod.NuggetMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rafulc.nuggetmod.item.custom.CoalCokeItem;
import net.rafulc.nuggetmod.item.custom.DowsingRodItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, NuggetMod.MOD_ID);

    public static final RegistryObject<Item> Nugget = ITEMS.register("nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NUGGET_TAB).food(ModFoods.Nugget)));

    public static final RegistryObject<Item> Raw_Nugget = ITEMS.register("raw_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NUGGET_TAB)));

    public static final RegistryObject<Item> Farinha = ITEMS.register("farinha",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NUGGET_TAB)));

    public static final RegistryObject<Item> Special_Nugget = ITEMS.register("special_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NUGGET_TAB)));

    public static final RegistryObject<Item> Dowsing_Rod = ITEMS.register("dowsing_rod",
            () -> new DowsingRodItem(new Item.Properties().tab(ModCreativeModeTab.NUGGET_TAB).durability(32)));

    public static final RegistryObject<Item> Douradinho = ITEMS.register("douradinho",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NUGGET_TAB).food(ModFoods.Douradinho)));

    public static final RegistryObject<Item> Coal_Coke = ITEMS.register("coal_coke",
            () -> new CoalCokeItem(new Item.Properties().tab(ModCreativeModeTab.NUGGET_TAB)));

    public static final RegistryObject<Item> Nugget_Sword = ITEMS.register("nugget_sword",
            () -> new SwordItem(ModTiers.Nugget, 4, 4,
                    new Item.Properties().tab(ModCreativeModeTab.NUGGET_TAB)));

    public static final RegistryObject<Item> Nugget_Helmet = ITEMS.register("nugget_helmet",
            () -> new ArmorItem(ModArmorMaterials.Nugget, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.NUGGET_TAB)));

    public static final RegistryObject<Item> Nugget_Chestplate = ITEMS.register("nugget_chestplate",
            () -> new ArmorItem(ModArmorMaterials.Nugget, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.NUGGET_TAB)));

    public static final RegistryObject<Item> Nugget_Legging = ITEMS.register("nugget_legging",
            () -> new ArmorItem(ModArmorMaterials.Nugget, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.NUGGET_TAB)));

    public static final RegistryObject<Item> Nugget_Boots = ITEMS.register("nugget_boots",
            () -> new ArmorItem(ModArmorMaterials.Nugget, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.NUGGET_TAB)));

    public static final RegistryObject<Item> Fisga = ITEMS.register("fisga",
            () -> new BowItem(new Item.Properties().tab(ModCreativeModeTab.NUGGET_TAB).durability(1000)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}