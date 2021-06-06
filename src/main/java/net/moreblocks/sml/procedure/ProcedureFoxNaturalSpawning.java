package net.moreblocks.sml.procedure;

import net.moreblocks.sml.MoreblocksModVariables;
import net.moreblocks.sml.ElementsMoreblocksMod;

import net.minecraft.world.World;

import java.util.Map;

@ElementsMoreblocksMod.ModElement.Tag
public class ProcedureFoxNaturalSpawning extends ElementsMoreblocksMod.ModElement {
	public ProcedureFoxNaturalSpawning(ElementsMoreblocksMod instance) {
		super(instance, 306);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure FoxNaturalSpawning!");
			return false;
		}
		World world = (World) dependencies.get("world");
		if (((MoreblocksModVariables.MapVariables.get(world).Foxes_Normal_Spawn) == (true))) {
			return (true);
		}
		return (false);
	}
}
