// Made with Blockbench 3.8.3
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports


public class ResourcefulSpiderModel extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer back;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer leg3;
	private final ModelRenderer leg4;
	private final ModelRenderer leg5;
	private final ModelRenderer leg6;
	private final ModelRenderer leg7;
	private final ModelRenderer leg8;

	public ResourcefulSpiderModel() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 24.0F, 0.0F);
		head.setTextureOffset(0, 12).addBox(-2.5F, -5.25F, -4.75F, 5.0F, 4.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(0, 3).addBox(-1.5F, -2.5F, -5.25F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(0.5F, -2.5F, -5.25F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		back = new ModelRenderer(this);
		back.setRotationPoint(0.0F, 24.0F, 0.0F);
		back.setTextureOffset(0, 0).addBox(-3.0F, -6.0F, 1.0F, 6.0F, 5.0F, 7.0F, 0.0F, false);

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(1.0F, 22.0F, 2.5F);
		leg1.setTextureOffset(44, 4).addBox(-10.5F, -0.5F, 0.5F, 8.0F, 1.0F, 1.0F, 0.0F, false);

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(0.0F, 24.0F, 0.0F);
		leg2.setTextureOffset(26, 6).addBox(1.5F, -2.5F, 3.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(0.0F, 24.0F, 0.0F);
		leg3.setTextureOffset(44, 2).addBox(-9.5F, -2.75F, 1.25F, 8.0F, 1.0F, 1.0F, 0.0F, false);

		leg4 = new ModelRenderer(this);
		leg4.setRotationPoint(0.0F, 24.0F, 0.0F);
		leg4.setTextureOffset(26, 4).addBox(1.5F, -2.75F, 1.25F, 8.0F, 1.0F, 1.0F, 0.0F, false);

		leg5 = new ModelRenderer(this);
		leg5.setRotationPoint(0.0F, 24.0F, 0.0F);
		leg5.setTextureOffset(44, 6).addBox(-9.5F, -2.75F, -0.5F, 8.0F, 1.0F, 1.0F, 0.0F, false);

		leg6 = new ModelRenderer(this);
		leg6.setRotationPoint(0.0F, 24.0F, 0.0F);
		leg6.setTextureOffset(26, 2).addBox(1.5F, -2.75F, -0.5F, 8.0F, 1.0F, 1.0F, 0.0F, false);

		leg7 = new ModelRenderer(this);
		leg7.setRotationPoint(0.0F, 24.0F, 0.0F);
		leg7.setTextureOffset(44, 0).addBox(-9.5F, -2.5F, -2.25F, 8.0F, 1.0F, 1.0F, 0.0F, false);

		leg8 = new ModelRenderer(this);
		leg8.setRotationPoint(0.0F, 24.0F, 0.0F);
		leg8.setTextureOffset(26, 0).addBox(1.5F, -2.5F, -2.25F, 8.0F, 1.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		back.render(matrixStack, buffer, packedLight, packedOverlay);
		leg1.render(matrixStack, buffer, packedLight, packedOverlay);
		leg2.render(matrixStack, buffer, packedLight, packedOverlay);
		leg3.render(matrixStack, buffer, packedLight, packedOverlay);
		leg4.render(matrixStack, buffer, packedLight, packedOverlay);
		leg5.render(matrixStack, buffer, packedLight, packedOverlay);
		leg6.render(matrixStack, buffer, packedLight, packedOverlay);
		leg7.render(matrixStack, buffer, packedLight, packedOverlay);
		leg8.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}