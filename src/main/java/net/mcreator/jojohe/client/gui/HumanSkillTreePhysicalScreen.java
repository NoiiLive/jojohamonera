package net.mcreator.jojohe.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.jojohe.world.inventory.HumanSkillTreePhysicalMenu;
import net.mcreator.jojohe.network.HumanSkillTreePhysicalButtonMessage;
import net.mcreator.jojohe.JojoheMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class HumanSkillTreePhysicalScreen extends AbstractContainerScreen<HumanSkillTreePhysicalMenu> {
	private final static HashMap<String, Object> guistate = HumanSkillTreePhysicalMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_guiarrow_left;
	ImageButton imagebutton_gui_arrow;
	ImageButton imagebutton_stat_guibutton;
	ImageButton imagebutton_skilltree_rebindtab;
	ImageButton imagebutton_skilltree_rebindtab1;
	ImageButton imagebutton_skilltree_rebindtab2;
	ImageButton imagebutton_skilltree_rebindtab3;

	public HumanSkillTreePhysicalScreen(HumanSkillTreePhysicalMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("jojohe:textures/screens/human_skill_tree_physical.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + -44 && mouseX < leftPos + -31 && mouseY > topPos + -107 && mouseY < topPos + -88)
			guiGraphics.renderTooltip(font, Component.translatable("gui.jojohe.human_skill_tree_physical.tooltip_support"), mouseX, mouseY);
		if (mouseX > leftPos + 30 && mouseX < leftPos + 43 && mouseY > topPos + -107 && mouseY < topPos + -88)
			guiGraphics.renderTooltip(font, Component.translatable("gui.jojohe.human_skill_tree_physical.tooltip_physical"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/skilltree_icon.png"), this.leftPos + -30, this.topPos + -68, 0, 0, 58, 58, 58, 58);

		guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/skilltree_icon.png"), this.leftPos + -69, this.topPos + -29, 0, 0, 58, 58, 58, 58);

		guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/skilltree_icon.png"), this.leftPos + -30, this.topPos + 10, 0, 0, 58, 58, 58, 58);

		guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/skilltree_icon.png"), this.leftPos + 10, this.topPos + -29, 0, 0, 58, 58, 58, 58);

		guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/skilltree_physical.png"), this.leftPos + -33, this.topPos + -107, 0, 0, 65, 19, 65, 19);

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
		imagebutton_guiarrow_left = new ImageButton(this.leftPos + -44, this.topPos + -107, 13, 19, 0, 0, 19, new ResourceLocation("jojohe:textures/screens/atlas/imagebutton_guiarrow_left.png"), 13, 38, e -> {
			if (true) {
				JojoheMod.PACKET_HANDLER.sendToServer(new HumanSkillTreePhysicalButtonMessage(0, x, y, z));
				HumanSkillTreePhysicalButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_guiarrow_left", imagebutton_guiarrow_left);
		this.addRenderableWidget(imagebutton_guiarrow_left);
		imagebutton_gui_arrow = new ImageButton(this.leftPos + 30, this.topPos + -107, 13, 19, 0, 0, 19, new ResourceLocation("jojohe:textures/screens/atlas/imagebutton_gui_arrow.png"), 13, 38, e -> {
			if (true) {
				JojoheMod.PACKET_HANDLER.sendToServer(new HumanSkillTreePhysicalButtonMessage(1, x, y, z));
				HumanSkillTreePhysicalButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_gui_arrow", imagebutton_gui_arrow);
		this.addRenderableWidget(imagebutton_gui_arrow);
		imagebutton_stat_guibutton = new ImageButton(this.leftPos + -12, this.topPos + -11, 22, 22, 0, 0, 22, new ResourceLocation("jojohe:textures/screens/atlas/imagebutton_stat_guibutton.png"), 22, 44, e -> {
			if (true) {
				JojoheMod.PACKET_HANDLER.sendToServer(new HumanSkillTreePhysicalButtonMessage(2, x, y, z));
				HumanSkillTreePhysicalButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_stat_guibutton", imagebutton_stat_guibutton);
		this.addRenderableWidget(imagebutton_stat_guibutton);
		imagebutton_skilltree_rebindtab = new ImageButton(this.leftPos + -10, this.topPos + -24, 18, 7, 0, 0, 7, new ResourceLocation("jojohe:textures/screens/atlas/imagebutton_skilltree_rebindtab.png"), 18, 14, e -> {
		});
		guistate.put("button:imagebutton_skilltree_rebindtab", imagebutton_skilltree_rebindtab);
		this.addRenderableWidget(imagebutton_skilltree_rebindtab);
		imagebutton_skilltree_rebindtab1 = new ImageButton(this.leftPos + -10, this.topPos + 54, 18, 7, 0, 0, 7, new ResourceLocation("jojohe:textures/screens/atlas/imagebutton_skilltree_rebindtab1.png"), 18, 14, e -> {
		});
		guistate.put("button:imagebutton_skilltree_rebindtab1", imagebutton_skilltree_rebindtab1);
		this.addRenderableWidget(imagebutton_skilltree_rebindtab1);
		imagebutton_skilltree_rebindtab2 = new ImageButton(this.leftPos + -49, this.topPos + 15, 18, 7, 0, 0, 7, new ResourceLocation("jojohe:textures/screens/atlas/imagebutton_skilltree_rebindtab2.png"), 18, 14, e -> {
		});
		guistate.put("button:imagebutton_skilltree_rebindtab2", imagebutton_skilltree_rebindtab2);
		this.addRenderableWidget(imagebutton_skilltree_rebindtab2);
		imagebutton_skilltree_rebindtab3 = new ImageButton(this.leftPos + 30, this.topPos + 15, 18, 7, 0, 0, 7, new ResourceLocation("jojohe:textures/screens/atlas/imagebutton_skilltree_rebindtab3.png"), 18, 14, e -> {
		});
		guistate.put("button:imagebutton_skilltree_rebindtab3", imagebutton_skilltree_rebindtab3);
		this.addRenderableWidget(imagebutton_skilltree_rebindtab3);
	}
}
