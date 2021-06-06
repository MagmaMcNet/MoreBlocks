package net.moreblocks.sml.procedure;

import net.moreblocks.sml.block.BlockBonniehead;
import net.moreblocks.sml.ElementsMoreblocksMod;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import java.util.Map;

@ElementsMoreblocksMod.ModElement.Tag
public class ProcedureBonnieheadBlockDestroyedByPlayer extends ElementsMoreblocksMod.ModElement {
	public ProcedureBonnieheadBlockDestroyedByPlayer(ElementsMoreblocksMod instance) {
		super(instance, 242);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure BonnieheadBlockDestroyedByPlayer!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer) {
			((EntityPlayer) entity).inventory.armorInventory.set(3, new ItemStack(BlockBonniehead.block, (int) (1)));
			if (entity instanceof EntityPlayerMP)
				((EntityPlayerMP) entity).inventory.markDirty();
		}
		/* @ItemStack */
	}
}
