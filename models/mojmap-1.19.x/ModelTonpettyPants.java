// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelTonpettyPants<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "tonpettypants"), "main");
	private final ModelPart Body;
	private final ModelPart LeftLeg;
	private final ModelPart RightLeg;

	public ModelTonpettyPants(ModelPart root) {
		this.Body = root.getChild("Body");
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(38, 19)
						.addBox(-4.0F, 10.0F, -2.45F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 38)
						.addBox(-4.0F, 10.0F, 1.45F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 63)
						.addBox(3.45F, 10.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(61, 34)
						.addBox(-4.45F, 10.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(30, 25)
						.addBox(-2.25F, 0.0F, -2.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 25)
						.addBox(1.25F, 0.0F, -2.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 3)
						.addBox(-2.0F, 0.0F, 1.25F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 46)
						.addBox(-2.0F, 0.0F, -2.25F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(10, 25)
						.addBox(1.25F, 0.0F, -2.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 25)
						.addBox(-2.25F, 0.0F, -2.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(45, 44)
						.addBox(-2.0F, 0.0F, 1.25F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(45, 34)
						.addBox(-2.0F, 0.0F, -2.25F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
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