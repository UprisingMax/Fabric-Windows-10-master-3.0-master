package net.max.projectx.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.max.projectx.ProjectX;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup TANZANITE = FabricItemGroupBuilder.build(
            new Identifier(ProjectX.MOD_ID, "tanzanite"), () -> new ItemStack(ModItems.TANZANITE));

    public static final ItemGroup PROJECTX = FabricItemGroupBuilder.build(
            new Identifier(ProjectX.MOD_ID, "projectx"), () -> new ItemStack(ModItems.ADAMANTIUM_INGOT));
}
