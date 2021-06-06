
package net.moreblocks.sml.item;

import net.moreblocks.sml.creativetab.TabFNAF;
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
public class ItemFreddyArmor extends ElementsMoreblocksMod.ModElement {
	@GameRegistry.ObjectHolder("moreblocks:freddy_armorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("moreblocks:freddy_armorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("moreblocks:freddy_armorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("moreblocks:freddy_armorboots")
	public static final Item boots = null;
	public ItemFreddyArmor(ElementsMoreblocksMod instance) {
		super(instance, 95);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("FREDDY_ARMOR", "moreblocks:freddy_", 30, new int[]{4, 12, 10, 4}, 18,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("freddy_armorbody")
				.setRegistryName("freddy_armorbody").setCreativeTab(TabFNAF.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("freddy_armorboots")
				.setRegistryName("freddy_armorboots").setCreativeTab(TabFNAF.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("moreblocks:freddy_armorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("moreblocks:freddy_armorboots", "inventory"));
	}
}
