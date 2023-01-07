package cn.suifeng.ikun.client.event;

import cn.suifeng.ikun.client.model.BasketballModel;
import cn.suifeng.ikun.client.renderer.entity.BasketballRenderer;
import cn.suifeng.ikun.world.entity.EntityTypeList;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModBusEventHandler {
    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(EntityTypeList.BASKETBALL.get(), BasketballRenderer::new);
    }

    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(BasketballModel.LAYER_LOCATION, BasketballModel::createBodyLayer);
    }
}