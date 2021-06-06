package net.moreblocks.sml.procedure;

import net.moreblocks.sml.ElementsMoreblocksMod;

import net.minecraft.util.DamageSource;
import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import java.util.Map;

@ElementsMoreblocksMod.ModElement.Tag
public class ProcedureDfSwordhit extends ElementsMoreblocksMod.ModElement {
	public ProcedureDfSwordhit(ElementsMoreblocksMod instance) {
		super(instance, 193);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure DfSwordhit!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.INSTANT_DAMAGE, (int) 2, (int) 0, (false), (false)));
		entity.attackEntityFrom(DamageSource.ON_FIRE, (float) 4);
	}
}
