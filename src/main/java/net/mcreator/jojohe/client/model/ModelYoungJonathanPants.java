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

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelYoungJonathanPants<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("jojohe", "model_young_jonathan_pants"), "main");
	public final ModelPart LeftLeg;
	public final ModelPart RightLeg;

	public ModelYoungJonathanPants(ModelPart root) {
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(52, 0).addBox(-2.0F, 7.0F, -2.25F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 50).addBox(-2.0F, 7.0F, 1.25F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 14)
						.addBox(-2.25F, 7.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(39, 24).addBox(1.25F, 7.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(35, 38)
						.addBox(1.35F, 0.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(42, 50).addBox(1.35F, 6.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(12, 38)
						.addBox(-2.35F, 0.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(47, 45).addBox(-2.35F, 6.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));
		PartDefinition left_leg_r1 = LeftLeg.addOrReplaceChild("left_leg_r1", CubeListBuilder.create().texOffs(6, 49).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9464F, 4.3799F, 0.0F, 0.0F, 0.0F, 0.2182F));
		PartDefinition left_leg_r2 = LeftLeg.addOrReplaceChild("left_leg_r2", CubeListBuilder.create().texOffs(0, 46).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.8381F, 5.6279F, 0.0F, 0.0F, 0.0F, -0.2182F));
		PartDefinition left_leg_r3 = LeftLeg.addOrReplaceChild("left_leg_r3", CubeListBuilder.create().texOffs(36, 49).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9464F, 4.3799F, 0.0F, 0.0F, 0.0F, -0.2182F));
		PartDefinition left_leg_r4 = LeftLeg.addOrReplaceChild("left_leg_r4", CubeListBuilder.create().texOffs(46, 1).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8381F, 5.6279F, 0.0F, 0.0F, 0.0F, 0.2182F));
		PartDefinition bone = LeftLeg.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 38).addBox(-2.35F, -4.0026F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(26, 23).addBox(-2.0F, -4.2526F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(30, 46)
						.addBox(-2.35F, 1.9974F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(36, 5).addBox(1.35F, -4.0026F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(12, 46)
						.addBox(1.35F, 1.9974F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.0026F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition left_leg_r5 = bone.addOrReplaceChild("left_leg_r5", CubeListBuilder.create().texOffs(46, 13).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9464F, 0.3773F, 0.0F, 0.0F, 0.0F, -0.2182F));
		PartDefinition left_leg_r6 = bone.addOrReplaceChild("left_leg_r6", CubeListBuilder.create().texOffs(46, 7).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8381F, 1.6253F, 0.0F, 0.0F, 0.0F, 0.2182F));
		PartDefinition left_leg_r7 = bone.addOrReplaceChild("left_leg_r7", CubeListBuilder.create().texOffs(47, 40).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9464F, 0.3773F, 0.0F, 0.0F, 0.0F, 0.2182F));
		PartDefinition left_leg_r8 = bone.addOrReplaceChild("left_leg_r8", CubeListBuilder.create().texOffs(45, 34).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.8381F, 1.6253F, 0.0F, 0.0F, 0.0F, -0.2182F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(52, 0).mirror().addBox(-2.0F, 7.0F, -2.25F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(48, 50).mirror().addBox(-2.0F, 7.0F, 1.25F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(40, 14).mirror().addBox(1.25F, 7.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(39, 24).mirror().addBox(-2.25F, 7.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(35, 38).mirror().addBox(-2.35F, 0.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(42, 50).mirror().addBox(-2.35F, 6.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(12, 38).mirror().addBox(1.35F, 0.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(47, 45).mirror().addBox(1.35F, 6.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition left_leg_r9 = RightLeg.addOrReplaceChild("left_leg_r9", CubeListBuilder.create().texOffs(6, 49).mirror().addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.9464F, 4.3799F, 0.0F, 0.0F, 0.0F, -0.2182F));
		PartDefinition left_leg_r10 = RightLeg.addOrReplaceChild("left_leg_r10", CubeListBuilder.create().texOffs(0, 46).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.8381F, 5.6279F, 0.0F, 0.0F, 0.0F, 0.2182F));
		PartDefinition left_leg_r11 = RightLeg.addOrReplaceChild("left_leg_r11", CubeListBuilder.create().texOffs(36, 49).mirror().addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.9464F, 4.3799F, 0.0F, 0.0F, 0.0F, 0.2182F));
		PartDefinition left_leg_r12 = RightLeg.addOrReplaceChild("left_leg_r12", CubeListBuilder.create().texOffs(46, 1).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.8381F, 5.6279F, 0.0F, 0.0F, 0.0F, -0.2182F));
		PartDefinition bone2 = RightLeg.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(0, 38).mirror().addBox(1.35F, -4.0026F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(26, 23).mirror()
						.addBox(-2.0F, -4.2526F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(30, 46).mirror().addBox(1.35F, 1.9974F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(36, 5)
						.mirror().addBox(-2.35F, -4.0026F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(12, 46).mirror().addBox(-2.35F, 1.9974F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.0026F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition left_leg_r13 = bone2.addOrReplaceChild("left_leg_r13", CubeListBuilder.create().texOffs(46, 13).mirror().addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.9464F, 0.3773F, 0.0F, 0.0F, 0.0F, 0.2182F));
		PartDefinition left_leg_r14 = bone2.addOrReplaceChild("left_leg_r14", CubeListBuilder.create().texOffs(46, 7).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.8381F, 1.6253F, 0.0F, 0.0F, 0.0F, -0.2182F));
		PartDefinition left_leg_r15 = bone2.addOrReplaceChild("left_leg_r15", CubeListBuilder.create().texOffs(47, 40).mirror().addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.9464F, 0.3773F, 0.0F, 0.0F, 0.0F, -0.2182F));
		PartDefinition left_leg_r16 = bone2.addOrReplaceChild("left_leg_r16", CubeListBuilder.create().texOffs(45, 34).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.8381F, 1.6253F, 0.0F, 0.0F, 0.0F, 0.2182F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
