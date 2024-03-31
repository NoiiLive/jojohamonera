
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
import net.mcreator.jojohe.procedures.ReturnGroundRippleSelected9Procedure;
import net.mcreator.jojohe.procedures.ReturnGroundRippleSelected8Procedure;
import net.mcreator.jojohe.procedures.ReturnGroundRippleSelected7Procedure;
import net.mcreator.jojohe.procedures.ReturnGroundRippleSelected6Procedure;
import net.mcreator.jojohe.procedures.ReturnGroundRippleSelected5Procedure;
import net.mcreator.jojohe.procedures.ReturnGroundRippleSelected4Procedure;
import net.mcreator.jojohe.procedures.ReturnGroundRippleSelected3Procedure;
import net.mcreator.jojohe.procedures.ReturnGroundRippleSelected2Procedure;
import net.mcreator.jojohe.procedures.ReturnGroundRippleSelected1Procedure;
import net.mcreator.jojohe.procedures.ReturnGroundRipple9Procedure;
import net.mcreator.jojohe.procedures.ReturnGroundRipple8Procedure;
import net.mcreator.jojohe.procedures.ReturnGroundRipple7Procedure;
import net.mcreator.jojohe.procedures.ReturnGroundRipple6Procedure;
import net.mcreator.jojohe.procedures.ReturnGroundRipple5Procedure;
import net.mcreator.jojohe.procedures.ReturnGroundRipple4Procedure;
import net.mcreator.jojohe.procedures.ReturnGroundRipple3Procedure;
import net.mcreator.jojohe.procedures.ReturnGroundRipple2Procedure;
import net.mcreator.jojohe.procedures.ReturnGroundRipple1Procedure;
import net.mcreator.jojohe.procedures.DontReturnProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class AbilityOverlayGroundRippleOverlay {
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
			if (ReturnGroundRipple1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_groundripple.png"), w - 25, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnGroundRipple2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_groundripple.png"), w - 44, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnGroundRipple3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_groundripple.png"), w - 63, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnGroundRipple4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_groundripple.png"), w - 82, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnGroundRipple5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_groundripple.png"), w - 101, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnGroundRipple6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_groundripple.png"), w - 44, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnGroundRipple7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_groundripple.png"), w - 63, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnGroundRipple8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_groundripple.png"), w - 82, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnGroundRipple9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_groundripple.png"), w - 101, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnGroundRippleSelected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_groundripple_h.png"), w - 25, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnGroundRippleSelected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_groundripple_h.png"), w - 44, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnGroundRippleSelected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_groundripple_h.png"), w - 63, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnGroundRippleSelected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_groundripple_h.png"), w - 82, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnGroundRippleSelected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_groundripple_h.png"), w - 101, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnGroundRippleSelected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_groundripple_h.png"), w - 44, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnGroundRippleSelected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_groundripple_h.png"), w - 63, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnGroundRippleSelected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_groundripple_h.png"), w - 82, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnGroundRippleSelected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_groundripple_h.png"), w - 101, h - 44, 0, 0, 20, 20, 20, 20);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
