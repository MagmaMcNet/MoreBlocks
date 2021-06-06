
package assets.moreblocks_addon.java.item;

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
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import assets.moreblocks_addon.java.ElementsMoreblocksAddonMod;

@ElementsMoreblocksAddonMod.ModElement.Tag
public class ItemSnowFoxFur extends ElementsMoreblocksAddonMod.ModElement {
	@GameRegistry.ObjectHolder("moreblocks_addon:snow_fox_furhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("moreblocks_addon:snow_fox_furbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("moreblocks_addon:snow_fox_furlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("moreblocks_addon:snow_fox_furboots")
	public static final Item boots = null;
	public ItemSnowFoxFur(ElementsMoreblocksAddonMod instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("SNOW_FOX_FUR", "moreblocks_addon:snow_fox", 25, new int[]{3, 5, 6, 3}, 12,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 2f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("snow_fox_furhelmet")
				.setRegistryName("snow_fox_furhelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("snow_fox_furbody")
				.setRegistryName("snow_fox_furbody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("snow_fox_furlegs")
				.setRegistryName("snow_fox_furlegs").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("snow_fox_furboots")
				.setRegistryName("snow_fox_furboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("moreblocks_addon:snow_fox_furhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("moreblocks_addon:snow_fox_furbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("moreblocks_addon:snow_fox_furlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("moreblocks_addon:snow_fox_furboots", "inventory"));
	}
}
