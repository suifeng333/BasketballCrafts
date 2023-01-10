package cn.suifeng.ikun.world.entity;

import cn.suifeng.ikun.IkunChicken;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityTypeList {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, IkunChicken.MOD_ID);

    public static final RegistryObject<EntityType<BasketballEntity>> BASKETBALL = ENTITY_TYPES.register("basketball", () -> EntityType.Builder.<BasketballEntity>of(BasketballEntity::new, MobCategory.MISC).sized(1.0F,1.0F).build("basketball"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}