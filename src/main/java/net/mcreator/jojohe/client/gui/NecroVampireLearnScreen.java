package net.mcreator.jojohe.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.jojohe.world.inventory.NecroVampireLearnMenu;
import net.mcreator.jojohe.network.NecroVampireLearnButtonMessage;
import net.mcreator.jojohe.JojoheMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class NecroVampireLearnScreen extends AbstractContainerScreen<NecroVampireLearnMenu> {
	private final static HashMap<String, Object> guistate = NecroVampireLearnMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_alright;

	public NecroVampireLearnScreen(NecroVampireLearnMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 200;
		this.imageHeight = 110;
	}

	private static final ResourceLocation texture = new ResourceLocation("jojohe:textures/screens/necro_vampire_learn.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.jojohe.necro_vampire_learn.label_you_look_ready_to_fight_vampires"), 50, 21, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.jojohe.necro_vampire_learn.label_bring_me_a_stone_mask"), 15, 41, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.jojohe.necro_vampire_learn.label_and_i_will_teach_you_hamon"), 55, 61, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_alright = Button.builder(Component.translatable("gui.jojohe.necro_vampire_learn.button_alright"), e -> {
			if (true) {
				JojoheMod.PACKET_HANDLER.sendToServer(new NecroVampireLearnButtonMessage(0, x, y, z));
				NecroVampireLearnButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 70, this.topPos + 81, 61, 20).build();
		guistate.put("button:button_alright", button_alright);
		this.addRenderableWidget(button_alright);
	}
}
