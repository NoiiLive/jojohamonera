// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelDioBrandoBoots<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "diobrandoboots"), "main");
	private final ModelPart left_boot;
	private final ModelPart right_boot;

	public ModelDioBrandoBoots(ModelPart root) {
		this.left_boot = root.getChild("left_boot");
		this.right_boot = root.getChild("right_boot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition left_boot = partdefinition.addOrReplaceChild("left_boot",
				CubeListBuilder.create().texOffs(24, 0)
						.addBox(-2.0F, 10.0F, -4.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 18)
						.addBox(-2.0F, 11.25F, -4.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition left_leg_r1 = left_boot.addOrReplaceChild("left_leg_r1",
				CubeListBuilder.create().texOffs(30, 61).addBox(-2.0F, -2.0F, -0.5F, 4.0F, 6.0F, 1.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 2.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition left_leg_r2 = left_boot
				.addOrReplaceChild("left_leg_r2",
						CubeListBuilder.create().texOffs(48, 6).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 7.0F, -2.2F, 0.4363F, 0.0F, 0.0F));

		PartDefinition left_leg_r3 = left_boot.addOrReplaceChild("left_leg_r3",
				CubeListBuilder.create().texOffs(24, 22).addBox(-1.0F, -1.0F, -0.5F, 3.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 8.4769F, -1.9996F, 0.4363F, 0.0F, 0.0F));

		PartDefinition left_leg_r4 = left_boot.addOrReplaceChild("left_leg_r4",
				CubeListBuilder.create().texOffs(68, 17).addBox(-2.0F, -2.0F, -0.5F, 4.0F, 4.0F, 1.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, -2.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition right_leg_r1 = left_boot.addOrReplaceChild("right_leg_r1",
				CubeListBuilder.create().texOffs(21, 52).addBox(-0.5F, -3.0F, -2.0F, 1.0F, 6.0F, 4.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(-2.0F, 9.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition left_leg_r5 = left_boot
				.addOrReplaceChild("left_leg_r5",
						CubeListBuilder.create().texOffs(0, 53).addBox(-0.5F, -3.0F, -2.0F, 1.0F, 6.0F, 4.0F,
								new CubeDeformation(0.01F)),
						PartPose.offsetAndRotation(2.0F, 9.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition right_boot = partdefinition.addOrReplaceChild("right_boot",
				CubeListBuilder.create().texOffs(24, 0).mirror()
						.addBox(-2.0F, 10.0F, -4.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(42, 18).mirror()
						.addBox(-2.0F, 11.25F, -4.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-2.0F, 12.0F, 0.0F));

		PartDefinition right_leg_r2 = right_boot.addOrReplaceChild("right_leg_r2",
				CubeListBuilder.create().texOffs(30, 61).mirror()
						.addBox(-2.0F, -2.0F, -0.5F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 8.0F, 2.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition right_leg_r3 = right_boot.addOrReplaceChild("right_leg_r3",
				CubeListBuilder.create().texOffs(48, 6).mirror()
						.addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 7.0F, -2.2F, 0.4363F, 0.0F, 0.0F));

		PartDefinition right_leg_r4 = right_boot.addOrReplaceChild("right_leg_r4",
				CubeListBuilder.create().texOffs(24, 22).mirror()
						.addBox(-2.0F, -1.0F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.5F, 8.4769F, -1.9996F, 0.4363F, 0.0F, 0.0F));

		PartDefinition right_leg_r5 = right_boot.addOrReplaceChild("right_leg_r5",
				CubeListBuilder.create().texOffs(68, 17).mirror()
						.addBox(-2.0F, -2.0F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 8.0F, -2.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition left_leg_r6 = right_boot.addOrReplaceChild("left_leg_r6",
				CubeListBuilder.create().texOffs(21, 52).mirror()
						.addBox(-0.5F, -3.0F, -2.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.01F)).mirror(false),
				PartPose.offsetAndRotation(2.0F, 9.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition right_leg_r6 = right_boot.addOrReplaceChild("right_leg_r6",
				CubeListBuilder.create().texOffs(0, 53).mirror()
						.addBox(-0.5F, -3.0F, -2.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.01F)).mirror(false),
				PartPose.offsetAndRotation(-2.0F, 9.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		left_boot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_boot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}