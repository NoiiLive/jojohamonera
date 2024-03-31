// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelYoungJonathanCoat<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "youngjonathancoat"), "main");
	private final ModelPart Body;
	private final ModelPart LeftArm;
	private final ModelPart RightArm;

	public ModelYoungJonathanCoat(ModelPart root) {
		this.Body = root.getChild("Body");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 52)
						.addBox(-1.0F, 5.0F, -2.3F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 51)
						.addBox(-1.0F, 1.0F, -2.15F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 23)
						.addBox(-0.5F, 1.25F, -2.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, 0.0F, 1.4F, 8.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 14)
						.addBox(3.4F, 0.0F, -2.0F, 1.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(36, 0)
						.addBox(1.0F, -0.25F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(35, 33)
						.addBox(1.0F, 11.25F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(53, 45)
						.addBox(-1.0F, 11.15F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(52, 13)
						.addBox(-1.0F, 11.25F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 7)
						.addBox(-1.0F, -0.25F, 1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 14)
						.addBox(-1.0F, -0.15F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(29, 33)
						.addBox(2.0F, 0.0F, -2.4F, 2.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 45)
						.addBox(1.0F, 0.0F, -2.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 13)
						.addBox(-4.4F, 0.0F, -2.0F, 1.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(30, 18)
						.addBox(-4.0F, -0.25F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 29)
						.addBox(-4.0F, 0.0F, -2.4F, 2.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 38)
						.addBox(-2.0F, 0.0F, -2.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 13)
						.addBox(-2.5F, 9.0F, -2.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 38)
						.addBox(-2.75F, 11.25F, -2.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(29, 28)
						.addBox(-4.0F, 11.25F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 12.0F, 0.0F));

		PartDefinition torso_r1 = Body.addOrReplaceChild("torso_r1",
				CubeListBuilder.create().texOffs(6, 54).addBox(-1.0F, -2.0F, -0.5F, 2.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.2919F, 6.1528F, -2.0891F, 0.0F, -0.0873F, -0.1309F));

		PartDefinition torso_r2 = Body.addOrReplaceChild("torso_r2",
				CubeListBuilder.create().texOffs(36, 54).addBox(-1.0F, -2.0F, -0.5F, 2.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.2919F, 1.9156F, -2.0891F, 0.0F, -0.0873F, 0.1309F));

		PartDefinition torso_r3 = Body.addOrReplaceChild("torso_r3",
				CubeListBuilder.create().texOffs(6, 42).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8881F, 10.8918F, 0.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition torso_r4 = Body.addOrReplaceChild("torso_r4",
				CubeListBuilder.create().texOffs(16, 14)
						.addBox(-4.0F, 0.0F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 0)
						.addBox(1.0F, 0.0F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 10.8918F, 1.8881F, 0.2182F, 0.0F, 0.0F));

		PartDefinition torso_r5 = Body.addOrReplaceChild("torso_r5",
				CubeListBuilder.create().texOffs(36, 5).addBox(-0.5F, 0.1F, -0.5001F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 10.8918F, 1.8881F, 0.215F, -0.0376F, 0.1705F));

		PartDefinition torso_r6 = Body.addOrReplaceChild("torso_r6",
				CubeListBuilder.create().texOffs(54, 39).addBox(-1.0F, -2.0F, -0.5F, 2.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.2919F, 6.1528F, -2.0891F, 0.0F, 0.0873F, 0.1309F));

		PartDefinition torso_r7 = Body.addOrReplaceChild("torso_r7",
				CubeListBuilder.create().texOffs(51, 54).addBox(-1.0F, -2.0F, -0.5F, 2.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.2919F, 1.9156F, -2.0891F, 0.0F, 0.0873F, -0.1309F));

		PartDefinition torso_r8 = Body.addOrReplaceChild("torso_r8",
				CubeListBuilder.create().texOffs(18, 4).mirror()
						.addBox(-1.5F, 0.0F, -0.409F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.4644F, 11.6753F, -2.001F, 0.0F, 0.0F, 0.2182F));

		PartDefinition torso_r9 = Body.addOrReplaceChild("torso_r9",
				CubeListBuilder.create().texOffs(18, 4).addBox(-1.5F, 0.0F, -0.409F, 3.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4644F, 11.6753F, -2.001F, 0.0F, 0.0F, -0.2182F));

		PartDefinition torso_r10 = Body.addOrReplaceChild("torso_r10",
				CubeListBuilder.create().texOffs(41, 42).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8881F, 10.8918F, 0.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition torso_r11 = Body.addOrReplaceChild("torso_r11",
				CubeListBuilder.create().texOffs(0, 38).addBox(-0.5F, 0.1F, -0.5001F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 10.8918F, 1.8881F, 0.215F, 0.0376F, -0.1705F));

		PartDefinition torso_r12 = Body.addOrReplaceChild("torso_r12",
				CubeListBuilder.create().texOffs(13, 51).addBox(-2.0F, -1.0F, -0.25F, 2.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.85F, 0.35F, -2.15F, -0.1897F, -0.1084F, -1.0369F));

		PartDefinition torso_r13 = Body.addOrReplaceChild("torso_r13",
				CubeListBuilder.create().texOffs(51, 18).addBox(0.0F, -1.0F, -0.25F, 2.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.85F, 0.35F, -2.15F, -0.1897F, 0.1084F, 1.0369F));

		PartDefinition torso_r14 = Body.addOrReplaceChild("torso_r14",
				CubeListBuilder.create().texOffs(6, 38).addBox(-0.5F, -1.25F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 2.75F, -2.15F, -0.0873F, 0.0F, -0.6981F));

		PartDefinition torso_r15 = Body.addOrReplaceChild("torso_r15",
				CubeListBuilder.create().texOffs(18, 38).addBox(-0.5F, -1.25F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 2.75F, -2.15F, -0.0873F, 0.0F, 0.6981F));

		PartDefinition torso_r16 = Body.addOrReplaceChild("torso_r16",
				CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5817F, 3.1209F, -2.1F, -0.0436F, 0.0F, -0.2618F));

		PartDefinition torso_r17 = Body.addOrReplaceChild("torso_r17",
				CubeListBuilder.create().texOffs(29, 28).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5817F, 3.1209F, -2.1F, -0.0436F, 0.0F, 0.2618F));

		PartDefinition torso_r18 = Body.addOrReplaceChild("torso_r18",
				CubeListBuilder.create().texOffs(30, 18).addBox(-0.4F, -2.0F, -0.49F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.693F, 5.0751F, -1.8F, 0.0F, 0.0F, -0.7418F));

		PartDefinition torso_r19 = Body.addOrReplaceChild("torso_r19",
				CubeListBuilder.create().texOffs(35, 33).addBox(-0.6F, -2.0F, -0.499F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.693F, 5.0751F, -1.8F, 0.0F, 0.0F, 0.7418F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(51, 29)
						.addBox(2.25F, 7.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(26, 0)
						.addBox(2.5F, -2.0F, -2.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 13)
						.addBox(-1.0F, -2.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 14)
						.addBox(-1.5F, -2.0F, -2.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(51, 23)
						.addBox(-1.25F, 7.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(52, 7)
						.addBox(-1.0F, 7.0F, -2.25F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 28)
						.addBox(-1.0F, -2.0F, -2.5F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
						.addBox(-1.0F, -2.0F, 1.5F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 3)
						.addBox(-1.0F, 7.0F, 1.25F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 14.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(51, 29)
				.mirror().addBox(-3.25F, 7.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(26, 0).mirror().addBox(-3.5F, -2.0F, -2.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(28, 13).mirror()
				.addBox(-3.0F, -2.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(20, 14)
				.mirror().addBox(0.5F, -2.0F, -2.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(51, 23).mirror().addBox(0.25F, 7.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(52, 7).mirror()
				.addBox(-3.0F, 7.0F, -2.25F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(19, 28)
				.mirror().addBox(-3.0F, -2.0F, -2.5F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 28).mirror().addBox(-3.0F, -2.0F, 1.5F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(52, 3).mirror()
				.addBox(-3.0F, 7.0F, 1.25F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
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