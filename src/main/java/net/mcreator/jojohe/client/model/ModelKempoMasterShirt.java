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
public class ModelKempoMasterShirt<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("jojohe", "model_kempo_master_shirt"), "main");
	public final ModelPart Torso;
	public final ModelPart LeftArm;
	public final ModelPart RightArm;

	public ModelKempoMasterShirt(ModelPart root) {
		this.Torso = root.getChild("Torso");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Torso = partdefinition.addOrReplaceChild("Torso",
				CubeListBuilder.create().texOffs(26, 0).addBox(-4.0F, 0.0F, -2.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 15).addBox(1.0F, 0.0F, -2.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 55)
						.addBox(1.0F, -0.25F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(6, 14).addBox(-1.0F, -0.25F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 54)
						.addBox(-4.0F, -0.25F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(36, 34).addBox(-4.0F, 1.0F, -2.5F, 8.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 52)
						.addBox(-4.5F, 0.0F, -2.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(54, 41).addBox(3.5F, 0.0F, -2.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 29)
						.addBox(-4.0F, 0.0F, 1.5F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(53, 26).addBox(-4.0F, 9.0F, -2.4F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 23)
						.addBox(-4.0F, 9.0F, 1.4F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 62).addBox(3.4F, 9.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(62, 7)
						.addBox(-4.4F, 9.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 12.0F, 0.0F));
		PartDefinition cube_r1 = Torso.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(6, 57).addBox(-0.0044F, -2.0184F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.75F, 12.95F, 0.0F, 0.0F, 0.0F, 0.096F));
		PartDefinition cube_r2 = Torso.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(36, 28).addBox(-4.0F, -2.0184F, -0.9956F, 8.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 12.95F, 2.75F, 0.096F, 0.0F, 0.0F));
		PartDefinition cube_r3 = Torso.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(54, 55).addBox(-0.9956F, -2.0184F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.75F, 12.95F, 0.0F, 0.0F, 0.0F, -0.096F));
		PartDefinition cube_r4 = Torso.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(10, 66).addBox(-1.5F, 0.0298F, -0.2391F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, 10.75F, -2.25F, -0.096F, 0.017F, 0.1298F));
		PartDefinition cube_r5 = Torso.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(66, 46).addBox(-1.5F, 0.0298F, -0.2391F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5F, 10.75F, -2.25F, -0.096F, -0.017F, -0.1298F));
		PartDefinition cube_r6 = Torso.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(52, 17).addBox(-4.0F, -2.0184F, -0.9956F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.1F, 2.75F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r7 = Torso.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(43, 51).addBox(-4.0F, -2.0F, -0.5F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.0F, 2.0F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r8 = Torso.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(46, 61).addBox(-0.9956F, -2.0184F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.75F, 7.1F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition cube_r9 = Torso.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(60, 60).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 9.0F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition cube_r10 = Torso.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 62).addBox(-0.0044F, -2.0184F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.75F, 7.1F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition cube_r11 = Torso.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(62, 1).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 9.0F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition cube_r12 = Torso.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(20, 52).addBox(-4.0F, -2.0184F, -0.0044F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.1F, -2.75F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r13 = Torso.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(52, 20).addBox(-4.0F, -2.0F, -0.5F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.0F, -2.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(50, 10).addBox(-1.0F, -2.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 14.0F, 0.0F));
		PartDefinition cube_r14 = LeftArm.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(24, 40).addBox(-2.0F, 0.0F, -0.5F, 4.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -2.0F, 2.0F, 0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r15 = LeftArm.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(34, 40).addBox(-2.0F, 0.0F, -0.5F, 4.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -2.0F, -2.0F, -0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r16 = LeftArm.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(20, 0).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.0436F));
		PartDefinition cube_r17 = LeftArm.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(20, 15).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0436F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(50, 5).addBox(-3.0F, -2.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 14.0F, 0.0F));
		PartDefinition cube_r18 = RightArm.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 36).addBox(-2.0F, 0.0F, -0.5F, 4.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -2.0F, 2.0F, 0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r19 = RightArm.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(40, 0).addBox(-2.0F, 0.0F, -0.5F, 4.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -2.0F, -2.0F, -0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r20 = RightArm.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 14).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0436F));
		PartDefinition cube_r21 = RightArm.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(10, 14).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.0436F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Torso.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}
