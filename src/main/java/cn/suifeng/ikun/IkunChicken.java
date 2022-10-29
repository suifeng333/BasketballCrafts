package cn.suifeng.ikun;

import cn.suifeng.ikun.world.item.ItemList;
import cn.suifeng.ikun.world.level.block.BlockList;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(IkunChicken.MOD_ID)
public class IkunChicken {
    public static final String MOD_ID = "ikunchicken";

    public IkunChicken() {
        ItemList.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BlockList.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());

        MinecraftForge.EVENT_BUS.register(this);
    }
}
