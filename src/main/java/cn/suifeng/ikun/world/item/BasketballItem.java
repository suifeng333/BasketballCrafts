package cn.suifeng.ikun.world.item;

import cn.suifeng.ikun.world.entity.BasketballEntity;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.ThrownEgg;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class BasketballItem extends Item {
    public BasketballItem(Item.Properties item){
        super(item);
    }

    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand interactionHand) {
        ItemStack itemstack = player.getItemInHand(interactionHand);
        level.playSound((Player)player,player.getX(),player.getY(),player.getZ(), SoundEvents.EGG_THROW, SoundSource.PLAYERS,0.5F,0.4F / (level.getRandom().nextFloat() * 0.4F + 0.8F));
        player.getEyePosition();
        if (!level.isClientSide) {
            BasketballEntity basketballentity = new BasketballEntity(level, player);
            basketballentity.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, 1.5F, 1.0F);
            basketballentity.setPos(player.getEyePosition());
            level.addFreshEntity(basketballentity);
        }
        return InteractionResultHolder.sidedSuccess(itemstack,level.isClientSide());
    }
}
