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

// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelTonpettyCoat<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("jojohe", "model_tonpetty_coat"), "main");
	public final ModelPart Chest;
	public final ModelPart LeftArm;
	public final ModelPart RightArm;

	public ModelTonpettyCoat(ModelPart root) {
		this.Chest = root.getChild("Chest");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Chest = partdefinition.addOrReplaceChild("Chest",
				CubeListBuilder.create().texOffs(24, 0).addBox(-4.0F, 5.0F, -2.5F, 8.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 19).addBox(-4.0F, 4.5F, 1.5F, 8.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 22)
						.addBox(-4.0F, 9.5F, 1.4F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(59, 27).addBox(-3.0F, 9.5F, 1.5F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 0)
						.addBox(-4.0F, 0.5F, 1.5F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 50).addBox(3.5F, 4.0F, -2.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 46)
						.addBox(-4.5F, 4.0F, -2.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(19, 3).addBox(-2.0F, 0.0F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 51)
						.addBox(-2.0F, -0.25F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(26, 25).addBox(1.0F, -0.25F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 3)
						.addBox(1.0F, 0.0F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 69).addBox(-2.0F, 1.0F, -2.7F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 16)
						.addBox(-1.0F, 3.0F, -2.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 41).addBox(-4.0F, -0.5F, -2.75F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 56)
						.addBox(-4.6F, 0.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 56).addBox(3.6F, 0.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 6)
						.addBox(-4.0F, -0.5F, -2.25F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(63, 54).addBox(-2.0F, -0.5F, 0.75F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 19)
						.addBox(1.0F, 1.5F, 1.7F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 18).addBox(-3.0F, 1.5F, 1.7F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 3)
						.addBox(-1.0F, 2.5F, 1.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 0).addBox(3.0F, 2.5F, 1.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, 2.5F, 1.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 12).addBox(2.0F, -0.5F, -2.75F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 25)
						.addBox(-4.0F, 2.0F, -2.6F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 56).addBox(-3.5F, 5.0F, -2.6F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 53)
						.addBox(0.5F, 5.0F, -2.6F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 13).addBox(2.0F, -0.5F, -2.25F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 12.0F, 0.0F));
		PartDefinition cube_r1 = Chest.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.0F, -2.5F, 1.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 10.0F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition cube_r2 = Chest.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(12, 0).addBox(-0.5F, 0.0F, -2.5F, 1.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 10.0F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition cube_r3 = Chest.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(38, 6).addBox(-2.5F, 1.0F, -0.5F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 10.0F, 2.0F, 0.1739F, -0.0151F, 0.0859F));
		PartDefinition cube_r4 = Chest.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(40, 60).addBox(2.0F, 0.2F, -2.0F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(37, 35).addBox(1.0F, 0.2F, -4.0F, 1.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.5F, 10.0F, 3.5F, 0.1745F, 0.0F, 0.1745F));
		PartDefinition cube_r5 = Chest.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(60, 61).addBox(-3.0F, 0.2F, -2.0F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 38).addBox(-2.0F, 0.2F, -4.0F, 1.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5F, 10.0F, 3.5F, 0.1745F, 0.0F, -0.1745F));
		PartDefinition cube_r6 = Chest.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(8, 38).addBox(-1.5F, 1.0F, -0.5F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 10.0F, 2.0F, 0.1739F, 0.0151F, -0.0859F));
		PartDefinition cube_r7 = Chest.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(6, 25).addBox(-1.75F, -0.2F, -0.6F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 10.0F, -2.0F, -0.1731F, -0.0227F, -0.1289F));
		PartDefinition cube_r8 = Chest.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(16, 25).addBox(-1.25F, -0.2F, -0.6F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 10.0F, -2.0F, -0.1731F, 0.0227F, 0.1289F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(0, 66).addBox(-1.7F, 0.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(54, 39).addBox(2.95F, 0.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(63, 48)
						.addBox(2.6F, -2.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(18, 41).addBox(-1.0F, -2.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(44, 63)
						.addBox(-1.6F, -2.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(70, 13).addBox(-1.0F, 0.0F, -2.7F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 61)
						.addBox(-1.0F, 1.0F, -2.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 69).addBox(-1.0F, 5.0F, -2.6F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(69, 4)
						.addBox(-1.0F, 5.0F, 1.6F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 64).addBox(-1.0F, 1.0F, 1.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(55, 30)
						.addBox(2.5F, 1.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 55).addBox(-1.5F, 1.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(50, 59)
						.addBox(-1.6F, 5.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 59).addBox(2.6F, 5.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(69, 22)
						.addBox(-1.0F, -2.0F, -2.6F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 69).addBox(-1.0F, -2.0F, 1.6F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(69, 49)
						.addBox(-1.0F, 0.0F, 1.7F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 14.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(64, 13).addBox(0.7F, 0.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(52, 24).addBox(-3.95F, 0.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(63, 41)
						.addBox(-3.6F, -2.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 29).addBox(-3.0F, -2.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(63, 7)
						.addBox(0.6F, -2.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(69, 47).addBox(-3.0F, 0.0F, -2.7F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 64)
						.addBox(-3.0F, 1.0F, -2.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 18).addBox(-3.0F, 5.0F, -2.6F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(67, 34)
						.addBox(-3.0F, 5.0F, 1.6F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(7, 0).addBox(-3.0F, 1.0F, 1.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(51, 50)
						.addBox(-3.5F, 1.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(4, 51).addBox(0.5F, 1.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(58, 16)
						.addBox(0.6F, 5.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(58, 0).addBox(-3.6F, 5.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(69, 8)
						.addBox(-3.0F, -2.0F, -2.6F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(67, 58).addBox(-3.0F, -2.0F, 1.6F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 69)
						.addBox(-3.0F, 0.0F, 1.7F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 14.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Chest.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}
