package cn.suifeng.ikun.world.item;

import cn.suifeng.ikun.world.entity.BasketballEntity;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;

public class BasketballItem extends Item {
    public BasketballItem(Item.Properties item) {
        super(item);
    }

    public void releaseUsing(ItemStack pStack, Level pLevel, LivingEntity pEntityLiving, int pTimeLeft) {
        super.releaseUsing(pStack,pLevel,pEntityLiving,pTimeLeft);
        if (pEntityLiving instanceof Player player) {
            pLevel.playSound(player,player.getX(),player.getY(),player.getZ(), SoundEvents.EGG_THROW, SoundSource.PLAYERS,0.5F,0.4F / (pLevel.getRandom().nextFloat() * 0.4F + 0.8F));
            int i = this.getUseDuration(pStack) - pTimeLeft;
            if (i < 0) return;
            float f = getPowerForTime(i);
            if (!((double)f < 0.1D)) {
                if (!pLevel.isClientSide) {
                    BasketballEntity basketballentity = new BasketballEntity(pLevel, player);
                    basketballentity.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, f * 1.5F, 1.0F);
                    basketballentity.setPos(player.getEyePosition());
                    pLevel.addFreshEntity(basketballentity);
                }
            }
        }
    }

    public static float getPowerForTime(int pCharge) {
        float f = (float)pCharge / 20.0F;
        f = (f * f + f * 2.0F) / 3.0F;
        if (f > 1.0F) {
            f = 1.0F;
        }
        return f;
    }

    public UseAnim getUseAnimation(ItemStack stack) {
        return UseAnim.BOW;
    }

    public int getUseDuration(ItemStack stack) {
        return 72000;
    }

    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand interactionHand) {
        player.startUsingItem(interactionHand);
        ItemStack itemstack = player.getItemInHand(interactionHand);
        player.getEyePosition();
        return InteractionResultHolder.sidedSuccess(itemstack,level.isClientSide());
    }
}
