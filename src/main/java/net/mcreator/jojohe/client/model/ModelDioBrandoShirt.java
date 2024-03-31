package net.mcreator.jojohe.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelDioBrandoShirt<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("jojohe", "model_dio_brando_shirt"), "main");
	public final ModelPart torso;
	public final ModelPart left_arm;
	public final ModelPart right_arm;

	public ModelDioBrandoShirt(ModelPart root) {
		this.torso = root.getChild("torso");
		this.left_arm = root.getChild("left_arm");
		this.right_arm = root.getChild("right_arm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition torso = partdefinition.addOrReplaceChild("torso",
				CubeListBuilder.create().texOffs(48, 0).addBox(-4.0F, 1.0F, 1.5F, 8.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 14).addBox(3.5F, 1.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(41, 55)
						.addBox(-4.5F, 1.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(62, 13).addBox(-3.35F, 5.25F, 2.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(57, 57)
						.addBox(2.35F, 5.25F, 2.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(79, 61).addBox(-2.0F, 2.5F, -2.75F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 69)
						.addBox(-2.0F, 3.5F, -3.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 32).addBox(-4.0F, 6.5F, -2.75F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)).texOffs(50, 27)
						.addBox(-4.0F, 5.5F, 1.75F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)).texOffs(10, 56).addBox(3.75F, 5.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.001F)).texOffs(51, 55)
						.addBox(-4.75F, 5.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.001F)).texOffs(63, 58).addBox(-3.0F, 9.5F, -2.75F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 15)
						.addBox(-3.0F, 9.5F, 1.75F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 77).addBox(3.0F, 1.5F, -2.75F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.001F)).texOffs(26, 88)
						.addBox(-4.0F, 1.5F, -2.75F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 12.0F, 0.0F));
		PartDefinition torso_r1 = torso.addOrReplaceChild("torso_r1", CubeListBuilder.create().texOffs(23, 16).addBox(-2.5F, -1.0F, -4.5F, 5.0F, 3.0F, 9.0F, new CubeDeformation(-0.001F)),
				PartPose.offsetAndRotation(2.1147F, 0.1014F, 0.0142F, 0.1719F, 0.0302F, -0.1719F));
		PartDefinition torso_r2 = torso.addOrReplaceChild("torso_r2", CubeListBuilder.create().texOffs(0, 25).addBox(-2.5F, -1.0F, -4.5F, 5.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.1147F, 0.1014F, 0.0142F, 0.1719F, -0.0302F, 0.1719F));
		PartDefinition torso_r3 = torso.addOrReplaceChild("torso_r3", CubeListBuilder.create().texOffs(69, 60).addBox(-4.1911F, -1.7758F, -0.8988F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.0321F, -2.9066F, 0.0885F, 0.1901F, -0.1069F));
		PartDefinition torso_r4 = torso.addOrReplaceChild("torso_r4", CubeListBuilder.create().texOffs(6, 64).addBox(-1.75F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9896F, 2.6726F, -2.9296F, -0.2169F, 0.1901F, -0.1069F));
		PartDefinition torso_r5 = torso.addOrReplaceChild("torso_r5", CubeListBuilder.create().texOffs(86, 17).addBox(-1.25F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9896F, 2.6726F, -2.9296F, -0.2169F, -0.1901F, 0.1069F));
		PartDefinition torso_r6 = torso.addOrReplaceChild("torso_r6", CubeListBuilder.create().texOffs(16, 71).addBox(-2.6911F, -0.2758F, -1.1488F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.25F, 5.0321F, -2.9066F, 0.0885F, 0.1901F, -0.1069F));
		PartDefinition torso_r7 = torso.addOrReplaceChild("torso_r7", CubeListBuilder.create().texOffs(70, 6).addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.7229F, 3.5762F, -3.2814F, -0.086F, 0.1901F, -0.1069F));
		PartDefinition torso_r8 = torso.addOrReplaceChild("torso_r8", CubeListBuilder.create().texOffs(24, 71).addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.7229F, 3.5762F, -3.2814F, -0.086F, -0.1901F, 0.1069F));
		PartDefinition torso_r9 = torso.addOrReplaceChild("torso_r9", CubeListBuilder.create().texOffs(62, 68).addBox(-0.5F, -0.5F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.2313F, 7.5307F, -2.9341F, 0.209F, 0.1842F, -0.1401F));
		PartDefinition torso_r10 = torso.addOrReplaceChild("torso_r10", CubeListBuilder.create().texOffs(69, 64).addBox(-0.5F, -0.5F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.2313F, 7.5307F, -2.9341F, 0.209F, -0.1842F, 0.1401F));
		PartDefinition torso_r11 = torso.addOrReplaceChild("torso_r11", CubeListBuilder.create().texOffs(56, 72).addBox(1.6911F, -0.2758F, -1.1488F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.25F, 5.0321F, -2.9066F, 0.0885F, -0.1901F, 0.1069F));
		PartDefinition torso_r12 = torso.addOrReplaceChild("torso_r12", CubeListBuilder.create().texOffs(77, 87).addBox(-3.25F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1018F, 7.6905F, -2.8434F, 0.2194F, 0.1901F, -0.1069F));
		PartDefinition torso_r13 = torso.addOrReplaceChild("torso_r13", CubeListBuilder.create().texOffs(56, 88).addBox(1.25F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1018F, 7.6905F, -2.8434F, 0.2194F, -0.1901F, 0.1069F));
		PartDefinition torso_r14 = torso.addOrReplaceChild("torso_r14", CubeListBuilder.create().texOffs(0, 70).addBox(0.1911F, -1.7758F, -0.8988F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.0321F, -2.9066F, 0.0885F, -0.1901F, 0.1069F));
		PartDefinition torso_r15 = torso.addOrReplaceChild("torso_r15", CubeListBuilder.create().texOffs(76, 52).addBox(-3.929F, -0.5F, -0.3435F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(0.2625F, 3.5898F, 2.6697F, 0.0F, -0.0873F, 0.6981F));
		PartDefinition torso_r16 = torso.addOrReplaceChild("torso_r16", CubeListBuilder.create().texOffs(75, 72).addBox(-0.071F, -0.5F, -0.3435F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(0.2625F, 3.5898F, 2.6697F, 0.0F, 0.1309F, 0.6981F));
		PartDefinition torso_r17 = torso.addOrReplaceChild("torso_r17", CubeListBuilder.create().texOffs(78, 36).addBox(-0.071F, -0.5F, -0.3435F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(-0.2625F, 3.5898F, 2.6697F, 0.0F, 0.0873F, -0.6981F));
		PartDefinition torso_r18 = torso.addOrReplaceChild("torso_r18", CubeListBuilder.create().texOffs(78, 47).addBox(-3.929F, -0.5F, -0.3435F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(-0.2625F, 3.5898F, 2.6697F, 0.0F, -0.1309F, -0.6981F));
		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm",
				CubeListBuilder.create().texOffs(16, 62).addBox(2.25F, 2.25F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(60, 51).addBox(-1.25F, 2.25F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(69, 29)
						.addBox(-1.0F, 2.25F, -2.25F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 51).addBox(-1.0F, 2.25F, 1.25F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 47)
						.addBox(-1.0F, -2.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 14.0F, 0.0F));
		PartDefinition right_arm_r1 = left_arm.addOrReplaceChild("right_arm_r1", CubeListBuilder.create().texOffs(10, 65).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(-1.1569F, 1.5876F, 0.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition right_arm_r2 = left_arm.addOrReplaceChild("right_arm_r2", CubeListBuilder.create().texOffs(64, 45).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(-1.1569F, 0.1225F, 0.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition right_arm_r3 = left_arm.addOrReplaceChild("right_arm_r3", CubeListBuilder.create().texOffs(64, 36).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(-1.1258F, -1.305F, 0.0F, 0.0F, 0.0F, 0.4363F));
		PartDefinition left_arm_r1 = left_arm.addOrReplaceChild("left_arm_r1", CubeListBuilder.create().texOffs(22, 65).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(3.1569F, 1.5876F, 0.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition left_arm_r2 = left_arm.addOrReplaceChild("left_arm_r2", CubeListBuilder.create().texOffs(74, 22).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(1.0F, 1.5876F, 2.1569F, 0.3927F, 0.0F, 0.0F));
		PartDefinition left_arm_r3 = left_arm.addOrReplaceChild("left_arm_r3", CubeListBuilder.create().texOffs(0, 74).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(1.0F, 0.1225F, 2.1569F, -0.3927F, 0.0F, 0.0F));
		PartDefinition left_arm_r4 = left_arm.addOrReplaceChild("left_arm_r4", CubeListBuilder.create().texOffs(66, 73).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(1.0F, -1.305F, 2.1258F, 0.4363F, 0.0F, 0.0F));
		PartDefinition left_arm_r5 = left_arm.addOrReplaceChild("left_arm_r5", CubeListBuilder.create().texOffs(34, 74).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(1.0F, 1.5876F, -2.1569F, -0.3927F, 0.0F, 0.0F));
		PartDefinition left_arm_r6 = left_arm.addOrReplaceChild("left_arm_r6", CubeListBuilder.create().texOffs(66, 0).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(3.1569F, 0.1225F, 0.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition left_arm_r7 = left_arm.addOrReplaceChild("left_arm_r7", CubeListBuilder.create().texOffs(74, 39).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(1.0F, 0.1225F, -2.1569F, 0.3927F, 0.0F, 0.0F));
		PartDefinition left_arm_r8 = left_arm.addOrReplaceChild("left_arm_r8", CubeListBuilder.create().texOffs(75, 49).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(1.0F, -1.305F, -2.1258F, -0.4363F, 0.0F, 0.0F));
		PartDefinition left_arm_r9 = left_arm.addOrReplaceChild("left_arm_r9", CubeListBuilder.create().texOffs(66, 9).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(3.1258F, -1.305F, 0.0F, 0.0F, 0.0F, -0.4363F));
		PartDefinition left_arm_r10 = left_arm.addOrReplaceChild("left_arm_r10", CubeListBuilder.create().texOffs(66, 68).addBox(-2.0F, -2.0F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(1.0F, 7.0F, 2.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition left_arm_r11 = left_arm.addOrReplaceChild("left_arm_r11", CubeListBuilder.create().texOffs(32, 69).addBox(-2.0F, -2.0F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(1.0F, 7.0F, -2.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition right_arm_r4 = left_arm.addOrReplaceChild("right_arm_r4", CubeListBuilder.create().texOffs(31, 53).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(-1.0F, 7.0F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition left_arm_r12 = left_arm.addOrReplaceChild("left_arm_r12", CubeListBuilder.create().texOffs(54, 45).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(3.0F, 7.0F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm",
				CubeListBuilder.create().texOffs(16, 62).mirror().addBox(-3.25F, 2.25F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(60, 51).mirror()
						.addBox(0.25F, 2.25F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(69, 29).mirror().addBox(-3.0F, 2.25F, -2.25F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(66, 51).mirror()
						.addBox(-3.0F, 2.25F, 1.25F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(18, 47).mirror().addBox(-3.0F, -2.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-5.0F, 14.0F, 0.0F));
		PartDefinition left_arm_r13 = right_arm.addOrReplaceChild("left_arm_r13", CubeListBuilder.create().texOffs(10, 65).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false),
				PartPose.offsetAndRotation(1.1569F, 1.5876F, 0.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition left_arm_r14 = right_arm.addOrReplaceChild("left_arm_r14", CubeListBuilder.create().texOffs(64, 45).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false),
				PartPose.offsetAndRotation(1.1569F, 0.1225F, 0.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition left_arm_r15 = right_arm.addOrReplaceChild("left_arm_r15", CubeListBuilder.create().texOffs(64, 36).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false),
				PartPose.offsetAndRotation(1.1258F, -1.305F, 0.0F, 0.0F, 0.0F, -0.4363F));
		PartDefinition right_arm_r5 = right_arm.addOrReplaceChild("right_arm_r5", CubeListBuilder.create().texOffs(22, 65).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false),
				PartPose.offsetAndRotation(-3.1569F, 1.5876F, 0.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition right_arm_r6 = right_arm.addOrReplaceChild("right_arm_r6", CubeListBuilder.create().texOffs(74, 22).mirror().addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 1.5876F, 2.1569F, 0.3927F, 0.0F, 0.0F));
		PartDefinition right_arm_r7 = right_arm.addOrReplaceChild("right_arm_r7", CubeListBuilder.create().texOffs(0, 74).mirror().addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 0.1225F, 2.1569F, -0.3927F, 0.0F, 0.0F));
		PartDefinition right_arm_r8 = right_arm.addOrReplaceChild("right_arm_r8", CubeListBuilder.create().texOffs(66, 73).mirror().addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, -1.305F, 2.1258F, 0.4363F, 0.0F, 0.0F));
		PartDefinition right_arm_r9 = right_arm.addOrReplaceChild("right_arm_r9", CubeListBuilder.create().texOffs(34, 74).mirror().addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 1.5876F, -2.1569F, -0.3927F, 0.0F, 0.0F));
		PartDefinition right_arm_r10 = right_arm.addOrReplaceChild("right_arm_r10", CubeListBuilder.create().texOffs(66, 0).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false),
				PartPose.offsetAndRotation(-3.1569F, 0.1225F, 0.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition right_arm_r11 = right_arm.addOrReplaceChild("right_arm_r11", CubeListBuilder.create().texOffs(74, 39).mirror().addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 0.1225F, -2.1569F, 0.3927F, 0.0F, 0.0F));
		PartDefinition right_arm_r12 = right_arm.addOrReplaceChild("right_arm_r12", CubeListBuilder.create().texOffs(75, 49).mirror().addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, -1.305F, -2.1258F, -0.4363F, 0.0F, 0.0F));
		PartDefinition right_arm_r13 = right_arm.addOrReplaceChild("right_arm_r13", CubeListBuilder.create().texOffs(66, 9).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false),
				PartPose.offsetAndRotation(-3.1258F, -1.305F, 0.0F, 0.0F, 0.0F, 0.4363F));
		PartDefinition right_arm_r14 = right_arm.addOrReplaceChild("right_arm_r14", CubeListBuilder.create().texOffs(66, 68).mirror().addBox(-2.0F, -2.0F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 7.0F, 2.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition right_arm_r15 = right_arm.addOrReplaceChild("right_arm_r15", CubeListBuilder.create().texOffs(32, 69).mirror().addBox(-2.0F, -2.0F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 7.0F, -2.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition left_arm_r16 = right_arm.addOrReplaceChild("left_arm_r16", CubeListBuilder.create().texOffs(31, 53).mirror().addBox(-0.5F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false),
				PartPose.offsetAndRotation(1.0F, 7.0F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition right_arm_r16 = right_arm.addOrReplaceChild("right_arm_r16", CubeListBuilder.create().texOffs(54, 45).mirror().addBox(-0.5F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false),
				PartPose.offsetAndRotation(-3.0F, 7.0F, 0.0F, 0.0F, 0.0F, -0.0873F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		torso.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
