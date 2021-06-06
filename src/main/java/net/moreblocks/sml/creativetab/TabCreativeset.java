
package net.moreblocks.sml.creativetab;

import net.moreblocks.sml.item.ItemCreativeAxe;
import net.moreblocks.sml.ElementsMoreblocksMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

@ElementsMoreblocksMod.ModElement.Tag
public class TabCreativeset extends ElementsMoreblocksMod.ModElement {
	public TabCreativeset(ElementsMoreblocksMod instance) {
		super(instance, 159);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabcreativeset") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemCreativeAxe.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
