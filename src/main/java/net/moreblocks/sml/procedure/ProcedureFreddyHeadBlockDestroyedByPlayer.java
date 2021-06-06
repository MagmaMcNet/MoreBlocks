package net.moreblocks.sml.procedure;

import net.moreblocks.sml.block.BlockFreddyHead;
import net.moreblocks.sml.ElementsMoreblocksMod;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import java.util.Map;

@ElementsMoreblocksMod.ModElement.Tag
public class ProcedureFreddyHeadBlockDestroyedByPlayer extends ElementsMoreblocksMod.ModElement {
	public ProcedureFreddyHeadBlockDestroyedByPlayer(ElementsMoreblocksMod instance) {
		super(instance, 243);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure FreddyHeadBlockDestroyedByPlayer!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer) {
			((EntityPlayer) entity).inventory.armorInventory.set(3, new ItemStack(BlockFreddyHead.block, (int) (1)));
			if (entity instanceof EntityPlayerMP)
				((EntityPlayerMP) entity).inventory.markDirty();
		}
		/* @ItemStack */
	}
}
