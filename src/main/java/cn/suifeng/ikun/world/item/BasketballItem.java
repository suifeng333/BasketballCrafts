package cn.suifeng.ikun.world.item;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class BasketballItem extends Item {
    public BasketballItem(Item.Properties item){
        super(item);
    }
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand interactionHand) {
        ItemStack itemstack = player.getItemInHand(interactionHand);
        level.playSound((Player)null,player.getX(),player.getY(),player.getZ(), SoundEvents.EGG_THROW, SoundSource.PLAYERS,0.5F,0.4F / (level.getRandom().nextFloat() * 0.4F + 0.8F));
        return InteractionResultHolder.sidedSuccess(itemstack,level.isClientSide());
    }
}
