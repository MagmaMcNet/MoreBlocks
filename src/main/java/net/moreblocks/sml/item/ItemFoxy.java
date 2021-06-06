
package net.moreblocks.sml.item;

import net.moreblocks.sml.creativetab.TabFNAF;
import net.moreblocks.sml.ElementsMoreblocksMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelBase;

@ElementsMoreblocksMod.ModElement.Tag
public class ItemFoxy extends ElementsMoreblocksMod.ModElement {
	@GameRegistry.ObjectHolder("moreblocks:foxyhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("moreblocks:foxybody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("moreblocks:foxylegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("moreblocks:foxyboots")
	public static final Item boots = null;
	public ItemFoxy(ElementsMoreblocksMod instance) {
		super(instance, 97);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("FOXY", "moreblocks:foxy_", 25, new int[]{2, 4, 8, 2}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("foxybody").setRegistryName("foxybody")
				.setCreativeTab(TabFNAF.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("foxylegs").setRegistryName("foxylegs")
				.setCreativeTab(TabFNAF.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("foxyboots").setRegistryName("foxyboots")
				.setCreativeTab(TabFNAF.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("moreblocks:foxybody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("moreblocks:foxylegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("moreblocks:foxyboots", "inventory"));
	}
	// Made with Blockbench 3.7.5
	// Exported for Minecraft version 1.12
	// Paste this class into your mod and generate all required imports
	public static class ModelFox extends ModelBase {
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer cube_r1;
		private final ModelRenderer tail;
		private final ModelRenderer cube_r2;
		private final ModelRenderer Right_up;
		private final ModelRenderer right_down;
		private final ModelRenderer left_up;
		private final ModelRenderer left_down;
		public ModelFox() {
			textureWidth = 48;
			textureHeight = 32;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 18.0F, -3.0F);
			head.cubeList.add(new ModelBox(head, 1, 5, -4.0F, -3.0F, -7.0F, 8, 6, 6, 0.0F, false));
			head.cubeList.add(new ModelBox(head, 8, 1, -4.0F, -5.0F, -6.0F, 2, 2, 1, 0.0F, false));
			head.cubeList.add(new ModelBox(head, 15, 1, 2.0F, -5.0F, -6.0F, 2, 2, 1, 0.0F, false));
			head.cubeList.add(new ModelBox(head, 5, 17, -2.0F, 1.0F, -10.0F, 4, 2, 4, 0.0F, false));
			body = new ModelRenderer(this);
			body.setRotationPoint(1.0F, 18.0F, 7.0F);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(-1.0F, 14.0F, 8.0F);
			body.addChild(cube_r1);
			setRotationAngle(cube_r1, 1.5708F, 0.0F, 0.0F);
			cube_r1.cubeList.add(new ModelBox(cube_r1, 24, 15, -3.0F, -19.0F, 12.0F, 6, 11, 6, 0.0F, false));
			tail = new ModelRenderer(this);
			tail.setRotationPoint(-1.0F, -1.0F, 0.0F);
			body.addChild(tail);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(-12.0F, 17.0F, 15.0F);
			tail.addChild(cube_r2);
			setRotationAngle(cube_r2, 1.5708F, 0.0F, 0.0F);
			cube_r2.cubeList.add(new ModelBox(cube_r2, 30, 0, 10.0F, -15.0F, 14.5F, 4, 9, 5, 0.0F, false));
			Right_up = new ModelRenderer(this);
			Right_up.setRotationPoint(-2.0F, 19.0F, -2.0F);
			Right_up.cubeList.add(new ModelBox(Right_up, 13, 24, -1.0F, -1.0F, -1.0F, 2, 6, 2, 0.0F, false));
			right_down = new ModelRenderer(this);
			right_down.setRotationPoint(-2.0F, 19.0F, 5.0F);
			right_down.cubeList.add(new ModelBox(right_down, 13, 24, -1.0F, -1.0F, -1.0F, 2, 6, 2, 0.0F, false));
			left_up = new ModelRenderer(this);
			left_up.setRotationPoint(2.0F, 19.0F, -2.0F);
			left_up.cubeList.add(new ModelBox(left_up, 4, 24, -1.0F, -1.0F, -1.0F, 2, 6, 2, 0.0F, false));
			left_down = new ModelRenderer(this);
			left_down.setRotationPoint(0.0F, 0.0F, 0.0F);
			left_up.addChild(left_down);
			left_down.cubeList.add(new ModelBox(left_down, 4, 24, -1.0F, -1.0F, 6.0F, 2, 6, 2, 0.0F, false));
		}

		@Override
		public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
			head.render(f5);
			body.render(f5);
			Right_up.render(f5);
			right_down.render(f5);
			left_up.render(f5);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
			super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.right_down.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.left_down.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.left_up.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.Right_up.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}
}
