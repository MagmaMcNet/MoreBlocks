// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

public static class ModelFox_sleep extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer cube_r1;
	private final ModelRenderer tail;
	private final ModelRenderer cube_r2;
	private final ModelRenderer Right_up;
	private final ModelRenderer right_down;
	private final ModelRenderer left_up;
	private final ModelRenderer left_down;

	public ModelFox_sleep() {
		textureWidth = 48;
		textureHeight = 32;

		head = new ModelRenderer(this);
		head.setRotationPoint(-4.0F, 21.0F, -6.0F);
		setRotationAngle(head, 0.0F, -1.6144F, 0.0F);
		head.cubeList.add(new ModelBox(head, 1, 5, -4.0F, -3.0F, -5.0F, 8, 6, 6, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 8, 1, -4.0F, -5.0F, -4.0F, 2, 2, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 15, 1, 2.0F, -5.0F, -4.0F, 2, 2, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 5, 17, -2.0F, 1.0F, -8.0F, 4, 2, 4, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(-4.0F, 21.0F, 8.0F);
		setRotationAngle(body, -0.3491F, 0.0F, -1.6144F);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-2.0F, -1.0F, -5.0F);
		body.addChild(cube_r1);
		setRotationAngle(cube_r1, 1.3963F, -0.0436F, 0.0436F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 24, 15, -1.5F, -5.0259F, -6.6551F, 6, 11, 6, 0.0F, true));

		tail = new ModelRenderer(this);
		tail.setRotationPoint(-1.1745F, 6.0196F, -4.5043F);
		body.addChild(tail);
		setRotationAngle(tail, -2.5744F, 0.0436F, 0.0F);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-12.0F, 17.0F, 15.0F);
		tail.addChild(cube_r2);
		setRotationAngle(cube_r2, 1.5708F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 30, 0, 9.7745F, -18.3171F, 17.0043F, 4, 9, 5, 0.0F, false));

		Right_up = new ModelRenderer(this);
		Right_up.setRotationPoint(-2.0F, 19.0F, -2.0F);

		right_down = new ModelRenderer(this);
		right_down.setRotationPoint(-2.0F, 19.0F, 5.0F);

		left_up = new ModelRenderer(this);
		left_up.setRotationPoint(5.0F, 19.0F, -2.0F);

		left_down = new ModelRenderer(this);
		left_down.setRotationPoint(2.0F, 19.0F, -2.0F);

	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
		body.render(f5);
		Right_up.render(f5);
		right_down.render(f5);
		left_up.render(f5);
		left_down.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}