package cn.suifeng.ikun.world.item;

import cn.suifeng.ikun.world.level.block.BlockList;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemList {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,"ikunchicken");

    public static final RegistryObject<Item> BASKETBALL = ITEMS.register("basketball",() -> new BasketballItem(new Item.Properties().tab(TabList.TAB_IKUNCHICKEN)));
    public static final RegistryObject<Item> LITCHI = ITEMS.register("litchi",() -> new Item(new Item.Properties().tab(TabList.TAB_IKUNCHICKEN).food(FoodList.LITCHI)));
    public static final RegistryObject<Item> TITANIUM_ORE = ITEMS.register("titanium_ore",() -> new BlockItem(BlockList.TITANIUM_ORE.get(),new Item.Properties().tab(TabList.TAB_IKUNCHICKEN)));
    public static final RegistryObject<Item> TITANIUM_BLOCK = ITEMS.register("titanium_block",() -> new BlockItem(BlockList.TITANIUM_BLOCK.get(), new Item.Properties().tab(TabList.TAB_IKUNCHICKEN)));
    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",() -> new Item(new Item.Properties().tab(TabList.TAB_IKUNCHICKEN)));
    public static final RegistryObject<Item> TITANIUM_PICKAXE = ITEMS.register("titanium_pickaxe", () -> new PickaxeItem(TierList.TITANIUM,-3,-1.5F,new Item.Properties().tab(TabList.TAB_IKUNCHICKEN)));
    public static final RegistryObject<Item> TITANIUM_AXE = ITEMS.register("titanium_axe",() -> new AxeItem(TierList.TITANIUM,-3,-1.0F,new Item.Properties().tab(TabList.TAB_IKUNCHICKEN)));
    public static final RegistryObject<Item> RAW_KUN = ITEMS.register("raw_kun",() -> new Item((new Item.Properties()).tab(TabList.TAB_IKUNCHICKEN)));
    public static final RegistryObject<Item> LICHI_WOOD = ITEMS.register("lichi_wood",() -> new BlockItem(BlockList.LICHI_WOOD.get(), new Item.Properties().tab(TabList.TAB_IKUNCHICKEN)));
    public static final RegistryObject<Item> LICHI_LOG = ITEMS.register("lichi_log",() -> new BlockItem(BlockList.LICHI_LOG.get(), new Item.Properties().tab(TabList.TAB_IKUNCHICKEN)));
    public static final RegistryObject<Item> LICHI_PLANKS = ITEMS.register("lichi_planks",() -> new BlockItem(BlockList.LICHI_PLANKS.get(), new Item.Properties().tab(TabList.TAB_IKUNCHICKEN)));
    public static final RegistryObject<Item> STRIPPED_LICHI_WOOD = ITEMS.register("stripped_lichi_wood",() -> new BlockItem(BlockList.STRIPPED_LICHI_WOOD.get(), new Item.Properties().tab(TabList.TAB_IKUNCHICKEN)));
    public static final RegistryObject<Item> STRIPPED_LICHI_LOG = ITEMS.register("stripped_lichi_log",() -> new BlockItem(BlockList.STRIPPED_LICHI_LOG.get(), new Item.Properties().tab(TabList.TAB_IKUNCHICKEN)));
    public static final RegistryObject<Item> LICHI_LEAVES = ITEMS.register("lichi_leaves",() -> new BlockItem(BlockList.LICHI_LEAVES.get(), new Item.Properties().tab(TabList.TAB_IKUNCHICKEN)));
    public static final RegistryObject<Item> LICHI_SAPLING = ITEMS.register("lichi_sapling",() -> new BlockItem(BlockList.LICHI_SAPLING.get(),new Item.Properties().tab(TabList.TAB_IKUNCHICKEN)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
