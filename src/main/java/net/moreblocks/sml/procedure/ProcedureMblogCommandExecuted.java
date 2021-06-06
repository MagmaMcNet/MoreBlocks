package net.moreblocks.sml.procedure;

import net.moreblocks.sml.MoreblocksModVariables;
import net.moreblocks.sml.ElementsMoreblocksMod;

import net.minecraft.world.World;

import java.util.Map;

@ElementsMoreblocksMod.ModElement.Tag
public class ProcedureMblogCommandExecuted extends ElementsMoreblocksMod.ModElement {
	public ProcedureMblogCommandExecuted(ElementsMoreblocksMod instance) {
		super(instance, 334);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MblogCommandExecuted!");
			return;
		}
		World world = (World) dependencies.get("world");
		if (((MoreblocksModVariables.MapVariables.get(world).PRINT_LOG) == (false))) {
			System.out.println("Print log Hass Been Set To True");
			MoreblocksModVariables.MapVariables.get(world).bread_Foxes = (boolean) (true);
			MoreblocksModVariables.MapVariables.get(world).syncData(world);
		} else if (((MoreblocksModVariables.MapVariables.get(world).PRINT_LOG) == (true))) {
			System.out.println("Print log Hass Been Set To False");
			MoreblocksModVariables.MapVariables.get(world).bread_Foxes = (boolean) (false);
			MoreblocksModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
