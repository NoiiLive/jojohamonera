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

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelModEmptyStoneMask<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("jojohe", "model_mod_empty_stone_mask"), "main");
	public final ModelPart mask;

	public ModelModEmptyStoneMask(ModelPart root) {
		this.mask = root.getChild("mask");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition mask = partdefinition.addOrReplaceChild("mask",
				CubeListBuilder.create().texOffs(0, 6).addBox(-4.0F, -3.0F, -4.5F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.0F, -8.0F, -4.5F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 36)
						.addBox(-4.0F, -4.0F, -4.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 35).addBox(3.0F, -4.0F, -4.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(17, 35)
						.addBox(-1.0F, -4.0F, -4.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = mask.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 11).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -3.7929F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r2 = mask.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 14).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.0F, -3.7929F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r3 = mask.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(20, 25).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -4.0F, -3.7929F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r4 = mask.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(25, 25).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -4.0F, -3.7929F, 0.0F, -0.7854F, 0.0F));
		PartDefinition decor2 = mask.addOrReplaceChild("decor2", CubeListBuilder.create().texOffs(31, 14).addBox(-1.0F, -3.0F, -0.25F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -5.0F, -4.75F));
		PartDefinition cube_r5 = decor2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(24, 35).addBox(-1.0F, -0.5F, -0.529F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.097F, 3.3007F, 0.75F, 0.0F, 0.0F, 0.3054F));
		PartDefinition cube_r6 = decor2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(26, 0).addBox(-1.0F, -0.5F, -0.53F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.75F, 3.0F, 0.75F, 0.0F, 0.0F, -0.3054F));
		PartDefinition cube_r7 = decor2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(29, 35).addBox(0.0F, -0.5F, -0.529F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.097F, 3.3007F, 0.75F, 0.0F, 0.0F, -0.3054F));
		PartDefinition cube_r8 = decor2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(30, 32).addBox(-1.0F, -0.5F, -0.53F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.75F, 3.0F, 0.75F, 0.0F, 0.0F, 0.3054F));
		PartDefinition cube_r9 = decor2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(33, 0).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r10 = decor2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(33, 3).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r11 = decor2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(7, 32).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -1.5F, 0.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r12 = decor2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(12, 33).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -1.5F, 0.0F, 0.0F, -0.7854F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		mask.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
