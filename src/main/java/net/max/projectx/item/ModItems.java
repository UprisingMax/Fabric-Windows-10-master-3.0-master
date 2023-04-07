package net.max.projectx.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.max.projectx.ProjectX;
import net.max.projectx.block.ModBlocks;
import net.max.projectx.item.custom.EightBallItem;
import net.max.projectx.item.custom.ModHoeItem;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item RAW_TANZANITE = registerItem("raw_tanzanite",
        new Item(new FabricItemSettings().group(ModItemGroup.TANZANITE)));

    public static final Item TANZANITE = registerItem("tanzanite",
        new Item(new FabricItemSettings().group(ModItemGroup.TANZANITE)));

    public static final Item EIGHT_BALL = registerItem("eight_ball",
            new EightBallItem(new FabricItemSettings().group(ModItemGroup.TANZANITE).maxCount(1)));

    public static final Item EGGPLANT_SEEDS = registerItem("eggplant_seeds",
            new AliasedBlockItem(ModBlocks.EGGPLANT_CROP,
                   new FabricItemSettings().group(ModItemGroup.TANZANITE)));

    public static final Item EGGPLANT = registerItem("eggplant",
            new Item(new FabricItemSettings().group(ModItemGroup.TANZANITE)
                    .food(new FoodComponent.Builder().hunger(4).saturationModifier(4f).build())));

    public static final Item ADAMANTIUM_INGOT = registerItem("adamantium_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.PROJECTX)));

    public static final Item MYTHRIL_INGOT = registerItem("mythril_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.PROJECTX)));

    public static final Item DEEP_IRON_INGOT = registerItem("deep_iron_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.PROJECTX)));

    public static final Item INFUSCOLIUM_INGOT = registerItem("infuscolium_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.PROJECTX)));

    public static final Item BLACK_STEEL_INGOT = registerItem("black_steel_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.PROJECTX)));

    public static final Item HELLSTONE_INGOT = registerItem("hellstone_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.PROJECTX)));

    public static final Item RAW_ADAMANTIUM = registerItem("raw_adamantium",
            new Item(new FabricItemSettings().group(ModItemGroup.PROJECTX)));

    public static final Item RAW_MYTHRIL = registerItem("raw_mythril",
            new Item(new FabricItemSettings().group(ModItemGroup.PROJECTX)));

    public static final Item RAW_DEEP_IRON = registerItem("raw_deep_iron",
            new Item(new FabricItemSettings().group(ModItemGroup.PROJECTX)));

    public static final Item RAW_INFUSCOLIUM = registerItem("raw_infuscolium",
            new Item(new FabricItemSettings().group(ModItemGroup.PROJECTX)));

    public static final Item RAW_HELLSTONE = registerItem("raw_hellstone",
            new Item(new FabricItemSettings().group(ModItemGroup.PROJECTX)));

    public static final Item ADAMANTIUM_NUGGET = registerItem("adamantium_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.PROJECTX)));

    public static final Item MYTHRIL_NUGGET = registerItem("mythril_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.PROJECTX)));

    public static final Item DEEP_IRON_NUGGET = registerItem("deep_iron_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.PROJECTX)));

    public static final Item INFUSCOLIUM_NUGGET = registerItem("infuscolium_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.PROJECTX)));

    public static final Item HELLSTONE_NUGGET = registerItem("hellstone_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.PROJECTX)));

    public static final Item INFUSCOLIUM_DUST = registerItem("infuscolium_dust",
            new Item(new FabricItemSettings().group(ModItemGroup.PROJECTX)));

    public static final Item BLACK_STEEL_HELMET = registerItem("black_steel_helmet",
            new ArmorItem(ModArmorMaterials.BLACK_STEEL, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.PROJECTX)));

    public static final Item BLACK_STEEL_CHESTPLATE = registerItem("black_steel_chestplate",
            new ArmorItem(ModArmorMaterials.BLACK_STEEL, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.PROJECTX)));

    public static final Item BLACK_STEEL_LEGGINGS = registerItem("black_steel_leggings",
            new ArmorItem(ModArmorMaterials.BLACK_STEEL, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.PROJECTX)));

    public static final Item BLACK_STEEL_BOOTS = registerItem("black_steel_boots",
            new ArmorItem(ModArmorMaterials.BLACK_STEEL, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.PROJECTX)));

    public static final Item BLACK_STEEL_SWORD = registerItem("black_steel_sword",
            new SwordItem(ModToolMaterial.BLACK_STEEL, 9, -2.4f,
                    new FabricItemSettings().maxCount(1).group(ModItemGroup.PROJECTX)));

    public static final Item BLACK_STEEL_PICKAXE = registerItem("black_steel_pickaxe",
            new PickaxeItem(ModToolMaterial.BLACK_STEEL, 7, -2.8f,
                    new FabricItemSettings().maxCount(1).group(ModItemGroup.PROJECTX)));

    public static final Item BLACK_STEEL_AXE = registerItem("black_steel_axe",
            new AxeItem(ModToolMaterial.BLACK_STEEL, 11, -3f,
                    new FabricItemSettings().maxCount(1).group(ModItemGroup.PROJECTX)));

    public static final Item BLACK_STEEL_SHOVEL = registerItem("black_steel_shovel",
            new ShovelItem(ModToolMaterial.BLACK_STEEL, 7.5f, -3f,
                    new FabricItemSettings().maxCount(1).group(ModItemGroup.PROJECTX)));

    public static final Item BLACK_STEEL_HOE = registerItem("black_steel_hoe",
            new ModHoeItem(ModToolMaterial.BLACK_STEEL, 1, 0f,
                    new FabricItemSettings().maxCount(1).group(ModItemGroup.PROJECTX)));

    public static final Item COPPER_SWORD = registerItem("copper_sword",
            new SwordItem(ModToolMaterial.COPPER, 5, -2.4f,
                    new FabricItemSettings().maxCount(1).group(ModItemGroup.PROJECTX)));

    public static final Item COPPER_PICKAXE = registerItem("copper_pickaxe",
            new PickaxeItem(ModToolMaterial.COPPER, 3, -2.8f,
                    new FabricItemSettings().maxCount(1).group(ModItemGroup.PROJECTX)));

    public static final Item COPPER_AXE = registerItem("copper_axe",
            new AxeItem(ModToolMaterial.COPPER, 8, -3f,
                    new FabricItemSettings().maxCount(1).group(ModItemGroup.PROJECTX)));

    public static final Item COPPER_SHOVEL = registerItem("copper_shovel",
            new ShovelItem(ModToolMaterial.COPPER, 3.5f, -3f,
                    new FabricItemSettings().maxCount(1).group(ModItemGroup.PROJECTX)));

    public static final Item COPPER_HOE = registerItem("copper_hoe",
            new ModHoeItem(ModToolMaterial.COPPER, 0, 0f,
                    new FabricItemSettings().maxCount(1).group(ModItemGroup.PROJECTX)));

    public static final Item PLANT_FIBER = registerItem("plant_fiber",
            new Item(new FabricItemSettings().group(ModItemGroup.PROJECTX)));

    public static final Item TWINE_BUNDLE = registerItem("twine_bundle",
            new Item(new FabricItemSettings().group(ModItemGroup.PROJECTX)));

    public static final Item VANILLA_ICECREAMCONE = registerItem("vanilla_icecreamcone",
            new Item(new FabricItemSettings().group(ModItemGroup.PROJECTX)
                    .food(new FoodComponent.Builder().hunger(4).saturationModifier(4f).build())));

    public static final Item CHOCOLATE_ICECREAMCONE = registerItem("chocolate_icecreamcone",
            new Item(new FabricItemSettings().group(ModItemGroup.PROJECTX)
                    .food(new FoodComponent.Builder().hunger(4).saturationModifier(4f).build())));

    public static final Item FLINT_KNIFE = registerItem("flint_knife",
            new SwordItem(ModToolMaterial.FLINT, 1, -2.4f,
                    new FabricItemSettings().maxCount(1).group(ModItemGroup.PROJECTX)));

    public static final Item FLINT_AXE = registerItem("flint_axe",
            new AxeItem(ModToolMaterial.FLINT, 1, -2.4f,
                    new FabricItemSettings().maxCount(1).group(ModItemGroup.PROJECTX)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(ProjectX.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ProjectX.LOGGER.debug("Registering Mod Items for " + ProjectX.MOD_ID);
    }
}
