
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

import net.mcreator.jojohe.procedures.ReturnScarletOverdriveSelected9Procedure;
import net.mcreator.jojohe.procedures.ReturnScarletOverdriveSelected8Procedure;
import net.mcreator.jojohe.procedures.ReturnScarletOverdriveSelected7Procedure;
import net.mcreator.jojohe.procedures.ReturnScarletOverdriveSelected6Procedure;
import net.mcreator.jojohe.procedures.ReturnScarletOverdriveSelected5Procedure;
import net.mcreator.jojohe.procedures.ReturnScarletOverdriveSelected4Procedure;
import net.mcreator.jojohe.procedures.ReturnScarletOverdriveSelected3Procedure;
import net.mcreator.jojohe.procedures.ReturnScarletOverdriveSelected2Procedure;
import net.mcreator.jojohe.procedures.ReturnScarletOverdriveSelected1Procedure;
import net.mcreator.jojohe.procedures.ReturnScarletOverdrive9Procedure;
import net.mcreator.jojohe.procedures.ReturnScarletOverdrive8Procedure;
import net.mcreator.jojohe.procedures.ReturnScarletOverdrive7Procedure;
import net.mcreator.jojohe.procedures.ReturnScarletOverdrive6Procedure;
import net.mcreator.jojohe.procedures.ReturnScarletOverdrive5Procedure;
import net.mcreator.jojohe.procedures.ReturnScarletOverdrive4Procedure;
import net.mcreator.jojohe.procedures.ReturnScarletOverdrive3Procedure;
import net.mcreator.jojohe.procedures.ReturnScarletOverdrive2Procedure;
import net.mcreator.jojohe.procedures.ReturnScarletOverdrive1Procedure;
import net.mcreator.jojohe.procedures.ReturnHamonUserProcedure;
import net.mcreator.jojohe.procedures.DontReturnProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class AbilityOverlayScarletOverdriveOverlay {
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
			if (ReturnScarletOverdrive1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_scarletod.png"), w - 25, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnScarletOverdrive2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_scarletod.png"), w - 44, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnScarletOverdrive3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_scarletod.png"), w - 63, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnScarletOverdrive4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_scarletod.png"), w - 82, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnScarletOverdrive5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_scarletod.png"), w - 101, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnScarletOverdrive6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_scarletod.png"), w - 44, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnScarletOverdrive7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_scarletod.png"), w - 63, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnScarletOverdrive8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_scarletod.png"), w - 82, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnScarletOverdrive9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_scarletod.png"), w - 101, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnScarletOverdriveSelected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_scarletod_h.png"), w - 25, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnScarletOverdriveSelected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_scarletod_h.png"), w - 44, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnScarletOverdriveSelected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_scarletod_h.png"), w - 63, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnScarletOverdriveSelected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_scarletod_h.png"), w - 82, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnScarletOverdriveSelected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_scarletod_h.png"), w - 101, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnScarletOverdriveSelected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_scarletod_h.png"), w - 44, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnScarletOverdriveSelected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_scarletod_h.png"), w - 63, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnScarletOverdriveSelected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_scarletod_h.png"), w - 82, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnScarletOverdriveSelected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_scarletod_h.png"), w - 101, h - 44, 0, 0, 20, 20, 20, 20);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
