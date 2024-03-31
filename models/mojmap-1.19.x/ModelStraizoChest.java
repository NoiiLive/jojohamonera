// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelStraizoChest<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "straizochest"), "main");
	private final ModelPart Chest;
	private final ModelPart LeftArm;
	private final ModelPart RightArm;

	public ModelStraizoChest(ModelPart root) {
		this.Chest = root.getChild("Chest");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Chest = partdefinition.addOrReplaceChild("Chest",
				CubeListBuilder.create().texOffs(20, 14)
						.addBox(-4.0F, 0.0F, -2.5F, 8.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 33)
						.addBox(-4.0F, 1.0F, 1.5F, 8.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(57, 2)
						.addBox(3.5F, 4.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(42, 55)
						.addBox(-4.5F, 4.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 9)
						.addBox(-4.0F, -0.25F, -2.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 25)
						.addBox(-4.25F, -1.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(12, 24)
						.addBox(3.25F, -1.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, -0.75F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(46, 17)
						.addBox(-4.0F, -1.0F, -4.25F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 30)
						.addBox(-4.0F, -1.0F, 3.25F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 12.0F, 0.0F));

		PartDefinition cube_r1 = Chest
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(10, 42).addBox(-0.75F, 0.0F, -2.5F, 1.0F, 4.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r2 = Chest
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(33, 43).addBox(-0.25F, 0.0F, -2.5F, 1.0F, 4.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(4.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r3 = Chest
				.addOrReplaceChild("cube_r3",
						CubeListBuilder.create().texOffs(0, 9).addBox(-4.5F, 0.0F, -0.25F, 9.0F, 20.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Chest.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(32, 25).addBox(-4.5F, 0.0F, -0.75F, 9.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(0, 42)
						.addBox(-1.5F, -2.0F, -2.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(38, 30)
						.addBox(2.5F, -2.0F, -2.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 51)
						.addBox(-1.0F, -2.0F, 1.5F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 30)
						.addBox(-1.0F, -2.0F, -2.5F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 57)
						.addBox(-1.0F, 7.0F, -2.4F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 53)
						.addBox(-1.0F, 7.0F, 1.4F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(63, 54)
						.addBox(2.4F, 7.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(54, 63)
						.addBox(-1.4F, 7.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 5)
						.addBox(-1.0F, -2.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 14.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(28, 34)
						.addBox(0.5F, -2.0F, -2.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(18, 34)
						.addBox(-3.5F, -2.0F, -2.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 47)
						.addBox(-3.0F, -2.0F, 1.5F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(45, 43)
						.addBox(-3.0F, -2.0F, -2.5F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 2)
						.addBox(-3.0F, 7.0F, -2.4F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 7)
						.addBox(-3.0F, 7.0F, 1.4F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(63, 40)
						.addBox(-3.4F, 7.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(36, 62)
						.addBox(0.4F, 7.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(38, 0)
						.addBox(-3.0F, -2.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 14.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Chest.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}