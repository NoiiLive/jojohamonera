package net.mcreator.jojohe.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.jojohe.world.inventory.DefenderChangeMenu;
import net.mcreator.jojohe.network.DefenderChangeButtonMessage;
import net.mcreator.jojohe.JojoheMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class DefenderChangeScreen extends AbstractContainerScreen<DefenderChangeMenu> {
	private final static HashMap<String, Object> guistate = DefenderChangeMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_change;
	Button button_x;
	Button button_xnable;
	Button button_xnable1;
	Button button_xnable2;
	Button button_enable;
	Button button_enable1;
	Button button_enable2;

	public DefenderChangeScreen(DefenderChangeMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 230;
		this.imageHeight = 180;
	}

	private static final ResourceLocation texture = new ResourceLocation("jojohe:textures/screens/defender_change.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
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
		guiGraphics.drawString(this.font, Component.translatable("gui.jojohe.defender_change.label_root_warrior"), 63, 11, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.jojohe.defender_change.label_zoom_punch"), 123, 36, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.jojohe.defender_change.label_scarlet_overdrive"), 123, 61, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.jojohe.defender_change.label_sunlight_overdrive"), 123, 86, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.jojohe.defender_change.label_root_warrior1"), 8, 116, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.jojohe.defender_change.label_strength_ii_regeneration_i"), 8, 146, -16751104, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.jojohe.defender_change.label_longer_cooldowns"), 8, 131, -10092544, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.jojohe.defender_change.label_resistance_ii"), 8, 161, -16751104, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_change = Button.builder(Component.translatable("gui.jojohe.defender_change.button_change"), e -> {
			if (true) {
				JojoheMod.PACKET_HANDLER.sendToServer(new DefenderChangeButtonMessage(0, x, y, z));
				DefenderChangeButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 3, this.topPos + 6, 56, 20).build();
		guistate.put("button:button_change", button_change);
		this.addRenderableWidget(button_change);
		button_x = Button.builder(Component.translatable("gui.jojohe.defender_change.button_x"), e -> {
			if (true) {
				JojoheMod.PACKET_HANDLER.sendToServer(new DefenderChangeButtonMessage(1, x, y, z));
				DefenderChangeButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 193, this.topPos + 156, 30, 20).build();
		guistate.put("button:button_x", button_x);
		this.addRenderableWidget(button_x);
		button_xnable = Button.builder(Component.translatable("gui.jojohe.defender_change.button_xnable"), e -> {
			if (true) {
				JojoheMod.PACKET_HANDLER.sendToServer(new DefenderChangeButtonMessage(2, x, y, z));
				DefenderChangeButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 63, this.topPos + 31, 56, 20).build();
		guistate.put("button:button_xnable", button_xnable);
		this.addRenderableWidget(button_xnable);
		button_xnable1 = Button.builder(Component.translatable("gui.jojohe.defender_change.button_xnable1"), e -> {
			if (true) {
				JojoheMod.PACKET_HANDLER.sendToServer(new DefenderChangeButtonMessage(3, x, y, z));
				DefenderChangeButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 63, this.topPos + 56, 56, 20).build();
		guistate.put("button:button_xnable1", button_xnable1);
		this.addRenderableWidget(button_xnable1);
		button_xnable2 = Button.builder(Component.translatable("gui.jojohe.defender_change.button_xnable2"), e -> {
			if (true) {
				JojoheMod.PACKET_HANDLER.sendToServer(new DefenderChangeButtonMessage(4, x, y, z));
				DefenderChangeButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 63, this.topPos + 81, 56, 20).build();
		guistate.put("button:button_xnable2", button_xnable2);
		this.addRenderableWidget(button_xnable2);
		button_enable = Button.builder(Component.translatable("gui.jojohe.defender_change.button_enable"), e -> {
			if (true) {
				JojoheMod.PACKET_HANDLER.sendToServer(new DefenderChangeButtonMessage(5, x, y, z));
				DefenderChangeButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}).bounds(this.leftPos + 3, this.topPos + 31, 56, 20).build();
		guistate.put("button:button_enable", button_enable);
		this.addRenderableWidget(button_enable);
		button_enable1 = Button.builder(Component.translatable("gui.jojohe.defender_change.button_enable1"), e -> {
			if (true) {
				JojoheMod.PACKET_HANDLER.sendToServer(new DefenderChangeButtonMessage(6, x, y, z));
				DefenderChangeButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}).bounds(this.leftPos + 3, this.topPos + 56, 56, 20).build();
		guistate.put("button:button_enable1", button_enable1);
		this.addRenderableWidget(button_enable1);
		button_enable2 = Button.builder(Component.translatable("gui.jojohe.defender_change.button_enable2"), e -> {
			if (true) {
				JojoheMod.PACKET_HANDLER.sendToServer(new DefenderChangeButtonMessage(7, x, y, z));
				DefenderChangeButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		}).bounds(this.leftPos + 3, this.topPos + 81, 56, 20).build();
		guistate.put("button:button_enable2", button_enable2);
		this.addRenderableWidget(button_enable2);
	}
}
