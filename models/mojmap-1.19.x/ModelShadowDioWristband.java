// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelShadowDioWristband<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "shadowdiowristband"), "main");
	private final ModelPart Body;
	private final ModelPart LeftArm;
	private final ModelPart RightArm;

	public ModelShadowDioWristband(ModelPart root) {
		this.Body = root.getChild("Body");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 12.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(52, 12)
						.addBox(2.4F, 7.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(34, 50)
						.addBox(2.5F, 6.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 50)
						.addBox(2.6F, 5.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(49, 7)
						.addBox(-1.4F, 7.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 49)
						.addBox(-1.5F, 6.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 49)
						.addBox(-1.6F, 5.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(9, 55)
						.addBox(-1.0F, 6.0F, -2.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(55, 4)
						.addBox(-1.0F, 7.0F, -2.4F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(55, 7)
						.addBox(-1.0F, 5.0F, -2.6F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 36)
						.addBox(-1.0F, 5.0F, 1.6F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(53, 54)
						.addBox(-1.0F, 6.0F, 1.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(55, 2)
						.addBox(-1.0F, 7.0F, 1.4F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 14.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(49, 2)
						.addBox(-3.4F, 7.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 49)
						.addBox(-3.5F, 6.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(46, 48)
						.addBox(-3.6F, 5.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 34)
						.addBox(0.4F, 7.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 47)
						.addBox(0.5F, 6.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 47)
						.addBox(0.6F, 5.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(54, 34)
						.addBox(-3.0F, 6.0F, -2.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 54)
						.addBox(-3.0F, 7.0F, -2.4F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 54)
						.addBox(-3.0F, 5.0F, -2.6F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 53)
						.addBox(-3.0F, 5.0F, 1.6F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 50)
						.addBox(-3.0F, 6.0F, 1.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 48)
						.addBox(-3.0F, 7.0F, 1.4F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 14.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}