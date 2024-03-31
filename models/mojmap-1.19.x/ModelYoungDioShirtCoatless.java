// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelYoungDioShirtCoatless<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "youngdioshirtcoatless"), "main");
	private final ModelPart Body;
	private final ModelPart LeftArm;
	private final ModelPart RightArm;

	public ModelYoungDioShirtCoatless(ModelPart root) {
		this.Body = root.getChild("Body");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(20, 27)
						.addBox(-2.0F, 1.0F, -2.25F, 4.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, 0.0F, 1.25F, 8.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 18)
						.addBox(3.25F, 0.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 13)
						.addBox(-4.0F, 11.25F, -2.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(6, 18)
						.addBox(-1.0F, -0.25F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 34)
						.addBox(2.0F, 0.0F, -2.25F, 2.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(27, 39)
						.addBox(1.5F, 0.0F, -2.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 5)
						.addBox(1.5F, -0.35F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(12, 34)
						.addBox(-2.5F, -0.35F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(40, 33)
						.addBox(-2.5F, 11.35F, -2.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 16)
						.addBox(1.5F, 11.35F, -2.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 5)
						.addBox(-2.5F, 11.35F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 0)
						.addBox(-0.5F, 11.35F, 0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
						.addBox(-4.25F, 0.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 0)
						.addBox(-4.0F, -0.25F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 0)
						.mirror().addBox(1.0F, -0.25F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 34).addBox(-4.0F, 0.0F, -2.25F, 2.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(23, 39).addBox(-2.5F, 0.0F, -2.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(40, 25).addBox(-0.5F, 5.0F, 1.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 12.0F, 0.0F));

		PartDefinition torso_r1 = Body
				.addOrReplaceChild("torso_r1",
						CubeListBuilder.create().texOffs(41, 39).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 5.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(2.0F, 0.5F, 2.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition torso_r2 = Body.addOrReplaceChild("torso_r2",
				CubeListBuilder.create().texOffs(43, 2).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 5.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 0.5F, 2.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition torso_r3 = Body.addOrReplaceChild("torso_r3",
				CubeListBuilder.create().texOffs(31, 39).addBox(-2.0F, -2.0F, -0.6F, 2.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.85F, 0.25F, -2.25F, -0.1897F, -0.1084F, -1.0369F));

		PartDefinition torso_r4 = Body.addOrReplaceChild("torso_r4",
				CubeListBuilder.create().texOffs(50, 11).addBox(0.0F, -2.0F, -0.6F, 2.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.85F, 0.25F, -2.25F, -0.1897F, 0.1084F, 1.0369F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(12, 40)
						.addBox(2.35F, 7.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 14)
						.addBox(2.25F, -2.0F, -2.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 13)
						.addBox(2.35F, 5.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 9)
						.addBox(-1.0F, -2.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(18, 0)
						.addBox(-1.25F, -2.0F, -2.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(39, 20)
						.addBox(-1.35F, 7.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(38, 0)
						.addBox(-1.0F, 7.0F, -2.35F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 24)
						.addBox(-1.0F, -2.0F, -2.25F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 14)
						.addBox(-1.0F, -2.0F, 1.25F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 7)
						.addBox(-1.0F, 7.0F, 1.35F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 14.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(12, 40)
				.mirror().addBox(-3.35F, 7.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(20, 14).mirror().addBox(-3.25F, -2.0F, -2.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(0, 13).mirror()
				.addBox(-3.35F, 5.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(24, 9)
				.mirror().addBox(-3.0F, -2.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(18, 0).mirror().addBox(0.25F, -2.0F, -2.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(39, 20).mirror()
				.addBox(0.35F, 7.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(38, 0)
				.mirror().addBox(-3.0F, 7.0F, -2.35F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(30, 24).mirror().addBox(-3.0F, -2.0F, -2.25F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(30, 14).mirror()
				.addBox(-3.0F, -2.0F, 1.25F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(28, 7)
				.mirror().addBox(-3.0F, 7.0F, 1.35F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-5.0F, 14.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
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