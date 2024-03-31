// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelZeppeliCoat<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "zeppelicoat"), "main");
	private final ModelPart torso;
	private final ModelPart left_arm;
	private final ModelPart right_arm;

	public ModelZeppeliCoat(ModelPart root) {
		this.torso = root.getChild("torso");
		this.left_arm = root.getChild("left_arm");
		this.right_arm = root.getChild("right_arm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition torso = partdefinition.addOrReplaceChild("torso",
				CubeListBuilder.create().texOffs(12, 74)
						.addBox(-2.5F, -0.15F, 0.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 10)
						.addBox(-2.8F, -0.15F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 62)
						.addBox(1.8F, -0.15F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(66, 21)
						.addBox(-3.0F, 1.0F, -2.25F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 13)
						.addBox(-3.5F, 9.0F, -2.25F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 69)
						.addBox(-1.5F, 3.0F, -2.25F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 67)
						.addBox(-1.5F, 8.0F, -2.25F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 71)
						.addBox(-0.5F, 1.25F, -2.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(-1.25F, 1.75F, -2.5F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.25F, 1.75F, -2.5F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(71, 55)
						.addBox(-0.5F, 8.0F, -2.599F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(69, 33)
						.addBox(-0.5F, 6.0F, -2.599F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 69)
						.addBox(-0.5F, 4.0F, -2.599F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 59)
						.addBox(-3.0F, 3.75F, -2.499F, 6.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 69)
						.addBox(1.75F, 3.25F, -2.498F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 18)
						.addBox(2.75F, 7.65F, -2.498F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 34)
						.addBox(-3.75F, 7.65F, -2.498F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 49)
						.addBox(-2.75F, 3.25F, -2.498F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 12.0F, 0.0F));

		PartDefinition torso_r1 = torso.addOrReplaceChild("torso_r1",
				CubeListBuilder.create().texOffs(52, 22).addBox(-0.5F, -0.5F, -0.499F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.299F, 9.933F, -1.999F, 0.0F, 0.0F, -0.5236F));

		PartDefinition torso_r2 = torso.addOrReplaceChild("torso_r2",
				CubeListBuilder.create().texOffs(47, 43).addBox(-1.5F, -0.5F, -0.499F, 3.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5311F, 9.433F, -1.999F, 0.0F, 0.0F, 0.5236F));

		PartDefinition torso_r3 = torso.addOrReplaceChild("torso_r3",
				CubeListBuilder.create().texOffs(6, 67).addBox(-1.5F, -0.5F, -0.499F, 3.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5311F, 9.433F, -1.999F, 0.0F, 0.0F, -0.5236F));

		PartDefinition torso_r4 = torso.addOrReplaceChild("torso_r4",
				CubeListBuilder.create().texOffs(83, 68).addBox(-1.5F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.049F, 3.567F, -2.0F, 0.0F, 0.0F, -0.5236F));

		PartDefinition torso_r5 = torso.addOrReplaceChild("torso_r5",
				CubeListBuilder.create().texOffs(60, 52).addBox(-1.5F, -0.5F, -0.499F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.299F, 9.933F, -1.999F, 0.0F, 0.0F, 0.5236F));

		PartDefinition torso_r6 = torso.addOrReplaceChild("torso_r6",
				CubeListBuilder.create().texOffs(0, 75).addBox(-2.5F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.049F, 3.567F, -2.0F, 0.0F, 0.0F, 0.5236F));

		PartDefinition torso_r7 = torso.addOrReplaceChild("torso_r7",
				CubeListBuilder.create().texOffs(19, 46).addBox(-1.5F, -1.0F, -0.25F, 3.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.75F, 1.1F, -2.25F, 0.0116F, -0.2457F, -0.3997F));

		PartDefinition torso_r8 = torso.addOrReplaceChild("torso_r8",
				CubeListBuilder.create().texOffs(36, 46).addBox(-1.5F, -1.0F, -0.25F, 3.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.75F, 1.1F, -2.25F, 0.0116F, 0.2457F, 0.3997F));

		PartDefinition coat = torso.addOrReplaceChild("coat", CubeListBuilder.create().texOffs(24, 21)
				.addBox(3.7822F, -23.1481F, -2.75F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(27, 0)
				.addBox(-3.5F, -24.15F, 1.35F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
				.addBox(-3.7822F, -23.1481F, -2.75F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(24, 21)
				.addBox(-3.0322F, -24.1481F, -3.25F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(31, 21)
				.addBox(3.0322F, -24.1481F, -3.25F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 52)
				.addBox(3.0F, -24.4F, -2.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.1F)).texOffs(44, 18)
				.addBox(-2.0F, -24.4F, 0.5F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.1F)).texOffs(60, 30)
				.addBox(-4.0F, -24.4F, -2.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.1F)),
				PartPose.offset(-0.5F, 24.05F, 0.25F));

		PartDefinition torso_r9 = coat.addOrReplaceChild("torso_r9",
				CubeListBuilder.create().texOffs(0, 46).addBox(0.0608F, -0.0141F, -0.499F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0566F, -20.3872F, -2.75F, 0.0F, 0.0F, 0.2182F));

		PartDefinition torso_r10 = coat.addOrReplaceChild("torso_r10",
				CubeListBuilder.create().texOffs(46, 62)
						.addBox(-1.0F, -2.5F, -0.5F, 1.0F, 16.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 46)
						.addBox(-0.25F, -2.5F, 0.0F, 1.0F, 16.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.35F, -17.8F, -2.75F, 0.0F, 0.0F, -0.1309F));

		PartDefinition torso_r11 = coat.addOrReplaceChild("torso_r11",
				CubeListBuilder.create().texOffs(7, 17).addBox(0.0608F, -0.0141F, -0.498F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9698F, -24.1475F, -2.75F, 0.0F, 0.0F, 0.2182F));

		PartDefinition torso_r12 = coat.addOrReplaceChild("torso_r12",
				CubeListBuilder.create().texOffs(0, 17).addBox(-1.0608F, -0.0141F, -0.498F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.9698F, -24.1475F, -2.75F, 0.0F, 0.0F, -0.2182F));

		PartDefinition torso_r13 = coat.addOrReplaceChild("torso_r13",
				CubeListBuilder.create().texOffs(0, 30).addBox(-1.0608F, -0.0141F, -0.499F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0566F, -20.3872F, -2.75F, 0.0F, 0.0F, -0.2182F));

		PartDefinition torso_r14 = coat.addOrReplaceChild("torso_r14",
				CubeListBuilder.create().texOffs(42, 62)
						.addBox(0.0F, -2.5F, -0.5F, 1.0F, 16.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 46)
						.addBox(-0.75F, -2.5F, 0.0F, 1.0F, 16.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.35F, -17.8F, -2.75F, 0.0F, 0.0F, 0.1309F));

		PartDefinition torso_r15 = coat.addOrReplaceChild("torso_r15",
				CubeListBuilder.create().texOffs(56, 52).addBox(-3.9995F, -8.0F, -3.0F, 1.0F, 16.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8035F, -12.2432F, 4.1801F, 0.1309F, 0.0F, 0.1309F));

		PartDefinition torso_r16 = coat.addOrReplaceChild("torso_r16",
				CubeListBuilder.create().texOffs(30, 62).addBox(-4.0F, -8.0F, -2.0F, 2.0F, 16.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4648F, -12.1495F, 4.3771F, 0.1309F, 0.0F, 0.1309F));

		PartDefinition torso_r17 = coat.addOrReplaceChild("torso_r17",
				CubeListBuilder.create().texOffs(76, 29).addBox(-3.0F, -3.0F, -0.5003F, 4.0F, 6.0F, 1.0F,
						new CubeDeformation(-0.002F)),
				PartPose.offsetAndRotation(-1.134F, -6.4323F, 3.6603F, 0.1135F, -0.0653F, 0.5199F));

		PartDefinition torso_r18 = coat.addOrReplaceChild("torso_r18",
				CubeListBuilder.create().texOffs(50, 76).addBox(-1.0F, -3.0F, -0.5003F, 4.0F, 6.0F, 1.0F,
						new CubeDeformation(-0.001F)),
				PartPose.offsetAndRotation(2.134F, -6.4323F, 3.6603F, 0.1135F, 0.0653F, -0.5199F));

		PartDefinition torso_r19 = coat.addOrReplaceChild("torso_r19",
				CubeListBuilder.create().texOffs(48, 0).addBox(-4.0F, -8.0F, -2.0F, 8.0F, 12.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -12.4795F, 4.3771F, 0.1309F, 0.0F, 0.0F));

		PartDefinition torso_r20 = coat.addOrReplaceChild("torso_r20",
				CubeListBuilder.create().texOffs(36, 62).addBox(2.0F, -8.0F, -2.0F, 2.0F, 16.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4648F, -12.1495F, 4.3771F, 0.1309F, 0.0F, -0.1309F));

		PartDefinition torso_r21 = coat.addOrReplaceChild("torso_r21",
				CubeListBuilder.create().texOffs(24, 62).addBox(2.9995F, -8.0F, -3.0F, 1.0F, 16.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8035F, -12.2432F, 4.1801F, 0.1309F, 0.0F, -0.1309F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(60, 13)
				.addBox(-1.0F, -2.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 14.0F, 0.0F));

		PartDefinition right_arm_r1 = left_arm.addOrReplaceChild("right_arm_r1",
				CubeListBuilder.create().texOffs(72, 73).addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F,
						new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(-1.25F, 7.25F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition right_arm_r2 = left_arm.addOrReplaceChild("right_arm_r2",
				CubeListBuilder.create().texOffs(16, 76).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0314F, 4.8907F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition right_arm_r3 = left_arm.addOrReplaceChild("right_arm_r3",
				CubeListBuilder.create().texOffs(72, 62).addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0817F, 2.6323F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition right_arm_r4 = left_arm.addOrReplaceChild("right_arm_r4",
				CubeListBuilder.create().texOffs(76, 0).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.132F, 0.3739F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition right_arm_r5 = left_arm.addOrReplaceChild("right_arm_r5",
				CubeListBuilder.create().texOffs(60, 74).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0619F, -1.2313F, 0.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition left_arm_r1 = left_arm.addOrReplaceChild("left_arm_r1",
				CubeListBuilder.create().texOffs(66, 77).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0619F, -1.2313F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition left_arm_r2 = left_arm.addOrReplaceChild("left_arm_r2",
				CubeListBuilder.create().texOffs(19, 82).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -1.2313F, 2.0619F, 0.3491F, 0.0F, 0.0F));

		PartDefinition left_arm_r3 = left_arm.addOrReplaceChild("left_arm_r3",
				CubeListBuilder.create().texOffs(81, 52).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 0.8568F, 2.0025F, -0.2618F, 0.0F, 0.0F));

		PartDefinition left_arm_r4 = left_arm.addOrReplaceChild("left_arm_r4",
				CubeListBuilder.create().texOffs(76, 80).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 2.6323F, 2.0817F, 0.1309F, 0.0F, 0.0F));

		PartDefinition left_arm_r5 = left_arm.addOrReplaceChild("left_arm_r5",
				CubeListBuilder.create().texOffs(78, 6).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 5.3737F, 1.902F, -0.2618F, 0.0F, 0.0F));

		PartDefinition left_arm_r6 = left_arm.addOrReplaceChild("left_arm_r6",
				CubeListBuilder.create().texOffs(80, 40).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F,
						new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(1.0F, 7.25F, 2.25F, -0.0873F, 0.0F, 0.0F));

		PartDefinition left_arm_r7 = left_arm.addOrReplaceChild("left_arm_r7",
				CubeListBuilder.create().texOffs(82, 65).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -1.2313F, -2.0619F, -0.3491F, 0.0F, 0.0F));

		PartDefinition left_arm_r8 = left_arm.addOrReplaceChild("left_arm_r8",
				CubeListBuilder.create().texOffs(76, 55).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0314F, 4.8907F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition left_arm_r9 = left_arm.addOrReplaceChild("left_arm_r9",
				CubeListBuilder.create().texOffs(0, 77).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.132F, 0.3739F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition left_arm_r10 = left_arm.addOrReplaceChild("left_arm_r10",
				CubeListBuilder.create().texOffs(82, 25).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 5.3737F, -1.902F, 0.2618F, 0.0F, 0.0F));

		PartDefinition left_arm_r11 = left_arm.addOrReplaceChild("left_arm_r11",
				CubeListBuilder.create().texOffs(82, 55).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 0.8568F, -2.0025F, 0.2618F, 0.0F, 0.0F));

		PartDefinition left_arm_r12 = left_arm.addOrReplaceChild("left_arm_r12",
				CubeListBuilder.create().texOffs(6, 74).addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0817F, 2.6323F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition left_arm_r13 = left_arm.addOrReplaceChild("left_arm_r13",
				CubeListBuilder.create().texOffs(82, 0).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 2.6323F, -2.0817F, -0.1309F, 0.0F, 0.0F));

		PartDefinition left_arm_r14 = left_arm.addOrReplaceChild("left_arm_r14",
				CubeListBuilder.create().texOffs(9, 82).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F,
						new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(1.0F, 7.25F, -2.25F, 0.0873F, 0.0F, 0.0F));

		PartDefinition left_arm_r15 = left_arm.addOrReplaceChild("left_arm_r15",
				CubeListBuilder.create().texOffs(74, 40).addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F,
						new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(3.25F, 7.25F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm",
				CubeListBuilder.create().texOffs(60, 13).mirror()
						.addBox(-3.0F, -2.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-5.0F, 14.0F, 0.0F));

		PartDefinition left_arm_r16 = right_arm.addOrReplaceChild("left_arm_r16",
				CubeListBuilder.create().texOffs(72, 73).mirror()
						.addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false),
				PartPose.offsetAndRotation(1.25F, 7.25F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition left_arm_r17 = right_arm.addOrReplaceChild("left_arm_r17",
				CubeListBuilder.create().texOffs(16, 76).mirror()
						.addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0314F, 4.8907F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition left_arm_r18 = right_arm.addOrReplaceChild("left_arm_r18",
				CubeListBuilder.create().texOffs(72, 62).mirror()
						.addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0817F, 2.6323F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition left_arm_r19 = right_arm.addOrReplaceChild("left_arm_r19",
				CubeListBuilder.create().texOffs(76, 0).mirror()
						.addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.132F, 0.3739F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition left_arm_r20 = right_arm.addOrReplaceChild("left_arm_r20",
				CubeListBuilder.create().texOffs(60, 74).mirror()
						.addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0619F, -1.2313F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition right_arm_r6 = right_arm.addOrReplaceChild("right_arm_r6",
				CubeListBuilder.create().texOffs(66, 77).mirror()
						.addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.0619F, -1.2313F, 0.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition right_arm_r7 = right_arm.addOrReplaceChild("right_arm_r7",
				CubeListBuilder.create().texOffs(19, 82).mirror()
						.addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, -1.2313F, 2.0619F, 0.3491F, 0.0F, 0.0F));

		PartDefinition right_arm_r8 = right_arm.addOrReplaceChild("right_arm_r8",
				CubeListBuilder.create().texOffs(81, 52).mirror()
						.addBox(-2.0F, -1.5F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 0.8568F, 2.0025F, -0.2618F, 0.0F, 0.0F));

		PartDefinition right_arm_r9 = right_arm.addOrReplaceChild("right_arm_r9",
				CubeListBuilder.create().texOffs(76, 80).mirror()
						.addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 2.6323F, 2.0817F, 0.1309F, 0.0F, 0.0F));

		PartDefinition right_arm_r10 = right_arm.addOrReplaceChild("right_arm_r10",
				CubeListBuilder.create().texOffs(78, 6).mirror()
						.addBox(-2.0F, -1.5F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 5.3737F, 1.902F, -0.2618F, 0.0F, 0.0F));

		PartDefinition right_arm_r11 = right_arm.addOrReplaceChild("right_arm_r11",
				CubeListBuilder.create().texOffs(80, 40).mirror()
						.addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 7.25F, 2.25F, -0.0873F, 0.0F, 0.0F));

		PartDefinition right_arm_r12 = right_arm.addOrReplaceChild("right_arm_r12",
				CubeListBuilder.create().texOffs(82, 65).mirror()
						.addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, -1.2313F, -2.0619F, -0.3491F, 0.0F, 0.0F));

		PartDefinition right_arm_r13 = right_arm.addOrReplaceChild("right_arm_r13",
				CubeListBuilder.create().texOffs(76, 55).mirror()
						.addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.0314F, 4.8907F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition right_arm_r14 = right_arm.addOrReplaceChild("right_arm_r14",
				CubeListBuilder.create().texOffs(0, 77).mirror()
						.addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.132F, 0.3739F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition right_arm_r15 = right_arm.addOrReplaceChild("right_arm_r15",
				CubeListBuilder.create().texOffs(82, 25).mirror()
						.addBox(-2.0F, -1.5F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 5.3737F, -1.902F, 0.2618F, 0.0F, 0.0F));

		PartDefinition right_arm_r16 = right_arm.addOrReplaceChild("right_arm_r16",
				CubeListBuilder.create().texOffs(82, 55).mirror()
						.addBox(-2.0F, -1.5F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 0.8568F, -2.0025F, 0.2618F, 0.0F, 0.0F));

		PartDefinition right_arm_r17 = right_arm.addOrReplaceChild("right_arm_r17",
				CubeListBuilder.create().texOffs(6, 74).mirror()
						.addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.0817F, 2.6323F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition right_arm_r18 = right_arm.addOrReplaceChild("right_arm_r18",
				CubeListBuilder.create().texOffs(82, 0).mirror()
						.addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 2.6323F, -2.0817F, -0.1309F, 0.0F, 0.0F));

		PartDefinition right_arm_r19 = right_arm.addOrReplaceChild("right_arm_r19",
				CubeListBuilder.create().texOffs(9, 82).mirror()
						.addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 7.25F, -2.25F, 0.0873F, 0.0F, 0.0F));

		PartDefinition right_arm_r20 = right_arm.addOrReplaceChild("right_arm_r20",
				CubeListBuilder.create().texOffs(74, 40).mirror()
						.addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false),
				PartPose.offsetAndRotation(-3.25F, 7.25F, 0.0F, 0.0F, 0.0F, -0.0873F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		torso.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}