// Made with Blockbench 4.9.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelBloodyRedStoneMask<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "bloodyredstonemask"), "main");
	private final ModelPart mask;

	public ModelBloodyRedStoneMask(ModelPart root) {
		this.mask = root.getChild("mask");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition mask = partdefinition.addOrReplaceChild("mask",
				CubeListBuilder.create().texOffs(0, 24)
						.addBox(-1.0F, -4.0F, -5.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 9)
						.addBox(-3.0F, -3.0F, -5.0F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(21, 30)
						.addBox(-1.5F, -0.9F, -5.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 20)
						.addBox(0.5F, -0.9F, -5.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 28)
						.addBox(-3.5F, -3.0F, -4.999F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 28)
						.addBox(2.5F, -3.0F, -4.999F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 26)
						.addBox(-3.5F, -8.0F, -4.999F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 25)
						.addBox(2.5F, -8.0F, -4.999F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.0F, -8.0F, -5.0F, 6.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = mask.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(8, 13).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5F, -4.0F, -4.2929F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r2 = mask.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(16, 0).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5F, -4.0F, -4.2929F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r3 = mask.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(24, 22).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -4.4F, -4.7F, 0.0F, 0.0F, -0.1309F));

		PartDefinition cube_r4 = mask.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(25, 0).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -4.4F, -4.7F, 0.0F, 0.0F, 0.1309F));

		PartDefinition cube_r5 = mask.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 5).addBox(-3.0F, -0.5F, -0.5F, 7.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -8.0F, -4.2929F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r6 = mask.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 7).addBox(-3.0F, -0.5F, -0.5F, 7.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 0.0F, -4.2929F, 0.7854F, 0.0F, 0.0F));

		PartDefinition socket = mask.addOrReplaceChild("socket", CubeListBuilder.create().texOffs(8, 24).addBox(-1.0F,
				-2.9301F, -0.9928F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -4.2199F, -4.8072F));

		PartDefinition cube_r7 = socket.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(26, 16).addBox(-1.0F, -0.5F, -0.55F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, 2.0699F, 0.2572F, 0.0F, 0.0F, 0.3054F));

		PartDefinition cube_r8 = socket.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(12, 30).addBox(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3701F, 2.2203F, 0.2572F, 0.0F, 0.0F, -0.3054F));

		PartDefinition cube_r9 = socket.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(30, 13).addBox(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3701F, 2.2203F, 0.2572F, 0.0F, 0.0F, 0.3054F));

		PartDefinition cube_r10 = socket.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(27, 3).addBox(-1.0F, -0.5F, -0.55F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5F, 2.0699F, 0.2572F, 0.0F, 0.0F, -0.3054F));

		PartDefinition cube_r11 = socket.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(0, 28).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 1.0699F, -0.1357F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r12 = socket.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(27, 5).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.9301F, -0.1357F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r13 = socket.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(27, 27).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 1.0699F, -0.1357F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r14 = socket.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(27, 8).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0699F, -0.1357F, 0.7854F, 0.0F, 0.0F));

		PartDefinition spikes = mask.addOrReplaceChild("spikes", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition spike1 = spikes.addOrReplaceChild("spike1", CubeListBuilder.create(),
				PartPose.offsetAndRotation(4.1212F, -6.5F, -2.3716F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r15 = spike1.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(22, 18).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0849F, 0.0F, 1.9861F, 0.0F, -0.5672F, 0.0F));

		PartDefinition cube_r16 = spike1.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(19, 22).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3297F, 0.0F, -0.2489F, 0.0F, 0.3491F, 0.0F));

		PartDefinition cube_r17 = spike1.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(29, 11).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3788F, 0.0F, -1.1284F, 0.0F, 0.9163F, 0.0F));

		PartDefinition spike2 = spikes.addOrReplaceChild("spike2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(4.1212F, -1.5F, -2.3716F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r18 = spike2.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(22, 4).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0849F, 0.0F, 1.9861F, 0.0F, -0.5672F, 0.0F));

		PartDefinition cube_r19 = spike2.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(22, 8).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3297F, 0.0F, -0.2489F, 0.0F, 0.3491F, 0.0F));

		PartDefinition cube_r20 = spike2.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(22, 28).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3788F, 0.0F, -1.1284F, 0.0F, 0.9163F, 0.0F));

		PartDefinition spike3 = spikes.addOrReplaceChild("spike3", CubeListBuilder.create(),
				PartPose.offset(4.1212F, -4.0F, -2.3716F));

		PartDefinition cube_r21 = spike3.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(9, 20).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0849F, 0.0F, 1.9861F, 0.0F, -0.5672F, 0.0F));

		PartDefinition cube_r22 = spike3.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(14, 21).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3297F, 0.0F, -0.2489F, 0.0F, 0.3491F, 0.0F));

		PartDefinition cube_r23 = spike3.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(27, 24).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3788F, 0.0F, -1.1284F, 0.0F, 0.9163F, 0.0F));

		PartDefinition spike4 = spikes.addOrReplaceChild("spike4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-4.1212F, -6.5F, -2.3716F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r24 = spike4.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(0, 20).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0849F, 0.0F, 1.9861F, 0.0F, 0.5672F, 0.0F));

		PartDefinition cube_r25 = spike4.addOrReplaceChild("cube_r25",
				CubeListBuilder.create().texOffs(20, 0).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3297F, 0.0F, -0.2489F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cube_r26 = spike4.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(5, 21).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3788F, 0.0F, -1.1284F, 0.0F, -0.9163F, 0.0F));

		PartDefinition spike5 = spikes.addOrReplaceChild("spike5", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-4.1212F, -1.5F, -2.3716F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r27 = spike5.addOrReplaceChild("cube_r27",
				CubeListBuilder.create().texOffs(17, 17).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0849F, 0.0F, 1.9861F, 0.0F, 0.5672F, 0.0F));

		PartDefinition cube_r28 = spike5.addOrReplaceChild("cube_r28",
				CubeListBuilder.create().texOffs(19, 13).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3297F, 0.0F, -0.2489F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cube_r29 = spike5.addOrReplaceChild("cube_r29",
				CubeListBuilder.create().texOffs(20, 4).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3788F, 0.0F, -1.1284F, 0.0F, -0.9163F, 0.0F));

		PartDefinition spike6 = spikes.addOrReplaceChild("spike6", CubeListBuilder.create(),
				PartPose.offset(-4.1212F, -4.0F, -2.3716F));

		PartDefinition cube_r30 = spike6.addOrReplaceChild("cube_r30",
				CubeListBuilder.create().texOffs(12, 16).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0849F, 0.0F, 1.9861F, 0.0F, 0.5672F, 0.0F));

		PartDefinition cube_r31 = spike6.addOrReplaceChild("cube_r31",
				CubeListBuilder.create().texOffs(17, 6).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3297F, 0.0F, -0.2489F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cube_r32 = spike6.addOrReplaceChild("cube_r32",
				CubeListBuilder.create().texOffs(14, 9).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3788F, 0.0F, -1.1284F, 0.0F, -0.9163F, 0.0F));

		PartDefinition blood = mask.addOrReplaceChild("blood",
				CubeListBuilder.create().texOffs(27, 18)
						.addBox(2.0F, -8.0F, -0.7071F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(22, 26)
						.addBox(-3.0F, -2.0F, -0.7071F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.5F, 0.0F, -4.3429F));

		PartDefinition cube_r33 = blood
				.addOrReplaceChild("cube_r33",
						CubeListBuilder.create().texOffs(6, 13).addBox(-3.0F, -0.5F, -0.5F, 1.0F, 1.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r34 = blood.addOrReplaceChild("cube_r34",
				CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, 2.0F, -0.5F, 1.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -4.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r35 = blood.addOrReplaceChild("cube_r35",
				CubeListBuilder.create().texOffs(13, 0).addBox(-0.5F, 2.0F, -0.5F, 1.0F, 1.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -10.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
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