package cn.suifeng.ikun.world.level.block;

import cn.suifeng.ikun.IkunChicken;
import cn.suifeng.ikun.world.feature.tree.LichiTreeGrower;
import cn.suifeng.ikun.world.level.block.custom.ModFlammableRotatedPillarBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockList {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, IkunChicken.MOD_ID);

    public static final RegistryObject<Block> TITANIUM_ORE = BLOCKS.register("titanium_ore",() -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F,2.0F)));
    public static final RegistryObject<Block> TITANIUM_BLOCK = BLOCKS.register("titanium_block", () -> new Block(Block.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(7.0F, 15.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> LICHI_WOOD = BLOCKS.register("lichi_wood",() -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().sound(SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_LICHI_WOOD = BLOCKS.register("stripped_lichi_wood",() -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).noOcclusion().sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LICHI_LOG = BLOCKS.register("lichi_log",() -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).noOcclusion().sound(SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_LICHI_LOG = BLOCKS.register("stripped_lichi_log",() -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).noOcclusion().sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LICHI_PLANKS = BLOCKS.register("lichi_planks",() -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD)){
        @Override
        public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
            return true;
        }

        @Override
        public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
            return 20;
        }

        @Override
        public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
            return 5;
        }

    });
    public static final RegistryObject<Block> LICHI_LEAVES = BLOCKS.register("lichi_leaves",() -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)){
        @Override
        public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
            return true;
        }

        @Override
        public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
            return 60;
        }

        @Override
        public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
            return 30;
        }

    });
    public static final RegistryObject<Block> LICHI_SAPLING = BLOCKS.register("lichi_sapling",() -> new SaplingBlock(new LichiTreeGrower(),BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
