package net.max.projectx.event;

import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;



public class AxeRequirementHandler implements PlayerBlockBreakEvents.Before {
    @Override
    public boolean beforeBlockBreak(World world, PlayerEntity player, BlockPos pos, BlockState state, BlockEntity blockEntity) {
        Item heldItem = player.getMainHandStack().getItem();
        if(player.isCreative()) {
            return true;
        }
        if (state.getMaterial() == Material.WOOD && !(heldItem instanceof AxeItem)) {
            player.sendMessage(Text.literal(player.getName().getString() + " cannot break this block with this tool!"));
            return false;
        } else if (state.getMaterial() == Material.WOOD && heldItem instanceof AxeItem) {
            player.sendMessage(Text.literal(player.getName().getString() + " broke wooden block with an axe!"));
            // Allow the block break event to continue
            return true;
        }
        // True for all other blocks
        return true;
    }
}