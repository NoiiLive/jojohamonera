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
public class ModelShadowDioPants<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("jojohe", "model_shadow_dio_pants"), "main");
	public final ModelPart Body;
	public final ModelPart LeftLeg;
	public final ModelPart RightLeg;

	public ModelShadowDioPants(ModelPart root) {
		this.Body = root.getChild("Body");
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(46, 43).addBox(-4.5F, 10.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(46, 23).addBox(-4.25F, 11.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(46, 29)
						.addBox(3.5F, 10.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(46, 18).addBox(3.25F, 11.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(14, 9)
						.addBox(-4.0F, 10.0F, -2.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 31).addBox(1.5F, 11.0F, -2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 22)
						.addBox(1.5F, 11.0F, 1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.5F, 11.0F, -2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 27)
						.addBox(-2.5F, 11.0F, 1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 45).addBox(-2.0F, 11.0F, -2.15F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 8)
						.addBox(2.0F, 11.0F, -2.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.0F, 11.25F, -2.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 27)
						.addBox(-4.0F, 11.0F, -2.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 5).addBox(-4.0F, 11.0F, 1.25F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 35)
						.addBox(-0.5F, 10.5F, -2.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 25).addBox(-1.0F, 9.5F, -2.75F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 7)
						.addBox(-4.0F, 10.0F, 1.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(18, 25).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 19).addBox(-1.0F, 0.0F, -4.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 13.0F, 2.0F, 0.0F, 0.0F, 0.7418F));
		PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(12, 21).addBox(-1.0181F, -0.018F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 31)
				.addBox(-1.0181F, 0.982F, -3.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(16, 19).addBox(-1.0181F, -0.018F, -4.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.85F, 14.5F, 2.0F, 0.0F, 0.0F, 1.309F));
		PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(6, 37).addBox(0.0181F, 0.982F, -3.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 31)
				.addBox(0.0181F, -0.018F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 7).addBox(0.0181F, -0.018F, -4.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.85F, 14.5F, 2.0F, 0.0F, 0.0F, -1.309F));
		PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(30, 29).addBox(0.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 24).addBox(0.0F, 0.0F, -4.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, 13.0F, 2.0F, 0.0F, 0.0F, -0.7418F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(34, 15).addBox(-2.0F, 0.0F, -2.15F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 18).addBox(-2.0F, 2.0F, -2.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 55)
						.addBox(-2.25F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 49).addBox(-2.25F, 2.0F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(16, 18)
						.addBox(1.25F, 0.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(68, 0).addBox(-2.0F, -0.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(17, 55)
						.addBox(-2.15F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 33).addBox(-2.15F, 2.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 13)
						.addBox(0.0F, 0.0F, -2.25F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 55).addBox(-1.0F, 2.0F, -2.25F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 23)
						.addBox(-2.0F, 0.0F, 1.25F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 0).addBox(-0.5F, 6.5F, -2.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 43)
						.addBox(-2.0F, 6.0F, -2.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 13).addBox(-2.5F, 6.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(34, 45)
						.addBox(1.5F, 6.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(52, 31).addBox(-2.0F, 6.0F, 1.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(-1.0F, 5.5F, -2.75F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));
		PartDefinition cube_r5 = LeftLeg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(40, 20).addBox(-0.75F, 0.01F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.0F, 2.0F, 1.5708F, -1.309F, -1.5708F));
		PartDefinition cube_r6 = LeftLeg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(40, 11).addBox(-0.75F, -2.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.75F, 2.0F, -1.5708F, -1.309F, 1.5708F));
		PartDefinition cube_r7 = LeftLeg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(34, 39).addBox(-0.75F, 0.01F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.25F, 2.0F, 1.5708F, -1.309F, -1.5708F));
		PartDefinition cube_r8 = LeftLeg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(16, 39).addBox(-0.75F, -2.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 10.0F, 2.0F, -1.5708F, -1.309F, 1.5708F));
		PartDefinition cube_r9 = LeftLeg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(28, 37).addBox(-0.25F, 0.01F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.0F, -2.0F, -1.5708F, -1.309F, 1.5708F));
		PartDefinition cube_r10 = LeftLeg.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(10, 37).addBox(-0.25F, -2.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.75F, -2.0F, 1.5708F, -1.309F, -1.5708F));
		PartDefinition cube_r11 = LeftLeg.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(37, 2).addBox(-0.25F, 0.01F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.25F, -2.0F, -1.5708F, -1.309F, 1.5708F));
		PartDefinition cube_r12 = LeftLeg.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 37).addBox(-0.25F, -2.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 10.0F, -2.0F, 1.5708F, -1.309F, -1.5708F));
		PartDefinition cube_r13 = LeftLeg.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(42, 35).addBox(-0.25F, 0.01F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition cube_r14 = LeftLeg.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(40, 41).addBox(-0.25F, -2.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 6.75F, 0.0F, 0.0F, 0.0F, -0.2618F));
		PartDefinition cube_r15 = LeftLeg.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(22, 41).addBox(-0.25F, 0.01F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 6.25F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition cube_r16 = LeftLeg.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(40, 27).addBox(-0.25F, -2.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 10.0F, 0.0F, 0.0F, 0.0F, -0.2618F));
		PartDefinition cube_r17 = LeftLeg.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(43, 0).addBox(-0.75F, 0.01F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 6.25F, 0.0F, 0.0F, 0.0F, -0.2618F));
		PartDefinition cube_r18 = LeftLeg.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 43).addBox(-0.75F, -2.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 10.0F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition cube_r19 = LeftLeg.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(10, 43).addBox(-0.75F, -2.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 6.75F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition cube_r20 = LeftLeg.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(28, 43).addBox(-0.75F, 0.01F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 3.0F, 0.0F, 0.0F, 0.0F, -0.2618F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(22, 11).addBox(0.0F, 0.0F, -2.15F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 16).addBox(1.0F, 2.0F, -2.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
						.addBox(1.25F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 43).addBox(1.25F, 2.0F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(16, 11)
						.addBox(-2.25F, 0.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 5).addBox(1.15F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(22, 20)
						.addBox(1.15F, 2.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 12).addBox(-2.0F, 0.0F, -2.25F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(55, 9)
						.addBox(-2.0F, 2.0F, -2.25F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 18).addBox(-2.0F, 0.0F, 1.25F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 21)
						.addBox(-0.5F, 6.5F, -2.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(49, 0).addBox(-2.0F, 6.0F, -2.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 45)
						.addBox(1.5F, 6.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(43, 6).addBox(-2.5F, 6.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 18)
						.addBox(-2.0F, 6.0F, 1.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 9).addBox(-1.0F, 5.5F, -2.75F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 0).mirror()
						.addBox(-2.0F, -0.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition cube_r21 = RightLeg.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(12, 25).addBox(-0.25F, 0.01F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.0F, 2.0F, 1.5708F, 1.309F, 1.5708F));
		PartDefinition cube_r22 = RightLeg.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(18, 27).addBox(-0.25F, -2.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.75F, 2.0F, -1.5708F, 1.309F, -1.5708F));
		PartDefinition cube_r23 = RightLeg.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(28, 7).addBox(-0.25F, 0.01F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.25F, 2.0F, 1.5708F, 1.309F, 1.5708F));
		PartDefinition cube_r24 = RightLeg.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(28, 16).addBox(-0.25F, -2.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 10.0F, 2.0F, -1.5708F, 1.309F, -1.5708F));
		PartDefinition cube_r25 = RightLeg.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(28, 23).addBox(-0.75F, 0.01F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.0F, -2.0F, -1.5708F, 1.309F, -1.5708F));
		PartDefinition cube_r26 = RightLeg.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(24, 29).addBox(-0.75F, -2.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.75F, -2.0F, 1.5708F, 1.309F, 1.5708F));
		PartDefinition cube_r27 = RightLeg.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 31).addBox(-0.75F, 0.01F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.25F, -2.0F, -1.5708F, 1.309F, -1.5708F));
		PartDefinition cube_r28 = RightLeg.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(31, 0).addBox(-0.75F, -2.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 10.0F, -2.0F, 1.5708F, 1.309F, 1.5708F));
		PartDefinition cube_r29 = RightLeg.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(10, 31).addBox(-0.75F, 0.01F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 3.0F, 0.0F, 0.0F, 0.0F, -0.2618F));
		PartDefinition cube_r30 = RightLeg.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(30, 31).addBox(-0.75F, -2.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 6.75F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition cube_r31 = RightLeg.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(16, 33).addBox(-0.75F, 0.01F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 6.25F, 0.0F, 0.0F, 0.0F, -0.2618F));
		PartDefinition cube_r32 = RightLeg.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(34, 9).addBox(-0.75F, -2.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 10.0F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition cube_r33 = RightLeg.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(34, 18).addBox(-0.25F, 0.01F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 6.25F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition cube_r34 = RightLeg.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(34, 25).addBox(-0.25F, -2.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 10.0F, 0.0F, 0.0F, 0.0F, -0.2618F));
		PartDefinition cube_r35 = RightLeg.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(22, 35).addBox(-0.25F, -2.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 6.75F, 0.0F, 0.0F, 0.0F, -0.2618F));
		PartDefinition cube_r36 = RightLeg.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(36, 33).addBox(-0.25F, 0.01F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.2618F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
