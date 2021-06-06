package net.moreblocks.sml.procedure;

import net.moreblocks.sml.item.ItemTomatoslice;
import net.moreblocks.sml.ElementsMoreblocksMod;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.Container;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.Entity;

import java.util.function.Supplier;
import java.util.Map;

@ElementsMoreblocksMod.ModElement.Tag
public class ProcedureTomoa extends ElementsMoreblocksMod.ModElement {
	public ProcedureTomoa(ElementsMoreblocksMod instance) {
		super(instance, 253);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Tomoa!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((true)) {
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(ItemTomatoslice.block, (int) (1));
						_setstack.setCount(4);
						((Slot) ((Map) invobj).get((int) (0))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
		}
	}
}
