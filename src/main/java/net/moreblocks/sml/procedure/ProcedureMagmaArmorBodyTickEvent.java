package net.moreblocks.sml.procedure;

import net.moreblocks.sml.ElementsMoreblocksMod;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import java.util.Map;

@ElementsMoreblocksMod.ModElement.Tag
public class ProcedureMagmaArmorBodyTickEvent extends ElementsMoreblocksMod.ModElement {
	public ProcedureMagmaArmorBodyTickEvent(ElementsMoreblocksMod instance) {
		super(instance, 160);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MagmaArmorBodyTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, (int) 2, (int) 1, (false), (false)));
	}
}
