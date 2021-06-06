
package net.moreblocks.sml.item;

import net.moreblocks.sml.creativetab.TabCreativeset;
import net.moreblocks.sml.ElementsMoreblocksMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

@ElementsMoreblocksMod.ModElement.Tag
public class ItemCreativeArmor extends ElementsMoreblocksMod.ModElement {
	@GameRegistry.ObjectHolder("moreblocks:creative_armorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("moreblocks:creative_armorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("moreblocks:creative_armorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("moreblocks:creative_armorboots")
	public static final Item boots = null;
	public ItemCreativeArmor(ElementsMoreblocksMod instance) {
		super(instance, 74);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("CREATIVE_ARMOR", "moreblocks:bedrock_armor__", 140, new int[]{16, 48, 40, 16},
				83, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("moreblocks:armour3")), 5f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("creative_armorhelmet")
				.setRegistryName("creative_armorhelmet").setCreativeTab(TabCreativeset.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("creative_armorbody")
				.setRegistryName("creative_armorbody").setCreativeTab(TabCreativeset.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("creative_armorlegs")
				.setRegistryName("creative_armorlegs").setCreativeTab(TabCreativeset.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("creative_armorboots")
				.setRegistryName("creative_armorboots").setCreativeTab(TabCreativeset.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("moreblocks:creative_armorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("moreblocks:creative_armorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("moreblocks:creative_armorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("moreblocks:creative_armorboots", "inventory"));
	}
}
