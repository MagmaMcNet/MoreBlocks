// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelgold_ore extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;

	public Modelgold_ore() {
		textureWidth = 16;
		textureHeight = 16;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.setTextureOffset(4, 4).addBox(-13.0F, -10.0F, 3.0F, 10.0F, 10.0F, 10.0F, 0.0F, true);
		bone.setTextureOffset(4, 12).addBox(-11.5F, -7.5F, 4.5F, 7.0F, 7.0F, 7.0F, 0.0F, true);
		bone.setTextureOffset(5, 6).addBox(-6.75F, -5.0F, 13.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		bone.setTextureOffset(6, 6).addBox(-10.5F, -5.0F, 13.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		bone.setTextureOffset(5, 7).addBox(-10.5F, -3.75F, 13.0F, 5.0F, 1.0F, 4.0F, 0.0F, false);
		bone.setTextureOffset(5, 7).addBox(-9.25F, -5.0F, 13.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);
		bone.setTextureOffset(5, 6).addBox(-9.25F, -5.0F, 17.25F, 2.0F, 1.0F, 0.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-10.25F, -2.5F, 16.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-6.25F, -2.5F, 16.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-7.25F, -2.5F, 16.5F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-9.25F, -2.5F, 16.5F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		bone.setTextureOffset(4, 5).addBox(-6.75F, -7.5F, 13.0F, 2.0F, 2.0F, 0.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-13.25F, -10.75F, 7.5F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.setTextureOffset(0, 1).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2.0F, -10.25F, 7.5F);
		bone.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.7854F);
		cube_r2.setTextureOffset(0, 1).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-14.5F, -13.5F, 7.25F);
		bone.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.7854F);
		cube_r3.setTextureOffset(15, 0).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.5F, -11.5F, 7.25F);
		bone.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.7854F);
		cube_r4.setTextureOffset(14, 0).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-10.0F, -0.75F, 14.0F);
		bone.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.3927F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(0, 0).addBox(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		cube_r5.setTextureOffset(0, 0).addBox(4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-10.0F, -0.25F, 15.0F);
		bone.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.3927F, 0.0F, 0.0F);
		cube_r6.setTextureOffset(0, 0).addBox(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		cube_r6.setTextureOffset(0, 0).addBox(4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-7.25F, 0.25F, 16.25F);
		bone.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.3927F, 0.0F, 0.0F);
		cube_r7.setTextureOffset(0, 0).addBox(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		cube_r7.setTextureOffset(0, 0).addBox(-1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		cube_r7.setTextureOffset(0, 0).addBox(-2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		cube_r7.setTextureOffset(0, 0).addBox(0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-5.25F, -1.0F, 12.0F);
		bone.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.3927F, 0.0F, 0.0F);
		cube_r8.setTextureOffset(1, 2).addBox(-5.5F, 0.0F, 0.0F, 5.0F, 1.0F, 5.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}