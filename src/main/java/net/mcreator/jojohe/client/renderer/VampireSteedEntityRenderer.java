
package net.mcreator.jojohe.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.jojohe.entity.VampireSteedEntityEntity;
import net.mcreator.jojohe.client.model.ModelVampireSteed;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class VampireSteedEntityRenderer extends MobRenderer<VampireSteedEntityEntity, ModelVampireSteed<VampireSteedEntityEntity>> {
	public VampireSteedEntityRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelVampireSteed(context.bakeLayer(ModelVampireSteed.LAYER_LOCATION)), 0.6f);
		this.addLayer(new RenderLayer<VampireSteedEntityEntity, ModelVampireSteed<VampireSteedEntityEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("jojohe:textures/entities/vampirehorsee.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, VampireSteedEntityEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, 15728640, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(VampireSteedEntityEntity entity) {
		return new ResourceLocation("jojohe:textures/entities/vampirehorse.png");
	}
}
