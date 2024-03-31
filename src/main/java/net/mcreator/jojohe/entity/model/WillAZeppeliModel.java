package net.mcreator.jojohe.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojohe.entity.WillAZeppeliEntity;

public class WillAZeppeliModel extends GeoModel<WillAZeppeliEntity> {
	@Override
	public ResourceLocation getAnimationResource(WillAZeppeliEntity entity) {
		return new ResourceLocation("jojohe", "animations/williamzeppeli.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WillAZeppeliEntity entity) {
		return new ResourceLocation("jojohe", "geo/williamzeppeli.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WillAZeppeliEntity entity) {
		return new ResourceLocation("jojohe", "textures/entities/" + entity.getTexture() + ".png");
	}

}
