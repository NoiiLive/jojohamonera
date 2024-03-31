package net.mcreator.jojohe.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.jojohe.world.inventory.SpawnGUIMenu;
import net.mcreator.jojohe.network.SpawnGUIButtonMessage;
import net.mcreator.jojohe.JojoheMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class SpawnGUIScreen extends AbstractContainerScreen<SpawnGUIMenu> {
	private final static HashMap<String, Object> guistate = SpawnGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_select;
	Button button_empty;
	Button button_empty1;

	public SpawnGUIScreen(SpawnGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 185;
		this.imageHeight = 202;
	}

	@Override
	public boolean isPauseScreen() {
		return true;
	}

	private static final ResourceLocation texture = new ResourceLocation("jojohe:textures/screens/spawn_gui.png");

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

		guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/noneplate.png"), this.leftPos + 6, this.topPos + 6, 0, 0, 129, 32, 129, 32);

		guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/dark.png"), this.leftPos + 10, this.topPos + 40, 0, 0, 162, 125, 162, 125);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.jojohe.spawn_gui.label_start_without_any_abilities"), 16, 46, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.jojohe.spawn_gui.label_and_gain_them_on_your_own"), 16, 60, -1, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_select = Button.builder(Component.translatable("gui.jojohe.spawn_gui.button_select"), e -> {
			if (true) {
				JojoheMod.PACKET_HANDLER.sendToServer(new SpawnGUIButtonMessage(0, x, y, z));
				SpawnGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 63, this.topPos + 175, 56, 20).build();
		guistate.put("button:button_select", button_select);
		this.addRenderableWidget(button_select);
		button_empty = Button.builder(Component.translatable("gui.jojohe.spawn_gui.button_empty"), e -> {
			if (true) {
				JojoheMod.PACKET_HANDLER.sendToServer(new SpawnGUIButtonMessage(1, x, y, z));
				SpawnGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + -38, this.topPos + 90, 30, 20).build();
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
		button_empty1 = Button.builder(Component.translatable("gui.jojohe.spawn_gui.button_empty1"), e -> {
			if (true) {
				JojoheMod.PACKET_HANDLER.sendToServer(new SpawnGUIButtonMessage(2, x, y, z));
				SpawnGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 192, this.topPos + 90, 30, 20).build();
		guistate.put("button:button_empty1", button_empty1);
		this.addRenderableWidget(button_empty1);
	}
}
