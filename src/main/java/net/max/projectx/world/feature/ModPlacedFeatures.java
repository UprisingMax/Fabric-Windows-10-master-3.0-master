package net.max.projectx.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class ModPlacedFeatures {

    public static final RegistryEntry<PlacedFeature> ADAMANTIUM_ORE_PLACED = PlacedFeatures.register("adamantium_ore_placed",
            ModConfiguredFeatures.ADAMANTIUM_ORE, modifiersWithCount(4,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-80), YOffset.fixed(-32))));

    public static final RegistryEntry<PlacedFeature> MYTHRIL_ORE_PLACED = PlacedFeatures.register("mythril_ore_placed",
            ModConfiguredFeatures.MYTHRIL_ORE, modifiersWithCount(4,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-80), YOffset.fixed(-32))));

    public static final RegistryEntry<PlacedFeature> DEEP_IRON_ORE_PLACED = PlacedFeatures.register("deep_iron_ore_placed",
            ModConfiguredFeatures.DEEP_IRON_ORE, modifiersWithCount(5,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-80), YOffset.fixed(-32))));

    public static final RegistryEntry<PlacedFeature> END_INFUSCOLIUM_ORE_PLACED = PlacedFeatures.register("end_infuscolium_ore_placed",
            ModConfiguredFeatures.END_INFUSCOLIUM_ORE, modifiersWithCount(8,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(10), YOffset.fixed(50))));

    public static final RegistryEntry<PlacedFeature> HELLSTONE_ORE_PLACED = PlacedFeatures.register("hellstone_ore_placed",
            ModConfiguredFeatures.HELLSTONE_ORE, modifiersWithCount(4,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-15), YOffset.fixed(40))));

    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }

    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }

    private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
        return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
    }
}
