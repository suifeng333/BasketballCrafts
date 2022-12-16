package cn.suifeng.ikun.world.feature;

import net.minecraft.data.worldgen.features.VegetationFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.function.Supplier;

public class ModPlacedFeatures {
    public static final PlacedFeature LICHI_PLACED=
            PlacementUtils.register("lichi_placed",ModConfiguredFeatures.LICHI_SPAWN.placed(VegetationPlacements.treePlacement(PlacementUtils.countExtra(10,0.2f,2))));
}
