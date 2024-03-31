
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jojohe.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.jojohe.JojoheMod;

public class JojoheModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, JojoheMod.MODID);
	public static final RegistryObject<SimpleParticleType> STONE_MASK_BREAK = REGISTRY.register("stone_mask_break", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> LARGE_HAMON = REGISTRY.register("large_hamon", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> SMALL_HAMON = REGISTRY.register("small_hamon", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> HAMON_BUBBLE = REGISTRY.register("hamon_bubble", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> BIZARRE = REGISTRY.register("bizarre", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> HAMON_FLAMES = REGISTRY.register("hamon_flames", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> HAMON_FLAMES_SMALL = REGISTRY.register("hamon_flames_small", () -> new SimpleParticleType(true));
}
