package cn.suifeng.ikun.world.feature;

import net.minecraft.data.worldgen.features.VegetationFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.function.Supplier;

public class ModPlacedFeatures {
    public static final PlacedFeature LICHI_PLACED =
            PlacementUtils.register("lichi_placed",ModConfiguredFeatures.LICHI_SPAWN.placed(VegetationPlacements.treePlacement(PlacementUtils.countExtra(3,0.1f,2))));

    public static final PlacedFeature KUN_ORE_PLACED =
            PlacementUtils.register("kun_ore_placed",ModConfiguredFeatures.KUN_ORE.placed(ModOrePlacement.commonOrePlacement(50,HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80),VerticalAnchor.absolute(80)))));
}
