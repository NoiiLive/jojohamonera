
package net.mcreator.jojohe.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class ScarletOverdriveEMobEffect extends MobEffect {
	public ScarletOverdriveEMobEffect() {
		super(MobEffectCategory.NEUTRAL, -3381760);
	}

	@Override
	public String getDescriptionId() {
		return "effect.jojohe.scarlet_overdrive_e";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
