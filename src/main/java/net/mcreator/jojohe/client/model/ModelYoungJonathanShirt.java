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

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelYoungJonathanShirt<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("jojohe", "model_young_jonathan_shirt"), "main");
	public final ModelPart Body;
	public final ModelPart LeftArm;
	public final ModelPart RightArm;

	public ModelYoungJonathanShirt(ModelPart root) {
		this.Body = root.getChild("Body");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(6, 33).addBox(-2.0F, 5.0F, -2.55F, 4.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 14).addBox(-2.0F, 4.0F, -2.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 17)
						.addBox(1.0F, 4.0F, -2.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 33).addBox(2.0F, 0.0F, -2.55F, 2.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 24)
						.addBox(-4.0F, 0.0F, -2.55F, 2.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 0).addBox(-2.0F, 1.0F, -2.4F, 4.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 0)
						.addBox(-0.5F, 1.25F, -2.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.0F, 1.0F, 1.4F, 8.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 2)
						.addBox(2.0F, 0.0F, 1.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 0).addBox(-4.0F, 0.0F, 1.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 29)
						.addBox(-2.0F, 0.0F, 1.3F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 17).addBox(3.4F, 0.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(36, 4)
						.addBox(2.0F, -0.25F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 36).addBox(-2.0F, -0.15F, 0.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 0)
						.addBox(-2.0F, -0.15F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 17).addBox(1.0F, -0.15F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
						.addBox(-4.4F, 0.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 33).addBox(-4.0F, -0.25F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
						.addBox(-4.0F, 11.25F, -2.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 12.0F, 0.0F));
		PartDefinition torso_r1 = Body.addOrReplaceChild("torso_r1", CubeListBuilder.create().texOffs(36, 24).addBox(-2.0F, -1.0F, -0.25F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.85F, 0.35F, -2.15F, -0.1897F, -0.1084F, -1.0369F));
		PartDefinition torso_r2 = Body.addOrReplaceChild("torso_r2", CubeListBuilder.create().texOffs(25, 37).addBox(0.0F, -1.0F, -0.25F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.85F, 0.35F, -2.15F, -0.1897F, 0.1084F, 1.0369F));
		PartDefinition torso_r3 = Body.addOrReplaceChild("torso_r3", CubeListBuilder.create().texOffs(16, 17).addBox(-0.5F, -1.25F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 2.75F, -2.15F, -0.0873F, 0.0F, -0.6981F));
		PartDefinition torso_r4 = Body.addOrReplaceChild("torso_r4", CubeListBuilder.create().texOffs(20, 13).addBox(-0.5F, -1.25F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 2.75F, -2.15F, -0.0873F, 0.0F, 0.6981F));
		PartDefinition torso_r5 = Body.addOrReplaceChild("torso_r5", CubeListBuilder.create().texOffs(0, 12).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5817F, 3.1209F, -2.1F, -0.0436F, 0.0F, -0.2618F));
		PartDefinition torso_r6 = Body.addOrReplaceChild("torso_r6", CubeListBuilder.create().texOffs(0, 17).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5817F, 3.1209F, -2.1F, -0.0436F, 0.0F, 0.2618F));
		PartDefinition torso_r7 = Body.addOrReplaceChild("torso_r7", CubeListBuilder.create().texOffs(16, 39).addBox(-0.4F, -4.0F, -0.49F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.693F, 5.0751F, -2.05F, 0.0F, 0.0F, -0.7418F));
		PartDefinition torso_r8 = Body.addOrReplaceChild("torso_r8", CubeListBuilder.create().texOffs(20, 39).addBox(-0.6F, -4.0F, -0.495F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.693F, 5.0751F, -2.05F, 0.0F, 0.0F, 0.7418F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(39, 10).addBox(2.4F, 7.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 13).addBox(2.5F, -2.0F, -2.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(26, 9)
						.addBox(-1.0F, -2.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 0).addBox(-1.5F, -2.0F, -2.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(31, 38)
						.addBox(-1.4F, 7.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(37, 38).addBox(-1.0F, 7.0F, -2.4F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 14)
						.addBox(-1.0F, -2.0F, -2.5F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 26).addBox(-1.0F, -2.0F, 1.5F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 31)
						.addBox(-1.0F, 7.0F, 1.4F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 14.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(39, 10).mirror().addBox(-3.4F, 7.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(20, 13).mirror().addBox(-3.5F, -2.0F, -2.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(26, 9).mirror().addBox(-3.0F, -2.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(20, 0).mirror().addBox(0.5F, -2.0F, -2.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(31, 38).mirror().addBox(0.4F, 7.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(37, 38).mirror().addBox(-3.0F, 7.0F, -2.4F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(30, 14).mirror().addBox(-3.0F, -2.0F, -2.5F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(20, 26).mirror().addBox(-3.0F, -2.0F, 1.5F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(36, 31).mirror().addBox(-3.0F, 7.0F, 1.4F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
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
