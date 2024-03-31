
package net.mcreator.jojohe.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.jojohe.procedures.AfterimagesEffectActiveProcedure;

public class AfterimagesEffectMobEffect extends MobEffect {
	public AfterimagesEffectMobEffect() {
		super(MobEffectCategory.NEUTRAL, -52);
	}

	@Override
	public String getDescriptionId() {
		return "effect.jojohe.afterimages_effect";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		AfterimagesEffectActiveProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
