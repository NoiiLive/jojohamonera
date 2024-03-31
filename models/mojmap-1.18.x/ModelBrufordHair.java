// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelBrufordHair<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "brufordhair"), "main");
	private final ModelPart crown;

	public ModelBrufordHair(ModelPart root) {
		this.crown = root.getChild("crown");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition crown = partdefinition.addOrReplaceChild("crown", CubeListBuilder.create().texOffs(6, 16).addBox(
				-0.5F, -5.5F, -4.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = crown
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, 0.0F, -0.5F, 8.0F, 9.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 2.9F, 3.9F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r2 = crown
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(0, 10).addBox(-4.0F, 0.0F, -0.5F, 8.0F, 3.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 3.5F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r3 = crown.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(12, 14).addBox(-1.1F, -0.6F, -0.5F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -5.5F, -4.1F, 0.0F, 0.0F, -0.5236F));

		PartDefinition cube_r4 = crown.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 14).addBox(-1.9F, 0.1F, -0.4F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -5.5F, -4.1F, 0.0F, 0.0F, -2.618F));

		PartDefinition cube_r5 = crown.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(6, 14).addBox(-0.1F, 0.1F, -0.4F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -5.5F, -4.1F, 0.0F, 0.0F, 2.618F));

		PartDefinition cube_r6 = crown.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 16).addBox(-0.9F, -0.6F, -0.5F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -5.5F, -4.1F, 0.0F, 0.0F, 0.5236F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		crown.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}