package net.mcreator.jojohe.client.renderer;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.jojohe.entity.SpaceRipperProjectileEntity;
import net.mcreator.jojohe.client.model.ModelSpaceRipper;

import com.mojang.math.Axis;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class SpaceRipperProjectileRenderer extends EntityRenderer<SpaceRipperProjectileEntity> {
	private static final ResourceLocation texture = new ResourceLocation("jojohe:textures/entities/invis.png");
	private final ModelSpaceRipper model;

	public SpaceRipperProjectileRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new ModelSpaceRipper(context.bakeLayer(ModelSpaceRipper.LAYER_LOCATION));
	}

	@Override
	public void render(SpaceRipperProjectileEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Axis.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
		poseStack.popPose();
		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(SpaceRipperProjectileEntity entity) {
		return texture;
	}
}
