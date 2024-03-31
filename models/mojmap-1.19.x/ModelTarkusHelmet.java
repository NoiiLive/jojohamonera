// Made with Blockbench 4.4.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelTarkusHelmet<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "tarkushelmet"), "main");
	private final ModelPart helmet;

	public ModelTarkusHelmet(ModelPart root) {
		this.helmet = root.getChild("helmet");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition helmet = partdefinition.addOrReplaceChild("helmet",
				CubeListBuilder.create().texOffs(21, 0)
						.addBox(-3.5F, -8.5F, -4.5F, 7.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 15)
						.addBox(-4.5F, -8.5F, -4.5F, 1.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 8)
						.addBox(3.5F, -8.5F, -4.5F, 1.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 8)
						.addBox(7.2F, -9.3F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.2F, -9.3F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(22, 8)
						.addBox(-3.5F, -8.5F, 3.5F, 7.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.5F, -8.5F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(11, 8)
						.addBox(-1.5F, -5.5F, -4.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = helmet.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(22, 17).addBox(-3.75F, -1.5F, -0.5F, 4.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.5F, -5.5F, -0.5F, 0.0F, 0.0F, 0.3491F));

		PartDefinition cube_r2 = helmet.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(28, 4).addBox(-0.25F, -1.5F, -0.5F, 4.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.5F, -5.5F, -0.5F, 0.0F, 0.0F, -0.3491F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		helmet.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.helmet.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.helmet.xRot = headPitch / (180F / (float) Math.PI);
	}
}