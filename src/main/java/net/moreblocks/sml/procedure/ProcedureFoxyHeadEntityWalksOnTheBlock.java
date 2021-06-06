package net.moreblocks.sml.procedure;

import net.moreblocks.sml.block.BlockFoxyHead;
import net.moreblocks.sml.ElementsMoreblocksMod;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import java.util.Map;

@ElementsMoreblocksMod.ModElement.Tag
public class ProcedureFoxyHeadEntityWalksOnTheBlock extends ElementsMoreblocksMod.ModElement {
	public ProcedureFoxyHeadEntityWalksOnTheBlock(ElementsMoreblocksMod instance) {
		super(instance, 241);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure FoxyHeadEntityWalksOnTheBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer) {
			((EntityPlayer) entity).inventory.armorInventory.set(3, new ItemStack(BlockFoxyHead.block, (int) (1)));
			if (entity instanceof EntityPlayerMP)
				((EntityPlayerMP) entity).inventory.markDirty();
		}
		/* @ItemStack */
	}
}
