package net.mcreator.jojohe.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojohe.entity.DioBrandoEntity;

public class DioBrandoModel extends GeoModel<DioBrandoEntity> {
	@Override
	public ResourceLocation getAnimationResource(DioBrandoEntity entity) {
		return new ResourceLocation("jojohe", "animations/diobrando.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DioBrandoEntity entity) {
		return new ResourceLocation("jojohe", "geo/diobrando.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DioBrandoEntity entity) {
		return new ResourceLocation("jojohe", "textures/entities/" + entity.getTexture() + ".png");
	}

}
