
package net.moreblocks.sml.item.crafting;

import net.moreblocks.sml.item.ItemBronzeingot;
import net.moreblocks.sml.block.BlockBronzeOre;
import net.moreblocks.sml.ElementsMoreblocksMod;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@ElementsMoreblocksMod.ModElement.Tag
public class RecipeSmeltbronzeore extends ElementsMoreblocksMod.ModElement {
	public RecipeSmeltbronzeore(ElementsMoreblocksMod instance) {
		super(instance, 327);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockBronzeOre.block, (int) (1)), new ItemStack(ItemBronzeingot.block, (int) (1)), 1F);
	}
}
