
package net.moreblocks.sml.creativetab;

import net.moreblocks.sml.item.ItemEndoIron;
import net.moreblocks.sml.ElementsMoreblocksMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

@ElementsMoreblocksMod.ModElement.Tag
public class TabFNAF extends ElementsMoreblocksMod.ModElement {
	public TabFNAF(ElementsMoreblocksMod instance) {
		super(instance, 224);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabfnaf") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemEndoIron.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
