
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jojohe.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.jojohe.client.renderer.ZoomPunchRProjectileRenderer;
import net.mcreator.jojohe.client.renderer.ZombieMinionRenderer;
import net.mcreator.jojohe.client.renderer.ZombieMinionNOAIRenderer;
import net.mcreator.jojohe.client.renderer.WineCutterProjectileRenderer;
import net.mcreator.jojohe.client.renderer.WillAZeppeliRenderer;
import net.mcreator.jojohe.client.renderer.VampireSteedNOAIRenderer;
import net.mcreator.jojohe.client.renderer.VampireSteedEntityRenderer;
import net.mcreator.jojohe.client.renderer.Vampire4Renderer;
import net.mcreator.jojohe.client.renderer.Vampire3Renderer;
import net.mcreator.jojohe.client.renderer.Vampire2Renderer;
import net.mcreator.jojohe.client.renderer.Vampire1Renderer;
import net.mcreator.jojohe.client.renderer.TonpettyRenderer;
import net.mcreator.jojohe.client.renderer.TattooRenderer;
import net.mcreator.jojohe.client.renderer.TarkusRenderer;
import net.mcreator.jojohe.client.renderer.StraizoRenderer;
import net.mcreator.jojohe.client.renderer.SpeedBladeHatProjectileRenderer;
import net.mcreator.jojohe.client.renderer.SpaceRipperProjectileRenderer;
import net.mcreator.jojohe.client.renderer.ShadowDioRenderer;
import net.mcreator.jojohe.client.renderer.REOSpeedwagonRenderer;
import net.mcreator.jojohe.client.renderer.NecroDioRenderer;
import net.mcreator.jojohe.client.renderer.KnifeThrownProjectileRenderer;
import net.mcreator.jojohe.client.renderer.KempoMasterRenderer;
import net.mcreator.jojohe.client.renderer.JonathanJoestarRenderer;
import net.mcreator.jojohe.client.renderer.JackTheRipperRenderer;
import net.mcreator.jojohe.client.renderer.HoodedVampire4Renderer;
import net.mcreator.jojohe.client.renderer.HoodedVampire3Renderer;
import net.mcreator.jojohe.client.renderer.HoodedVampire2Renderer;
import net.mcreator.jojohe.client.renderer.HoodedVampire1Renderer;
import net.mcreator.jojohe.client.renderer.HamonUser4Renderer;
import net.mcreator.jojohe.client.renderer.HamonUser3Renderer;
import net.mcreator.jojohe.client.renderer.HamonUser2Renderer;
import net.mcreator.jojohe.client.renderer.HamonUser1Renderer;
import net.mcreator.jojohe.client.renderer.HamonShadowRenderer;
import net.mcreator.jojohe.client.renderer.DogHumanChimeraRenderer;
import net.mcreator.jojohe.client.renderer.DogHumanChimeraNOAIRenderer;
import net.mcreator.jojohe.client.renderer.DireRenderer;
import net.mcreator.jojohe.client.renderer.DioBrandoRenderer;
import net.mcreator.jojohe.client.renderer.ChamberEntityRenderer;
import net.mcreator.jojohe.client.renderer.CatBirdChimeraRenderer;
import net.mcreator.jojohe.client.renderer.CatBirdChimeraNOAIRenderer;
import net.mcreator.jojohe.client.renderer.BrufordRenderer;
import net.mcreator.jojohe.client.renderer.BloodDioRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class JojoheModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(JojoheModEntities.JONATHAN_JOESTAR.get(), JonathanJoestarRenderer::new);
		event.registerEntityRenderer(JojoheModEntities.SHADOW_DIO.get(), ShadowDioRenderer::new);
		event.registerEntityRenderer(JojoheModEntities.BLOOD_DIO.get(), BloodDioRenderer::new);
		event.registerEntityRenderer(JojoheModEntities.NECRO_DIO.get(), NecroDioRenderer::new);
		event.registerEntityRenderer(JojoheModEntities.REO_SPEEDWAGON.get(), REOSpeedwagonRenderer::new);
		event.registerEntityRenderer(JojoheModEntities.TONPETTY.get(), TonpettyRenderer::new);
		event.registerEntityRenderer(JojoheModEntities.DIRE.get(), DireRenderer::new);
		event.registerEntityRenderer(JojoheModEntities.STRAIZO.get(), StraizoRenderer::new);
		event.registerEntityRenderer(JojoheModEntities.BRUFORD.get(), BrufordRenderer::new);
		event.registerEntityRenderer(JojoheModEntities.TARKUS.get(), TarkusRenderer::new);
		event.registerEntityRenderer(JojoheModEntities.JACK_THE_RIPPER.get(), JackTheRipperRenderer::new);
		event.registerEntityRenderer(JojoheModEntities.KEMPO_MASTER.get(), KempoMasterRenderer::new);
		event.registerEntityRenderer(JojoheModEntities.TATTOO.get(), TattooRenderer::new);
		event.registerEntityRenderer(JojoheModEntities.VAMPIRE_1.get(), Vampire1Renderer::new);
		event.registerEntityRenderer(JojoheModEntities.VAMPIRE_2.get(), Vampire2Renderer::new);
		event.registerEntityRenderer(JojoheModEntities.VAMPIRE_3.get(), Vampire3Renderer::new);
		event.registerEntityRenderer(JojoheModEntities.VAMPIRE_4.get(), Vampire4Renderer::new);
		event.registerEntityRenderer(JojoheModEntities.HOODED_VAMPIRE_1.get(), HoodedVampire1Renderer::new);
		event.registerEntityRenderer(JojoheModEntities.HOODED_VAMPIRE_2.get(), HoodedVampire2Renderer::new);
		event.registerEntityRenderer(JojoheModEntities.HOODED_VAMPIRE_3.get(), HoodedVampire3Renderer::new);
		event.registerEntityRenderer(JojoheModEntities.HOODED_VAMPIRE_4.get(), HoodedVampire4Renderer::new);
		event.registerEntityRenderer(JojoheModEntities.HAMON_USER_1.get(), HamonUser1Renderer::new);
		event.registerEntityRenderer(JojoheModEntities.HAMON_USER_2.get(), HamonUser2Renderer::new);
		event.registerEntityRenderer(JojoheModEntities.HAMON_USER_3.get(), HamonUser3Renderer::new);
		event.registerEntityRenderer(JojoheModEntities.HAMON_USER_4.get(), HamonUser4Renderer::new);
		event.registerEntityRenderer(JojoheModEntities.ZOMBIE_MINION.get(), ZombieMinionRenderer::new);
		event.registerEntityRenderer(JojoheModEntities.ZOMBIE_MINION_NOAI.get(), ZombieMinionNOAIRenderer::new);
		event.registerEntityRenderer(JojoheModEntities.CHAMBER_ENTITY.get(), ChamberEntityRenderer::new);
		event.registerEntityRenderer(JojoheModEntities.CAT_BIRD_CHIMERA.get(), CatBirdChimeraRenderer::new);
		event.registerEntityRenderer(JojoheModEntities.DOG_HUMAN_CHIMERA.get(), DogHumanChimeraRenderer::new);
		event.registerEntityRenderer(JojoheModEntities.VAMPIRE_STEED_ENTITY.get(), VampireSteedEntityRenderer::new);
		event.registerEntityRenderer(JojoheModEntities.VAMPIRE_STEED_NOAI.get(), VampireSteedNOAIRenderer::new);
		event.registerEntityRenderer(JojoheModEntities.DOG_HUMAN_CHIMERA_NOAI.get(), DogHumanChimeraNOAIRenderer::new);
		event.registerEntityRenderer(JojoheModEntities.CAT_BIRD_CHIMERA_NOAI.get(), CatBirdChimeraNOAIRenderer::new);
		event.registerEntityRenderer(JojoheModEntities.HAMON_SHADOW.get(), HamonShadowRenderer::new);
		event.registerEntityRenderer(JojoheModEntities.SPACE_RIPPER_PROJECTILE.get(), SpaceRipperProjectileRenderer::new);
		event.registerEntityRenderer(JojoheModEntities.ZOOM_PUNCH_R_PROJECTILE.get(), ZoomPunchRProjectileRenderer::new);
		event.registerEntityRenderer(JojoheModEntities.SPEED_BLADE_HAT_PROJECTILE.get(), SpeedBladeHatProjectileRenderer::new);
		event.registerEntityRenderer(JojoheModEntities.KNIFE_THROWN_PROJECTILE.get(), KnifeThrownProjectileRenderer::new);
		event.registerEntityRenderer(JojoheModEntities.WINE_CUTTER_PROJECTILE.get(), WineCutterProjectileRenderer::new);
		event.registerEntityRenderer(JojoheModEntities.DIO_BRANDO.get(), DioBrandoRenderer::new);
		event.registerEntityRenderer(JojoheModEntities.WILL_A_ZEPPELI.get(), WillAZeppeliRenderer::new);
	}
}
