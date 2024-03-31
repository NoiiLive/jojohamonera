// Made with Blockbench 4.5.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelJackTheRipperPants<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "jacktheripperpants"), "main");
	private final ModelPart Body;
	private final ModelPart LeftLeg;
	private final ModelPart RightLeg;

	public ModelJackTheRipperPants(ModelPart root) {
		this.Body = root.getChild("Body");
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(8, 42)
						.addBox(-4.25F, 11.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(30, 40)
						.addBox(3.25F, 11.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 0)
						.addBox(3.5F, 10.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(14, 8)
						.addBox(-4.5F, 10.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(26, 18)
						.addBox(-4.0F, 11.0F, -2.25F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 0)
						.addBox(-4.0F, 10.0F, -2.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, 10.1F, -2.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 16)
						.addBox(-4.0F, 10.0F, 1.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 2)
						.addBox(-4.0F, 11.0F, 1.25F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Body
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(0, 2).addBox(-0.6F, -0.9F, -0.5F, 1.0F, 2.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(1.5F, 9.9F, -2.1F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 7).addBox(-0.4F, -0.9F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 9.9F, -2.1F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(21, 22).addBox(-0.5F, 0.0F, -2.5F, 1.0F, 4.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 11.0F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(20, 40)
						.addBox(-4.5F, 0.0F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 10)
						.addBox(-0.5F, -0.25F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 29)
						.addBox(0.5F, 0.0F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 11.0F, -2.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Body
				.addOrReplaceChild("cube_r5",
						CubeListBuilder.create().texOffs(0, 14).addBox(-4.5F, 0.0F, -0.5F, 9.0F, 4.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 11.0F, 2.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r6 = Body.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(25, 7).addBox(-0.5F, 0.0F, -2.5F, 1.0F, 4.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 11.0F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(10, 23)
						.addBox(-2.25F, 0.0F, -2.0F, 1.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 0)
						.addBox(1.25F, 0.0F, -2.0F, 1.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(33, 20)
						.addBox(-2.0F, 0.0F, -2.25F, 4.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 31)
						.addBox(-2.0F, 0.0F, 1.25F, 4.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(0, 19)
						.addBox(1.25F, 0.0F, -2.0F, 1.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 15)
						.addBox(-2.25F, 0.0F, -2.0F, 1.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 31)
						.addBox(-2.0F, 0.0F, -2.25F, 4.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 31)
						.addBox(-2.0F, 0.0F, 1.25F, 4.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
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