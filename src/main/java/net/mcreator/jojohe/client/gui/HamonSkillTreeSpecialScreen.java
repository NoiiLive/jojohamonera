package net.mcreator.jojohe.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.jojohe.world.inventory.HamonSkillTreeSpecialMenu;
import net.mcreator.jojohe.procedures.ReturnSendoRippleUnlockedProcedure;
import net.mcreator.jojohe.procedures.ReturnSendoRippleLockedProcedure;
import net.mcreator.jojohe.procedures.ReturnScarletOverdriveUnlockedProcedure;
import net.mcreator.jojohe.procedures.ReturnScarletOverdriveLockedProcedure;
import net.mcreator.jojohe.procedures.ReturnMetalSilverUnlockedProcedure;
import net.mcreator.jojohe.procedures.ReturnMetalSilverLockedProcedure;
import net.mcreator.jojohe.procedures.ReturnHamonHairUnlockedProcedure;
import net.mcreator.jojohe.procedures.ReturnHamonBeatOverdriveUnlockedProcedure;
import net.mcreator.jojohe.procedures.ReturnBubbleLensesUnlockedProcedure;
import net.mcreator.jojohe.procedures.ReturnBubbleBarrierUnlockedProcedure;
import net.mcreator.jojohe.network.HamonSkillTreeSpecialButtonMessage;
import net.mcreator.jojohe.JojoheMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class HamonSkillTreeSpecialScreen extends AbstractContainerScreen<HamonSkillTreeSpecialMenu> {
	private final static HashMap<String, Object> guistate = HamonSkillTreeSpecialMenu.guistate;
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
	ImageButton imagebutton_skilltree_rebindtab4;
	ImageButton imagebutton_skilltree_rebindtab5;
	ImageButton imagebutton_skilltree_rebindtab6;
	ImageButton imagebutton_skilltree_lock;
	ImageButton imagebutton_skilltree_lock1;
	ImageButton imagebutton_skilltree_lock2;

	public HamonSkillTreeSpecialScreen(HamonSkillTreeSpecialMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("jojohe:textures/screens/hamon_skill_tree_special.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + -52 && mouseX < leftPos + -28 && mouseY > topPos + -51 && mouseY < topPos + -27)
			guiGraphics.renderTooltip(font, Component.translatable("gui.jojohe.hamon_skill_tree_special.tooltip_wip_not_implemented"), mouseX, mouseY);
		if (mouseX > leftPos + -91 && mouseX < leftPos + -67 && mouseY > topPos + -12 && mouseY < topPos + 12)
			guiGraphics.renderTooltip(font, Component.translatable("gui.jojohe.hamon_skill_tree_special.tooltip_wip_not_implemented1"), mouseX, mouseY);
		if (mouseX > leftPos + 27 && mouseX < leftPos + 51 && mouseY > topPos + 27 && mouseY < topPos + 51)
			guiGraphics.renderTooltip(font, Component.translatable("gui.jojohe.hamon_skill_tree_special.tooltip_wip_not_implemented2"), mouseX, mouseY);
		if (mouseX > leftPos + 66 && mouseX < leftPos + 90 && mouseY > topPos + -12 && mouseY < topPos + 12)
			guiGraphics.renderTooltip(font, Component.translatable("gui.jojohe.hamon_skill_tree_special.tooltip_wip_not_implemented3"), mouseX, mouseY);
		if (mouseX > leftPos + -41 && mouseX < leftPos + -28 && mouseY > topPos + -107 && mouseY < topPos + -88)
			guiGraphics.renderTooltip(font, Component.translatable("gui.jojohe.hamon_skill_tree_special.tooltip_ranged"), mouseX, mouseY);
		if (mouseX > leftPos + 27 && mouseX < leftPos + 40 && mouseY > topPos + -107 && mouseY < topPos + -88)
			guiGraphics.renderTooltip(font, Component.translatable("gui.jojohe.hamon_skill_tree_special.tooltip_support"), mouseX, mouseY);
		if (ReturnScarletOverdriveLockedProcedure.execute(entity))
			if (mouseX > leftPos + 27 && mouseX < leftPos + 51 && mouseY > topPos + -51 && mouseY < topPos + -27)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojohe.hamon_skill_tree_special.tooltip_scarlet_overdrive_0_willpower"), mouseX, mouseY);
		if (ReturnSendoRippleLockedProcedure.execute(entity))
			if (mouseX > leftPos + -13 && mouseX < leftPos + 11 && mouseY > topPos + -12 && mouseY < topPos + 12)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojohe.hamon_skill_tree_special.tooltip_sendo_ripple_overdrive_0_willp"), mouseX, mouseY);
		if (ReturnMetalSilverLockedProcedure.execute(entity))
			if (mouseX > leftPos + -52 && mouseX < leftPos + -28 && mouseY > topPos + 27 && mouseY < topPos + 51)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojohe.hamon_skill_tree_special.tooltip_metal_silver_overdrive_0_willp"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/skilltree_icon.png"), this.leftPos + -30, this.topPos + -29, 0, 0, 58, 58, 58, 58);

		guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/skilltree_icon.png"), this.leftPos + -108, this.topPos + -29, 0, 0, 58, 58, 58, 58);

		guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/skilltree_icon.png"), this.leftPos + -69, this.topPos + -68, 0, 0, 58, 58, 58, 58);

		guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/skilltree_icon.png"), this.leftPos + 10, this.topPos + 10, 0, 0, 58, 58, 58, 58);

		guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/skilltree_icon.png"), this.leftPos + 10, this.topPos + -68, 0, 0, 58, 58, 58, 58);

		guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/skilltree_icon.png"), this.leftPos + -69, this.topPos + 10, 0, 0, 58, 58, 58, 58);

		guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/skilltree_icon.png"), this.leftPos + 49, this.topPos + -29, 0, 0, 58, 58, 58, 58);

		guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/skilltree_lock.png"), this.leftPos + -51, this.topPos + -52, 0, 0, 22, 26, 22, 26);

		guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/skilltree_lock.png"), this.leftPos + -90, this.topPos + -13, 0, 0, 22, 26, 22, 26);

		guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/skilltree_lock.png"), this.leftPos + 28, this.topPos + 26, 0, 0, 22, 26, 22, 26);

		guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/skilltree_lock.png"), this.leftPos + 67, this.topPos + -13, 0, 0, 22, 26, 22, 26);

		guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/skilltree_special.png"), this.leftPos + -33, this.topPos + -107, 0, 0, 65, 19, 65, 19);

		if (ReturnSendoRippleUnlockedProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_sendo_overdrive.png"), this.leftPos + -17, this.topPos + -16, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnScarletOverdriveUnlockedProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_scarlet_overdrive.png"), this.leftPos + 23, this.topPos + -55, 0, 0, 32, 32, 32, 32);
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
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_guiarrow_left = new ImageButton(this.leftPos + -41, this.topPos + -107, 13, 19, 0, 0, 19, new ResourceLocation("jojohe:textures/screens/atlas/imagebutton_guiarrow_left.png"), 13, 38, e -> {
			if (true) {
				JojoheMod.PACKET_HANDLER.sendToServer(new HamonSkillTreeSpecialButtonMessage(0, x, y, z));
				HamonSkillTreeSpecialButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_guiarrow_left", imagebutton_guiarrow_left);
		this.addRenderableWidget(imagebutton_guiarrow_left);
		imagebutton_gui_arrow = new ImageButton(this.leftPos + 27, this.topPos + -107, 13, 19, 0, 0, 19, new ResourceLocation("jojohe:textures/screens/atlas/imagebutton_gui_arrow.png"), 13, 38, e -> {
			if (true) {
				JojoheMod.PACKET_HANDLER.sendToServer(new HamonSkillTreeSpecialButtonMessage(1, x, y, z));
				HamonSkillTreeSpecialButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_gui_arrow", imagebutton_gui_arrow);
		this.addRenderableWidget(imagebutton_gui_arrow);
		imagebutton_stat_guibutton = new ImageButton(this.leftPos + -12, this.topPos + 28, 22, 22, 0, 0, 22, new ResourceLocation("jojohe:textures/screens/atlas/imagebutton_stat_guibutton.png"), 22, 44, e -> {
			if (true) {
				JojoheMod.PACKET_HANDLER.sendToServer(new HamonSkillTreeSpecialButtonMessage(2, x, y, z));
				HamonSkillTreeSpecialButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_stat_guibutton", imagebutton_stat_guibutton);
		this.addRenderableWidget(imagebutton_stat_guibutton);
		imagebutton_skilltree_rebindtab = new ImageButton(this.leftPos + -10, this.topPos + 15, 18, 7, 0, 0, 7, new ResourceLocation("jojohe:textures/screens/atlas/imagebutton_skilltree_rebindtab.png"), 18, 14, e -> {
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnSendoRippleUnlockedProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilltree_rebindtab", imagebutton_skilltree_rebindtab);
		this.addRenderableWidget(imagebutton_skilltree_rebindtab);
		imagebutton_skilltree_rebindtab1 = new ImageButton(this.leftPos + 30, this.topPos + -24, 18, 7, 0, 0, 7, new ResourceLocation("jojohe:textures/screens/atlas/imagebutton_skilltree_rebindtab1.png"), 18, 14, e -> {
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnScarletOverdriveUnlockedProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilltree_rebindtab1", imagebutton_skilltree_rebindtab1);
		this.addRenderableWidget(imagebutton_skilltree_rebindtab1);
		imagebutton_skilltree_rebindtab2 = new ImageButton(this.leftPos + -49, this.topPos + 54, 18, 7, 0, 0, 7, new ResourceLocation("jojohe:textures/screens/atlas/imagebutton_skilltree_rebindtab2.png"), 18, 14, e -> {
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnMetalSilverUnlockedProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilltree_rebindtab2", imagebutton_skilltree_rebindtab2);
		this.addRenderableWidget(imagebutton_skilltree_rebindtab2);
		imagebutton_skilltree_rebindtab3 = new ImageButton(this.leftPos + -49, this.topPos + -24, 18, 7, 0, 0, 7, new ResourceLocation("jojohe:textures/screens/atlas/imagebutton_skilltree_rebindtab3.png"), 18, 14, e -> {
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnHamonBeatOverdriveUnlockedProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilltree_rebindtab3", imagebutton_skilltree_rebindtab3);
		this.addRenderableWidget(imagebutton_skilltree_rebindtab3);
		imagebutton_skilltree_rebindtab4 = new ImageButton(this.leftPos + -88, this.topPos + 15, 18, 7, 0, 0, 7, new ResourceLocation("jojohe:textures/screens/atlas/imagebutton_skilltree_rebindtab4.png"), 18, 14, e -> {
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnHamonHairUnlockedProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilltree_rebindtab4", imagebutton_skilltree_rebindtab4);
		this.addRenderableWidget(imagebutton_skilltree_rebindtab4);
		imagebutton_skilltree_rebindtab5 = new ImageButton(this.leftPos + 30, this.topPos + 54, 18, 7, 0, 0, 7, new ResourceLocation("jojohe:textures/screens/atlas/imagebutton_skilltree_rebindtab5.png"), 18, 14, e -> {
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnBubbleLensesUnlockedProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilltree_rebindtab5", imagebutton_skilltree_rebindtab5);
		this.addRenderableWidget(imagebutton_skilltree_rebindtab5);
		imagebutton_skilltree_rebindtab6 = new ImageButton(this.leftPos + 69, this.topPos + 15, 18, 7, 0, 0, 7, new ResourceLocation("jojohe:textures/screens/atlas/imagebutton_skilltree_rebindtab6.png"), 18, 14, e -> {
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnBubbleBarrierUnlockedProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilltree_rebindtab6", imagebutton_skilltree_rebindtab6);
		this.addRenderableWidget(imagebutton_skilltree_rebindtab6);
		imagebutton_skilltree_lock = new ImageButton(this.leftPos + 28, this.topPos + -52, 22, 26, 0, 0, 26, new ResourceLocation("jojohe:textures/screens/atlas/imagebutton_skilltree_lock.png"), 22, 52, e -> {
			if (ReturnScarletOverdriveLockedProcedure.execute(entity)) {
				JojoheMod.PACKET_HANDLER.sendToServer(new HamonSkillTreeSpecialButtonMessage(10, x, y, z));
				HamonSkillTreeSpecialButtonMessage.handleButtonAction(entity, 10, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnScarletOverdriveLockedProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilltree_lock", imagebutton_skilltree_lock);
		this.addRenderableWidget(imagebutton_skilltree_lock);
		imagebutton_skilltree_lock1 = new ImageButton(this.leftPos + -12, this.topPos + -13, 22, 26, 0, 0, 26, new ResourceLocation("jojohe:textures/screens/atlas/imagebutton_skilltree_lock1.png"), 22, 52, e -> {
			if (ReturnSendoRippleLockedProcedure.execute(entity)) {
				JojoheMod.PACKET_HANDLER.sendToServer(new HamonSkillTreeSpecialButtonMessage(11, x, y, z));
				HamonSkillTreeSpecialButtonMessage.handleButtonAction(entity, 11, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnSendoRippleLockedProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilltree_lock1", imagebutton_skilltree_lock1);
		this.addRenderableWidget(imagebutton_skilltree_lock1);
		imagebutton_skilltree_lock2 = new ImageButton(this.leftPos + -51, this.topPos + 26, 22, 26, 0, 0, 26, new ResourceLocation("jojohe:textures/screens/atlas/imagebutton_skilltree_lock2.png"), 22, 52, e -> {
			if (ReturnMetalSilverLockedProcedure.execute(entity)) {
				JojoheMod.PACKET_HANDLER.sendToServer(new HamonSkillTreeSpecialButtonMessage(12, x, y, z));
				HamonSkillTreeSpecialButtonMessage.handleButtonAction(entity, 12, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnMetalSilverLockedProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilltree_lock2", imagebutton_skilltree_lock2);
		this.addRenderableWidget(imagebutton_skilltree_lock2);
	}
}
