
package net.moreblocks.sml.item.crafting;

import net.moreblocks.sml.item.ItemObsidianIngot;
import net.moreblocks.sml.block.BlockObsidianOre;
import net.moreblocks.sml.ElementsMoreblocksMod;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@ElementsMoreblocksMod.ModElement.Tag
public class RecipeSmeltobsideianore extends ElementsMoreblocksMod.ModElement {
	public RecipeSmeltobsideianore(ElementsMoreblocksMod instance) {
		super(instance, 328);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockObsidianOre.block, (int) (1)), new ItemStack(ItemObsidianIngot.block, (int) (1)), 1F);
	}
}
