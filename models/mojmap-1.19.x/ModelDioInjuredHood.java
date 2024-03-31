// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelDioInjuredHood<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "dioinjuredhood"), "main");
	private final ModelPart Head;

	public ModelDioInjuredHood(ModelPart root) {
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(10, 17)
						.addBox(-4.5F, -8.0F, -4.0F, 1.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(73, 0)
						.addBox(-2.5F, -8.1F, -4.75F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 25)
						.addBox(-4.0F, -8.15F, -4.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 52)
						.addBox(-3.0F, -8.15F, -4.5F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 9)
						.addBox(3.0F, -8.15F, -4.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 9)
						.addBox(3.5F, -8.0F, -4.0F, 1.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(18, 34)
						.addBox(-4.0F, -8.0F, 3.5F, 8.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 9)
						.addBox(-4.0F, -0.75F, 0.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(74, 59)
						.addBox(-4.0F, -0.75F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(74, 42)
						.addBox(3.0F, -0.75F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, -8.5F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = Head
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(24, 0).addBox(-1.1F, -5.15F, -0.75F, 1.0F, 5.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(5.0F, -3.6F, -4.0F, 0.0F, 0.0F, -0.48F));

		PartDefinition cube_r2 = Head
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(10, 76).addBox(0.1F, -5.15F, -0.75F, 1.0F, 5.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-5.0F, -3.6F, -4.0F, 0.0F, 0.0F, 0.48F));

		PartDefinition cube_r3 = Head
				.addOrReplaceChild("cube_r3",
						CubeListBuilder.create().texOffs(26, 76).addBox(0.0F, -4.0F, -0.75F, 1.0F, 4.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(3.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition cube_r4 = Head.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(76, 34).addBox(-1.0F, -4.0F, -0.75F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 0.0F, -4.0F, 0.0F, 0.0F, -0.2182F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
	}
}