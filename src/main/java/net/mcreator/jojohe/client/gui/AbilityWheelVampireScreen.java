package net.mcreator.jojohe.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.jojohe.world.inventory.AbilityWheelVampireMenu;
import net.mcreator.jojohe.procedures.WheelSwitchDisplayProcedure;
import net.mcreator.jojohe.procedures.ReturnAbilitySlot9Procedure;
import net.mcreator.jojohe.procedures.ReturnAbilitySlot8Procedure;
import net.mcreator.jojohe.procedures.ReturnAbilitySlot7Procedure;
import net.mcreator.jojohe.procedures.ReturnAbilitySlot6Procedure;
import net.mcreator.jojohe.procedures.ReturnAbilitySlot5Procedure;
import net.mcreator.jojohe.procedures.ReturnAbilitySlot4Procedure;
import net.mcreator.jojohe.procedures.ReturnAbilitySlot3Procedure;
import net.mcreator.jojohe.procedures.ReturnAbilitySlot2Procedure;
import net.mcreator.jojohe.procedures.ReturnAbilitySlot1Procedure;
import net.mcreator.jojohe.network.AbilityWheelVampireButtonMessage;
import net.mcreator.jojohe.JojoheMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class AbilityWheelVampireScreen extends AbstractContainerScreen<AbilityWheelVampireMenu> {
	private final static HashMap<String, Object> guistate = AbilityWheelVampireMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_guiarrow_down;

	public AbilityWheelVampireScreen(AbilityWheelVampireMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("jojohe:textures/screens/ability_wheel_vampire.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + -51 && mouseX < leftPos + -19 && mouseY > topPos + -49 && mouseY < topPos + -17)
			guiGraphics.renderTooltip(font, Component.literal(ReturnAbilitySlot1Procedure.execute(entity)), mouseX, mouseY);
		if (mouseX > leftPos + -17 && mouseX < leftPos + 15 && mouseY > topPos + -49 && mouseY < topPos + -17)
			guiGraphics.renderTooltip(font, Component.literal(ReturnAbilitySlot2Procedure.execute(entity)), mouseX, mouseY);
		if (mouseX > leftPos + 17 && mouseX < leftPos + 49 && mouseY > topPos + -49 && mouseY < topPos + -17)
			guiGraphics.renderTooltip(font, Component.literal(ReturnAbilitySlot3Procedure.execute(entity)), mouseX, mouseY);
		if (mouseX > leftPos + -51 && mouseX < leftPos + -19 && mouseY > topPos + -15 && mouseY < topPos + 17)
			guiGraphics.renderTooltip(font, Component.literal(ReturnAbilitySlot4Procedure.execute(entity)), mouseX, mouseY);
		if (mouseX > leftPos + -17 && mouseX < leftPos + 15 && mouseY > topPos + -15 && mouseY < topPos + 17)
			guiGraphics.renderTooltip(font, Component.literal(ReturnAbilitySlot5Procedure.execute(entity)), mouseX, mouseY);
		if (mouseX > leftPos + 17 && mouseX < leftPos + 49 && mouseY > topPos + -15 && mouseY < topPos + 17)
			guiGraphics.renderTooltip(font, Component.literal(ReturnAbilitySlot6Procedure.execute(entity)), mouseX, mouseY);
		if (mouseX > leftPos + -51 && mouseX < leftPos + -19 && mouseY > topPos + 19 && mouseY < topPos + 51)
			guiGraphics.renderTooltip(font, Component.literal(ReturnAbilitySlot7Procedure.execute(entity)), mouseX, mouseY);
		if (mouseX > leftPos + -17 && mouseX < leftPos + 15 && mouseY > topPos + 19 && mouseY < topPos + 51)
			guiGraphics.renderTooltip(font, Component.literal(ReturnAbilitySlot8Procedure.execute(entity)), mouseX, mouseY);
		if (mouseX > leftPos + 17 && mouseX < leftPos + 49 && mouseY > topPos + 19 && mouseY < topPos + 51)
			guiGraphics.renderTooltip(font, Component.literal(ReturnAbilitySlot9Procedure.execute(entity)), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/ability_grid.png"), this.leftPos + -53, this.topPos + -51, 0, 0, 104, 104, 104, 104);

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
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_guiarrow_down = new ImageButton(this.leftPos + -10, this.topPos + 55, 19, 13, 0, 0, 13, new ResourceLocation("jojohe:textures/screens/atlas/imagebutton_guiarrow_down.png"), 19, 26, e -> {
			if (WheelSwitchDisplayProcedure.execute(world, entity)) {
				JojoheMod.PACKET_HANDLER.sendToServer(new AbilityWheelVampireButtonMessage(0, x, y, z));
				AbilityWheelVampireButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (WheelSwitchDisplayProcedure.execute(world, entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_guiarrow_down", imagebutton_guiarrow_down);
		this.addRenderableWidget(imagebutton_guiarrow_down);
	}
}
