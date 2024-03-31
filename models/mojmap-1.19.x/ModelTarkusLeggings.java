// Made with Blockbench 4.4.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelTarkusLeggings<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "tarkusleggings"), "main");
	private final ModelPart LeftLeg;
	private final ModelPart Body;
	private final ModelPart RightLeg;

	public ModelTarkusLeggings(ModelPart root) {
		this.LeftLeg = root.getChild("LeftLeg");
		this.Body = root.getChild("Body");
		this.RightLeg = root.getChild("RightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(42, 0)
						.addBox(-2.0F, 0.0F, -2.25F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(37, 40)
						.addBox(-2.0F, 0.0F, 1.25F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 10)
						.addBox(-2.25F, 0.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(39, 30)
						.addBox(1.25F, 0.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(12, 40)
						.addBox(-2.0F, 1.0F, -2.25F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 33)
						.addBox(-2.0F, 1.0F, 1.25F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition cube_r1 = LeftLeg
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(25, 9).addBox(-0.75F, -0.25F, -2.5F, 1.0F, 3.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6109F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(14, 0)
						.addBox(-4.0F, 7.0F, -2.25F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 19)
						.addBox(-4.0F, 11.0F, -2.25F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 4)
						.addBox(-4.0F, 10.0F, -2.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 21)
						.addBox(-2.0F, 9.95F, -2.6F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 33)
						.addBox(3.25F, 7.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 22)
						.addBox(3.25F, 11.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 17)
						.addBox(3.5F, 10.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 31)
						.addBox(-4.25F, 7.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(31, 40)
						.addBox(-4.25F, 11.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(6, 40)
						.addBox(-4.5F, 10.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(38, 28)
						.addBox(-3.0F, 6.0F, -2.25F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
						.addBox(-4.0F, 7.0F, 1.25F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 6)
						.addBox(-4.0F, 11.0F, 1.25F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 17)
						.addBox(-4.0F, 10.0F, 1.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(6, 31)
						.addBox(-2.0F, 0.0F, -2.25F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 4)
						.addBox(-2.0F, 0.0F, 1.25F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 38)
						.addBox(1.25F, 0.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 38)
						.addBox(-2.25F, 0.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(12, 26)
						.addBox(-1.0F, 1.0F, -2.25F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 24)
						.addBox(-1.0F, 1.0F, 1.25F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));

		PartDefinition cube_r2 = RightLeg
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(5, 23).addBox(-0.25F, -0.25F, -2.5F, 1.0F, 3.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6109F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}