
package net.moreblocks.sml.creativetab;

import net.moreblocks.sml.block.BlockEyespy;
import net.moreblocks.sml.ElementsMoreblocksMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

@ElementsMoreblocksMod.ModElement.Tag
public class TabMoreBlocks extends ElementsMoreblocksMod.ModElement {
	public TabMoreBlocks(ElementsMoreblocksMod instance) {
		super(instance, 120);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabmore_blocks") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(BlockEyespy.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
