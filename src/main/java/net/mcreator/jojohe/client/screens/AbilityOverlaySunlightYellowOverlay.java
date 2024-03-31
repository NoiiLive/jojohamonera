
package net.mcreator.jojohe.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import net.mcreator.jojohe.procedures.ReturnSunlightYellowSelected9Procedure;
import net.mcreator.jojohe.procedures.ReturnSunlightYellowSelected8Procedure;
import net.mcreator.jojohe.procedures.ReturnSunlightYellowSelected7Procedure;
import net.mcreator.jojohe.procedures.ReturnSunlightYellowSelected6Procedure;
import net.mcreator.jojohe.procedures.ReturnSunlightYellowSelected5Procedure;
import net.mcreator.jojohe.procedures.ReturnSunlightYellowSelected4Procedure;
import net.mcreator.jojohe.procedures.ReturnSunlightYellowSelected3Procedure;
import net.mcreator.jojohe.procedures.ReturnSunlightYellowSelected2Procedure;
import net.mcreator.jojohe.procedures.ReturnSunlightYellowSelected1Procedure;
import net.mcreator.jojohe.procedures.ReturnSunlightYellow9Procedure;
import net.mcreator.jojohe.procedures.ReturnSunlightYellow8Procedure;
import net.mcreator.jojohe.procedures.ReturnSunlightYellow7Procedure;
import net.mcreator.jojohe.procedures.ReturnSunlightYellow6Procedure;
import net.mcreator.jojohe.procedures.ReturnSunlightYellow5Procedure;
import net.mcreator.jojohe.procedures.ReturnSunlightYellow4Procedure;
import net.mcreator.jojohe.procedures.ReturnSunlightYellow3Procedure;
import net.mcreator.jojohe.procedures.ReturnSunlightYellow2Procedure;
import net.mcreator.jojohe.procedures.ReturnSunlightYellow1Procedure;
import net.mcreator.jojohe.procedures.ReturnHamonUserProcedure;
import net.mcreator.jojohe.procedures.DontReturnProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class AbilityOverlaySunlightYellowOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		if (ReturnHamonUserProcedure.execute(entity)) {
			if (DontReturnProcedure.execute()) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_switch_display_he.png"), w / 2 + 113, h / 2 + 76, 0, 0, 96, 39, 96, 39);
			}
			if (ReturnSunlightYellow1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_sunlightyellow.png"), w - 25, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnSunlightYellow2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_sunlightyellow.png"), w - 44, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnSunlightYellow3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_sunlightyellow.png"), w - 63, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnSunlightYellow4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_sunlightyellow.png"), w - 82, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnSunlightYellow5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_sunlightyellow.png"), w - 101, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnSunlightYellow6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_sunlightyellow.png"), w - 44, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnSunlightYellow7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_sunlightyellow.png"), w - 63, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnSunlightYellow8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_sunlightyellow.png"), w - 82, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnSunlightYellow9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_sunlightyellow.png"), w - 101, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnSunlightYellowSelected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_sunlightyellow_h.png"), w - 25, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnSunlightYellowSelected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_sunlightyellow_h.png"), w - 44, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnSunlightYellowSelected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_sunlightyellow_h.png"), w - 63, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnSunlightYellowSelected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_sunlightyellow_h.png"), w - 82, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnSunlightYellowSelected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_sunlightyellow_h.png"), w - 101, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnSunlightYellowSelected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_sunlightyellow_h.png"), w - 44, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnSunlightYellowSelected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_sunlightyellow_h.png"), w - 63, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnSunlightYellowSelected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_sunlightyellow_h.png"), w - 82, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnSunlightYellowSelected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_sunlightyellow_h.png"), w - 101, h - 44, 0, 0, 20, 20, 20, 20);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
