
package net.moreblocks.sml.item.crafting;

import net.moreblocks.sml.item.ItemSilveringot;
import net.moreblocks.sml.block.BlockSilverore;
import net.moreblocks.sml.ElementsMoreblocksMod;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@ElementsMoreblocksMod.ModElement.Tag
public class RecipeSilversmelt extends ElementsMoreblocksMod.ModElement {
	public RecipeSilversmelt(ElementsMoreblocksMod instance) {
		super(instance, 326);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockSilverore.block, (int) (1)), new ItemStack(ItemSilveringot.block, (int) (1)), 1F);
	}
}
