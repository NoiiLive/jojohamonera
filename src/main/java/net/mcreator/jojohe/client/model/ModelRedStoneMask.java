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
public class ModelRedStoneMask<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("jojohe", "model_red_stone_mask"), "main");
	public final ModelPart mask;

	public ModelRedStoneMask(ModelPart root) {
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
		PartDefinition socket = mask.addOrReplaceChild("socket", CubeListBuilder.create().texOffs(8, 24).addBox(-1.0F, -2.9301F, -0.9928F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.2199F, -4.8072F));
		PartDefinition cube_r7 = socket.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(26, 16).addBox(-1.0F, -0.5F, -0.55F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, 2.0699F, 0.2572F, 0.0F, 0.0F, 0.3054F));
		PartDefinition cube_r8 = socket.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(12, 30).addBox(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3701F, 2.2203F, 0.2572F, 0.0F, 0.0F, -0.3054F));
		PartDefinition cube_r9 = socket.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(30, 13).addBox(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3701F, 2.2203F, 0.2572F, 0.0F, 0.0F, 0.3054F));
		PartDefinition cube_r10 = socket.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(27, 3).addBox(-1.0F, -0.5F, -0.55F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5F, 2.0699F, 0.2572F, 0.0F, 0.0F, -0.3054F));
		PartDefinition cube_r11 = socket.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 28).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 1.0699F, -0.1357F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r12 = socket.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(27, 5).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.9301F, -0.1357F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r13 = socket.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(27, 27).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 1.0699F, -0.1357F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r14 = socket.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(27, 8).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0699F, -0.1357F, 0.7854F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		mask.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
