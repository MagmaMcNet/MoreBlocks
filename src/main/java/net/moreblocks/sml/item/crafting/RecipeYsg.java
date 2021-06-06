
package net.moreblocks.sml.item.crafting;

import net.moreblocks.sml.item.ItemToad;
import net.moreblocks.sml.item.ItemBread;
import net.moreblocks.sml.ElementsMoreblocksMod;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@ElementsMoreblocksMod.ModElement.Tag
public class RecipeYsg extends ElementsMoreblocksMod.ModElement {
	public RecipeYsg(ElementsMoreblocksMod instance) {
		super(instance, 266);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemBread.block, (int) (1)), new ItemStack(ItemToad.block, (int) (1)), 2F);
	}
}
