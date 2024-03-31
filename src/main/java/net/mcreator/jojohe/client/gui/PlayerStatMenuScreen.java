package net.mcreator.jojohe.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.jojohe.world.inventory.PlayerStatMenuMenu;
import net.mcreator.jojohe.procedures.WillpowerAddDisplayProcedure;
import net.mcreator.jojohe.procedures.StrengthAddDisplayProcedure;
import net.mcreator.jojohe.procedures.SpeedAddDisplayProcedure;
import net.mcreator.jojohe.procedures.ReturnWillpowerProcedure;
import net.mcreator.jojohe.procedures.ReturnStrengthProcedure;
import net.mcreator.jojohe.procedures.ReturnSpeedProcedure;
import net.mcreator.jojohe.procedures.ReturnSkillPointsProcedure;
import net.mcreator.jojohe.procedures.ReturnRootTextProcedure;
import net.mcreator.jojohe.procedures.ReturnRaceTextProcedure;
import net.mcreator.jojohe.procedures.ReturnPlayerLevelProcedure;
import net.mcreator.jojohe.procedures.ReturnMasteryProcedure;
import net.mcreator.jojohe.procedures.ReturnEXPTooltipProcedure;
import net.mcreator.jojohe.procedures.ReturnDurabilityProcedure;
import net.mcreator.jojohe.procedures.PlayerEXP9Procedure;
import net.mcreator.jojohe.procedures.PlayerEXP8Procedure;
import net.mcreator.jojohe.procedures.PlayerEXP7Procedure;
import net.mcreator.jojohe.procedures.PlayerEXP6Procedure;
import net.mcreator.jojohe.procedures.PlayerEXP5Procedure;
import net.mcreator.jojohe.procedures.PlayerEXP4Procedure;
import net.mcreator.jojohe.procedures.PlayerEXP3Procedure;
import net.mcreator.jojohe.procedures.PlayerEXP2Procedure;
import net.mcreator.jojohe.procedures.PlayerEXP22Procedure;
import net.mcreator.jojohe.procedures.PlayerEXP21Procedure;
import net.mcreator.jojohe.procedures.PlayerEXP20Procedure;
import net.mcreator.jojohe.procedures.PlayerEXP1Procedure;
import net.mcreator.jojohe.procedures.PlayerEXP19Procedure;
import net.mcreator.jojohe.procedures.PlayerEXP18Procedure;
import net.mcreator.jojohe.procedures.PlayerEXP17Procedure;
import net.mcreator.jojohe.procedures.PlayerEXP16Procedure;
import net.mcreator.jojohe.procedures.PlayerEXP15Procedure;
import net.mcreator.jojohe.procedures.PlayerEXP14Procedure;
import net.mcreator.jojohe.procedures.PlayerEXP13Procedure;
import net.mcreator.jojohe.procedures.PlayerEXP12Procedure;
import net.mcreator.jojohe.procedures.PlayerEXP11Procedure;
import net.mcreator.jojohe.procedures.PlayerEXP10Procedure;
import net.mcreator.jojohe.procedures.DurabilityAddDisplayProcedure;
import net.mcreator.jojohe.network.PlayerStatMenuButtonMessage;
import net.mcreator.jojohe.JojoheMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class PlayerStatMenuScreen extends AbstractContainerScreen<PlayerStatMenuMenu> {
	private final static HashMap<String, Object> guistate = PlayerStatMenuMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_gui_arrow;
	ImageButton imagebutton_pointadd_button;
	ImageButton imagebutton_pointadd_button1;
	ImageButton imagebutton_pointadd_button2;
	ImageButton imagebutton_pointadd_button3;

	public PlayerStatMenuScreen(PlayerStatMenuMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("jojohe:textures/screens/player_stat_menu.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 81 && mouseX < leftPos + 98 && mouseY > topPos + -37 && mouseY < topPos + -14)
			guiGraphics.renderTooltip(font, Component.translatable("gui.jojohe.player_stat_menu.tooltip_open_skill_tree"), mouseX, mouseY);
		if (mouseX > leftPos + -100 && mouseX < leftPos + -66 && mouseY > topPos + -2 && mouseY < topPos + 85)
			guiGraphics.renderTooltip(font, Component.literal(ReturnEXPTooltipProcedure.execute(entity)), mouseX, mouseY);
		if (DurabilityAddDisplayProcedure.execute(entity))
			if (mouseX > leftPos + 72 && mouseX < leftPos + 97 && mouseY > topPos + 50 && mouseY < topPos + 65)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojohe.player_stat_menu.tooltip_increases_your_health_and_decre"), mouseX, mouseY);
		if (SpeedAddDisplayProcedure.execute(entity))
			if (mouseX > leftPos + 72 && mouseX < leftPos + 97 && mouseY > topPos + 32 && mouseY < topPos + 47)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojohe.player_stat_menu.tooltip_decreases_the_cooldowns_of_your"), mouseX, mouseY);
		if (StrengthAddDisplayProcedure.execute(entity))
			if (mouseX > leftPos + 72 && mouseX < leftPos + 97 && mouseY > topPos + 14 && mouseY < topPos + 29)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojohe.player_stat_menu.tooltip_increases_the_power_of_your_move"), mouseX, mouseY);
		if (WillpowerAddDisplayProcedure.execute(entity))
			if (mouseX > leftPos + 72 && mouseX < leftPos + 97 && mouseY > topPos + 67 && mouseY < topPos + 82)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojohe.player_stat_menu.tooltip_allows_you_to_acquire_more_moves"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/statpage.png"), this.leftPos + -110, this.topPos + -75, 0, 0, 220, 170, 220, 170);

		if (PlayerEXP22Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/expbar_22.png"), this.leftPos + -101, this.topPos + -3, 0, 0, 36, 89, 36, 89);
		}
		if (PlayerEXP21Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/expbar_21.png"), this.leftPos + -101, this.topPos + -3, 0, 0, 36, 89, 36, 89);
		}
		if (PlayerEXP20Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/expbar_20.png"), this.leftPos + -101, this.topPos + -3, 0, 0, 36, 89, 36, 89);
		}
		if (PlayerEXP19Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/expbar_19.png"), this.leftPos + -101, this.topPos + -3, 0, 0, 36, 89, 36, 89);
		}
		if (PlayerEXP18Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/expbar_18.png"), this.leftPos + -101, this.topPos + -3, 0, 0, 36, 89, 36, 89);
		}
		if (PlayerEXP17Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/expbar_17.png"), this.leftPos + -101, this.topPos + -3, 0, 0, 36, 89, 36, 89);
		}
		if (PlayerEXP16Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/expbar_16.png"), this.leftPos + -101, this.topPos + -3, 0, 0, 36, 89, 36, 89);
		}
		if (PlayerEXP15Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/expbar_15.png"), this.leftPos + -101, this.topPos + -3, 0, 0, 36, 89, 36, 89);
		}
		if (PlayerEXP14Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/expbar_14.png"), this.leftPos + -101, this.topPos + -3, 0, 0, 36, 89, 36, 89);
		}
		if (PlayerEXP13Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/expbar_13.png"), this.leftPos + -101, this.topPos + -3, 0, 0, 36, 89, 36, 89);
		}
		if (PlayerEXP12Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/expbar_12.png"), this.leftPos + -101, this.topPos + -3, 0, 0, 36, 89, 36, 89);
		}
		if (PlayerEXP11Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/expbar_11.png"), this.leftPos + -101, this.topPos + -3, 0, 0, 36, 89, 36, 89);
		}
		if (PlayerEXP10Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/expbar_10.png"), this.leftPos + -101, this.topPos + -3, 0, 0, 36, 89, 36, 89);
		}
		if (PlayerEXP9Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/expbar_9.png"), this.leftPos + -101, this.topPos + -3, 0, 0, 36, 89, 36, 89);
		}
		if (PlayerEXP8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/expbar_8.png"), this.leftPos + -101, this.topPos + -3, 0, 0, 36, 89, 36, 89);
		}
		if (PlayerEXP7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/expbar_7.png"), this.leftPos + -101, this.topPos + -3, 0, 0, 36, 89, 36, 89);
		}
		if (PlayerEXP6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/expbar_6.png"), this.leftPos + -101, this.topPos + -3, 0, 0, 36, 89, 36, 89);
		}
		if (PlayerEXP5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/expbar_5.png"), this.leftPos + -101, this.topPos + -3, 0, 0, 36, 89, 36, 89);
		}
		if (PlayerEXP4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/expbar_4.png"), this.leftPos + -101, this.topPos + -3, 0, 0, 36, 89, 36, 89);
		}
		if (PlayerEXP3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/expbar_3.png"), this.leftPos + -101, this.topPos + -3, 0, 0, 36, 89, 36, 89);
		}
		if (PlayerEXP2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/expbar_2.png"), this.leftPos + -101, this.topPos + -3, 0, 0, 36, 89, 36, 89);
		}
		if (PlayerEXP1Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/expbar_1.png"), this.leftPos + -101, this.topPos + -3, 0, 0, 36, 89, 36, 89);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font,

				ReturnRaceTextProcedure.execute(entity), -96, -58, -1, false);
		guiGraphics.drawString(this.font,

				ReturnRootTextProcedure.execute(entity), -7, -58, -1, false);
		guiGraphics.drawString(this.font,

				ReturnPlayerLevelProcedure.execute(entity), -58, -34, -1, false);
		guiGraphics.drawString(this.font,

				ReturnSkillPointsProcedure.execute(entity), -58, -16, -1, false);
		guiGraphics.drawString(this.font,

				ReturnMasteryProcedure.execute(entity), -58, 2, -1, false);
		guiGraphics.drawString(this.font,

				ReturnStrengthProcedure.execute(entity), -58, 20, -1, false);
		guiGraphics.drawString(this.font,

				ReturnSpeedProcedure.execute(entity), -58, 38, -1, false);
		guiGraphics.drawString(this.font,

				ReturnDurabilityProcedure.execute(entity), -58, 56, -1, false);
		guiGraphics.drawString(this.font,

				ReturnWillpowerProcedure.execute(entity), -58, 73, -1, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_gui_arrow = new ImageButton(this.leftPos + 83, this.topPos + -35, 13, 19, 0, 0, 19, new ResourceLocation("jojohe:textures/screens/atlas/imagebutton_gui_arrow.png"), 13, 38, e -> {
			if (true) {
				JojoheMod.PACKET_HANDLER.sendToServer(new PlayerStatMenuButtonMessage(0, x, y, z));
				PlayerStatMenuButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_gui_arrow", imagebutton_gui_arrow);
		this.addRenderableWidget(imagebutton_gui_arrow);
		imagebutton_pointadd_button = new ImageButton(this.leftPos + 72, this.topPos + 67, 25, 15, 0, 0, 15, new ResourceLocation("jojohe:textures/screens/atlas/imagebutton_pointadd_button.png"), 25, 30, e -> {
			if (WillpowerAddDisplayProcedure.execute(entity)) {
				JojoheMod.PACKET_HANDLER.sendToServer(new PlayerStatMenuButtonMessage(1, x, y, z));
				PlayerStatMenuButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (WillpowerAddDisplayProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_pointadd_button", imagebutton_pointadd_button);
		this.addRenderableWidget(imagebutton_pointadd_button);
		imagebutton_pointadd_button1 = new ImageButton(this.leftPos + 72, this.topPos + 50, 25, 15, 0, 0, 15, new ResourceLocation("jojohe:textures/screens/atlas/imagebutton_pointadd_button1.png"), 25, 30, e -> {
			if (DurabilityAddDisplayProcedure.execute(entity)) {
				JojoheMod.PACKET_HANDLER.sendToServer(new PlayerStatMenuButtonMessage(2, x, y, z));
				PlayerStatMenuButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (DurabilityAddDisplayProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_pointadd_button1", imagebutton_pointadd_button1);
		this.addRenderableWidget(imagebutton_pointadd_button1);
		imagebutton_pointadd_button2 = new ImageButton(this.leftPos + 72, this.topPos + 32, 25, 15, 0, 0, 15, new ResourceLocation("jojohe:textures/screens/atlas/imagebutton_pointadd_button2.png"), 25, 30, e -> {
			if (SpeedAddDisplayProcedure.execute(entity)) {
				JojoheMod.PACKET_HANDLER.sendToServer(new PlayerStatMenuButtonMessage(3, x, y, z));
				PlayerStatMenuButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (SpeedAddDisplayProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_pointadd_button2", imagebutton_pointadd_button2);
		this.addRenderableWidget(imagebutton_pointadd_button2);
		imagebutton_pointadd_button3 = new ImageButton(this.leftPos + 72, this.topPos + 14, 25, 15, 0, 0, 15, new ResourceLocation("jojohe:textures/screens/atlas/imagebutton_pointadd_button3.png"), 25, 30, e -> {
			if (StrengthAddDisplayProcedure.execute(entity)) {
				JojoheMod.PACKET_HANDLER.sendToServer(new PlayerStatMenuButtonMessage(4, x, y, z));
				PlayerStatMenuButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (StrengthAddDisplayProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_pointadd_button3", imagebutton_pointadd_button3);
		this.addRenderableWidget(imagebutton_pointadd_button3);
	}
}
