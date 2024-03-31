// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelJonathanBoxingShorts<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "jonathanboxingshorts"), "main");
	private final ModelPart body;
	private final ModelPart left_leg;
	private final ModelPart right_leg;

	public ModelJonathanBoxingShorts(ModelPart root) {
		this.body = root.getChild("body");
		this.left_leg = root.getChild("left_leg");
		this.right_leg = root.getChild("right_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(24, 16)
						.addBox(-4.0F, 10.0F, -2.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 20)
						.addBox(-4.0F, 11.0F, -2.3701F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 30)
						.addBox(3.5F, 10.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(37, 11)
						.addBox(3.3701F, 11.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(18, 6)
						.addBox(-4.0F, 10.0F, 1.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 18)
						.addBox(-4.0F, 11.0F, 1.3701F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 25)
						.addBox(-4.5F, 10.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(36, 35)
						.addBox(-4.3701F, 11.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, 11.25F, -2.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(20, 1)
				.addBox(-2.0F, -0.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition right_leg_r1 = left_leg
				.addOrReplaceChild("right_leg_r1",
						CubeListBuilder.create().texOffs(10, 26).addBox(0.0F, -3.0F, -2.0F, 1.0F, 6.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-2.5F, 2.9F, 0.0F, 0.0F, 0.0F, 0.0436F));

		PartDefinition left_leg_r1 = left_leg
				.addOrReplaceChild("left_leg_r1",
						CubeListBuilder.create().texOffs(24, 26).addBox(-1.0F, -3.0F, -2.0F, 1.0F, 6.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(2.5F, 2.9F, 0.0F, 0.0F, 0.0F, -0.0436F));

		PartDefinition left_leg_r2 = left_leg
				.addOrReplaceChild("left_leg_r2",
						CubeListBuilder.create().texOffs(30, 22).addBox(-2.0F, -3.0F, -1.0F, 4.0F, 6.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 2.9F, 2.5F, 0.0436F, 0.0F, 0.0F));

		PartDefinition left_leg_r3 = left_leg.addOrReplaceChild("left_leg_r3",
				CubeListBuilder.create().texOffs(31, 8).addBox(-2.0F, -3.0F, 0.0F, 4.0F, 6.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.9F, -2.5F, -0.0436F, 0.0F, 0.0F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg",
				CubeListBuilder.create().texOffs(20, 1).mirror()
						.addBox(-2.0F, -0.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-2.0F, 12.0F, 0.0F));

		PartDefinition left_leg_r4 = right_leg.addOrReplaceChild("left_leg_r4",
				CubeListBuilder.create().texOffs(10, 26).mirror()
						.addBox(-1.0F, -3.0F, -2.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.5F, 2.9F, 0.0F, 0.0F, 0.0F, -0.0436F));

		PartDefinition right_leg_r2 = right_leg.addOrReplaceChild("right_leg_r2",
				CubeListBuilder.create().texOffs(24, 26).mirror()
						.addBox(0.0F, -3.0F, -2.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.5F, 2.9F, 0.0F, 0.0F, 0.0F, 0.0436F));

		PartDefinition right_leg_r3 = right_leg.addOrReplaceChild("right_leg_r3",
				CubeListBuilder.create().texOffs(30, 22).mirror()
						.addBox(-2.0F, -3.0F, -1.0F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 2.9F, 2.5F, 0.0436F, 0.0F, 0.0F));

		PartDefinition right_leg_r4 = right_leg.addOrReplaceChild("right_leg_r4",
				CubeListBuilder.create().texOffs(31, 8).mirror()
						.addBox(-2.0F, -3.0F, 0.0F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 2.9F, -2.5F, -0.0436F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}