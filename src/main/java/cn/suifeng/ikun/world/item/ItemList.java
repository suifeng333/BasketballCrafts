package cn.suifeng.ikun.world.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemList {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,"ikunchicken");

    public static final RegistryObject<Item> BASKETBALL = ITEMS.register("basketball",() -> new Item(new Item.Properties().tab(TabList.TAB_IKUNCHICKEN)));
}
