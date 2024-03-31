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

// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelTarkus<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("jojohe", "model_tarkus"), "main");
	public final ModelPart head;
	public final ModelPart body;
	public final ModelPart LeftArm;
	public final ModelPart RightArm;
	public final ModelPart Leftleg;
	public final ModelPart Rightleg;

	public ModelTarkus(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
		this.Leftleg = root.getChild("Leftleg");
		this.Rightleg = root.getChild("Rightleg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(44, 40).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(28, 23).addBox(-4.5F, -8.5F, -4.5F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(85, 35)
						.addBox(3.5F, -5.5F, -4.5F, 1.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(13, 82).addBox(-4.5F, -5.5F, -4.5F, 1.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(94, 69)
						.addBox(-3.5F, -5.5F, 3.5F, 7.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 9).addBox(-1.5F, -5.5F, -4.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 48)
						.addBox(7.1F, -9.4F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(23, 48).addBox(-8.1F, -9.4F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(51, 50)
						.addBox(-3.75F, -4.9F, -4.25F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(51, 50).mirror().addBox(0.75F, -4.9F, -4.25F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, -9.0F, -3.5F));
		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(55, 28).addBox(-4.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.3491F));
		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(56, 62).addBox(0.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -6.0F, 0.0F, 0.0F, 0.0F, -0.3491F));
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-9.0F, 1.0F, -6.0F, 18.0F, 12.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(33, 92).addBox(-8.25F, 2.5F, -6.75F, 8.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(90, 48)
						.addBox(0.25F, 2.5F, -6.75F, 8.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 0).addBox(-4.5F, 13.0F, -3.0F, 9.0F, 5.0F, 6.0F, new CubeDeformation(0.5F)).texOffs(89, 0)
						.addBox(-4.0F, 13.0F, -3.75F, 8.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 56).addBox(-8.0F, 0.25F, -6.5F, 3.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(20, 50)
						.addBox(5.0F, 0.25F, -6.5F, 3.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(88, 25).addBox(-5.0F, 0.25F, 2.5F, 10.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -10.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(37, 75).addBox(-1.0F, -2.5F, -3.5F, 4.0F, 10.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(77, 80).addBox(-1.0F, 7.5F, -2.5F, 4.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(55, 14)
						.addBox(-2.5F, -3.0F, -4.5F, 7.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(87, 14).addBox(-1.5F, 11.0F, -3.0F, 5.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(10.0F, -7.0F, -0.5F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(22, 65).addBox(-3.0F, -2.5F, -3.5F, 4.0F, 10.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(59, 77).addBox(-3.0F, 7.5F, -2.5F, 4.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 48)
						.addBox(-4.5F, -3.0F, -4.5F, 7.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(28, 35).addBox(-3.5F, 11.0F, -3.0F, 5.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 87)
						.addBox(-1.75F, 17.0F, -4.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(47, 0).addBox(-1.75F, 15.5F, -6.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 23)
						.addBox(-1.75F, 17.5F, -30.0F, 2.0F, 1.0F, 24.0F, new CubeDeformation(0.0F)).texOffs(28, 35).addBox(-1.25F, 16.0F, -8.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 23)
						.addBox(-1.25F, 16.0F, -28.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(17, 23).addBox(-1.25F, 16.5F, -30.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.25F, 17.0F, -31.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 0).addBox(-1.25F, 17.5F, -32.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
						.addBox(-1.25F, 15.5F, -9.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.25F, 15.5F, -25.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(56, 59)
						.addBox(-1.25F, 15.0F, -21.0F, 1.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 48).addBox(-1.75F, 15.0F, -5.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-10.0F, -7.0F, -0.5F));
		PartDefinition Leftleg = partdefinition.addOrReplaceChild("Leftleg",
				CubeListBuilder.create().texOffs(0, 62).addBox(-2.5F, 0.0F, -3.0F, 6.0F, 16.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(70, 50).addBox(-3.0F, 6.5F, -3.5F, 7.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(90, 80)
						.addBox(-3.0F, 4.5F, -3.5F, 7.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(56, 56).addBox(-2.0F, 5.5F, -4.0F, 5.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 64)
						.addBox(-3.0F, 13.5F, -5.5F, 7.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, 8.0F, 0.0F));
		PartDefinition cube_r3 = Leftleg.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(75, 70).addBox(-1.25F, -2.0F, -4.0F, 6.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition Rightleg = partdefinition.addOrReplaceChild("Rightleg",
				CubeListBuilder.create().texOffs(0, 23).addBox(-3.5F, 0.0F, -3.0F, 6.0F, 16.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(68, 28).addBox(-4.0F, 6.5F, -3.5F, 7.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(44, 35)
						.addBox(-4.0F, 4.5F, -3.5F, 7.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(38, 56).addBox(-3.0F, 5.5F, -4.0F, 5.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(51, 94)
						.addBox(-4.0F, 13.5F, -5.5F, 7.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, 8.0F, 0.0F));
		PartDefinition cube_r4 = Rightleg.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(70, 4).addBox(-4.75F, -2.0F, -4.0F, 6.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3927F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Leftleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Rightleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.Leftleg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.Rightleg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
