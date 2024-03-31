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
public class ModelTarkusBoots<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("jojohe", "model_tarkus_boots"), "main");
	public final ModelPart LeftFoot;
	public final ModelPart RightFoot;

	public ModelTarkusBoots(ModelPart root) {
		this.LeftFoot = root.getChild("LeftFoot");
		this.RightFoot = root.getChild("RightFoot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition LeftFoot = partdefinition.addOrReplaceChild("LeftFoot",
				CubeListBuilder.create().texOffs(35, 36).addBox(-2.0F, 10.0F, -4.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(25, 36).addBox(-2.0F, 5.0F, -2.5F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 10)
						.addBox(-1.0F, 5.5F, -2.75F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 20).addBox(-1.5F, 6.0F, -2.65F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 30)
						.addBox(-2.0F, 6.0F, 1.5F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 20).addBox(1.5F, 6.0F, -2.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 4)
						.addBox(-2.5F, 6.0F, -2.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(14, 10).addBox(-2.5F, 5.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 7)
						.addBox(1.5F, 5.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 7).addBox(-2.0F, 11.25F, -4.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));
		PartDefinition RightFoot = partdefinition.addOrReplaceChild("RightFoot",
				CubeListBuilder.create().texOffs(32, 0).addBox(-2.0F, 10.0F, -4.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 8).addBox(-2.0F, 5.0F, -2.5F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 7)
						.addBox(-1.0F, 5.5F, -2.75F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 18).addBox(-1.5F, 6.0F, -2.65F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(29, 29)
						.addBox(-2.0F, 6.0F, 1.5F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 18).addBox(-2.5F, 6.0F, -2.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(14, 14)
						.addBox(1.5F, 6.0F, -2.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 3).addBox(1.5F, 5.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.5F, 5.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.0F, 11.25F, -4.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		LeftFoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightFoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.LeftFoot.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightFoot.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
