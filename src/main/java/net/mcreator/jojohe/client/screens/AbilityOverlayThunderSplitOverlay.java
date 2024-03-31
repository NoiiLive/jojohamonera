
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

import net.mcreator.jojohe.procedures.ReturnThunderSplitSelected9Procedure;
import net.mcreator.jojohe.procedures.ReturnThunderSplitSelected8Procedure;
import net.mcreator.jojohe.procedures.ReturnThunderSplitSelected7Procedure;
import net.mcreator.jojohe.procedures.ReturnThunderSplitSelected6Procedure;
import net.mcreator.jojohe.procedures.ReturnThunderSplitSelected5Procedure;
import net.mcreator.jojohe.procedures.ReturnThunderSplitSelected4Procedure;
import net.mcreator.jojohe.procedures.ReturnThunderSplitSelected3Procedure;
import net.mcreator.jojohe.procedures.ReturnThunderSplitSelected2Procedure;
import net.mcreator.jojohe.procedures.ReturnThunderSplitSelected1Procedure;
import net.mcreator.jojohe.procedures.ReturnThunderSplit9Procedure;
import net.mcreator.jojohe.procedures.ReturnThunderSplit8Procedure;
import net.mcreator.jojohe.procedures.ReturnThunderSplit7Procedure;
import net.mcreator.jojohe.procedures.ReturnThunderSplit6Procedure;
import net.mcreator.jojohe.procedures.ReturnThunderSplit5Procedure;
import net.mcreator.jojohe.procedures.ReturnThunderSplit4Procedure;
import net.mcreator.jojohe.procedures.ReturnThunderSplit3Procedure;
import net.mcreator.jojohe.procedures.ReturnThunderSplit2Procedure;
import net.mcreator.jojohe.procedures.ReturnThunderSplit1Procedure;
import net.mcreator.jojohe.procedures.ReturnHamonUserProcedure;
import net.mcreator.jojohe.procedures.DontReturnProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class AbilityOverlayThunderSplitOverlay {
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
			if (ReturnThunderSplit1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_thundercross.png"), w - 25, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnThunderSplit2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_thundercross.png"), w - 44, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnThunderSplit3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_thundercross.png"), w - 63, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnThunderSplit4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_thundercross.png"), w - 82, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnThunderSplit5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_thundercross.png"), w - 101, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnThunderSplit6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_thundercross.png"), w - 44, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnThunderSplit7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_thundercross.png"), w - 63, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnThunderSplit8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_thundercross.png"), w - 82, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnThunderSplit9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_thundercross.png"), w - 101, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnThunderSplitSelected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_thundercross_h.png"), w - 25, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnThunderSplitSelected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_thundercross_h.png"), w - 44, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnThunderSplitSelected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_thundercross_h.png"), w - 63, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnThunderSplitSelected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_thundercross_h.png"), w - 82, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnThunderSplitSelected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_thundercross_h.png"), w - 101, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnThunderSplitSelected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_thundercross_h.png"), w - 44, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnThunderSplitSelected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_thundercross_h.png"), w - 63, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnThunderSplitSelected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_thundercross_h.png"), w - 82, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnThunderSplitSelected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_h_thundercross_h.png"), w - 101, h - 44, 0, 0, 20, 20, 20, 20);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
