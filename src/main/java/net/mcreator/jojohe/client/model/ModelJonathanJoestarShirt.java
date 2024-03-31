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

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelJonathanJoestarShirt<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("jojohe", "model_jonathan_joestar_shirt"), "main");
	public final ModelPart torso;
	public final ModelPart left_arm;
	public final ModelPart right_arm;

	public ModelJonathanJoestarShirt(ModelPart root) {
		this.torso = root.getChild("torso");
		this.left_arm = root.getChild("left_arm");
		this.right_arm = root.getChild("right_arm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition torso = partdefinition.addOrReplaceChild("torso",
				CubeListBuilder.create().texOffs(52, 20).addBox(-4.0F, 4.4837F, -2.4211F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 25).addBox(-4.0F, 1.0F, -2.75F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 54)
						.addBox(-4.0F, 0.0F, -2.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 54).addBox(3.0F, 0.0F, -2.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(69, 66)
						.addBox(3.0F, -0.25F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(30, 69).addBox(-4.0F, -0.25F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(56, 39)
						.addBox(-3.0F, -0.25F, 1.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(51, 42).addBox(-4.0F, 4.4837F, 1.4211F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 49)
						.addBox(-4.0F, 0.0F, 1.75F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(51, 57).addBox(-4.75F, 0.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 65)
						.addBox(-4.4211F, 4.4837F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(65, 13).addBox(3.4211F, 4.4837F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(41, 57)
						.addBox(3.75F, 0.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 12.0F, 0.0F));
		PartDefinition torso_r1 = torso.addOrReplaceChild("torso_r1", CubeListBuilder.create().texOffs(70, 31).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0855F, 4.2418F, 0.0F, 0.0F, 0.0F, 0.4363F));
		PartDefinition torso_r2 = torso.addOrReplaceChild("torso_r2", CubeListBuilder.create().texOffs(70, 26).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0619F, 6.7825F, 0.0F, 0.0F, 0.0F, -0.3491F));
		PartDefinition torso_r3 = torso.addOrReplaceChild("torso_r3", CubeListBuilder.create().texOffs(70, 36).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0619F, 6.7825F, 0.0F, 0.0F, 0.0F, 0.3491F));
		PartDefinition torso_r4 = torso.addOrReplaceChild("torso_r4", CubeListBuilder.create().texOffs(62, 70).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0855F, 4.2418F, 0.0F, 0.0F, 0.0F, -0.4363F));
		PartDefinition torso_r5 = torso.addOrReplaceChild("torso_r5", CubeListBuilder.create().texOffs(45, 55).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.2418F, 2.0855F, -0.4363F, 0.0F, 0.0F));
		PartDefinition torso_r6 = torso.addOrReplaceChild("torso_r6", CubeListBuilder.create().texOffs(7, 54).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.7825F, 2.0619F, 0.3491F, 0.0F, 0.0F));
		PartDefinition torso_r7 = torso.addOrReplaceChild("torso_r7", CubeListBuilder.create().texOffs(55, 48).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.7825F, -2.0619F, -0.3491F, 0.0F, 0.0F));
		PartDefinition torso_r8 = torso.addOrReplaceChild("torso_r8", CubeListBuilder.create().texOffs(56, 37).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.2418F, -2.0855F, 0.4363F, 0.0F, 0.0F));
		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm",
				CubeListBuilder.create().texOffs(10, 69).addBox(2.25F, 8.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 68).addBox(2.35F, 9.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(36, 42)
						.addBox(-1.5F, 6.0F, -2.5F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(8, 56).addBox(0.0F, 9.25F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(6, 69)
						.addBox(0.0F, 8.0F, -2.25F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(31, 54).addBox(-1.0F, 8.0F, -2.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(27, 54)
						.addBox(-1.0F, 8.0F, 1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(61, 13).addBox(0.0F, 8.0F, 1.25F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 68)
						.addBox(-1.25F, 8.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 16).addBox(-1.25F, -2.75F, -2.5F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(57, 0)
						.addBox(3.0F, 0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 51).addBox(-1.5F, -2.5F, -2.5F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(20, 54)
						.addBox(-1.5F, -2.75F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(6, 61).addBox(-1.25F, 0.5F, -2.75F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 87)
						.addBox(-1.25F, -2.5F, -2.75F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(86, 69).addBox(-1.25F, -3.0F, -2.75F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(67, 86)
						.addBox(-1.25F, -3.0F, -0.25F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(69, 64).addBox(-1.25F, -2.5F, 1.75F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 35)
						.addBox(-1.25F, 0.5F, 1.75F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 14.0F, 0.0F));
		PartDefinition left_arm_r1 = left_arm.addOrReplaceChild("left_arm_r1", CubeListBuilder.create().texOffs(7, 51).addBox(-2.5F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, 5.25F, 1.9F, -0.1309F, 0.0F, 0.0F));
		PartDefinition left_arm_r2 = left_arm.addOrReplaceChild("left_arm_r2", CubeListBuilder.create().texOffs(34, 58).addBox(-2.5F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, 5.25F, -1.9F, 0.1309F, 0.0F, 0.0F));
		PartDefinition left_arm_r3 = left_arm.addOrReplaceChild("left_arm_r3", CubeListBuilder.create().texOffs(30, 13).addBox(0.0F, -1.0F, -1.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8247F, 7.0F, 1.0356F, 0.0F, -0.2182F, 0.0F));
		PartDefinition right_arm_r1 = left_arm.addOrReplaceChild("right_arm_r1", CubeListBuilder.create().texOffs(64, 29).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9F, 5.25F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition left_arm_r4 = left_arm.addOrReplaceChild("left_arm_r4", CubeListBuilder.create().texOffs(63, 64).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.9F, 5.25F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm",
				CubeListBuilder.create().texOffs(10, 69).mirror().addBox(-3.25F, 8.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(16, 68).mirror().addBox(-3.35F, 9.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(36, 42).mirror().addBox(-3.5F, 6.0F, -2.5F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(8, 56).mirror().addBox(-3.0F, 9.25F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(6, 69).mirror().addBox(-3.0F, 8.0F, -2.25F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(31, 54).mirror().addBox(0.0F, 8.0F, -2.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(27, 54).mirror().addBox(0.0F, 8.0F, 1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(61, 13).mirror().addBox(-3.0F, 8.0F, 1.25F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(56, 68).mirror().addBox(0.25F, 8.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(32, 16).mirror().addBox(-3.75F, -2.75F, -2.5F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(57, 0).mirror().addBox(-4.0F, 0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 51).mirror().addBox(0.5F, -2.5F, -2.5F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(20, 54).mirror().addBox(0.5F, -2.75F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(6, 61).mirror().addBox(-3.75F, 0.5F, -2.75F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(56, 87).mirror().addBox(0.25F, -2.5F, -2.75F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(86, 69).mirror().addBox(0.25F, -3.0F, -2.75F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(67, 86).mirror().addBox(0.25F, -3.0F, -0.25F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(69, 64).mirror().addBox(0.25F, -2.5F, 1.75F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(58, 35).mirror().addBox(-3.75F, 0.5F, 1.75F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-5.0F, 14.0F, 0.0F));
		PartDefinition right_arm_r2 = right_arm.addOrReplaceChild("right_arm_r2", CubeListBuilder.create().texOffs(7, 51).mirror().addBox(-1.5F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.5F, 5.25F, 1.9F, -0.1309F, 0.0F, 0.0F));
		PartDefinition right_arm_r3 = right_arm.addOrReplaceChild("right_arm_r3", CubeListBuilder.create().texOffs(34, 58).mirror().addBox(-1.5F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.5F, 5.25F, -1.9F, 0.1309F, 0.0F, 0.0F));
		PartDefinition right_arm_r4 = right_arm.addOrReplaceChild("right_arm_r4", CubeListBuilder.create().texOffs(30, 13).mirror().addBox(0.0F, -1.0F, -1.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.8247F, 7.0F, 1.0356F, 0.0F, 0.2182F, 0.0F));
		PartDefinition left_arm_r5 = right_arm.addOrReplaceChild("left_arm_r5", CubeListBuilder.create().texOffs(64, 29).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.9F, 5.25F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition right_arm_r5 = right_arm.addOrReplaceChild("right_arm_r5", CubeListBuilder.create().texOffs(63, 64).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.9F, 5.25F, 0.0F, 0.0F, 0.0F, -0.1309F));
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
