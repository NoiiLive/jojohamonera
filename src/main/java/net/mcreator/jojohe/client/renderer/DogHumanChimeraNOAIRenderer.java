
package net.mcreator.jojohe.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.jojohe.entity.DogHumanChimeraNOAIEntity;
import net.mcreator.jojohe.client.model.ModelHumanDogHybrid;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class DogHumanChimeraNOAIRenderer extends MobRenderer<DogHumanChimeraNOAIEntity, ModelHumanDogHybrid<DogHumanChimeraNOAIEntity>> {
	public DogHumanChimeraNOAIRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelHumanDogHybrid(context.bakeLayer(ModelHumanDogHybrid.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<DogHumanChimeraNOAIEntity, ModelHumanDogHybrid<DogHumanChimeraNOAIEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("jojohe:textures/entities/doghuman_e.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, DogHumanChimeraNOAIEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, 15728640, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(DogHumanChimeraNOAIEntity entity) {
		return new ResourceLocation("jojohe:textures/entities/doghumantexture.png");
	}
}
