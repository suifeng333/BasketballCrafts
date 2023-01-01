package cn.suifeng.ikun.world.feature;

import cn.suifeng.ikun.world.level.block.BlockList;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.List;

public class ModConfiguredFeatures {
    public static final ConfiguredFeature<TreeConfiguration,?> LICHI_TREE =
            FeatureUtils.register("lichi", new ConfiguredFeature<>(Feature.TREE,new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(BlockList.LICHI_LOG.get()),
                    new StraightTrunkPlacer(5, 6, 3),
                    BlockStateProvider.simple(BlockList.LICHI_LEAVES.get()),
                    new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                    new TwoLayersFeatureSize(1, 0, 2)).build()
            ));

    public static final PlacedFeature LICHI_CHECKED =
            PlacementUtils.register("lichi_checked",ModConfiguredFeatures.LICHI_TREE.filteredByBlockSurvival(BlockList.LICHI_SAPLING.get()));

    public static final ConfiguredFeature<RandomFeatureConfiguration,?> LICHI_SPAWN =
            FeatureUtils.register("lichi_spawn",new ConfiguredFeature<>(Feature.RANDOM_SELECTOR,new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(LICHI_CHECKED,0.5f)),LICHI_CHECKED)));
}
