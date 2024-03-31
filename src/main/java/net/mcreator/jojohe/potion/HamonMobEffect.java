
package net.mcreator.jojohe.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class HamonMobEffect extends MobEffect {
	public HamonMobEffect() {
		super(MobEffectCategory.NEUTRAL, -9157);
	}

	@Override
	public String getDescriptionId() {
		return "effect.jojohe.hamon";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
