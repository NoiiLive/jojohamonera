
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

import net.mcreator.jojohe.procedures.ReturnStreetFighterProcedure;
import net.mcreator.jojohe.procedures.ReturnHumanRootProcedure;
import net.mcreator.jojohe.procedures.ReturnHumanProcedure;
import net.mcreator.jojohe.procedures.ReturnCooldownLengthProcedure;
import net.mcreator.jojohe.procedures.ReturnAbilityCooldownSelected9Procedure;
import net.mcreator.jojohe.procedures.ReturnAbilityCooldownSelected8Procedure;
import net.mcreator.jojohe.procedures.ReturnAbilityCooldownSelected7Procedure;
import net.mcreator.jojohe.procedures.ReturnAbilityCooldownSelected6Procedure;
import net.mcreator.jojohe.procedures.ReturnAbilityCooldownSelected5Procedure;
import net.mcreator.jojohe.procedures.ReturnAbilityCooldownSelected4Procedure;
import net.mcreator.jojohe.procedures.ReturnAbilityCooldownSelected3Procedure;
import net.mcreator.jojohe.procedures.ReturnAbilityCooldownSelected2Procedure;
import net.mcreator.jojohe.procedures.ReturnAbilityCooldownSelected1Procedure;
import net.mcreator.jojohe.procedures.ReturnAbilityCooldown9Procedure;
import net.mcreator.jojohe.procedures.ReturnAbilityCooldown8Procedure;
import net.mcreator.jojohe.procedures.ReturnAbilityCooldown7Procedure;
import net.mcreator.jojohe.procedures.ReturnAbilityCooldown6Procedure;
import net.mcreator.jojohe.procedures.ReturnAbilityCooldown5Procedure;
import net.mcreator.jojohe.procedures.ReturnAbilityCooldown4Procedure;
import net.mcreator.jojohe.procedures.ReturnAbilityCooldown3Procedure;
import net.mcreator.jojohe.procedures.ReturnAbilityCooldown2Procedure;
import net.mcreator.jojohe.procedures.ReturnAbilityCooldown1Procedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class AbilityHumanOverlayOverlay {
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
		if (ReturnHumanProcedure.execute(entity)) {
			if (ReturnHumanProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_switch_display_he.png"), w - 101, h - 44, 0, 0, 96, 39, 96, 39);
			}
			if (ReturnHumanRootProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_root_human.png"), w - 25, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnStreetFighterProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_root_streetfighter.png"), w - 25, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnAbilityCooldown1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_locked.png"), w - 25, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnAbilityCooldown2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_locked.png"), w - 44, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnAbilityCooldown3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_locked.png"), w - 63, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnAbilityCooldown4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_locked.png"), w - 82, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnAbilityCooldown5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_locked.png"), w - 101, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnAbilityCooldown6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_locked.png"), w - 44, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnAbilityCooldown7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_locked.png"), w - 63, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnAbilityCooldown8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_locked.png"), w - 82, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnAbilityCooldown9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_locked.png"), w - 101, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnAbilityCooldownSelected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_locked_selected.png"), w - 25, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnAbilityCooldownSelected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_locked_selected.png"), w - 44, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnAbilityCooldownSelected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_locked_selected.png"), w - 63, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnAbilityCooldownSelected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_locked_selected.png"), w - 82, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnAbilityCooldownSelected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_locked_selected.png"), w - 101, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnAbilityCooldownSelected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_locked_selected.png"), w - 44, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnAbilityCooldownSelected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_locked_selected.png"), w - 63, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnAbilityCooldownSelected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_locked_selected.png"), w - 82, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnAbilityCooldownSelected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojohe:textures/screens/ability_locked_selected.png"), w - 101, h - 44, 0, 0, 20, 20, 20, 20);
			}
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					ReturnCooldownLengthProcedure.execute(entity), w - 24, h - 58, -39322, false);
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
