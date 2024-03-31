// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelHamonMask<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "hamonmask"), "main");
	private final ModelPart mask;

	public ModelHamonMask(ModelPart root) {
		this.mask = root.getChild("mask");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition mask = partdefinition.addOrReplaceChild("mask",
				CubeListBuilder.create().texOffs(0, 2)
						.addBox(-4.0F, -1.0F, -4.25F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, -0.75F, -4.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 13)
						.addBox(3.25F, -1.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 12)
						.addBox(3.25F, -2.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 11)
						.addBox(-4.25F, -1.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(9, 4)
						.addBox(-4.25F, -2.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = mask.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(8, 7)
						.addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 11)
						.addBox(6.8F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.65F, -1.0F, -1.5F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r2 = mask.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(10, 12).addBox(0.1513F, -1.8109F, -0.1937F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.9124F, -4.2462F, -0.4489F, 0.6699F, 0.2139F));

		PartDefinition cube_r3 = mask.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(14, 4).addBox(-2.1513F, -1.8109F, -0.1937F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.9124F, -4.2462F, -0.4489F, -0.6699F, -0.2139F));

		PartDefinition cube_r4 = mask.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 4).addBox(-1.5F, -1.9967F, -1.1359F, 3.0F, 4.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.9124F, -4.2462F, 0.2618F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		mask.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}