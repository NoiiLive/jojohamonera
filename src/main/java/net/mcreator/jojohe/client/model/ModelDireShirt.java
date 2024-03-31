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
public class ModelDireShirt<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("jojohe", "model_dire_shirt"), "main");
	public final ModelPart Chest;
	public final ModelPart LeftArm;
	public final ModelPart RightArm;

	public ModelDireShirt(ModelPart root) {
		this.Chest = root.getChild("Chest");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Chest = partdefinition.addOrReplaceChild("Chest",
				CubeListBuilder.create().texOffs(36, 27).addBox(-4.0F, 8.0F, -2.4F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 0).addBox(-4.0F, 8.0F, 1.4F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 61)
						.addBox(3.4F, 8.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(60, 58).addBox(-4.4F, 8.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 38)
						.addBox(3.5F, 0.0F, -2.0F, 1.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(60, 49).addBox(3.5F, 10.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(6, 59)
						.addBox(-4.5F, 10.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(36, 36).addBox(-4.5F, 0.0F, -2.0F, 1.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 10)
						.addBox(-4.0F, 1.0F, -2.5F, 8.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 18).addBox(-4.0F, 0.0F, 1.5F, 8.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 29)
						.addBox(-4.0F, 0.0F, -2.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 27).addBox(-4.0F, 10.0F, -2.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 6)
						.addBox(-4.0F, 10.0F, 1.5F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 3).addBox(-4.0F, 11.0F, -2.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 25)
						.addBox(1.0F, 10.0F, -2.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 18).addBox(2.0F, 11.0F, -2.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 27)
						.addBox(-1.5F, 1.1F, -2.7F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 25).addBox(-2.5F, 0.75F, -2.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 22)
						.addBox(1.5F, 0.75F, -2.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 41).addBox(-4.0F, -0.25F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 36)
						.addBox(1.0F, -0.25F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(14, 20).addBox(-1.0F, -0.25F, 1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 27)
						.addBox(1.0F, 0.0F, -2.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 12.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(6, 48).addBox(2.5F, 0.0F, -2.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(46, 5).addBox(-1.5F, 0.0F, -2.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(57, 19)
						.addBox(2.4F, 6.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(12, 56).addBox(-1.4F, 6.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(58, 7)
						.addBox(-1.0F, 0.0F, -2.5F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 55).addBox(-1.0F, 0.0F, 1.5F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(63, 43)
						.addBox(-1.0F, 6.0F, -2.4F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(63, 19).addBox(-1.0F, 6.0F, 1.4F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 9)
						.addBox(-1.7F, -3.0F, -3.0F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 14.0F, 0.0F));
		PartDefinition cube_r1 = LeftArm.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(16, 50).addBox(-1.5F, -4.0F, -0.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 18).addBox(-1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(51, 10)
						.addBox(-3.5F, -4.0F, -0.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(18, 10).addBox(-3.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8F, -3.0F, 0.5F, -0.7854F, 0.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(42, 44).addBox(-3.5F, 0.0F, -2.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(30, 44).addBox(0.5F, 0.0F, -2.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(44, 55)
						.addBox(-3.4F, 6.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 54).addBox(0.4F, 6.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(34, 55)
						.addBox(-3.0F, 0.0F, -2.5F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 46).addBox(-3.0F, 0.0F, 1.5F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 63)
						.addBox(-3.0F, 6.0F, -2.4F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(43, 62).addBox(-3.0F, 6.0F, 1.4F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.3F, -3.0F, -3.0F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 14.0F, 0.0F));
		PartDefinition cube_r2 = RightArm.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(35, 49).addBox(0.5F, -4.0F, -0.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(0.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 49)
						.addBox(2.5F, -4.0F, -0.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 9).addBox(2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8F, -3.0F, 0.5F, -0.7854F, 0.0F, 0.0F));
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
