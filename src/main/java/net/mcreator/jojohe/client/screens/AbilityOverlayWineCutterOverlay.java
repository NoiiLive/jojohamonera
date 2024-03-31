
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

import net.mcreator.jojohe.procedures.ReturnWineCutterSelected9Procedure;
import net.mcreator.jojohe.procedures.ReturnWineCutterSelected8Procedure;
import net.mcreator.jojohe.procedures.ReturnWineCutterSelected7Procedure;
import net.mcreator.jojohe.procedures.ReturnWineCutterSelected6Procedure;
import net.mcreator.jojohe.procedures.ReturnWineCutterSelected5Procedure;
import net.mcreator.jojohe.procedures.ReturnWineCutterSelected4Procedure;
import net.mcreator.jojohe.procedures.ReturnWineCutterSelected3Procedure;
import net.mcreator.jojohe.procedures.ReturnWineCutterSelected2Procedure;
import net.mcreator.jojohe.procedures.ReturnWineCutterSelected1Procedure;
import net.mcreator.jojohe.procedures.ReturnWineCutter9Procedure;
import net.mcreator.jojohe.procedures.ReturnWineCutter8Procedure;
import net.mcreator.jojohe.procedures.ReturnWineCutter7Procedure;
import net.mcreator.jojohe.procedures.ReturnWineCutter6Procedure;
import net.mcreator.jojohe.procedures.ReturnWineCutter5Procedure;
import net.mcreator.jojohe.procedures.ReturnWineCutter4Procedure;
import net.mcreator.jojohe.procedures.ReturnWineCutter3Procedure;
import net.mcreator.jojohe.procedures.ReturnWineCutter2Procedure;
import net.mcreator.jojohe.procedures.ReturnWineCutter1Procedure;
import net.mcreator.jojohe.procedures.ReturnHamonUserProcedure;
import net.mcreator.jojohe.procedures.DontReturnProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class AbilityOverlayWineCutterOverlay {
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
			if (ReturnWineCutter1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_winecutter.png"), w - 25, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnWineCutter2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_winecutter.png"), w - 44, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnWineCutter3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_winecutter.png"), w - 63, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnWineCutter4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_winecutter.png"), w - 82, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnWineCutter5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_winecutter.png"), w - 101, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnWineCutter6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_winecutter.png"), w - 44, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnWineCutter7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_winecutter.png"), w - 63, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnWineCutter8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_winecutter.png"), w - 82, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnWineCutter9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_winecutter.png"), w - 101, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnWineCutterSelected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_winecutter_h.png"), w - 25, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnWineCutterSelected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_winecutter_h.png"), w - 44, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnWineCutterSelected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_winecutter_h.png"), w - 63, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnWineCutterSelected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_winecutter_h.png"), w - 82, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnWineCutterSelected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_winecutter_h.png"), w - 101, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnWineCutterSelected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_winecutter_h.png"), w - 44, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnWineCutterSelected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_winecutter_h.png"), w - 63, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnWineCutterSelected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_winecutter_h.png"), w - 82, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnWineCutterSelected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_winecutter_h.png"), w - 101, h - 44, 0, 0, 20, 20, 20, 20);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
