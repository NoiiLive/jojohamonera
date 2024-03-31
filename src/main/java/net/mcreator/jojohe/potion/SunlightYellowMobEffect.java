
package net.mcreator.jojohe.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.jojohe.procedures.OverdriveEffectProcedure;

public class SunlightYellowMobEffect extends MobEffect {
	public SunlightYellowMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -1095);
	}

	@Override
	public String getDescriptionId() {
		return "effect.jojohe.sunlight_yellow";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		OverdriveEffectProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
