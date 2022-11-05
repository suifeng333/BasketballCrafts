package cn.suifeng.ikun.world.item;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

import javax.annotation.Nonnull;
import java.util.function.Supplier;

public enum TierList implements Tier {

    KUN(25, 2500, 25.0F, 27.0F, 14, () -> Ingredient.of(ItemList.KUN_INGOT.get()));

    private final int uses; // 耐久
    private final float speed; // 攻击速度
    private final float damage; // 攻击伤害
    private final int level; // 挖掘等级
    private final int enchantmentValue; // 附魔经验叠加
    private final Supplier<Ingredient> repairIngredient; // 修理材料

    TierList(int level, int uses, float speed, float damage, int enchantmentValue, @Nonnull Supplier<Ingredient> repairIngredient) {
        this.level = level;
        this.uses = uses;
        this.speed = speed;
        this.damage = damage;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = repairIngredient;
    }

    public int getUses() {
        return this.uses;
    }

    public float getSpeed() {
        return this.speed;
    }

    public float getAttackDamageBonus() {
        return this.damage;
    }

    public int getLevel() {
        return this.level;
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Nonnull
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}

