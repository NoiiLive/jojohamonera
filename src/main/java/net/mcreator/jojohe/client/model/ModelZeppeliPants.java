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
public class ModelZeppeliPants<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("jojohe", "model_zeppeli_pants"), "main");
	public final ModelPart body;
	public final ModelPart left_leg;
	public final ModelPart right_leg;

	public ModelZeppeliPants(ModelPart root) {
		this.body = root.getChild("body");
		this.left_leg = root.getChild("left_leg");
		this.right_leg = root.getChild("right_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(64, 27).addBox(-4.0F, 11.0F, -2.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(78, 9).addBox(-4.5F, 11.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(47, 38)
						.addBox(-4.0F, 11.25F, -2.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(78, 20).addBox(3.5F, 11.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(64, 25)
						.addBox(-4.0F, 11.0F, 1.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(52, 25).addBox(-2.0F, -0.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 12.0F, 0.0F));
		PartDefinition right_leg_r1 = left_leg.addOrReplaceChild("right_leg_r1", CubeListBuilder.create().texOffs(70, 33).addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(2.0029F, 1.3904F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition right_leg_r2 = left_leg.addOrReplaceChild("right_leg_r2", CubeListBuilder.create().texOffs(10, 67).addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(2.0029F, 4.1712F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition right_leg_r3 = left_leg.addOrReplaceChild("right_leg_r3", CubeListBuilder.create().texOffs(60, 66).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(1.9224F, 7.5104F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition left_leg_r1 = left_leg.addOrReplaceChild("left_leg_r1", CubeListBuilder.create().texOffs(66, 70).addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(-2.0029F, 4.1712F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition left_leg_r2 = left_leg.addOrReplaceChild("left_leg_r2", CubeListBuilder.create().texOffs(7, 46).addBox(-2.0F, -2.0F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(0.0F, 7.5104F, 1.9224F, 0.0873F, 0.0F, 0.0F));
		PartDefinition left_leg_r3 = left_leg.addOrReplaceChild("left_leg_r3", CubeListBuilder.create().texOffs(78, 61).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(0.0F, 4.1712F, 2.0029F, -0.1745F, 0.0F, 0.0F));
		PartDefinition left_leg_r4 = left_leg.addOrReplaceChild("left_leg_r4", CubeListBuilder.create().texOffs(78, 14).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(0.0F, 1.3904F, 2.0029F, 0.1745F, 0.0F, 0.0F));
		PartDefinition left_leg_r5 = left_leg.addOrReplaceChild("left_leg_r5", CubeListBuilder.create().texOffs(29, 79).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(0.0F, 4.1712F, -2.0029F, 0.1745F, 0.0F, 0.0F));
		PartDefinition left_leg_r6 = left_leg.addOrReplaceChild("left_leg_r6", CubeListBuilder.create().texOffs(71, 48).addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(-2.0029F, 1.3904F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition left_leg_r7 = left_leg.addOrReplaceChild("left_leg_r7", CubeListBuilder.create().texOffs(0, 67).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(-1.9224F, 7.5104F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition left_leg_r8 = left_leg.addOrReplaceChild("left_leg_r8", CubeListBuilder.create().texOffs(39, 79).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(0.0F, 1.3904F, -2.0029F, -0.1745F, 0.0F, 0.0F));
		PartDefinition left_leg_r9 = left_leg.addOrReplaceChild("left_leg_r9", CubeListBuilder.create().texOffs(77, 47).addBox(-2.0F, -2.0F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(0.0F, 7.5104F, -1.9224F, -0.0873F, 0.0F, 0.0F));
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(52, 25).mirror().addBox(-2.0F, -0.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition left_leg_r10 = right_leg.addOrReplaceChild("left_leg_r10", CubeListBuilder.create().texOffs(70, 33).mirror().addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false),
				PartPose.offsetAndRotation(-2.0029F, 1.3904F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition left_leg_r11 = right_leg.addOrReplaceChild("left_leg_r11", CubeListBuilder.create().texOffs(10, 67).mirror().addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false),
				PartPose.offsetAndRotation(-2.0029F, 4.1712F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition left_leg_r12 = right_leg.addOrReplaceChild("left_leg_r12", CubeListBuilder.create().texOffs(60, 66).mirror().addBox(-0.5F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false),
				PartPose.offsetAndRotation(-1.9224F, 7.5104F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition right_leg_r4 = right_leg.addOrReplaceChild("right_leg_r4", CubeListBuilder.create().texOffs(66, 70).mirror().addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false),
				PartPose.offsetAndRotation(2.0029F, 4.1712F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition right_leg_r5 = right_leg.addOrReplaceChild("right_leg_r5", CubeListBuilder.create().texOffs(7, 46).mirror().addBox(-2.0F, -2.0F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 7.5104F, 1.9224F, 0.0873F, 0.0F, 0.0F));
		PartDefinition right_leg_r6 = right_leg.addOrReplaceChild("right_leg_r6", CubeListBuilder.create().texOffs(78, 61).mirror().addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.1712F, 2.0029F, -0.1745F, 0.0F, 0.0F));
		PartDefinition right_leg_r7 = right_leg.addOrReplaceChild("right_leg_r7", CubeListBuilder.create().texOffs(78, 14).mirror().addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.3904F, 2.0029F, 0.1745F, 0.0F, 0.0F));
		PartDefinition right_leg_r8 = right_leg.addOrReplaceChild("right_leg_r8", CubeListBuilder.create().texOffs(29, 79).mirror().addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.1712F, -2.0029F, 0.1745F, 0.0F, 0.0F));
		PartDefinition right_leg_r9 = right_leg.addOrReplaceChild("right_leg_r9", CubeListBuilder.create().texOffs(71, 48).mirror().addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false),
				PartPose.offsetAndRotation(2.0029F, 1.3904F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition right_leg_r10 = right_leg.addOrReplaceChild("right_leg_r10", CubeListBuilder.create().texOffs(0, 67).mirror().addBox(-0.5F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false),
				PartPose.offsetAndRotation(1.9224F, 7.5104F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition right_leg_r11 = right_leg.addOrReplaceChild("right_leg_r11", CubeListBuilder.create().texOffs(39, 79).mirror().addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.3904F, -2.0029F, -0.1745F, 0.0F, 0.0F));
		PartDefinition right_leg_r12 = right_leg.addOrReplaceChild("right_leg_r12", CubeListBuilder.create().texOffs(77, 47).mirror().addBox(-2.0F, -2.0F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 7.5104F, -1.9224F, -0.0873F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
