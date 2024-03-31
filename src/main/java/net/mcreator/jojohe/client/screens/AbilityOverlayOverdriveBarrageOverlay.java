
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

import net.mcreator.jojohe.procedures.ReturnOverdriveBarrageSelected9Procedure;
import net.mcreator.jojohe.procedures.ReturnOverdriveBarrageSelected8Procedure;
import net.mcreator.jojohe.procedures.ReturnOverdriveBarrageSelected7Procedure;
import net.mcreator.jojohe.procedures.ReturnOverdriveBarrageSelected6Procedure;
import net.mcreator.jojohe.procedures.ReturnOverdriveBarrageSelected5Procedure;
import net.mcreator.jojohe.procedures.ReturnOverdriveBarrageSelected4Procedure;
import net.mcreator.jojohe.procedures.ReturnOverdriveBarrageSelected3Procedure;
import net.mcreator.jojohe.procedures.ReturnOverdriveBarrageSelected2Procedure;
import net.mcreator.jojohe.procedures.ReturnOverdriveBarrageSelected1Procedure;
import net.mcreator.jojohe.procedures.ReturnOverdriveBarrage9Procedure;
import net.mcreator.jojohe.procedures.ReturnOverdriveBarrage8Procedure;
import net.mcreator.jojohe.procedures.ReturnOverdriveBarrage7Procedure;
import net.mcreator.jojohe.procedures.ReturnOverdriveBarrage6Procedure;
import net.mcreator.jojohe.procedures.ReturnOverdriveBarrage5Procedure;
import net.mcreator.jojohe.procedures.ReturnOverdriveBarrage4Procedure;
import net.mcreator.jojohe.procedures.ReturnOverdriveBarrage3Procedure;
import net.mcreator.jojohe.procedures.ReturnOverdriveBarrage2Procedure;
import net.mcreator.jojohe.procedures.ReturnOverdriveBarrage1Procedure;
import net.mcreator.jojohe.procedures.ReturnHamonUserProcedure;
import net.mcreator.jojohe.procedures.DontReturnProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class AbilityOverlayOverdriveBarrageOverlay {
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
			if (ReturnOverdriveBarrage1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_odbarrage.png"), w - 25, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnOverdriveBarrage2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_odbarrage.png"), w - 44, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnOverdriveBarrage3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_odbarrage.png"), w - 63, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnOverdriveBarrage4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_odbarrage.png"), w - 82, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnOverdriveBarrage5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_odbarrage.png"), w - 101, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnOverdriveBarrage6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_odbarrage.png"), w - 44, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnOverdriveBarrage7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_odbarrage.png"), w - 63, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnOverdriveBarrage8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_odbarrage.png"), w - 82, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnOverdriveBarrage9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_odbarrage.png"), w - 101, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnOverdriveBarrageSelected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_odbarrage_h.png"), w - 25, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnOverdriveBarrageSelected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_odbarrage_h.png"), w - 44, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnOverdriveBarrageSelected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_odbarrage_h.png"), w - 63, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnOverdriveBarrageSelected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_odbarrage_h.png"), w - 82, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnOverdriveBarrageSelected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_odbarrage_h.png"), w - 101, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnOverdriveBarrageSelected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_odbarrage_h.png"), w - 44, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnOverdriveBarrageSelected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_odbarrage_h.png"), w - 63, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnOverdriveBarrageSelected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_odbarrage_h.png"), w - 82, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnOverdriveBarrageSelected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_odbarrage_h.png"), w - 101, h - 44, 0, 0, 20, 20, 20, 20);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
