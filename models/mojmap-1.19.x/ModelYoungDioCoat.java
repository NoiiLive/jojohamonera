// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelYoungDioCoat<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "youngdiocoat"), "main");
	private final ModelPart Body;
	private final ModelPart LeftArm;
	private final ModelPart RightArm;

	public ModelYoungDioCoat(ModelPart root) {
		this.Body = root.getChild("Body");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(25, 56)
				.addBox(-1.0F, 8.0F, -2.15F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 52)
				.addBox(-1.0F, 1.0F, -2.25F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 0)
				.addBox(-0.5F, 8.0F, -2.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-4.0F, 0.0F, 1.4F, 8.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 14)
				.addBox(3.4F, 0.0F, -2.0F, 1.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(6, 34)
				.addBox(1.0F, -0.25F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(30, 18)
				.addBox(1.0F, 11.25F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 38)
				.addBox(-1.0F, 11.15F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(22, 38)
				.addBox(-1.0F, 11.25F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 39)
				.addBox(-1.0F, -0.25F, 1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 14)
				.addBox(-1.0F, -0.15F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 0)
				.addBox(2.0F, 0.0F, -2.4F, 2.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(15, 46)
				.addBox(1.0F, 0.0F, -2.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 14).mirror()
				.addBox(-4.4F, 0.0F, -2.0F, 1.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(6, 34)
				.mirror().addBox(-4.0F, -0.25F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(36, 0).mirror().addBox(-4.0F, 0.0F, -2.4F, 2.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(15, 46).mirror()
				.addBox(-2.0F, 0.0F, -2.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(30, 18)
				.mirror().addBox(-4.0F, 11.25F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 12.0F, 0.0F));

		PartDefinition torso_r1 = Body.addOrReplaceChild("torso_r1",
				CubeListBuilder.create().texOffs(18, 4).mirror()
						.addBox(-1.5F, 0.0F, -0.499F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.5356F, 11.6753F, -1.9F, 0.0F, 0.0F, -0.2182F));

		PartDefinition torso_r2 = Body.addOrReplaceChild("torso_r2",
				CubeListBuilder.create().texOffs(55, 54).mirror()
						.addBox(-1.0F, -2.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.2919F, 6.1528F, -2.0891F, 0.0F, -0.0873F, -0.1309F));

		PartDefinition torso_r3 = Body.addOrReplaceChild("torso_r3",
				CubeListBuilder.create().texOffs(9, 56).mirror()
						.addBox(-1.0F, -2.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.2919F, 1.9156F, -2.0891F, 0.0F, -0.0873F, 0.1309F));

		PartDefinition torso_r4 = Body.addOrReplaceChild("torso_r4",
				CubeListBuilder.create().texOffs(42, 34).mirror()
						.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.8881F, 10.8918F, 0.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition torso_r5 = Body.addOrReplaceChild("torso_r5",
				CubeListBuilder.create().texOffs(10, 29).mirror()
						.addBox(-4.0F, 0.0F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(10, 29).addBox(1.0F, 0.0F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 10.8918F, 1.8881F, 0.2182F, 0.0F, 0.0F));

		PartDefinition torso_r6 = Body.addOrReplaceChild("torso_r6",
				CubeListBuilder.create().texOffs(29, 28).mirror()
						.addBox(-0.5F, 0.1F, -0.5001F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.5F, 10.8918F, 1.8881F, 0.215F, -0.0376F, 0.1705F));

		PartDefinition torso_r7 = Body.addOrReplaceChild("torso_r7",
				CubeListBuilder.create().texOffs(55, 54).addBox(-1.0F, -2.0F, -0.5F, 2.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.2919F, 6.1528F, -2.0891F, 0.0F, 0.0873F, 0.1309F));

		PartDefinition torso_r8 = Body.addOrReplaceChild("torso_r8",
				CubeListBuilder.create().texOffs(9, 56).addBox(-1.0F, -2.0F, -0.5F, 2.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.2919F, 1.9156F, -2.0891F, 0.0F, 0.0873F, -0.1309F));

		PartDefinition torso_r9 = Body.addOrReplaceChild("torso_r9",
				CubeListBuilder.create().texOffs(18, 4).addBox(-1.5F, 0.0F, -0.499F, 3.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5356F, 11.6753F, -1.9F, 0.0F, 0.0F, 0.2182F));

		PartDefinition torso_r10 = Body.addOrReplaceChild("torso_r10",
				CubeListBuilder.create().texOffs(42, 34).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8881F, 10.8918F, 0.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition torso_r11 = Body.addOrReplaceChild("torso_r11",
				CubeListBuilder.create().texOffs(29, 28).addBox(-0.5F, 0.1F, -0.5001F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 10.8918F, 1.8881F, 0.215F, 0.0376F, -0.1705F));

		PartDefinition torso_r12 = Body.addOrReplaceChild("torso_r12",
				CubeListBuilder.create().texOffs(0, 52).mirror()
						.addBox(-2.0F, -1.0F, -0.25F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.85F, 0.35F, -2.15F, -0.1897F, -0.1084F, -1.0369F));

		PartDefinition torso_r13 = Body.addOrReplaceChild("torso_r13",
				CubeListBuilder.create().texOffs(0, 52).addBox(0.0F, -1.0F, -0.25F, 2.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.85F, 0.35F, -2.15F, -0.1897F, 0.1084F, 1.0369F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(51, 30)
						.addBox(2.25F, 7.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(26, 0)
						.addBox(2.5F, -2.0F, -2.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(30, 20)
						.addBox(2.6F, 5.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 18)
						.addBox(2.6F, 3.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 13)
						.addBox(-1.0F, -2.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 14)
						.addBox(-1.5F, -2.0F, -2.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(25, 51)
						.addBox(-1.25F, 7.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(49, 52)
						.addBox(-1.0F, 7.0F, -2.25F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 28)
						.addBox(-1.0F, -2.0F, -2.5F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
						.addBox(-1.0F, -2.0F, 1.5F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 9)
						.addBox(-1.0F, 7.0F, 1.25F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 14.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(51, 30)
				.mirror().addBox(-3.25F, 7.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(26, 0).mirror().addBox(-3.5F, -2.0F, -2.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(30, 20).mirror()
				.addBox(-3.6F, 5.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(30, 18)
				.mirror().addBox(-3.6F, 3.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(28, 13).mirror().addBox(-3.0F, -2.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(20, 14).mirror()
				.addBox(0.5F, -2.0F, -2.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(25, 51)
				.mirror().addBox(0.25F, 7.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(49, 52).mirror().addBox(-3.0F, 7.0F, -2.25F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(19, 28).mirror()
				.addBox(-3.0F, -2.0F, -2.5F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 28)
				.mirror().addBox(-3.0F, -2.0F, 1.5F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(52, 9).mirror().addBox(-3.0F, 7.0F, 1.25F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.mirror(false), PartPose.offset(-5.0F, 14.0F, 0.0F));

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