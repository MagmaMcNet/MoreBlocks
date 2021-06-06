// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports

public static class ModelFox_9_baby_sitting extends ModelBase {
	private final ModelRenderer Fox;
	private final ModelRenderer head;
	private final ModelRenderer head_r1;
	private final ModelRenderer body;
	private final ModelRenderer body_rotation;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer leg3;
	private final ModelRenderer leg4;
	private final ModelRenderer tail;
	private final ModelRenderer tail_rotation;
	private final ModelRenderer tail2;
	private final ModelRenderer Tails1;
	private final ModelRenderer Tails2;
	private final ModelRenderer Tails3;
	private final ModelRenderer Tails4;
	private final ModelRenderer Tails5;
	private final ModelRenderer Tails6;
	private final ModelRenderer Tails7;
	private final ModelRenderer Tails8;

	public ModelFox_9_baby_sitting() {
		textureWidth = 24;
		textureHeight = 16;

		Fox = new ModelRenderer(this);
		Fox.setRotationPoint(0.0F, 25.0F, -3.0F);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -6.75F, 2.0F);
		Fox.addChild(head);
		head.cubeList.add(new ModelBox(head, 0, 0, -2.0F, -2.0F, -2.5F, 4, 3, 3, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 10, 6, 1.0F, -3.0F, -2.0F, 1, 1, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 1, 7, -1.0F, 0.0F, -3.5F, 2, 1, 1, 0.0F, false));

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(-1.5F, -2.5F, -1.5F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, 0.0F, 0.0F, -1.5708F);
		head_r1.cubeList.add(new ModelBox(head_r1, 10, 6, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -8.25F, 3.25F);
		Fox.addChild(body);

		body_rotation = new ModelRenderer(this);
		body_rotation.setRotationPoint(0.0F, 3.5F, -0.25F);
		body.addChild(body_rotation);
		setRotationAngle(body_rotation, 0.5236F, 0.0F, 0.0F);
		body_rotation.cubeList.add(new ModelBox(body_rotation, 12, 8, -1.5F, -2.0F, -1.5F, 3, 5, 3, 0.0F, false));

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(-1.0F, -1.25F, 4.0F);
		Fox.addChild(leg1);
		setRotationAngle(leg1, -1.5708F, 0.0F, 0.0F);
		leg1.cubeList.add(new ModelBox(leg1, 4, 12, -0.5005F, -0.75F, -1.0F, 1, 3, 1, 0.0F, false));

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(1.0F, -1.25F, 4.0F);
		Fox.addChild(leg2);
		setRotationAngle(leg2, -1.5708F, 0.0F, 0.0F);
		leg2.cubeList.add(new ModelBox(leg2, 8, 8, -0.4995F, -0.75F, -1.0F, 1, 3, 1, 0.0F, false));

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(-1.0F, -3.25F, 1.5F);
		Fox.addChild(leg3);
		setRotationAngle(leg3, -0.3491F, 0.0F, 0.0F);
		leg3.cubeList.add(new ModelBox(leg3, 8, 12, -0.5005F, -0.75F, -0.5F, 1, 3, 1, 0.0F, false));

		leg4 = new ModelRenderer(this);
		leg4.setRotationPoint(1.0F, -3.25F, 1.5F);
		Fox.addChild(leg4);
		setRotationAngle(leg4, -0.3491F, 0.0F, 0.0F);
		leg4.cubeList.add(new ModelBox(leg4, 0, 12, -0.4995F, -0.75F, -0.5F, 1, 3, 1, 0.0F, false));

		tail = new ModelRenderer(this);
		tail.setRotationPoint(2.5F, -4.5F, 6.5F);
		Fox.addChild(tail);
		setRotationAngle(tail, 0.1309F, 0.0F, 0.0F);

		tail_rotation = new ModelRenderer(this);
		tail_rotation.setRotationPoint(-2.5F, 1.25F, 0.75F);
		tail.addChild(tail_rotation);
		setRotationAngle(tail_rotation, 1.4835F, 0.0F, 0.0F);
		tail_rotation.cubeList.add(new ModelBox(tail_rotation, 14, 0, -1.0F, -1.75F, -2.75F, 2, 5, 3, 0.0F, false));

		tail2 = new ModelRenderer(this);
		tail2.setRotationPoint(0.0F, -1.25F, 0.25F);
		tail_rotation.addChild(tail2);
		setRotationAngle(tail2, 0.0873F, 0.0F, 0.0F);

		Tails1 = new ModelRenderer(this);
		Tails1.setRotationPoint(2.5F, 1.75F, -1.375F);
		tail2.addChild(Tails1);
		setRotationAngle(Tails1, -0.1745F, 0.0F, -0.5672F);
		Tails1.cubeList.add(new ModelBox(Tails1, 14, 0, -0.95F, -2.7F, -1.8F, 2, 5, 3, -0.1F, false));

		Tails2 = new ModelRenderer(this);
		Tails2.setRotationPoint(-2.5F, 2.25F, -1.375F);
		tail2.addChild(Tails2);
		setRotationAngle(Tails2, -0.1745F, 0.0F, 0.5672F);
		Tails2.cubeList.add(new ModelBox(Tails2, 14, 0, -0.95F, -3.2F, -1.8F, 2, 5, 3, -0.1F, false));

		Tails3 = new ModelRenderer(this);
		Tails3.setRotationPoint(0.0F, 2.25F, 1.625F);
		tail2.addChild(Tails3);
		setRotationAngle(Tails3, 0.3927F, 0.0F, 0.0F);
		Tails3.cubeList.add(new ModelBox(Tails3, 14, 0, -0.95F, -2.7F, -0.8F, 2, 5, 3, -0.1F, false));

		Tails4 = new ModelRenderer(this);
		Tails4.setRotationPoint(-2.5F, 2.25F, 1.125F);
		tail2.addChild(Tails4);
		setRotationAngle(Tails4, 0.1309F, 0.0F, 0.3491F);
		Tails4.cubeList.add(new ModelBox(Tails4, 14, 0, -0.95F, -3.7F, -0.8F, 2, 5, 3, -0.1F, false));

		Tails5 = new ModelRenderer(this);
		Tails5.setRotationPoint(2.5F, 2.25F, 1.125F);
		tail2.addChild(Tails5);
		setRotationAngle(Tails5, 0.1309F, 0.0F, -0.3491F);
		Tails5.cubeList.add(new ModelBox(Tails5, 14, 0, -0.95F, -3.7F, -0.8F, 2, 5, 3, -0.1F, false));

		Tails6 = new ModelRenderer(this);
		Tails6.setRotationPoint(2.5F, 1.75F, 0.125F);
		tail2.addChild(Tails6);
		setRotationAngle(Tails6, 0.0F, 0.0F, -0.7854F);
		Tails6.cubeList.add(new ModelBox(Tails6, 14, 0, -0.45F, -2.7F, -1.925F, 2, 5, 3, -0.1F, false));

		Tails7 = new ModelRenderer(this);
		Tails7.setRotationPoint(-2.5F, 1.25F, 0.125F);
		tail2.addChild(Tails7);
		setRotationAngle(Tails7, -0.0873F, 0.0F, 0.7854F);
		Tails7.cubeList.add(new ModelBox(Tails7, 14, 0, -0.45F, -2.7F, -1.925F, 2, 5, 3, -0.1F, false));

		Tails8 = new ModelRenderer(this);
		Tails8.setRotationPoint(0.0F, 2.75F, 1.625F);
		tail2.addChild(Tails8);
		Tails8.cubeList.add(new ModelBox(Tails8, 14, 0, -0.95F, -2.7F, -2.3F, 2, 5, 3, -0.1F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Fox.render(f5);
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
	}
}