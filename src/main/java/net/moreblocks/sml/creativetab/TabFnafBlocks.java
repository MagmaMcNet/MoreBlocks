
package net.moreblocks.sml.creativetab;

import net.moreblocks.sml.block.BlockFloor3;
import net.moreblocks.sml.ElementsMoreblocksMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

@ElementsMoreblocksMod.ModElement.Tag
public class TabFnafBlocks extends ElementsMoreblocksMod.ModElement {
	public TabFnafBlocks(ElementsMoreblocksMod instance) {
		super(instance, 238);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabfnaf_blocks") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(BlockFloor3.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
