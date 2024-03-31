package net.mcreator.jojohe.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.jojohe.world.inventory.NecroVampireQuestMenu;
import net.mcreator.jojohe.network.NecroVampireQuestButtonMessage;
import net.mcreator.jojohe.JojoheMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class NecroVampireQuestScreen extends AbstractContainerScreen<NecroVampireQuestMenu> {
	private final static HashMap<String, Object> guistate = NecroVampireQuestMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_ok;
	Button button_no;

	public NecroVampireQuestScreen(NecroVampireQuestMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 200;
		this.imageHeight = 110;
	}

	private static final ResourceLocation texture = new ResourceLocation("jojohe:textures/screens/necro_vampire_quest.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.jojohe.necro_vampire_quest.label_you_look_ready_to_fight_vampires"), 10, 21, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.jojohe.necro_vampire_quest.label_bring_me_a_stone_mask"), 55, 41, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.jojohe.necro_vampire_quest.label_and_i_will_teach_you_hamon"), 35, 61, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_ok = Button.builder(Component.translatable("gui.jojohe.necro_vampire_quest.button_ok"), e -> {
			if (true) {
				JojoheMod.PACKET_HANDLER.sendToServer(new NecroVampireQuestButtonMessage(0, x, y, z));
				NecroVampireQuestButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 148, this.topPos + 81, 35, 20).build();
		guistate.put("button:button_ok", button_ok);
		this.addRenderableWidget(button_ok);
		button_no = Button.builder(Component.translatable("gui.jojohe.necro_vampire_quest.button_no"), e -> {
			if (true) {
				JojoheMod.PACKET_HANDLER.sendToServer(new NecroVampireQuestButtonMessage(1, x, y, z));
				NecroVampireQuestButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 13, this.topPos + 81, 35, 20).build();
		guistate.put("button:button_no", button_no);
		this.addRenderableWidget(button_no);
	}
}
