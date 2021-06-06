
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
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import java.util.Set;
import java.util.HashMap;

@ElementsMoreblocksMod.ModElement.Tag
public class ItemCreativePickaxe extends ElementsMoreblocksMod.ModElement {
	@GameRegistry.ObjectHolder("moreblocks:creative_pickaxe")
	public static final Item block = null;
	public ItemCreativePickaxe(ElementsMoreblocksMod instance) {
		super(instance, 75);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemPickaxe(EnumHelper.addToolMaterial("CREATIVE_PICKAXE", 20, 6280, 24f, 16f, 140)) {
			{
				this.attackSpeed = -3f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("pickaxe", 20);
				return ret.keySet();
			}
		}.setUnlocalizedName("creative_pickaxe").setRegistryName("creative_pickaxe").setCreativeTab(TabCreativeset.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("moreblocks:creative_pickaxe", "inventory"));
	}
}
