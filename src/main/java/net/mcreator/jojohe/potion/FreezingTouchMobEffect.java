
package net.mcreator.jojohe.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class FreezingTouchMobEffect extends MobEffect {
	public FreezingTouchMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -3342337);
	}

	@Override
	public String getDescriptionId() {
		return "effect.jojohe.freezing_touch";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
