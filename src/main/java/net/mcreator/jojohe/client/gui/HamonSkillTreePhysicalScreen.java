package net.mcreator.jojohe.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.jojohe.world.inventory.HamonSkillTreePhysicalMenu;
import net.mcreator.jojohe.procedures.ReturnZoomPunchUnlockedProcedure;
import net.mcreator.jojohe.procedures.ReturnZoomPunchLockedProcedure;
import net.mcreator.jojohe.procedures.ReturnTornadoOverdriveUnlockedProcedure;
import net.mcreator.jojohe.procedures.ReturnTornadoOverdriveLockedProcedure;
import net.mcreator.jojohe.procedures.ReturnThunderSplitUnlockedProcedure;
import net.mcreator.jojohe.procedures.ReturnThunderSplitLockedProcedure;
import net.mcreator.jojohe.procedures.ReturnSunlightYellowUnlockedProcedure;
import net.mcreator.jojohe.procedures.ReturnSunlightYellowLockedProcedure;
import net.mcreator.jojohe.procedures.ReturnSendoWaveKickUnlockedProcedure;
import net.mcreator.jojohe.procedures.ReturnSendoWaveKickLockedProcedure;
import net.mcreator.jojohe.procedures.ReturnRebuffOverdriveUnlockedProcedure;
import net.mcreator.jojohe.procedures.ReturnOverdriveUnlockedProcedure;
import net.mcreator.jojohe.procedures.ReturnOverdriveLockedProcedure;
import net.mcreator.jojohe.procedures.ReturnOverdriveBarrageUnlockedProcedure;
import net.mcreator.jojohe.procedures.ReturnOverdriveBarrageLockedProcedure;
import net.mcreator.jojohe.procedures.ReturnGroundRippleUnlockedProcedure;
import net.mcreator.jojohe.procedures.ReturnGroundRippleLockedProcedure;
import net.mcreator.jojohe.network.HamonSkillTreePhysicalButtonMessage;
import net.mcreator.jojohe.JojoheMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class HamonSkillTreePhysicalScreen extends AbstractContainerScreen<HamonSkillTreePhysicalMenu> {
	private final static HashMap<String, Object> guistate = HamonSkillTreePhysicalMenu.guistate;
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
	ImageButton imagebutton_skilltree_rebindtab7;
	ImageButton imagebutton_skilltree_rebindtab8;
	ImageButton imagebutton_skilltree_lock;
	ImageButton imagebutton_skilltree_lock1;
	ImageButton imagebutton_skilltree_lock2;
	ImageButton imagebutton_skilltree_lock3;
	ImageButton imagebutton_skilltree_lock4;
	ImageButton imagebutton_skilltree_lock5;
	ImageButton imagebutton_skilltree_lock6;
	ImageButton imagebutton_skilltree_lock7;

	public HamonSkillTreePhysicalScreen(HamonSkillTreePhysicalMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("jojohe:textures/screens/hamon_skill_tree_physical.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + -146 && mouseX < leftPos + -122 && mouseY > topPos + -12 && mouseY < topPos + 12)
			guiGraphics.renderTooltip(font, Component.translatable("gui.jojohe.hamon_skill_tree_physical.tooltip_wip"), mouseX, mouseY);
		if (mouseX > leftPos + 30 && mouseX < leftPos + 43 && mouseY > topPos + -107 && mouseY < topPos + -88)
			guiGraphics.renderTooltip(font, Component.translatable("gui.jojohe.hamon_skill_tree_physical.tooltip_ranged"), mouseX, mouseY);
		if (mouseX > leftPos + -44 && mouseX < leftPos + -31 && mouseY > topPos + -107 && mouseY < topPos + -88)
			guiGraphics.renderTooltip(font, Component.translatable("gui.jojohe.hamon_skill_tree_physical.tooltip_movement"), mouseX, mouseY);
		if (ReturnZoomPunchLockedProcedure.execute(entity))
			if (mouseX > leftPos + -13 && mouseX < leftPos + 11 && mouseY > topPos + -12 && mouseY < topPos + 12)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojohe.hamon_skill_tree_physical.tooltip_zoom_punch_0_willpower_0_skil"), mouseX, mouseY);
		if (ReturnOverdriveBarrageLockedProcedure.execute(entity))
			if (mouseX > leftPos + -52 && mouseX < leftPos + -28 && mouseY > topPos + 27 && mouseY < topPos + 51)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojohe.hamon_skill_tree_physical.tooltip_overdrive_barrage_0_willpower"), mouseX, mouseY);
		if (ReturnThunderSplitLockedProcedure.execute(entity))
			if (mouseX > leftPos + 27 && mouseX < leftPos + 51 && mouseY > topPos + -51 && mouseY < topPos + -27)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojohe.hamon_skill_tree_physical.tooltip_thunder_split_attack_0_willpow"), mouseX, mouseY);
		if (ReturnGroundRippleLockedProcedure.execute(entity))
			if (mouseX > leftPos + -52 && mouseX < leftPos + -28 && mouseY > topPos + -51 && mouseY < topPos + -27)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojohe.hamon_skill_tree_physical.tooltip_ground_ripple_0_willpower_0_s"), mouseX, mouseY);
		if (ReturnSunlightYellowLockedProcedure.execute(entity))
			if (mouseX > leftPos + 121 && mouseX < leftPos + 145 && mouseY > topPos + -12 && mouseY < topPos + 12)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojohe.hamon_skill_tree_physical.tooltip_sunlight_yellow_overdrive_0_wi"), mouseX, mouseY);
		if (ReturnSendoWaveKickLockedProcedure.execute(entity))
			if (mouseX > leftPos + 66 && mouseX < leftPos + 90 && mouseY > topPos + -12 && mouseY < topPos + 12)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojohe.hamon_skill_tree_physical.tooltip_sendo_wave_kick_0_willpower_0"), mouseX, mouseY);
		if (ReturnOverdriveLockedProcedure.execute(entity))
			if (mouseX > leftPos + 27 && mouseX < leftPos + 51 && mouseY > topPos + 27 && mouseY < topPos + 51)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojohe.hamon_skill_tree_physical.tooltip_overdrive_0_willpower_0_skill"), mouseX, mouseY);
		if (ReturnTornadoOverdriveLockedProcedure.execute(entity))
			if (mouseX > leftPos + -91 && mouseX < leftPos + -67 && mouseY > topPos + -12 && mouseY < topPos + 12)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojohe.hamon_skill_tree_physical.tooltip_tornado_overdrive_0_willpower"), mouseX, mouseY);
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

		guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/skilltree_icon.png"), this.leftPos + 104, this.topPos + -29, 0, 0, 58, 58, 58, 58);

		guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/skilltree_icon.png"), this.leftPos + 10, this.topPos + -68, 0, 0, 58, 58, 58, 58);

		guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/skilltree_icon.png"), this.leftPos + -163, this.topPos + -29, 0, 0, 58, 58, 58, 58);

		guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/skilltree_icon.png"), this.leftPos + -69, this.topPos + 10, 0, 0, 58, 58, 58, 58);

		guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/skilltree_icon.png"), this.leftPos + 49, this.topPos + -29, 0, 0, 58, 58, 58, 58);

		guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/skilltree_lock.png"), this.leftPos + -145, this.topPos + -13, 0, 0, 22, 26, 22, 26);

		guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/skilltree_physical.png"), this.leftPos + -33, this.topPos + -107, 0, 0, 65, 19, 65, 19);

		if (ReturnZoomPunchUnlockedProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_zoom_punch.png"), this.leftPos + -17, this.topPos + -16, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnSunlightYellowUnlockedProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_sunlight_yellow.png"), this.leftPos + 117, this.topPos + -16, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnOverdriveBarrageUnlockedProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_overdrive_barrage.png"), this.leftPos + -56, this.topPos + 23, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnThunderSplitUnlockedProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_thunder_split.png"), this.leftPos + 23, this.topPos + -55, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnGroundRippleUnlockedProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_ground_ripple.png"), this.leftPos + -56, this.topPos + -55, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnOverdriveUnlockedProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_overdrive.png"), this.leftPos + 23, this.topPos + 23, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnSendoWaveKickUnlockedProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_sendo_kick.png"), this.leftPos + 62, this.topPos + -16, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnTornadoOverdriveUnlockedProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_tornado_overdrive.png"), this.leftPos + -95, this.topPos + -16, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnRebuffOverdriveUnlockedProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_rebuff_overdrive.png"), this.leftPos + -150, this.topPos + -16, 0, 0, 32, 32, 32, 32);
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
		imagebutton_guiarrow_left = new ImageButton(this.leftPos + -44, this.topPos + -107, 13, 19, 0, 0, 19, new ResourceLocation("jojohe:textures/screens/atlas/imagebutton_guiarrow_left.png"), 13, 38, e -> {
			if (true) {
				JojoheMod.PACKET_HANDLER.sendToServer(new HamonSkillTreePhysicalButtonMessage(0, x, y, z));
				HamonSkillTreePhysicalButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_guiarrow_left", imagebutton_guiarrow_left);
		this.addRenderableWidget(imagebutton_guiarrow_left);
		imagebutton_gui_arrow = new ImageButton(this.leftPos + 30, this.topPos + -107, 13, 19, 0, 0, 19, new ResourceLocation("jojohe:textures/screens/atlas/imagebutton_gui_arrow.png"), 13, 38, e -> {
			if (true) {
				JojoheMod.PACKET_HANDLER.sendToServer(new HamonSkillTreePhysicalButtonMessage(1, x, y, z));
				HamonSkillTreePhysicalButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_gui_arrow", imagebutton_gui_arrow);
		this.addRenderableWidget(imagebutton_gui_arrow);
		imagebutton_stat_guibutton = new ImageButton(this.leftPos + -12, this.topPos + 28, 22, 22, 0, 0, 22, new ResourceLocation("jojohe:textures/screens/atlas/imagebutton_stat_guibutton.png"), 22, 44, e -> {
			if (true) {
				JojoheMod.PACKET_HANDLER.sendToServer(new HamonSkillTreePhysicalButtonMessage(2, x, y, z));
				HamonSkillTreePhysicalButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_stat_guibutton", imagebutton_stat_guibutton);
		this.addRenderableWidget(imagebutton_stat_guibutton);
		imagebutton_skilltree_rebindtab = new ImageButton(this.leftPos + -10, this.topPos + 15, 18, 7, 0, 0, 7, new ResourceLocation("jojohe:textures/screens/atlas/imagebutton_skilltree_rebindtab.png"), 18, 14, e -> {
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnZoomPunchUnlockedProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilltree_rebindtab", imagebutton_skilltree_rebindtab);
		this.addRenderableWidget(imagebutton_skilltree_rebindtab);
		imagebutton_skilltree_rebindtab1 = new ImageButton(this.leftPos + 30, this.topPos + -24, 18, 7, 0, 0, 7, new ResourceLocation("jojohe:textures/screens/atlas/imagebutton_skilltree_rebindtab1.png"), 18, 14, e -> {
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnThunderSplitUnlockedProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilltree_rebindtab1", imagebutton_skilltree_rebindtab1);
		this.addRenderableWidget(imagebutton_skilltree_rebindtab1);
		imagebutton_skilltree_rebindtab2 = new ImageButton(this.leftPos + -49, this.topPos + -24, 18, 7, 0, 0, 7, new ResourceLocation("jojohe:textures/screens/atlas/imagebutton_skilltree_rebindtab2.png"), 18, 14, e -> {
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnGroundRippleUnlockedProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilltree_rebindtab2", imagebutton_skilltree_rebindtab2);
		this.addRenderableWidget(imagebutton_skilltree_rebindtab2);
		imagebutton_skilltree_rebindtab3 = new ImageButton(this.leftPos + -49, this.topPos + 54, 18, 7, 0, 0, 7, new ResourceLocation("jojohe:textures/screens/atlas/imagebutton_skilltree_rebindtab3.png"), 18, 14, e -> {
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnOverdriveBarrageUnlockedProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilltree_rebindtab3", imagebutton_skilltree_rebindtab3);
		this.addRenderableWidget(imagebutton_skilltree_rebindtab3);
		imagebutton_skilltree_rebindtab4 = new ImageButton(this.leftPos + 30, this.topPos + 54, 18, 7, 0, 0, 7, new ResourceLocation("jojohe:textures/screens/atlas/imagebutton_skilltree_rebindtab4.png"), 18, 14, e -> {
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnOverdriveUnlockedProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilltree_rebindtab4", imagebutton_skilltree_rebindtab4);
		this.addRenderableWidget(imagebutton_skilltree_rebindtab4);
		imagebutton_skilltree_rebindtab5 = new ImageButton(this.leftPos + 69, this.topPos + 15, 18, 7, 0, 0, 7, new ResourceLocation("jojohe:textures/screens/atlas/imagebutton_skilltree_rebindtab5.png"), 18, 14, e -> {
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnSendoWaveKickUnlockedProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilltree_rebindtab5", imagebutton_skilltree_rebindtab5);
		this.addRenderableWidget(imagebutton_skilltree_rebindtab5);
		imagebutton_skilltree_rebindtab6 = new ImageButton(this.leftPos + -88, this.topPos + 15, 18, 7, 0, 0, 7, new ResourceLocation("jojohe:textures/screens/atlas/imagebutton_skilltree_rebindtab6.png"), 18, 14, e -> {
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnTornadoOverdriveUnlockedProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilltree_rebindtab6", imagebutton_skilltree_rebindtab6);
		this.addRenderableWidget(imagebutton_skilltree_rebindtab6);
		imagebutton_skilltree_rebindtab7 = new ImageButton(this.leftPos + -143, this.topPos + 15, 18, 7, 0, 0, 7, new ResourceLocation("jojohe:textures/screens/atlas/imagebutton_skilltree_rebindtab7.png"), 18, 14, e -> {
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnRebuffOverdriveUnlockedProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilltree_rebindtab7", imagebutton_skilltree_rebindtab7);
		this.addRenderableWidget(imagebutton_skilltree_rebindtab7);
		imagebutton_skilltree_rebindtab8 = new ImageButton(this.leftPos + 124, this.topPos + 15, 18, 7, 0, 0, 7, new ResourceLocation("jojohe:textures/screens/atlas/imagebutton_skilltree_rebindtab8.png"), 18, 14, e -> {
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnSunlightYellowUnlockedProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilltree_rebindtab8", imagebutton_skilltree_rebindtab8);
		this.addRenderableWidget(imagebutton_skilltree_rebindtab8);
		imagebutton_skilltree_lock = new ImageButton(this.leftPos + -12, this.topPos + -13, 22, 26, 0, 0, 26, new ResourceLocation("jojohe:textures/screens/atlas/imagebutton_skilltree_lock.png"), 22, 52, e -> {
			if (ReturnZoomPunchLockedProcedure.execute(entity)) {
				JojoheMod.PACKET_HANDLER.sendToServer(new HamonSkillTreePhysicalButtonMessage(12, x, y, z));
				HamonSkillTreePhysicalButtonMessage.handleButtonAction(entity, 12, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnZoomPunchLockedProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilltree_lock", imagebutton_skilltree_lock);
		this.addRenderableWidget(imagebutton_skilltree_lock);
		imagebutton_skilltree_lock1 = new ImageButton(this.leftPos + 28, this.topPos + -52, 22, 26, 0, 0, 26, new ResourceLocation("jojohe:textures/screens/atlas/imagebutton_skilltree_lock1.png"), 22, 52, e -> {
			if (ReturnThunderSplitLockedProcedure.execute(entity)) {
				JojoheMod.PACKET_HANDLER.sendToServer(new HamonSkillTreePhysicalButtonMessage(13, x, y, z));
				HamonSkillTreePhysicalButtonMessage.handleButtonAction(entity, 13, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnThunderSplitLockedProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilltree_lock1", imagebutton_skilltree_lock1);
		this.addRenderableWidget(imagebutton_skilltree_lock1);
		imagebutton_skilltree_lock2 = new ImageButton(this.leftPos + -51, this.topPos + -52, 22, 26, 0, 0, 26, new ResourceLocation("jojohe:textures/screens/atlas/imagebutton_skilltree_lock2.png"), 22, 52, e -> {
			if (ReturnGroundRippleLockedProcedure.execute(entity)) {
				JojoheMod.PACKET_HANDLER.sendToServer(new HamonSkillTreePhysicalButtonMessage(14, x, y, z));
				HamonSkillTreePhysicalButtonMessage.handleButtonAction(entity, 14, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnGroundRippleLockedProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilltree_lock2", imagebutton_skilltree_lock2);
		this.addRenderableWidget(imagebutton_skilltree_lock2);
		imagebutton_skilltree_lock3 = new ImageButton(this.leftPos + -51, this.topPos + 26, 22, 26, 0, 0, 26, new ResourceLocation("jojohe:textures/screens/atlas/imagebutton_skilltree_lock3.png"), 22, 52, e -> {
			if (ReturnOverdriveBarrageLockedProcedure.execute(entity)) {
				JojoheMod.PACKET_HANDLER.sendToServer(new HamonSkillTreePhysicalButtonMessage(15, x, y, z));
				HamonSkillTreePhysicalButtonMessage.handleButtonAction(entity, 15, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnOverdriveBarrageLockedProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilltree_lock3", imagebutton_skilltree_lock3);
		this.addRenderableWidget(imagebutton_skilltree_lock3);
		imagebutton_skilltree_lock4 = new ImageButton(this.leftPos + 122, this.topPos + -13, 22, 26, 0, 0, 26, new ResourceLocation("jojohe:textures/screens/atlas/imagebutton_skilltree_lock4.png"), 22, 52, e -> {
			if (ReturnSunlightYellowLockedProcedure.execute(entity)) {
				JojoheMod.PACKET_HANDLER.sendToServer(new HamonSkillTreePhysicalButtonMessage(16, x, y, z));
				HamonSkillTreePhysicalButtonMessage.handleButtonAction(entity, 16, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnSunlightYellowLockedProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilltree_lock4", imagebutton_skilltree_lock4);
		this.addRenderableWidget(imagebutton_skilltree_lock4);
		imagebutton_skilltree_lock5 = new ImageButton(this.leftPos + 28, this.topPos + 26, 22, 26, 0, 0, 26, new ResourceLocation("jojohe:textures/screens/atlas/imagebutton_skilltree_lock5.png"), 22, 52, e -> {
			if (ReturnOverdriveLockedProcedure.execute(entity)) {
				JojoheMod.PACKET_HANDLER.sendToServer(new HamonSkillTreePhysicalButtonMessage(17, x, y, z));
				HamonSkillTreePhysicalButtonMessage.handleButtonAction(entity, 17, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnOverdriveLockedProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilltree_lock5", imagebutton_skilltree_lock5);
		this.addRenderableWidget(imagebutton_skilltree_lock5);
		imagebutton_skilltree_lock6 = new ImageButton(this.leftPos + 67, this.topPos + -13, 22, 26, 0, 0, 26, new ResourceLocation("jojohe:textures/screens/atlas/imagebutton_skilltree_lock6.png"), 22, 52, e -> {
			if (ReturnSendoWaveKickLockedProcedure.execute(entity)) {
				JojoheMod.PACKET_HANDLER.sendToServer(new HamonSkillTreePhysicalButtonMessage(18, x, y, z));
				HamonSkillTreePhysicalButtonMessage.handleButtonAction(entity, 18, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnSendoWaveKickLockedProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilltree_lock6", imagebutton_skilltree_lock6);
		this.addRenderableWidget(imagebutton_skilltree_lock6);
		imagebutton_skilltree_lock7 = new ImageButton(this.leftPos + -90, this.topPos + -13, 22, 26, 0, 0, 26, new ResourceLocation("jojohe:textures/screens/atlas/imagebutton_skilltree_lock7.png"), 22, 52, e -> {
			if (ReturnTornadoOverdriveLockedProcedure.execute(entity)) {
				JojoheMod.PACKET_HANDLER.sendToServer(new HamonSkillTreePhysicalButtonMessage(19, x, y, z));
				HamonSkillTreePhysicalButtonMessage.handleButtonAction(entity, 19, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnTornadoOverdriveLockedProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilltree_lock7", imagebutton_skilltree_lock7);
		this.addRenderableWidget(imagebutton_skilltree_lock7);
	}
}
