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

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelJonathanJoestarPants<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("jojohe", "model_jonathan_joestar_pants"), "main");
	public final ModelPart body;
	public final ModelPart left_leg;
	public final ModelPart right_leg;

	public ModelJonathanJoestarPants(ModelPart root) {
		this.body = root.getChild("body");
		this.left_leg = root.getChild("left_leg");
		this.right_leg = root.getChild("right_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(36, 37).addBox(-4.0F, 11.25F, -2.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(61, 6).addBox(3.3153F, 9.0636F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(67, 21)
						.addBox(3.4153F, 9.1636F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)).texOffs(65, 43).addBox(-4.4153F, 9.1636F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)).texOffs(18, 60)
						.addBox(-4.3153F, 9.0636F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(50, 29).addBox(-4.0F, 9.0636F, -2.3153F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 23)
						.addBox(-4.0F, 9.1636F, -2.4153F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).texOffs(40, 31).addBox(-1.0F, 9.4136F, -2.515F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).texOffs(51, 45)
						.addBox(-4.0F, 9.1636F, 1.4153F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).texOffs(17, 50).addBox(-4.0F, 9.0636F, 1.3153F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition torso_r1 = body.addOrReplaceChild("torso_r1", CubeListBuilder.create().texOffs(87, 7).addBox(-1.0F, -1.0F, -0.4987F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(0.0111F, 9.4126F, -2.3163F, 0.0F, 0.0F, -0.7854F));
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg",
				CubeListBuilder.create().texOffs(67, 2).addBox(1.2659F, 4.4511F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 66).addBox(-2.2659F, 4.4511F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(81, 18)
						.addBox(-2.0F, 4.4511F, -2.2659F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 21).addBox(-2.0F, 4.4511F, 1.2659F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 50)
						.addBox(-2.0F, -0.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));
		PartDefinition left_leg_r1 = left_leg.addOrReplaceChild("left_leg_r1", CubeListBuilder.create().texOffs(44, 0).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.9616F, 1.9813F, 0.1745F, 0.0F, 0.0F));
		PartDefinition left_leg_r2 = left_leg.addOrReplaceChild("left_leg_r2", CubeListBuilder.create().texOffs(81, 0).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.6477F, 2.0435F, -0.3054F, 0.0F, 0.0F));
		PartDefinition left_leg_r3 = left_leg.addOrReplaceChild("left_leg_r3", CubeListBuilder.create().texOffs(71, 13).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.9616F, -1.9813F, -0.1745F, 0.0F, 0.0F));
		PartDefinition left_leg_r4 = left_leg.addOrReplaceChild("left_leg_r4", CubeListBuilder.create().texOffs(81, 49).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.6477F, -2.0435F, 0.3054F, 0.0F, 0.0F));
		PartDefinition right_leg_r1 = left_leg.addOrReplaceChild("right_leg_r1", CubeListBuilder.create().texOffs(50, 65).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0435F, 3.6477F, 0.0F, 0.0F, 0.0F, -0.3054F));
		PartDefinition right_leg_r2 = left_leg.addOrReplaceChild("right_leg_r2", CubeListBuilder.create().texOffs(61, 55).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9813F, 0.9616F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition left_leg_r5 = left_leg.addOrReplaceChild("left_leg_r5", CubeListBuilder.create().texOffs(67, 51).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0435F, 3.6477F, 0.0F, 0.0F, 0.0F, 0.3054F));
		PartDefinition left_leg_r6 = left_leg.addOrReplaceChild("left_leg_r6", CubeListBuilder.create().texOffs(34, 62).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9813F, 0.9616F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg",
				CubeListBuilder.create().texOffs(67, 2).mirror().addBox(-2.2659F, 4.4511F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(24, 66).mirror()
						.addBox(1.2659F, 4.4511F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(81, 18).mirror().addBox(-2.0F, 4.4511F, -2.2659F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(80, 21)
						.mirror().addBox(-2.0F, 4.4511F, 1.2659F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(52, 50).mirror().addBox(-2.0F, -0.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition right_leg_r3 = right_leg.addOrReplaceChild("right_leg_r3", CubeListBuilder.create().texOffs(44, 0).mirror().addBox(-2.0F, -1.0F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.9616F, 1.9813F, 0.1745F, 0.0F, 0.0F));
		PartDefinition right_leg_r4 = right_leg.addOrReplaceChild("right_leg_r4", CubeListBuilder.create().texOffs(81, 0).mirror().addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.6477F, 2.0435F, -0.3054F, 0.0F, 0.0F));
		PartDefinition right_leg_r5 = right_leg.addOrReplaceChild("right_leg_r5", CubeListBuilder.create().texOffs(71, 13).mirror().addBox(-2.0F, -1.0F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.9616F, -1.9813F, -0.1745F, 0.0F, 0.0F));
		PartDefinition right_leg_r6 = right_leg.addOrReplaceChild("right_leg_r6", CubeListBuilder.create().texOffs(81, 49).mirror().addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.6477F, -2.0435F, 0.3054F, 0.0F, 0.0F));
		PartDefinition left_leg_r7 = right_leg.addOrReplaceChild("left_leg_r7", CubeListBuilder.create().texOffs(50, 65).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.0435F, 3.6477F, 0.0F, 0.0F, 0.0F, 0.3054F));
		PartDefinition left_leg_r8 = right_leg.addOrReplaceChild("left_leg_r8", CubeListBuilder.create().texOffs(61, 55).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.9813F, 0.9616F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition right_leg_r7 = right_leg.addOrReplaceChild("right_leg_r7", CubeListBuilder.create().texOffs(67, 51).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0435F, 3.6477F, 0.0F, 0.0F, 0.0F, -0.3054F));
		PartDefinition right_leg_r8 = right_leg.addOrReplaceChild("right_leg_r8", CubeListBuilder.create().texOffs(34, 62).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.9813F, 0.9616F, 0.0F, 0.0F, 0.0F, 0.1745F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
