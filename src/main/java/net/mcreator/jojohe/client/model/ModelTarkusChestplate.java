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

// Made with Blockbench 4.4.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelTarkusChestplate<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("jojohe", "model_tarkus_chestplate"), "main");
	public final ModelPart Body;
	public final ModelPart LeftArm;
	public final ModelPart RightArm;

	public ModelTarkusChestplate(ModelPart root) {
		this.Body = root.getChild("Body");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(6, 26).addBox(-1.0F, 7.9F, -2.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(17, 3).addBox(-1.0F, 4.9F, -2.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(37, 0)
						.addBox(-2.0F, 5.9F, -2.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(17, 0).addBox(-4.0F, 4.9F, -2.4F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(17, 25)
						.addBox(-4.0F, 4.9F, 1.4F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 2).addBox(-4.0F, 6.9F, -2.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(3.0F, 6.9F, -2.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 20).addBox(-4.0F, 0.9F, -2.5F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 20)
						.addBox(-4.0F, -0.1F, 1.5F, 8.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 18).addBox(-4.0F, -0.1F, -2.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
						.addBox(1.0F, -0.1F, -2.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(17, 3).addBox(1.75F, -0.55F, -3.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(35, 23)
						.addBox(-2.0F, -0.55F, 1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 12).addBox(-3.75F, -0.55F, -3.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(32, 14)
						.addBox(2.0F, -0.35F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 7).addBox(-4.0F, -0.35F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 26)
						.addBox(3.5F, -0.1F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 26).addBox(-4.5F, -0.1F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 35)
						.addBox(3.4F, 4.9F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 35).addBox(-4.4F, 4.9F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 12.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(0, 9).addBox(-1.5F, -2.25F, -2.55F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(30, 36).addBox(-1.0F, 5.75F, -2.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 27)
						.addBox(-1.0F, 5.75F, 1.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(31, 0).addBox(-1.5F, 5.75F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(30, 29)
						.addBox(2.5F, 5.75F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 14.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.5F, -2.25F, -2.55F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(20, 36).addBox(-3.0F, 5.75F, -2.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 19)
						.addBox(-3.0F, 5.75F, 1.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 29).addBox(0.5F, 5.75F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(26, 11)
						.addBox(-3.5F, 5.75F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 14.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
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
