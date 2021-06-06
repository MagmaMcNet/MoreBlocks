// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports

public static class ModelNine_Tailed_Fox extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer body_rotation;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer leg3;
	private final ModelRenderer leg4;
	private final ModelRenderer tail;
	private final ModelRenderer tail_rotation;
	private final ModelRenderer tail2;
	private final ModelRenderer Tails2;
	private final ModelRenderer Tails4;
	private final ModelRenderer Tails5;
	private final ModelRenderer Tails1;
	private final ModelRenderer Tails6;
	private final ModelRenderer Tails7;
	private final ModelRenderer Tails3;
	private final ModelRenderer Tails8;

	public ModelNine_Tailed_Fox() {
		textureWidth = 48;
		textureHeight = 32;

		head = new ModelRenderer(this);
		head.setRotationPoint(1.0F, 16.5F, -3.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -5.0F, -2.0F, -5.0F, 8, 6, 6, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 28, 0, 1.0F, -4.0F, -4.0F, 2, 2, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 22, 0, -5.0F, -4.0F, -4.0F, 2, 2, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 12, -3.0F, 2.0F, -8.0F, 4, 2, 3, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 17, -5.0F, -6.0F, -4.0F, 3, 4, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 8, 17, 0.0F, -6.0F, -4.0F, 3, 4, 1, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 7.5F, 3.5F);

		body_rotation = new ModelRenderer(this);
		body_rotation.setRotationPoint(0.0F, 9.0F, -0.5F);
		body.addChild(body_rotation);
		setRotationAngle(body_rotation, 1.5708F, 0.0F, 0.0F);
		body_rotation.cubeList.add(new ModelBox(body_rotation, 24, 15, -3.0F, -5.0F, -3.0F, 6, 11, 6, 0.0F, false));

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(5.0F, 17.5F, 7.0F);
		leg1.cubeList.add(new ModelBox(leg1, 16, 16, -8.001F, 0.5F, -1.0F, 2, 6, 2, 0.0F, false));

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(1.0F, 17.5F, 7.0F);
		leg2.cubeList.add(new ModelBox(leg2, 16, 24, 0.001F, 0.5F, -1.0F, 2, 6, 2, 0.0F, false));

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(5.0F, 17.5F, 0.0F);
		leg3.cubeList.add(new ModelBox(leg3, 8, 24, -8.001F, 0.5F, -1.0F, 2, 6, 2, 0.0F, false));

		leg4 = new ModelRenderer(this);
		leg4.setRotationPoint(1.0F, 17.5F, 0.0F);
		leg4.cubeList.add(new ModelBox(leg4, 0, 24, 0.001F, 0.5F, -1.0F, 2, 6, 2, 0.0F, false));

		tail = new ModelRenderer(this);
		tail.setRotationPoint(4.0F, 13.0F, 10.0F);

		tail_rotation = new ModelRenderer(this);
		tail_rotation.setRotationPoint(-4.0F, 2.5F, 1.5F);
		tail.addChild(tail_rotation);
		setRotationAngle(tail_rotation, 1.4835F, 0.0F, 0.0F);
		tail_rotation.cubeList.add(new ModelBox(tail_rotation, 30, 0, -2.0F, -2.5F, -5.5F, 4, 9, 5, 0.0F, false));

		tail2 = new ModelRenderer(this);
		tail2.setRotationPoint(0.0F, -2.5F, 0.5F);
		tail_rotation.addChild(tail2);
		setRotationAngle(tail2, 0.0873F, 0.0F, 0.0F);

		Tails2 = new ModelRenderer(this);
		Tails2.setRotationPoint(-5.0F, 4.5F, -2.75F);
		tail2.addChild(Tails2);
		setRotationAngle(Tails2, -0.1745F, 0.0F, 0.5672F);
		Tails2.cubeList.add(new ModelBox(Tails2, 30, 0, -2.0F, -5.5F, -3.5F, 4, 9, 5, -0.1F, false));

		Tails4 = new ModelRenderer(this);
		Tails4.setRotationPoint(-5.0F, 4.5F, 2.25F);
		tail2.addChild(Tails4);
		setRotationAngle(Tails4, 0.1309F, 0.0F, 0.3491F);
		Tails4.cubeList.add(new ModelBox(Tails4, 30, 0, -2.0F, -6.5F, -1.5F, 4, 9, 5, -0.1F, false));

		Tails5 = new ModelRenderer(this);
		Tails5.setRotationPoint(5.0F, 4.5F, 2.25F);
		tail2.addChild(Tails5);
		setRotationAngle(Tails5, 0.1309F, 0.0F, -0.3491F);
		Tails5.cubeList.add(new ModelBox(Tails5, 30, 0, -2.0F, -6.5F, -1.5F, 4, 9, 5, -0.1F, false));

		Tails1 = new ModelRenderer(this);
		Tails1.setRotationPoint(5.0F, 3.5F, -2.75F);
		tail2.addChild(Tails1);
		setRotationAngle(Tails1, -0.1745F, 0.0F, -0.5672F);
		Tails1.cubeList.add(new ModelBox(Tails1, 30, 0, -2.0F, -4.5F, -3.5F, 4, 9, 5, -0.1F, false));

		Tails6 = new ModelRenderer(this);
		Tails6.setRotationPoint(5.0F, 3.5F, 0.25F);
		tail2.addChild(Tails6);
		setRotationAngle(Tails6, 0.0F, 0.0F, -0.7854F);
		Tails6.cubeList.add(new ModelBox(Tails6, 30, 0, -1.0F, -4.5F, -3.75F, 4, 9, 5, -0.1F, false));

		Tails7 = new ModelRenderer(this);
		Tails7.setRotationPoint(-5.0F, 2.5F, 0.25F);
		tail2.addChild(Tails7);
		setRotationAngle(Tails7, -0.0873F, 0.0F, 0.7854F);
		Tails7.cubeList.add(new ModelBox(Tails7, 30, 0, -1.0F, -4.5F, -3.75F, 4, 9, 5, -0.1F, false));

		Tails3 = new ModelRenderer(this);
		Tails3.setRotationPoint(0.0F, 4.5F, 3.25F);
		tail2.addChild(Tails3);
		setRotationAngle(Tails3, 0.3927F, 0.0F, 0.0F);
		Tails3.cubeList.add(new ModelBox(Tails3, 30, 0, -2.0F, -4.5F, -1.5F, 4, 9, 5, -0.1F, false));

		Tails8 = new ModelRenderer(this);
		Tails8.setRotationPoint(0.0F, 5.5F, 3.25F);
		tail2.addChild(Tails8);
		Tails8.cubeList.add(new ModelBox(Tails8, 30, 0, -2.0F, -4.5F, -4.5F, 4, 9, 5, -0.1F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
		body.render(f5);
		leg1.render(f5);
		leg2.render(f5);
		leg3.render(f5);
		leg4.render(f5);
		tail.render(f5);
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