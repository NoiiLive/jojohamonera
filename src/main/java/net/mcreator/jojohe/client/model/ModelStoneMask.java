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

// Made with Blockbench 4.9.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelStoneMask<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("jojohe", "model_stone_mask"), "main");
	public final ModelPart mask;

	public ModelStoneMask(ModelPart root) {
		this.mask = root.getChild("mask");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition mask = partdefinition.addOrReplaceChild("mask",
				CubeListBuilder.create().texOffs(0, 24).addBox(-1.0F, -4.0F, -5.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 9).addBox(-3.0F, -3.0F, -5.0F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(21, 30)
						.addBox(-1.5F, -0.9F, -5.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 20).addBox(0.5F, -0.9F, -5.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 28)
						.addBox(-3.5F, -3.0F, -4.999F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 28).addBox(2.5F, -3.0F, -4.999F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 26)
						.addBox(-3.5F, -8.0F, -4.999F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 25).addBox(2.5F, -8.0F, -4.999F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.0F, -8.0F, -5.0F, 6.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = mask.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(8, 13).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5F, -4.0F, -4.2929F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r2 = mask.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(16, 0).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5F, -4.0F, -4.2929F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r3 = mask.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(24, 22).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -4.4F, -4.7F, 0.0F, 0.0F, -0.1309F));
		PartDefinition cube_r4 = mask.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(25, 0).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -4.4F, -4.7F, 0.0F, 0.0F, 0.1309F));
		PartDefinition cube_r5 = mask.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 5).addBox(-3.0F, -0.5F, -0.5F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -8.0F, -4.2929F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r6 = mask.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 7).addBox(-3.0F, -0.5F, -0.5F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 0.0F, -4.2929F, 0.7854F, 0.0F, 0.0F));
		PartDefinition details = mask.addOrReplaceChild("details", CubeListBuilder.create().texOffs(0, 13).addBox(0.25F, -2.325F, -0.75F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.25F, -6.675F, -4.75F));
		PartDefinition cube_r7 = details.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(12, 11).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.25F, -0.175F, -0.25F, 0.0296F, 0.3035F, -0.5614F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		mask.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
