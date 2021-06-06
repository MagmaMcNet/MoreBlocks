package net.moreblocks.sml.procedure;

import net.moreblocks.sml.item.ItemBerry;
import net.moreblocks.sml.MoreblocksModVariables;
import net.moreblocks.sml.ElementsMoreblocksMod;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import java.util.Map;

@ElementsMoreblocksMod.ModElement.Tag
public class ProcedureAny_Fox9Tails_Asset extends ElementsMoreblocksMod.ModElement {
	public ProcedureAny_Fox9Tails_Asset(ElementsMoreblocksMod instance) {
		super(instance, 309);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Any_Fox9Tails_Asset!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Any_Fox9Tails_Asset!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		if (((MoreblocksModVariables.MapVariables.get(world).bread_Foxes) == (true))) {
			if (((entity instanceof EntityPlayer)
					? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(ItemBerry.block, (int) (1)))
					: false)) {
				MoreblocksModVariables.MapVariables.get(world).tmp_Bread_foxes = (boolean) (true);
				MoreblocksModVariables.MapVariables.get(world).syncData(world);
			}
		}
	}
}
