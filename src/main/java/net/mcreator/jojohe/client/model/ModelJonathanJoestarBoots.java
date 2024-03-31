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
public class ModelJonathanJoestarBoots<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("jojohe", "model_jonathan_joestar_boots"), "main");
	public final ModelPart left_boot;
	public final ModelPart right_boot;

	public ModelJonathanJoestarBoots(ModelPart root) {
		this.left_boot = root.getChild("left_boot");
		this.right_boot = root.getChild("right_boot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition left_boot = partdefinition.addOrReplaceChild("left_boot",
				CubeListBuilder.create().texOffs(24, 0).addBox(-2.0F, 10.0F, -4.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(47, 10).addBox(-2.0F, 11.25F, -4.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(38, 82)
						.addBox(-2.0F, 8.0F, -2.25F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(71, 8).addBox(-2.0F, 8.0F, 1.25F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 60)
						.addBox(1.25F, 8.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 58).addBox(-2.25F, 8.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));
		PartDefinition right_leg_r1 = left_boot.addOrReplaceChild("right_leg_r1", CubeListBuilder.create().texOffs(67, 58).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(-2.0F, 8.0F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition left_leg_r1 = left_boot.addOrReplaceChild("left_leg_r1", CubeListBuilder.create().texOffs(0, 68).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(2.0F, 8.0F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition left_leg_r2 = left_boot.addOrReplaceChild("left_leg_r2", CubeListBuilder.create().texOffs(81, 57).addBox(-2.0F, -2.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 2.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition left_leg_r3 = left_boot.addOrReplaceChild("left_leg_r3", CubeListBuilder.create().texOffs(81, 60).addBox(-2.0F, -2.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, -2.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition right_boot = partdefinition.addOrReplaceChild("right_boot",
				CubeListBuilder.create().texOffs(24, 0).mirror().addBox(-2.0F, 10.0F, -4.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(47, 10).mirror().addBox(-2.0F, 11.25F, -4.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(38, 82).mirror().addBox(-2.0F, 8.0F, -2.25F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(71, 8).mirror().addBox(-2.0F, 8.0F, 1.25F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 60).mirror().addBox(-2.25F, 8.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(28, 58).mirror().addBox(1.25F, 8.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition left_leg_r4 = right_boot.addOrReplaceChild("left_leg_r4", CubeListBuilder.create().texOffs(67, 58).mirror().addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false),
				PartPose.offsetAndRotation(2.0F, 8.0F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition right_leg_r2 = right_boot.addOrReplaceChild("right_leg_r2", CubeListBuilder.create().texOffs(0, 68).mirror().addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false),
				PartPose.offsetAndRotation(-2.0F, 8.0F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition right_leg_r3 = right_boot.addOrReplaceChild("right_leg_r3", CubeListBuilder.create().texOffs(81, 57).mirror().addBox(-2.0F, -2.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 8.0F, 2.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition right_leg_r4 = right_boot.addOrReplaceChild("right_leg_r4", CubeListBuilder.create().texOffs(81, 60).mirror().addBox(-2.0F, -2.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 8.0F, -2.0F, 0.0873F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		left_boot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_boot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
