package net.mcreator.jojohe.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.jojohe.world.inventory.SpeedwagonChoiceMenu;
import net.mcreator.jojohe.network.SpeedwagonChoiceButtonMessage;
import net.mcreator.jojohe.JojoheMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class SpeedwagonChoiceScreen extends AbstractContainerScreen<SpeedwagonChoiceMenu> {
	private final static HashMap<String, Object> guistate = SpeedwagonChoiceMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_mask;
	Button button_mask1;

	public SpeedwagonChoiceScreen(SpeedwagonChoiceMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 200;
		this.imageHeight = 110;
	}

	private static final ResourceLocation texture = new ResourceLocation("jojohe:textures/screens/speedwagon_choice.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.jojohe.speedwagon_choice.label_you_look_ready_to_fight_vampires"), 15, 21, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.jojohe.speedwagon_choice.label_bring_me_a_stone_mask"), 45, 41, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.jojohe.speedwagon_choice.label_and_i_will_teach_you_hamon"), 30, 61, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_mask = Button.builder(Component.translatable("gui.jojohe.speedwagon_choice.button_mask"), e -> {
			if (true) {
				JojoheMod.PACKET_HANDLER.sendToServer(new SpeedwagonChoiceButtonMessage(0, x, y, z));
				SpeedwagonChoiceButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 81, 46, 20).build();
		guistate.put("button:button_mask", button_mask);
		this.addRenderableWidget(button_mask);
		button_mask1 = Button.builder(Component.translatable("gui.jojohe.speedwagon_choice.button_mask1"), e -> {
			if (true) {
				JojoheMod.PACKET_HANDLER.sendToServer(new SpeedwagonChoiceButtonMessage(1, x, y, z));
				SpeedwagonChoiceButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 145, this.topPos + 81, 46, 20).build();
		guistate.put("button:button_mask1", button_mask1);
		this.addRenderableWidget(button_mask1);
	}
}
