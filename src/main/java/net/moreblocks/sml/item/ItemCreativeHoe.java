
package net.moreblocks.sml.item;

import net.moreblocks.sml.creativetab.TabCreativeset;
import net.moreblocks.sml.ElementsMoreblocksMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import java.util.Set;
import java.util.HashMap;

@ElementsMoreblocksMod.ModElement.Tag
public class ItemCreativeHoe extends ElementsMoreblocksMod.ModElement {
	@GameRegistry.ObjectHolder("moreblocks:creative_hoe")
	public static final Item block = null;
	public ItemCreativeHoe(ElementsMoreblocksMod instance) {
		super(instance, 79);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemHoe(EnumHelper.addToolMaterial("CREATIVE_HOE", 20, 6280, 24f, 0f, 140)) {
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("hoe", 20);
				return ret.keySet();
			}
		}.setUnlocalizedName("creative_hoe").setRegistryName("creative_hoe").setCreativeTab(TabCreativeset.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("moreblocks:creative_hoe", "inventory"));
	}
}
