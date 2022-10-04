package cn.suifeng.ikun.world.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class TabList {
    public static final CreativeModeTab TAB_IKUNCHICKEN = new CreativeModeTab("ikunchicken") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemList.BASKETBALL.get());
        }
    };
}