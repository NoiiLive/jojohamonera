// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelStraizoPants<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "straizopants"), "main");
	private final ModelPart Body;
	private final ModelPart LeftLeg;
	private final ModelPart RightLeg;

	public ModelStraizoPants(ModelPart root) {
		this.Body = root.getChild("Body");
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(54, 68)
						.addBox(-4.5F, 11.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(6, 61)
						.addBox(-4.4F, 9.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(68, 34)
						.addBox(3.5F, 11.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 60)
						.addBox(3.4F, 9.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(50, 0)
						.addBox(-4.0F, 11.0F, -2.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 10)
						.addBox(-4.0F, 9.0F, -2.4F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 40)
						.addBox(-4.0F, 11.0F, 1.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 14)
						.addBox(-4.0F, 9.0F, 1.4F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(67, 45)
						.addBox(-2.25F, 7.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(67, 29)
						.addBox(-2.4F, 6.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 67)
						.addBox(1.25F, 7.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(67, 6)
						.addBox(1.4F, 6.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 55)
						.addBox(1.5F, 0.0F, -2.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 52)
						.addBox(-2.5F, 0.0F, -2.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(25, 69)
						.addBox(-2.0F, 7.0F, -2.25F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 0)
						.addBox(-2.0F, 6.0F, -2.4F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 3)
						.addBox(-1.0F, 5.5F, -2.65F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(63, 18)
						.addBox(-2.0F, 0.0F, -2.5F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(63, 11)
						.addBox(-2.0F, 0.0F, 1.5F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 68)
						.addBox(-2.0F, 7.0F, 1.25F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(67, 61)
						.addBox(-2.0F, 6.0F, 1.4F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(6, 67)
						.addBox(1.25F, 7.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 66)
						.addBox(1.4F, 6.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 65)
						.addBox(-2.25F, 7.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(42, 64)
						.addBox(-2.4F, 6.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(52, 19)
						.addBox(-2.5F, 0.0F, -2.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(51, 49)
						.addBox(1.5F, 0.0F, -2.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(67, 59)
						.addBox(-2.0F, 7.0F, -2.25F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 27)
						.addBox(-2.0F, 6.0F, -2.4F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, 5.5F, -2.65F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 62)
						.addBox(-2.0F, 0.0F, -2.5F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 33)
						.addBox(-2.0F, 0.0F, 1.5F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 25)
						.addBox(-2.0F, 7.0F, 1.25F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 59)
						.addBox(-2.0F, 6.0F, 1.4F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}