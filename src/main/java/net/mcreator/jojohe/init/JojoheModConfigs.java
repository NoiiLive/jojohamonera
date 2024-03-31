package net.mcreator.jojohe.init;

import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.mcreator.jojohe.configuration.JoJoHEMainConfiguration;
import net.mcreator.jojohe.configuration.JoJoHEHamonConfiguration;
import net.mcreator.jojohe.JojoheMod;

@Mod.EventBusSubscriber(modid = JojoheMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class JojoheModConfigs {
	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		event.enqueueWork(() -> {
			ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, JoJoHEMainConfiguration.SPEC, "jojohe_main.toml");
			ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, JoJoHEHamonConfiguration.SPEC, "jojohe_hamon.toml");
		});
	}
}
