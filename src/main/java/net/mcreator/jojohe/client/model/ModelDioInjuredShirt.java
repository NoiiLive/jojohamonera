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
public class ModelDioInjuredShirt<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("jojohe", "model_dio_injured_shirt"), "main");
	public final ModelPart Body;
	public final ModelPart LeftArm;
	public final ModelPart RightArm;

	public ModelDioInjuredShirt(ModelPart root) {
		this.Body = root.getChild("Body");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(16, 43).addBox(-4.0F, 0.0F, -2.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 6).addBox(2.0F, 0.0F, -2.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 55)
						.addBox(2.0F, -0.25F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(60, 50).addBox(-4.0F, -0.25F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(42, 5)
						.addBox(-2.0F, -0.25F, 0.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 33).addBox(-4.0F, 1.0F, -2.5F, 8.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 21)
						.addBox(-2.0F, 0.75F, -2.61F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 42).addBox(0.0F, 0.75F, -2.61F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 17)
						.addBox(0.5F, 2.75F, -2.6F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 42).addBox(1.0F, 3.25F, -2.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 36)
						.addBox(-2.0F, 3.25F, -2.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 34).addBox(-1.5F, 1.25F, -2.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 13)
						.addBox(0.5F, 1.25F, -2.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 9).addBox(-0.5F, 4.25F, -2.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 13)
						.addBox(-1.0F, 2.75F, -2.61F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 24).addBox(-2.5F, 2.75F, -2.6F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 34)
						.addBox(-4.5F, 0.0F, -2.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(52, 70).addBox(-4.4F, 9.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(42, 70)
						.addBox(3.4F, 9.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(36, 20).addBox(3.5F, 0.0F, -2.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(52, 22)
						.addBox(-4.0F, 9.0F, -2.4F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 14).addBox(-4.0F, 0.0F, 1.5F, 8.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(51, 10)
						.addBox(-4.0F, 9.0F, 1.4F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 12.0F, 0.0F));
		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(31, 8).addBox(-4.0F, 1.0F, -0.5F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.0F, 2.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(38, 0).addBox(-4.0F, 1.0F, -0.5F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.0F, -2.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(14, 76).addBox(-0.6F, 0.0F, -0.75F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 11.0F, 2.25F, 0.0873F, 0.0F, -0.0873F));
		PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(56, 0).addBox(-0.4F, 0.0F, -0.75F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 11.0F, 2.25F, 0.0873F, 0.0F, 0.0873F));
		PartDefinition cube_r5 = Body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(18, 76).addBox(-0.4F, 0.0F, -0.25F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 11.0F, -2.25F, -0.0873F, 0.0F, 0.0873F));
		PartDefinition cube_r6 = Body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(22, 76).addBox(-0.6F, 0.0F, -0.25F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 11.0F, -2.25F, -0.0873F, 0.0F, -0.0873F));
		PartDefinition cube_r7 = Body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(46, 56).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 11.0F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition cube_r8 = Body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(56, 56).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 11.0F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition cube_r9 = Body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 76).addBox(-3.25F, -0.25F, -0.75F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.2182F));
		PartDefinition cube_r10 = Body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(76, 9).addBox(-0.75F, -0.25F, -0.75F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.2182F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(48, 33).addBox(2.5F, -2.0F, -2.0F, 1.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(46, 21).addBox(-1.5F, -2.0F, -2.0F, 1.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 14.0F, 0.0F));
		PartDefinition cube_r11 = LeftArm.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(52, 45).addBox(-2.0F, -2.25F, -0.5F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(42, 43).addBox(-2.5F, -2.0F, -0.5F, 1.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r12 = LeftArm.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(69, 3).addBox(-1.0F, -0.05F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 5.35F, -1.5F, -1.5708F, -1.4399F, 1.5708F));
		PartDefinition cube_r13 = LeftArm.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(68, 68).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 9.0F, -1.5F, 1.5708F, -1.4399F, -1.5708F));
		PartDefinition cube_r14 = LeftArm.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(70, 9).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 9.0F, 1.5F, -1.5708F, 1.4399F, -1.5708F));
		PartDefinition cube_r15 = LeftArm.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 70).addBox(-1.0F, -0.05F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 5.35F, 1.5F, 1.5708F, 1.4399F, 1.5708F));
		PartDefinition cube_r16 = LeftArm.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(45, 9).addBox(-2.5F, -2.0F, -3.5F, 1.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r17 = LeftArm.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(70, 15).addBox(-1.0F, -0.05F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 5.35F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition cube_r18 = LeftArm.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(10, 70).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 9.0F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition cube_r19 = LeftArm.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(70, 21).addBox(0.0F, -0.05F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5F, 5.35F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition cube_r20 = LeftArm.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(70, 36).addBox(0.0F, -2.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5F, 9.0F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(30, 43).addBox(-3.5F, -2.0F, -2.0F, 1.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 43).addBox(0.5F, -2.0F, -2.0F, 1.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 14.0F, 0.0F));
		PartDefinition cube_r21 = RightArm.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(52, 17).addBox(-2.0F, -2.25F, -0.5F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 42).addBox(1.5F, -2.0F, -0.5F, 1.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r22 = RightArm.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(46, 64).addBox(0.0F, -0.05F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 5.35F, -1.5F, -1.5708F, 1.4399F, -1.5708F));
		PartDefinition cube_r23 = RightArm.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(56, 64).addBox(0.0F, -2.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 9.0F, -1.5F, 1.5708F, 1.4399F, 1.5708F));
		PartDefinition cube_r24 = RightArm.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(20, 65).addBox(0.0F, -2.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 9.0F, 1.5F, -1.5708F, -1.4399F, 1.5708F));
		PartDefinition cube_r25 = RightArm.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(62, 66).addBox(0.0F, -0.05F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 5.35F, 1.5F, 1.5708F, -1.4399F, -1.5708F));
		PartDefinition cube_r26 = RightArm.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(10, 42).addBox(1.5F, -2.0F, -3.5F, 1.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r27 = RightArm.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(36, 67).addBox(0.0F, -0.05F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 5.35F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition cube_r28 = RightArm.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(26, 68).addBox(0.0F, -2.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 9.0F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition cube_r29 = RightArm.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(68, 46).addBox(-1.0F, -0.05F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, 5.35F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition cube_r30 = RightArm.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(68, 62).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, 9.0F, 0.0F, 0.0F, 0.0F, -0.1309F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}
