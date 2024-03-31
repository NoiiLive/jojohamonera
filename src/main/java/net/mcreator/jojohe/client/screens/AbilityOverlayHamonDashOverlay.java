
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
import net.mcreator.jojohe.procedures.ReturnHamonDashSelected9Procedure;
import net.mcreator.jojohe.procedures.ReturnHamonDashSelected8Procedure;
import net.mcreator.jojohe.procedures.ReturnHamonDashSelected7Procedure;
import net.mcreator.jojohe.procedures.ReturnHamonDashSelected6Procedure;
import net.mcreator.jojohe.procedures.ReturnHamonDashSelected5Procedure;
import net.mcreator.jojohe.procedures.ReturnHamonDashSelected4Procedure;
import net.mcreator.jojohe.procedures.ReturnHamonDashSelected3Procedure;
import net.mcreator.jojohe.procedures.ReturnHamonDashSelected2Procedure;
import net.mcreator.jojohe.procedures.ReturnHamonDashSelected1Procedure;
import net.mcreator.jojohe.procedures.ReturnHamonDash9Procedure;
import net.mcreator.jojohe.procedures.ReturnHamonDash8Procedure;
import net.mcreator.jojohe.procedures.ReturnHamonDash7Procedure;
import net.mcreator.jojohe.procedures.ReturnHamonDash6Procedure;
import net.mcreator.jojohe.procedures.ReturnHamonDash5Procedure;
import net.mcreator.jojohe.procedures.ReturnHamonDash4Procedure;
import net.mcreator.jojohe.procedures.ReturnHamonDash3Procedure;
import net.mcreator.jojohe.procedures.ReturnHamonDash2Procedure;
import net.mcreator.jojohe.procedures.ReturnHamonDash1Procedure;
import net.mcreator.jojohe.procedures.DontReturnProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class AbilityOverlayHamonDashOverlay {
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
			if (ReturnHamonDash1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_hamondash.png"), w - 25, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnHamonDash2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_hamondash.png"), w - 44, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnHamonDash3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_hamondash.png"), w - 63, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnHamonDash4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_hamondash.png"), w - 82, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnHamonDash5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_hamondash.png"), w - 101, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnHamonDash6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_hamondash.png"), w - 44, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnHamonDash7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_hamondash.png"), w - 63, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnHamonDash8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_hamondash.png"), w - 82, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnHamonDash9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_hamondash.png"), w - 101, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnHamonDashSelected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_hamondash_h.png"), w - 25, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnHamonDashSelected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_hamondash_h.png"), w - 44, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnHamonDashSelected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_hamondash_h.png"), w - 63, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnHamonDashSelected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_hamondash_h.png"), w - 82, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnHamonDashSelected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_hamondash_h.png"), w - 101, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnHamonDashSelected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_hamondash_h.png"), w - 44, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnHamonDashSelected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_hamondash_h.png"), w - 63, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnHamonDashSelected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_hamondash_h.png"), w - 82, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnHamonDashSelected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_hamondash_h.png"), w - 101, h - 44, 0, 0, 20, 20, 20, 20);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
