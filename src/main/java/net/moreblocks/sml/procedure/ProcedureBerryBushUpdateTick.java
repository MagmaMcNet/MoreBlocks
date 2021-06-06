package net.moreblocks.sml.procedure;

import net.moreblocks.sml.block.BlockBerryBushberrys;
import net.moreblocks.sml.MoreblocksModVariables;
import net.moreblocks.sml.ElementsMoreblocksMod;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;

import java.util.Map;

@ElementsMoreblocksMod.ModElement.Tag
public class ProcedureBerryBushUpdateTick extends ElementsMoreblocksMod.ModElement {
	public ProcedureBerryBushUpdateTick(ElementsMoreblocksMod instance) {
		super(instance, 333);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure BerryBushUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure BerryBushUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure BerryBushUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure BerryBushUpdateTick!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((Math.random() < 0.05)) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockBerryBushberrys.block.getDefaultState(), 3);
			if (((MoreblocksModVariables.MapVariables.get(world).PRINT_LOG) == (true))) {
				System.out.println("Berry Bush Updated");
			}
		}
		if (((MoreblocksModVariables.MapVariables.get(world).PRINT_LOG) == (true))) {
			System.out.println("Berry Bush Tick Update");
		}
	}
}
