package net.mcreator.jojohe.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojohe.entity.JonathanJoestarEntity;

public class JonathanJoestarModel extends GeoModel<JonathanJoestarEntity> {
	@Override
	public ResourceLocation getAnimationResource(JonathanJoestarEntity entity) {
		return new ResourceLocation("jojohe", "animations/jonathanjoestar.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(JonathanJoestarEntity entity) {
		return new ResourceLocation("jojohe", "geo/jonathanjoestar.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(JonathanJoestarEntity entity) {
		return new ResourceLocation("jojohe", "textures/entities/" + entity.getTexture() + ".png");
	}

}
