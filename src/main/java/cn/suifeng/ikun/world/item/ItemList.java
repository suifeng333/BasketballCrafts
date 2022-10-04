package cn.suifeng.ikun.world.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

import static cn.suifeng.ikun.IkunChicken.ITEMS;

public class ItemList {
    public static final RegistryObject<Item> BASKETBALL = ITEMS.register("basketball",() -> new Item(new Item.Properties().tab(TabList.TAB_IKUNCHICKEN)));
}
