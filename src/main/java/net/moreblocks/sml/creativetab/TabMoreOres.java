
package net.moreblocks.sml.creativetab;

import net.moreblocks.sml.item.ItemObsidianIngot;
import net.moreblocks.sml.ElementsMoreblocksMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

@ElementsMoreblocksMod.ModElement.Tag
public class TabMoreOres extends ElementsMoreblocksMod.ModElement {
	public TabMoreOres(ElementsMoreblocksMod instance) {
		super(instance, 121);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabmore_ores") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemObsidianIngot.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
