// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelDioBrandoPants<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "diobrandopants"), "main");
	private final ModelPart body;
	private final ModelPart left_leg;
	private final ModelPart right_leg;

	public ModelDioBrandoPants(ModelPart root) {
		this.body = root.getChild("body");
		this.left_leg = root.getChild("left_leg");
		this.right_leg = root.getChild("right_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(71, 87)
						.addBox(-4.0F, 9.0F, -2.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 87)
						.addBox(2.0F, 9.0F, -2.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 9)
						.addBox(-4.0F, 9.0F, 1.5F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(51, 42)
						.addBox(-4.0F, 11.35F, 0.0F, 8.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(22, 62)
						.addBox(-4.0F, 11.35F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(52, 13)
						.addBox(2.0F, 11.35F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(19, 28)
						.addBox(-2.0F, 11.25F, -2.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 63)
						.addBox(3.5F, 9.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(62, 18)
						.addBox(-4.5F, 9.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(75, 75)
						.addBox(-2.0F, 10.0F, -2.25F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 67)
						.addBox(-1.75F, 10.75F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 64)
						.addBox(0.75F, 10.75F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg",
				CubeListBuilder.create().texOffs(90, 12)
						.addBox(0.0F, 0.0F, -2.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).texOffs(52, 36)
						.addBox(0.0F, -0.35F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(19, 31)
						.addBox(-2.0F, -0.35F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 31)
						.addBox(-2.0F, -0.25F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 63)
						.addBox(1.5F, 0.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)).texOffs(20, 87)
						.addBox(-2.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)).texOffs(70, 55)
						.addBox(-2.0F, 0.0F, 1.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).texOffs(44, 87)
						.addBox(-2.0F, 0.0F, -2.25F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 57)
						.addBox(-2.0F, 3.0F, -2.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 86)
						.addBox(-2.25F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 22)
						.addBox(-2.25F, 3.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition left_leg_r1 = left_leg.addOrReplaceChild("left_leg_r1",
				CubeListBuilder.create().texOffs(72, 0).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(0.0F, 4.8518F, 2.3371F, -0.4363F, 0.0F, 0.0F));

		PartDefinition left_leg_r2 = left_leg.addOrReplaceChild("left_leg_r2",
				CubeListBuilder.create().texOffs(12, 37).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F,
						new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(0.0F, 3.2196F, 2.2487F, 0.1745F, 0.0F, 0.0F));

		PartDefinition left_leg_r3 = left_leg.addOrReplaceChild("left_leg_r3",
				CubeListBuilder.create().texOffs(14, 87)
						.addBox(0.0F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)).texOffs(6, 55)
						.addBox(-2.0F, 0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).texOffs(63, 60)
						.addBox(-1.0F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(0.0F, 3.2196F, -2.2487F, -0.1745F, 0.0F, 0.0F));

		PartDefinition left_leg_r4 = left_leg.addOrReplaceChild("left_leg_r4",
				CubeListBuilder.create().texOffs(73, 64).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(0.0F, 4.8518F, -2.3371F, 0.4363F, 0.0F, 0.0F));

		PartDefinition right_leg_r1 = left_leg.addOrReplaceChild("right_leg_r1",
				CubeListBuilder.create().texOffs(40, 63).addBox(-0.8992F, 0.3007F, -2.0F, 1.0F, 2.0F, 4.0F,
						new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(-2.3137F, 3.9575F, 0.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition right_leg_r2 = left_leg.addOrReplaceChild("right_leg_r2",
				CubeListBuilder.create().texOffs(18, 52)
						.addBox(-0.5F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).texOffs(19, 25)
						.addBox(-0.5F, 0.0F, 2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).texOffs(42, 18)
						.addBox(-0.5F, -1.0F, 3.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(-2.1618F, 2.7272F, -3.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition left_leg_r5 = left_leg.addOrReplaceChild("left_leg_r5",
				CubeListBuilder.create().texOffs(57, 59).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 3.0F, 4.0F,
						new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(2.1618F, 2.7272F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition left_leg_r6 = left_leg.addOrReplaceChild("left_leg_r6",
				CubeListBuilder.create().texOffs(63, 62).addBox(-0.1008F, 0.3007F, -2.0F, 1.0F, 2.0F, 4.0F,
						new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(2.3137F, 3.9575F, 0.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition left_leg_r7 = left_leg.addOrReplaceChild("left_leg_r7",
				CubeListBuilder.create().texOffs(88, 46).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(2.5F, 2.5F, 0.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition left_leg_r8 = left_leg.addOrReplaceChild("left_leg_r8",
				CubeListBuilder.create().texOffs(89, 53).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(2.25F, 1.0F, 0.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create()
				.texOffs(90, 12).mirror().addBox(-2.0F, 0.0F, -2.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.001F))
				.mirror(false).texOffs(52, 36).mirror()
				.addBox(-2.0F, -0.35F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(19, 31)
				.mirror().addBox(0.0F, -0.35F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 31).mirror().addBox(0.0F, -0.25F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(50, 63).mirror()
				.addBox(-2.5F, 0.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false).texOffs(20, 87)
				.mirror().addBox(1.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(70, 55).mirror().addBox(-2.0F, 0.0F, 1.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.001F))
				.mirror(false).texOffs(44, 87).mirror()
				.addBox(0.0F, 0.0F, -2.25F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(41, 57)
				.mirror().addBox(1.0F, 3.0F, -2.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(30, 86).mirror().addBox(1.25F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(56, 22).mirror()
				.addBox(1.25F, 3.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-2.0F, 12.0F, 0.0F));

		PartDefinition right_leg_r3 = right_leg.addOrReplaceChild("right_leg_r3",
				CubeListBuilder.create().texOffs(72, 0).mirror()
						.addBox(-2.0F, -0.5F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.8518F, 2.3371F, -0.4363F, 0.0F, 0.0F));

		PartDefinition right_leg_r4 = right_leg.addOrReplaceChild("right_leg_r4",
				CubeListBuilder.create().texOffs(12, 37).mirror()
						.addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.2196F, 2.2487F, 0.1745F, 0.0F, 0.0F));

		PartDefinition right_leg_r5 = right_leg.addOrReplaceChild("right_leg_r5", CubeListBuilder.create()
				.texOffs(14, 87).mirror().addBox(-2.0F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.001F))
				.mirror(false).texOffs(6, 55).mirror()
				.addBox(1.0F, 0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false).texOffs(63, 60)
				.mirror().addBox(0.0F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.2196F, -2.2487F, -0.1745F, 0.0F, 0.0F));

		PartDefinition right_leg_r6 = right_leg.addOrReplaceChild("right_leg_r6",
				CubeListBuilder.create().texOffs(73, 64).mirror()
						.addBox(-2.0F, -0.5F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.8518F, -2.3371F, 0.4363F, 0.0F, 0.0F));

		PartDefinition left_leg_r9 = right_leg.addOrReplaceChild("left_leg_r9",
				CubeListBuilder.create().texOffs(40, 63).mirror()
						.addBox(-0.1008F, 0.3007F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false),
				PartPose.offsetAndRotation(2.3137F, 3.9575F, 0.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition left_leg_r10 = right_leg.addOrReplaceChild("left_leg_r10", CubeListBuilder.create()
				.texOffs(18, 52).mirror().addBox(-0.5F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.mirror(false).texOffs(19, 25).mirror()
				.addBox(-0.5F, 0.0F, 2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false).texOffs(42, 18)
				.mirror().addBox(-0.5F, -1.0F, 3.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false),
				PartPose.offsetAndRotation(2.1618F, 2.7272F, -3.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition right_leg_r7 = right_leg.addOrReplaceChild("right_leg_r7",
				CubeListBuilder.create().texOffs(57, 59).mirror()
						.addBox(-0.5F, -1.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false),
				PartPose.offsetAndRotation(-2.1618F, 2.7272F, 0.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition right_leg_r8 = right_leg.addOrReplaceChild("right_leg_r8",
				CubeListBuilder.create().texOffs(63, 62).mirror()
						.addBox(-0.8992F, 0.3007F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false),
				PartPose.offsetAndRotation(-2.3137F, 3.9575F, 0.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition right_leg_r9 = right_leg.addOrReplaceChild("right_leg_r9",
				CubeListBuilder.create().texOffs(88, 46).mirror()
						.addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false),
				PartPose.offsetAndRotation(-2.5F, 2.5F, 0.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition right_leg_r10 = right_leg.addOrReplaceChild("right_leg_r10",
				CubeListBuilder.create().texOffs(89, 53).mirror()
						.addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false),
				PartPose.offsetAndRotation(-2.25F, 1.0F, 0.0F, 0.0F, 0.0F, -0.4363F));

		return LayerDefinition.create(meshdefinition, 128, 128);
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