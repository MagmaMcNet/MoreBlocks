
package net.moreblocks.sml.item;

import net.moreblocks.sml.creativetab.TabMoreOres;
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
public class ItemEmerald_Armor extends ElementsMoreblocksMod.ModElement {
	@GameRegistry.ObjectHolder("moreblocks:emerald_armorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("moreblocks:emerald_armorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("moreblocks:emerald_armorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("moreblocks:emerald_armorboots")
	public static final Item boots = null;
	public ItemEmerald_Armor(ElementsMoreblocksMod instance) {
		super(instance, 40);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("EMERALD_ARMOR", "moreblocks:emerald__", 45, new int[]{6, 7, 8, 6}, 27,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 1.4000000000000001f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("emerald_armorhelmet")
				.setRegistryName("emerald_armorhelmet").setCreativeTab(TabMoreOres.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("emerald_armorbody")
				.setRegistryName("emerald_armorbody").setCreativeTab(TabMoreOres.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("emerald_armorlegs")
				.setRegistryName("emerald_armorlegs").setCreativeTab(TabMoreOres.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("emerald_armorboots")
				.setRegistryName("emerald_armorboots").setCreativeTab(TabMoreOres.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("moreblocks:emerald_armorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("moreblocks:emerald_armorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("moreblocks:emerald_armorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("moreblocks:emerald_armorboots", "inventory"));
	}
}
