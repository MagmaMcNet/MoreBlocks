package net.moreblocks.sml.procedure;

import net.moreblocks.sml.MoreblocksModVariables;
import net.moreblocks.sml.ElementsMoreblocksMod;

import net.minecraft.world.World;
import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import java.util.Map;

@ElementsMoreblocksMod.ModElement.Tag
public class ProcedureBerryBushMobplayerCollidesWithPlant extends ElementsMoreblocksMod.ModElement {
	public ProcedureBerryBushMobplayerCollidesWithPlant(ElementsMoreblocksMod instance) {
		super(instance, 332);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure BerryBushMobplayerCollidesWithPlant!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure BerryBushMobplayerCollidesWithPlant!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		if ((Math.random() < 0.1)) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.POISON, (int) 25, (int) 1, (false), (false)));
			if (((MoreblocksModVariables.MapVariables.get(world).PRINT_LOG) == (true))) {
				System.out.println("Berry Bush Updated");
			}
		}
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, (int) 6, (int) 2, (false), (false)));
	}
}
