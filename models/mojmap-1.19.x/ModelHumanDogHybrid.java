// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelHumanDogHybrid<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "humandoghybrid"), "main");
	private final ModelPart head;
	private final ModelPart body;
	private final ModelPart RightLegBack;
	private final ModelPart LeftLegBack;
	private final ModelPart RightLegFront;
	private final ModelPart LeftLegFront;

	public ModelHumanDogHybrid(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.RightLegBack = root.getChild("RightLegBack");
		this.LeftLegBack = root.getChild("LeftLegBack");
		this.RightLegFront = root.getChild("RightLegFront");
		this.LeftLegFront = root.getChild("LeftLegFront");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 18)
						.addBox(-4.0F, -5.0F, -6.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.5F, -5.5F, -6.5F, 9.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 12.0F, -5.0F));

		PartDefinition body = partdefinition
				.addOrReplaceChild("body",
						CubeListBuilder.create().texOffs(32, 12).addBox(-3.0F, -2.0F, -3.0F, 6.0F, 9.0F, 6.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 14.0F, 2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition upperBody = body.addOrReplaceChild("upperBody",
				CubeListBuilder.create().texOffs(26, 28).addBox(-3.5F, -4.0F, -8.0F, 9.0F, 7.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-1.0F, -2.0F, 6.0F, 0.9599F, 0.0F, 0.0F));

		PartDefinition tail_r1 = tail
				.addOrReplaceChild("tail_r1",
						CubeListBuilder.create().texOffs(24, 41).addBox(-1.0F, -17.2839F, 6.1281F, 2.0F, 8.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(1.0F, 8.0F, 0.0F, 1.6144F, 0.0F, 0.0F));

		PartDefinition RightLegBack = partdefinition.addOrReplaceChild("RightLegBack", CubeListBuilder.create()
				.texOffs(36, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.5F, 16.0F, 7.0F));

		PartDefinition LeftLegBack = partdefinition.addOrReplaceChild("LeftLegBack", CubeListBuilder.create()
				.texOffs(16, 34).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.5F, 16.0F, 7.0F));

		PartDefinition RightLegFront = partdefinition.addOrReplaceChild("RightLegFront", CubeListBuilder.create()
				.texOffs(8, 34).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.5F, 16.0F, -4.0F));

		PartDefinition LeftLegFront = partdefinition.addOrReplaceChild("LeftLegFront", CubeListBuilder.create()
				.texOffs(0, 34).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.5F, 16.0F, -4.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLegBack.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLegBack.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLegFront.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLegFront.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.RightLegFront.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.LeftLegBack.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.LeftLegFront.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightLegBack.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}