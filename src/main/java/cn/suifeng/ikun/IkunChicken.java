package cn.suifeng.ikun;

import cn.suifeng.ikun.world.entity.EntityTypeList;
import cn.suifeng.ikun.world.item.ItemList;
import cn.suifeng.ikun.world.level.block.BlockList;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(IkunChicken.MOD_ID)
public class IkunChicken {
    public static final String MOD_ID = "ikunchicken";

    public IkunChicken() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemList.register(eventBus); //注册物品
        BlockList.register(eventBus); //注册方块
        EntityTypeList.register(eventBus); //注册实体

        eventBus.addListener(this::setup);
        eventBus.addListener(this::clientSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void clientSetup(final FMLClientSetupEvent event) {

        ItemBlockRenderTypes.setRenderLayer(BlockList.LICHI_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockList.LICHI_SAPLING.get(), RenderType.cutout());

    }

    private void setup(final FMLCommonSetupEvent event) {

    }
}
