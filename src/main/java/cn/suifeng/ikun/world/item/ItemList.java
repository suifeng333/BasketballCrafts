package cn.suifeng.ikun.world.item;

import cn.suifeng.ikun.world.level.block.BlockList;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemList {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,"ikunchicken");

    public static final RegistryObject<Item> BASKETBALL = ITEMS.register("basketball",() -> new BasketballItem(new Item.Properties().tab(TabList.TAB_IKUNCHICKEN)));
    public static final RegistryObject<Item> LITCHI = ITEMS.register("litchi",() -> new Item(new Item.Properties().tab(TabList.TAB_IKUNCHICKEN).food(FoodList.LITCHI)));
    public static final RegistryObject<Item> KUN_ORE = ITEMS.register("kun_ore",() -> new BlockItem(BlockList.KUN_ORE.get(),new Item.Properties().tab(TabList.TAB_IKUNCHICKEN)));
    public static final RegistryObject<Item> KUN_BLOCK = ITEMS.register("kun_block",() -> new BlockItem(BlockList.KUN_BLOCK.get(), new Item.Properties().tab(TabList.TAB_IKUNCHICKEN)));
    public static final RegistryObject<Item> KUN_INGOT = ITEMS.register("kun_ingot",() -> new Item(new Item.Properties().tab(TabList.TAB_IKUNCHICKEN)));
    public static final RegistryObject<Item> KUN_PICKAXE = ITEMS.register("kun_pickaxe", () -> new PickaxeItem(TierList.KUN,-3,-1.5F,new Item.Properties().tab(TabList.TAB_IKUNCHICKEN)));
    public static final RegistryObject<Item> KUN_AXE = ITEMS.register("kun_axe",() -> new AxeItem(TierList.KUN,-3,-1.0F,new Item.Properties().tab(TabList.TAB_IKUNCHICKEN)));
    public static final RegistryObject<Item> RAW_KUN = ITEMS.register("raw_kun",() -> new Item((new Item.Properties()).tab(TabList.TAB_IKUNCHICKEN)));
    public static final RegistryObject<Item> LICHI_WOOD = ITEMS.register("lichi_wood",() -> new BlockItem(BlockList.LICHI_WOOD.get(), new Item.Properties().tab(TabList.TAB_IKUNCHICKEN)));
    public static final RegistryObject<Item> LICHI_LOG = ITEMS.register("lichi_log",() -> new BlockItem(BlockList.LICHI_LOG.get(), new Item.Properties().tab(TabList.TAB_IKUNCHICKEN)));
    public static final RegistryObject<Item> LICHI_PLANKS = ITEMS.register("lichi_planks",() -> new BlockItem(BlockList.LICHI_PLANKS.get(), new Item.Properties().tab(TabList.TAB_IKUNCHICKEN)));
    public static final RegistryObject<Item> STRIPPED_LICHI_WOOD = ITEMS.register("stripped_lichi_wood",() -> new BlockItem(BlockList.STRIPPED_LICHI_WOOD.get(), new Item.Properties().tab(TabList.TAB_IKUNCHICKEN)));
    public static final RegistryObject<Item> STRIPPED_LICHI_LOG = ITEMS.register("stripped_lichi_log",() -> new BlockItem(BlockList.STRIPPED_LICHI_LOG.get(), new Item.Properties().tab(TabList.TAB_IKUNCHICKEN)));
    public static final RegistryObject<Item> LICHI_LEAVES = ITEMS.register("lichi_leaves",() -> new BlockItem(BlockList.LICHI_LEAVES.get(), new Item.Properties().tab(TabList.TAB_IKUNCHICKEN)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
