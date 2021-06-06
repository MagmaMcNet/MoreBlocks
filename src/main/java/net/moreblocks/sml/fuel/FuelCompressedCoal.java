
package net.moreblocks.sml.fuel;

import net.moreblocks.sml.item.ItemSupercoal;
import net.moreblocks.sml.ElementsMoreblocksMod;

import net.minecraft.item.ItemStack;

@ElementsMoreblocksMod.ModElement.Tag
public class FuelCompressedCoal extends ElementsMoreblocksMod.ModElement {
	public FuelCompressedCoal(ElementsMoreblocksMod instance) {
		super(instance, 250);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(ItemSupercoal.block, (int) (1)).getItem())
			return 3200;
		return 0;
	}
}
