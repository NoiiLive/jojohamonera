
package net.mcreator.jojohe.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class WeakenedVampireMobEffect extends MobEffect {
	public WeakenedVampireMobEffect() {
		super(MobEffectCategory.NEUTRAL, -10216420);
	}

	@Override
	public String getDescriptionId() {
		return "effect.jojohe.weakened_vampire";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
