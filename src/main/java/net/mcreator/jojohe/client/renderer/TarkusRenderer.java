
package net.mcreator.jojohe.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.jojohe.entity.TarkusEntity;
import net.mcreator.jojohe.client.model.ModelTarkus;

public class TarkusRenderer extends MobRenderer<TarkusEntity, ModelTarkus<TarkusEntity>> {
	public TarkusRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelTarkus(context.bakeLayer(ModelTarkus.LAYER_LOCATION)), 0.7f);
	}

	@Override
	public ResourceLocation getTextureLocation(TarkusEntity entity) {
		return new ResourceLocation("jojohe:textures/entities/tarkus.png");
	}
}
