package cn.suifeng.ikun.client.renderer.entity;

import cn.suifeng.ikun.IkunChicken;
import cn.suifeng.ikun.client.model.BasketballModel;
import cn.suifeng.ikun.world.entity.BasketballEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;

public class BasketballRenderer extends EntityRenderer<BasketballEntity> {
    private final EntityRendererProvider.Context context;
    private static final ResourceLocation TEXTURE = new ResourceLocation(IkunChicken.MOD_ID, "textures/entity/basketball1.png");

    protected BasketballRenderer(EntityRendererProvider.Context p_174008_, EntityRendererProvider.Context context) {
        super(p_174008_);
        this.context = context;
    }

    @Override
    public ResourceLocation getTextureLocation(BasketballEntity pEntity) {
        return null;
    }

    public BasketballModel getModel() {
        return new BasketballModel<>(this.context.bakeLayer(BasketballModel.LAYER_LOCATION));
    }

    @Override
    public void render(BasketballEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
        VertexConsumer cutoutNoCull = pBuffer.getBuffer(RenderType.entityCutoutNoCull(TEXTURE));
        this.getModel().renderToBuffer(pMatrixStack,cutoutNoCull, 250, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
    }
}
