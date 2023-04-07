package net.max.projectx.world.feature;

import net.max.projectx.ProjectX;
import net.max.projectx.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {
    public static final List<OreFeatureConfig.Target> OVERWORLD_ADAMANTIUM_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_ADAMANTIUM_ORE.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ADAMANTIUM_ORE =
            ConfiguredFeatures.register("adamantium_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ADAMANTIUM_ORES, 5));


    public static final List<OreFeatureConfig.Target> OVERWORLD_MYTHRIL_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_MYTHRIL_ORE.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> MYTHRIL_ORE =
            ConfiguredFeatures.register("mythril_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_MYTHRIL_ORES, 5));


    public static final List<OreFeatureConfig.Target> OVERWORLD_DEEP_IRON_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_DEEP_IRON_ORE.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> DEEP_IRON_ORE =
            ConfiguredFeatures.register("deep_iron_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_DEEP_IRON_ORES, 9));

    public static final List<OreFeatureConfig.Target> END_INFUSCOLIUM_ORES = List.of(
            OreFeatureConfig.createTarget(new BlockMatchRuleTest(Blocks.END_STONE), ModBlocks.END_STONE_INFUSCOLIUM_ORE.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> END_INFUSCOLIUM_ORE =
            ConfiguredFeatures.register("infuscolium_ore", Feature.ORE, new OreFeatureConfig(END_INFUSCOLIUM_ORES, 6));

    public static final List<OreFeatureConfig.Target> NETHER_HELLSTONE_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.NETHERRACK, ModBlocks.HELLSTONE_ORE.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> HELLSTONE_ORE =
            ConfiguredFeatures.register("hellstone_ore", Feature.ORE, new OreFeatureConfig(NETHER_HELLSTONE_ORES, 4));


    public static void registerConfiguredFeatures() {
        ProjectX.LOGGER.debug("Registering the ModConfiguredFeatures " + ProjectX.MOD_ID);
    }
}
