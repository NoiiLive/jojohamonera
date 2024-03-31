
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

import net.mcreator.jojohe.procedures.ReturnZoomPunchSelected9Procedure;
import net.mcreator.jojohe.procedures.ReturnZoomPunchSelected8Procedure;
import net.mcreator.jojohe.procedures.ReturnZoomPunchSelected7Procedure;
import net.mcreator.jojohe.procedures.ReturnZoomPunchSelected6Procedure;
import net.mcreator.jojohe.procedures.ReturnZoomPunchSelected5Procedure;
import net.mcreator.jojohe.procedures.ReturnZoomPunchSelected4Procedure;
import net.mcreator.jojohe.procedures.ReturnZoomPunchSelected3Procedure;
import net.mcreator.jojohe.procedures.ReturnZoomPunchSelected2Procedure;
import net.mcreator.jojohe.procedures.ReturnZoomPunchSelected1Procedure;
import net.mcreator.jojohe.procedures.ReturnZoomPunch9Procedure;
import net.mcreator.jojohe.procedures.ReturnZoomPunch8Procedure;
import net.mcreator.jojohe.procedures.ReturnZoomPunch7Procedure;
import net.mcreator.jojohe.procedures.ReturnZoomPunch6Procedure;
import net.mcreator.jojohe.procedures.ReturnZoomPunch5Procedure;
import net.mcreator.jojohe.procedures.ReturnZoomPunch4Procedure;
import net.mcreator.jojohe.procedures.ReturnZoomPunch3Procedure;
import net.mcreator.jojohe.procedures.ReturnZoomPunch2Procedure;
import net.mcreator.jojohe.procedures.ReturnZoomPunch1Procedure;
import net.mcreator.jojohe.procedures.ReturnHamonUserProcedure;
import net.mcreator.jojohe.procedures.DontReturnProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class AbilityOverlayZoomPunchOverlay {
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
			if (ReturnZoomPunch1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_zoompunch.png"), w - 25, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnZoomPunch2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_zoompunch.png"), w - 44, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnZoomPunch3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_zoompunch.png"), w - 63, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnZoomPunch4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_zoompunch.png"), w - 82, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnZoomPunch5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_zoompunch.png"), w - 101, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnZoomPunch6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_zoompunch.png"), w - 44, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnZoomPunch7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_zoompunch.png"), w - 63, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnZoomPunch8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_zoompunch.png"), w - 82, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnZoomPunch9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_zoompunch.png"), w - 101, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnZoomPunchSelected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_zoompunch_h.png"), w - 25, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnZoomPunchSelected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_zoompunch_h.png"), w - 44, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnZoomPunchSelected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_zoompunch_h.png"), w - 63, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnZoomPunchSelected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_zoompunch_h.png"), w - 82, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnZoomPunchSelected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_zoompunch_h.png"), w - 101, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnZoomPunchSelected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_zoompunch_h.png"), w - 44, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnZoomPunchSelected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_zoompunch_h.png"), w - 63, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnZoomPunchSelected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_zoompunch_h.png"), w - 82, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnZoomPunchSelected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_zoompunch_h.png"), w - 101, h - 44, 0, 0, 20, 20, 20, 20);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
