// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports

public static class ModelFox extends ModelBase {
	private final ModelRenderer FOX;
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer body_rotation;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer leg3;
	private final ModelRenderer leg4;
	private final ModelRenderer tail;
	private final ModelRenderer tail_rotation;

	public ModelFox() {
		textureWidth = 48;
		textureHeight = 32;

		FOX = new ModelRenderer(this);
		FOX.setRotationPoint(0.0F, 17.0F, 6.0F);

		head = new ModelRenderer(this);
		head.setRotationPoint(1.0F, -0.5F, -12.0F);
		FOX.addChild(head);
		head.cubeList.add(new ModelBox(head, 0, 0, -5.0F, -2.0F, -5.0F, 8, 6, 6, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 28, 0, 1.0F, -4.0F, -4.0F, 2, 2, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 22, 0, -5.0F, -4.0F, -4.0F, 2, 2, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 12, -3.0F, 2.0F, -8.0F, 4, 2, 3, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 17, -5.0F, -6.0F, -4.0F, 3, 4, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 8, 17, 0.0F, -6.0F, -4.0F, 3, 4, 1, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -9.5F, -5.5F);
		FOX.addChild(body);

		body_rotation = new ModelRenderer(this);
		body_rotation.setRotationPoint(0.0F, 9.0F, -0.5F);
		body.addChild(body_rotation);
		setRotationAngle(body_rotation, 1.5708F, 0.0F, 0.0F);
		body_rotation.cubeList.add(new ModelBox(body_rotation, 24, 15, -3.0F, -5.0F, -3.0F, 6, 11, 6, 0.0F, false));

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(5.0F, 0.5F, -2.0F);
		FOX.addChild(leg1);
		leg1.cubeList.add(new ModelBox(leg1, 16, 16, -8.001F, 0.5F, -1.0F, 2, 6, 2, 0.0F, false));

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(1.0F, 0.5F, -2.0F);
		FOX.addChild(leg2);
		leg2.cubeList.add(new ModelBox(leg2, 16, 24, 0.001F, 0.5F, -1.0F, 2, 6, 2, 0.0F, false));

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(5.0F, 0.5F, -9.0F);
		FOX.addChild(leg3);
		leg3.cubeList.add(new ModelBox(leg3, 8, 24, -8.001F, 0.5F, -1.0F, 2, 6, 2, 0.0F, false));

		leg4 = new ModelRenderer(this);
		leg4.setRotationPoint(1.0F, 0.5F, -9.0F);
		FOX.addChild(leg4);
		leg4.cubeList.add(new ModelBox(leg4, 0, 24, 0.001F, 0.5F, -1.0F, 2, 6, 2, 0.0F, false));

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 0.0F, 0.0F);
		FOX.addChild(tail);

		tail_rotation = new ModelRenderer(this);
		tail_rotation.setRotationPoint(0.0F, -3.5F, 2.5F);
		tail.addChild(tail_rotation);
		setRotationAngle(tail_rotation, 1.5708F, 0.0F, 0.0F);
		tail_rotation.cubeList.add(new ModelBox(tail_rotation, 30, 0, -2.0F, -2.5F, -5.5F, 4, 9, 5, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		FOX.render(f5);
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
		this.leg1.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.leg4.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leg2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.leg3.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}