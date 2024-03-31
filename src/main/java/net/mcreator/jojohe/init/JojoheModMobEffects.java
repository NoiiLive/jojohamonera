
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jojohe.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.jojohe.potion.WeakenedVampireMobEffect;
import net.mcreator.jojohe.potion.VampirismMobEffect;
import net.mcreator.jojohe.potion.SunlightYellowMobEffect;
import net.mcreator.jojohe.potion.ScarletOverdriveEMobEffect;
import net.mcreator.jojohe.potion.HamonMobEffect;
import net.mcreator.jojohe.potion.FrozenSolidMobEffect;
import net.mcreator.jojohe.potion.FreezingTouchMobEffect;
import net.mcreator.jojohe.potion.FleshbudGiveEffectMobEffect;
import net.mcreator.jojohe.potion.AfterimagesEffectMobEffect;
import net.mcreator.jojohe.JojoheMod;

public class JojoheModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, JojoheMod.MODID);
	public static final RegistryObject<MobEffect> HAMON = REGISTRY.register("hamon", () -> new HamonMobEffect());
	public static final RegistryObject<MobEffect> VAMPIRISM = REGISTRY.register("vampirism", () -> new VampirismMobEffect());
	public static final RegistryObject<MobEffect> FREEZING_TOUCH = REGISTRY.register("freezing_touch", () -> new FreezingTouchMobEffect());
	public static final RegistryObject<MobEffect> WEAKENED_VAMPIRE = REGISTRY.register("weakened_vampire", () -> new WeakenedVampireMobEffect());
	public static final RegistryObject<MobEffect> SUNLIGHT_YELLOW = REGISTRY.register("sunlight_yellow", () -> new SunlightYellowMobEffect());
	public static final RegistryObject<MobEffect> FROZEN_SOLID = REGISTRY.register("frozen_solid", () -> new FrozenSolidMobEffect());
	public static final RegistryObject<MobEffect> SCARLET_OVERDRIVE_E = REGISTRY.register("scarlet_overdrive_e", () -> new ScarletOverdriveEMobEffect());
	public static final RegistryObject<MobEffect> AFTERIMAGES_EFFECT = REGISTRY.register("afterimages_effect", () -> new AfterimagesEffectMobEffect());
	public static final RegistryObject<MobEffect> FLESHBUD_GIVE_EFFECT = REGISTRY.register("fleshbud_give_effect", () -> new FleshbudGiveEffectMobEffect());
}
