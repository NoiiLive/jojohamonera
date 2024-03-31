package net.mcreator.jojohe.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.jojohe.world.inventory.WisdomLearnMenu;
import net.mcreator.jojohe.network.WisdomLearnButtonMessage;
import net.mcreator.jojohe.JojoheMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class WisdomLearnScreen extends AbstractContainerScreen<WisdomLearnMenu> {
	private final static HashMap<String, Object> guistate = WisdomLearnMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_learn_hamon;

	public WisdomLearnScreen(WisdomLearnMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 160;
		this.imageHeight = 100;
	}

	private static final ResourceLocation texture = new ResourceLocation("jojohe:textures/screens/wisdom_learn.png");

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

		guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/cost_book.png"), this.leftPos + 63, this.topPos + 8, 0, 0, 32, 32, 32, 32);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.jojohe.wisdom_learn.label_cost_1_stone_mask"), 18, 46, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_learn_hamon = Button.builder(Component.translatable("gui.jojohe.wisdom_learn.button_learn_hamon"), e -> {
			if (true) {
				JojoheMod.PACKET_HANDLER.sendToServer(new WisdomLearnButtonMessage(0, x, y, z));
				WisdomLearnButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 38, this.topPos + 66, 82, 20).build();
		guistate.put("button:button_learn_hamon", button_learn_hamon);
		this.addRenderableWidget(button_learn_hamon);
	}
}
