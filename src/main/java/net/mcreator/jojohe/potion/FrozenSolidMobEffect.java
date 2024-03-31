
package net.mcreator.jojohe.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.jojohe.procedures.FrozenSolidEffectsProcedure;

public class FrozenSolidMobEffect extends MobEffect {
	public FrozenSolidMobEffect() {
		super(MobEffectCategory.HARMFUL, -4521985);
	}

	@Override
	public String getDescriptionId() {
		return "effect.jojohe.frozen_solid";
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		FrozenSolidEffectsProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
