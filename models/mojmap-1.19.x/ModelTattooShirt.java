// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelTattooShirt<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "tattooshirt"), "main");
	private final ModelPart Torso;
	private final ModelPart LeftArm;
	private final ModelPart RightArm;

	public ModelTattooShirt(ModelPart root) {
		this.Torso = root.getChild("Torso");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Torso = partdefinition.addOrReplaceChild("Torso",
				CubeListBuilder.create().texOffs(56, 34)
						.addBox(-3.0F, -0.5F, -2.75F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 26)
						.addBox(-3.0F, -0.5F, 1.25F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(7, 68)
						.addBox(1.0F, -0.5F, -1.75F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(23, 67)
						.addBox(-3.0F, -0.5F, -1.75F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
						.addBox(-4.0F, 3.0F, -2.5F, 8.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 21)
						.addBox(-4.0F, 3.0F, 1.5F, 8.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 8)
						.addBox(3.0F, -0.25F, -2.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 30)
						.addBox(3.5F, 0.0F, -2.0F, 1.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(18, 30)
						.addBox(-4.5F, 0.0F, -2.0F, 1.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(33, 3)
						.addBox(-8.0F, -0.25F, -2.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 12.0F, 0.0F));

		PartDefinition cube_r1 = Torso
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(0, 46).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 6.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition cube_r2 = Torso.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(26, 53).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 4.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 11.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r3 = Torso.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(38, 53).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 4.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 11.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r4 = Torso
				.addOrReplaceChild("cube_r4",
						CubeListBuilder.create().texOffs(32, 47).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 6.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(8.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition cube_r5 = Torso
				.addOrReplaceChild("cube_r5",
						CubeListBuilder.create().texOffs(32, 14).addBox(-4.0F, 0.0F, -0.5F, 8.0F, 4.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 11.0F, 2.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r6 = Torso.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(33, 69).addBox(-1.5F, 0.0F, -0.5F, 3.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5F, 10.9F, -2.0F, -0.0869F, -0.0076F, -0.0869F));

		PartDefinition cube_r7 = Torso.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(0, 71).addBox(-1.5F, 0.0F, -0.5F, 3.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, 10.9F, -2.0F, -0.0869F, 0.0076F, 0.0869F));

		PartDefinition cube_r8 = Torso
				.addOrReplaceChild("cube_r8",
						CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, 0.0F, -0.5F, 16.0F, 6.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r9 = Torso.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(34, 8)
						.addBox(-0.499F, 3.0F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(29, 71)
						.addBox(-0.5F, 0.0F, -0.51F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 30)
						.addBox(-0.2F, 3.0F, -0.511F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, 0.0F, 2.0F, 0.1298F, -0.017F, 0.1298F));

		PartDefinition cube_r10 = Torso.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(24, 30)
						.addBox(-0.8F, 3.0F, -0.511F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 71)
						.addBox(-0.5F, 0.0F, -0.51F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 30)
						.addBox(-0.501F, 3.0F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 0.0F, 2.0F, 0.1298F, 0.017F, -0.1298F));

		PartDefinition cube_r11 = Torso.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(20, 14)
						.addBox(-0.8F, 3.0F, -0.489F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(21, 71)
						.addBox(-0.5F, 0.0F, -0.49F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 19)
						.addBox(-0.501F, 3.0F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 0.0F, -2.0F, -0.1298F, -0.017F, -0.1298F));

		PartDefinition cube_r12 = Torso.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(0, 14)
						.addBox(-0.2F, 3.0F, -0.489F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 19)
						.addBox(-0.499F, 3.0F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(17, 70)
						.addBox(-0.5F, 0.0F, -0.49F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, 0.0F, -2.0F, -0.1298F, 0.017F, 0.1298F));

		PartDefinition cube_r13 = Torso.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(0, 7).addBox(-8.0F, 0.0F, -0.5F, 16.0F, 6.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(64, 8)
						.addBox(-1.5F, 3.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 64)
						.addBox(2.5F, 3.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(70, 14)
						.addBox(-1.0F, 3.0F, -2.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 8)
						.addBox(-1.0F, 3.0F, 1.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 43)
						.addBox(-1.0F, -2.0F, -2.5F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 15)
						.addBox(-1.0F, -2.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(50, 22)
						.addBox(-1.5F, -2.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(50, 36)
						.addBox(2.5F, -2.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(64, 49)
						.addBox(-1.0F, -2.0F, 1.5F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 14.0F, 0.0F));

		PartDefinition cube_r14 = LeftArm.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(58, 19).addBox(-0.5F, -3.0F, -2.0F, 1.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 8.0F, 2.0F, -1.5708F, -1.5272F, 1.5708F));

		PartDefinition cube_r15 = LeftArm.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(66, 55).addBox(-2.0F, -3.0F, -0.5F, 4.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 8.0F, 0.0F, 0.0F, -1.5708F, -0.0436F));

		PartDefinition cube_r16 = LeftArm
				.addOrReplaceChild("cube_r16",
						CubeListBuilder.create().texOffs(42, 67).addBox(-2.0F, -3.0F, -0.5F, 4.0F, 3.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(1.0F, 8.0F, -2.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r17 = LeftArm
				.addOrReplaceChild("cube_r17",
						CubeListBuilder.create().texOffs(16, 59).addBox(-0.5F, -3.0F, -2.0F, 1.0F, 3.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(3.0F, 8.0F, 0.0F, 0.0F, 0.0F, 0.0436F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(6, 62)
						.addBox(0.5F, 3.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(38, 61)
						.addBox(-3.5F, 3.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(62, 69)
						.addBox(-3.0F, 3.0F, -2.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 69)
						.addBox(-3.0F, 3.0F, 1.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(63, 63)
						.addBox(-3.0F, -2.0F, -2.5F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 45)
						.addBox(-3.0F, -2.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 50)
						.addBox(0.5F, -2.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(44, 47)
						.addBox(-3.5F, -2.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(53, 63)
						.addBox(-3.0F, -2.0F, 1.5F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 14.0F, 0.0F));

		PartDefinition cube_r18 = RightArm.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(44, 57).addBox(-0.5F, -3.0F, -2.0F, 1.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 8.0F, 2.0F, -1.5708F, 1.5272F, -1.5708F));

		PartDefinition cube_r19 = RightArm.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(66, 28).addBox(-2.0F, -3.0F, -0.5F, 4.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 8.0F, 0.0F, 0.0F, 1.5708F, 0.0436F));

		PartDefinition cube_r20 = RightArm.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(66, 37).addBox(-2.0F, -3.0F, -0.5F, 4.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 8.0F, -2.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r21 = RightArm.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(58, 12).addBox(-0.5F, -3.0F, -2.0F, 1.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 8.0F, 0.0F, 0.0F, 0.0F, -0.0436F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Torso.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}