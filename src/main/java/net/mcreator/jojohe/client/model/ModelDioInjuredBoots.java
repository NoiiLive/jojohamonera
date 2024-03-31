package net.mcreator.jojohe.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
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

// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelDioInjuredBoots<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("jojohe", "model_dio_injured_boots"), "main");
	public final ModelPart LeftBoot;
	public final ModelPart RightBoot;

	public ModelDioInjuredBoots(ModelPart root) {
		this.LeftBoot = root.getChild("LeftBoot");
		this.RightBoot = root.getChild("RightBoot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition LeftBoot = partdefinition.addOrReplaceChild("LeftBoot",
				CubeListBuilder.create().texOffs(64, 40).addBox(-2.75F, 6.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(54, 29).addBox(-2.5F, 8.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(64, 13)
						.addBox(1.75F, 6.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 25).addBox(1.5F, 8.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(74, 68)
						.addBox(-2.0F, 6.0F, -2.75F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 74).addBox(-2.0F, 8.0F, -2.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(74, 47)
						.addBox(-2.0F, 6.0F, 1.75F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 74).addBox(-2.0F, 8.0F, 1.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 32)
						.addBox(-2.0F, 10.0F, -4.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(22, 27).addBox(-2.0F, 11.25F, -4.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));
		PartDefinition RightBoot = partdefinition.addOrReplaceChild("RightBoot",
				CubeListBuilder.create().texOffs(58, 72).addBox(1.75F, 9.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 61).addBox(1.75F, 6.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(1.85F, 4.75F, -1.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 13).addBox(1.8F, 5.0F, -2.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 0)
						.addBox(-2.85F, 4.75F, -1.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 9).addBox(-2.8F, 5.0F, -2.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(10, 64)
						.addBox(1.5F, 10.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(70, 54).addBox(1.5F, 8.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 71)
						.addBox(-2.75F, 9.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(62, 60).addBox(-2.75F, 6.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 64)
						.addBox(-2.5F, 10.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(70, 27).addBox(-2.5F, 8.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(42, 33)
						.addBox(-2.0F, 4.0F, -2.75F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 60).addBox(-2.0F, 9.0F, -2.75F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(74, 32)
						.addBox(-2.0F, 7.0F, -2.95F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 25).addBox(-0.5F, 7.75F, -2.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(75, 4)
						.addBox(-2.0F, 8.0F, -2.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(75, 2).addBox(-2.0F, 9.0F, 1.75F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 14)
						.addBox(-2.0F, 6.0F, 1.75F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(74, 64).addBox(-2.0F, 8.0F, 1.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 55)
						.addBox(-2.0F, 10.0F, 1.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(55, 13).addBox(-2.0F, 10.0F, -4.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 0)
						.addBox(-2.0F, 11.25F, -4.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		LeftBoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightBoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.LeftBoot.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightBoot.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
