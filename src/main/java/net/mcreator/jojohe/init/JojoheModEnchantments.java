
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jojohe.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.jojohe.enchantment.VampiricSyringeEnchantment;
import net.mcreator.jojohe.enchantment.SunscreenEnchantment;
import net.mcreator.jojohe.enchantment.MetalSilverOverdriveEnchantment;
import net.mcreator.jojohe.JojoheMod;

public class JojoheModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, JojoheMod.MODID);
	public static final RegistryObject<Enchantment> METAL_SILVER_OVERDRIVE = REGISTRY.register("metal_silver_overdrive", () -> new MetalSilverOverdriveEnchantment());
	public static final RegistryObject<Enchantment> VAMPIRIC_SYRINGE = REGISTRY.register("vampiric_syringe", () -> new VampiricSyringeEnchantment());
	public static final RegistryObject<Enchantment> SUNSCREEN = REGISTRY.register("sunscreen", () -> new SunscreenEnchantment());
}
