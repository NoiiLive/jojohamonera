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

// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelBrufordBody<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("jojohe", "model_bruford_body"), "main");
	public final ModelPart body;
	public final ModelPart LeftArm;
	public final ModelPart RightArm;

	public ModelBrufordBody(ModelPart root) {
		this.body = root.getChild("body");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(22, 7).addBox(-4.0F, 2.0F, -2.5F, 8.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 21).addBox(-2.0F, 0.75F, -2.4F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(21, 13)
						.addBox(-2.0F, 0.75F, 1.4F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 0).addBox(-4.0F, 2.0F, 1.5F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 31)
						.addBox(3.5F, 0.0F, -2.0F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 28).addBox(-4.5F, 0.0F, -2.0F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 31)
						.addBox(-4.5F, 7.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 28).addBox(3.5F, 7.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 23)
						.addBox(-4.0F, 1.5F, -2.75F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 6).addBox(-1.0F, 2.25F, -2.85F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 0)
						.addBox(-4.0F, 2.25F, -2.95F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 26).addBox(-4.0F, -0.3F, -2.6F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(13, 23)
						.addBox(2.0F, -0.25F, -2.6F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(26, 34).addBox(2.0F, 2.25F, -2.85F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(15, 14)
						.addBox(-1.0F, 3.75F, -2.85F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(31, 27).addBox(-3.0F, 5.5F, -2.65F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 39)
						.addBox(-2.0F, 7.5F, -2.55F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 23).addBox(-1.5F, 9.5F, -2.45F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.5F, 11.5F, -2.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 12.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(15, 16).addBox(-1.5F, -2.5F, -2.5F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 7).addBox(-1.5F, -0.5F, -2.5F, 6.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(20, 34)
						.addBox(2.5F, 5.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 30).addBox(-1.5F, 5.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(38, 30)
						.addBox(-1.0F, 5.0F, -2.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 37).addBox(-1.0F, 5.0F, 1.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 14.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(0, 14).addBox(-3.5F, -2.5F, -2.5F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.5F, -0.5F, -2.5F, 6.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(31, 20)
						.addBox(-3.5F, 5.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(30, 13).addBox(0.5F, 5.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(37, 20)
						.addBox(-3.0F, 5.0F, -2.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 13).addBox(-3.0F, 5.0F, 1.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 14.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
