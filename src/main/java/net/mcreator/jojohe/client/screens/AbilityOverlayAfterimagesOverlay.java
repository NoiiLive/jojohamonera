
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

import net.mcreator.jojohe.procedures.ReturnHamonUserProcedure;
import net.mcreator.jojohe.procedures.ReturnAfterimagesSelected9Procedure;
import net.mcreator.jojohe.procedures.ReturnAfterimagesSelected8Procedure;
import net.mcreator.jojohe.procedures.ReturnAfterimagesSelected7Procedure;
import net.mcreator.jojohe.procedures.ReturnAfterimagesSelected6Procedure;
import net.mcreator.jojohe.procedures.ReturnAfterimagesSelected5Procedure;
import net.mcreator.jojohe.procedures.ReturnAfterimagesSelected4Procedure;
import net.mcreator.jojohe.procedures.ReturnAfterimagesSelected3Procedure;
import net.mcreator.jojohe.procedures.ReturnAfterimagesSelected1Procedure;
import net.mcreator.jojohe.procedures.ReturnAfterimages9Procedure;
import net.mcreator.jojohe.procedures.ReturnAfterimages8Procedure;
import net.mcreator.jojohe.procedures.ReturnAfterimages7Procedure;
import net.mcreator.jojohe.procedures.ReturnAfterimages6Procedure;
import net.mcreator.jojohe.procedures.ReturnAfterimages5Procedure;
import net.mcreator.jojohe.procedures.ReturnAfterimages4Procedure;
import net.mcreator.jojohe.procedures.ReturnAfterimages3Procedure;
import net.mcreator.jojohe.procedures.ReturnAfterimages2Procedure;
import net.mcreator.jojohe.procedures.ReturnAfterimages1Procedure;
import net.mcreator.jojohe.procedures.DontReturnProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class AbilityOverlayAfterimagesOverlay {
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
			if (ReturnAfterimages1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_afterimages.png"), w - 25, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnAfterimages2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_afterimages.png"), w - 44, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnAfterimages3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_afterimages.png"), w - 63, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnAfterimages4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_afterimages.png"), w - 82, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnAfterimages5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_afterimages.png"), w - 101, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnAfterimages6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_afterimages.png"), w - 44, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnAfterimages7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_afterimages.png"), w - 63, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnAfterimages8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_afterimages.png"), w - 82, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnAfterimages9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_afterimages.png"), w - 101, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnAfterimagesSelected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_afterimages_h.png"), w - 25, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnAfterimages2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_afterimages_h.png"), w - 44, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnAfterimagesSelected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_afterimages_h.png"), w - 63, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnAfterimagesSelected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_afterimages_h.png"), w - 82, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnAfterimagesSelected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_afterimages_h.png"), w - 101, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnAfterimagesSelected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_afterimages_h.png"), w - 44, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnAfterimagesSelected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_afterimages_h.png"), w - 63, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnAfterimagesSelected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_afterimages_h.png"), w - 82, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnAfterimagesSelected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_afterimages_h.png"), w - 101, h - 44, 0, 0, 20, 20, 20, 20);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
