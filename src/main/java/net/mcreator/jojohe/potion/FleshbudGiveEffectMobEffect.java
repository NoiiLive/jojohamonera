
package net.mcreator.jojohe.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class FleshbudGiveEffectMobEffect extends MobEffect {
	public FleshbudGiveEffectMobEffect() {
		super(MobEffectCategory.NEUTRAL, -4023922);
	}

	@Override
	public String getDescriptionId() {
		return "effect.jojohe.fleshbud_give_effect";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
