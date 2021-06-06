
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
public class ItemFoxFurArmour extends ElementsMoreblocksAddonMod.ModElement {
	@GameRegistry.ObjectHolder("moreblocks_addon:fox_fur_armourhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("moreblocks_addon:fox_fur_armourbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("moreblocks_addon:fox_fur_armourlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("moreblocks_addon:fox_fur_armourboots")
	public static final Item boots = null;
	public ItemFoxFurArmour(ElementsMoreblocksAddonMod instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("FOX_FUR_ARMOUR", "moreblocks_addon:fox", 25, new int[]{3, 5, 6, 3}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 2f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("fox_fur_armourhelmet")
				.setRegistryName("fox_fur_armourhelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("fox_fur_armourbody")
				.setRegistryName("fox_fur_armourbody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("fox_fur_armourlegs")
				.setRegistryName("fox_fur_armourlegs").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("fox_fur_armourboots")
				.setRegistryName("fox_fur_armourboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("moreblocks_addon:fox_fur_armourhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("moreblocks_addon:fox_fur_armourbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("moreblocks_addon:fox_fur_armourlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("moreblocks_addon:fox_fur_armourboots", "inventory"));
	}
}
