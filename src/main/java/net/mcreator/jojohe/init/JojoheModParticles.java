
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jojohe.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.jojohe.client.particle.StoneMaskBreakParticle;
import net.mcreator.jojohe.client.particle.SmallHamonParticle;
import net.mcreator.jojohe.client.particle.LargeHamonParticle;
import net.mcreator.jojohe.client.particle.HamonFlamesSmallParticle;
import net.mcreator.jojohe.client.particle.HamonFlamesParticle;
import net.mcreator.jojohe.client.particle.HamonBubbleParticle;
import net.mcreator.jojohe.client.particle.BizarreParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class JojoheModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(JojoheModParticleTypes.STONE_MASK_BREAK.get(), StoneMaskBreakParticle::provider);
		event.registerSpriteSet(JojoheModParticleTypes.LARGE_HAMON.get(), LargeHamonParticle::provider);
		event.registerSpriteSet(JojoheModParticleTypes.SMALL_HAMON.get(), SmallHamonParticle::provider);
		event.registerSpriteSet(JojoheModParticleTypes.HAMON_BUBBLE.get(), HamonBubbleParticle::provider);
		event.registerSpriteSet(JojoheModParticleTypes.BIZARRE.get(), BizarreParticle::provider);
		event.registerSpriteSet(JojoheModParticleTypes.HAMON_FLAMES.get(), HamonFlamesParticle::provider);
		event.registerSpriteSet(JojoheModParticleTypes.HAMON_FLAMES_SMALL.get(), HamonFlamesSmallParticle::provider);
	}
}
