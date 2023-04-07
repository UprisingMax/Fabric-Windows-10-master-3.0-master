package net.max.projectx.item;

import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.tag.ItemTags;


import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {

    FLINT(6, 30, 2.0F, 0.0F, 15,
            () -> Ingredient.ofItems(new ItemConvertible[]{Items.FLINT})),

    COPPER(1, 180, 5.0F, 0.0F, 15,
            () -> Ingredient.ofItems(new ItemConvertible[]{Items.COPPER_INGOT})),

    BLACK_STEEL(5, 2500, 16.0F, 0F, 20,
            () -> Ingredient.ofItems(ModItems.BLACK_STEEL_INGOT));


    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    private ModToolMaterial(int miningLevel, int itemDurability, float miningSpeed, float attackDamage,
                            int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getMiningLevel() {
        return this.miningLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}