package net.mcreator.jojohe.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.jojohe.world.inventory.AbilityWheelHamonMenu;
import net.mcreator.jojohe.procedures.WheelSwitchDisplayProcedure;
import net.mcreator.jojohe.procedures.ReturnZoomPunchWheel9Procedure;
import net.mcreator.jojohe.procedures.ReturnZoomPunchWheel8Procedure;
import net.mcreator.jojohe.procedures.ReturnZoomPunchWheel7Procedure;
import net.mcreator.jojohe.procedures.ReturnZoomPunchWheel6Procedure;
import net.mcreator.jojohe.procedures.ReturnZoomPunchWheel5Procedure;
import net.mcreator.jojohe.procedures.ReturnZoomPunchWheel4Procedure;
import net.mcreator.jojohe.procedures.ReturnZoomPunchWheel3Procedure;
import net.mcreator.jojohe.procedures.ReturnZoomPunchWheel2Procedure;
import net.mcreator.jojohe.procedures.ReturnZoomPunchWheel1Procedure;
import net.mcreator.jojohe.procedures.ReturnWineCutterWheel9Procedure;
import net.mcreator.jojohe.procedures.ReturnWineCutterWheel8Procedure;
import net.mcreator.jojohe.procedures.ReturnWineCutterWheel7Procedure;
import net.mcreator.jojohe.procedures.ReturnWineCutterWheel6Procedure;
import net.mcreator.jojohe.procedures.ReturnWineCutterWheel5Procedure;
import net.mcreator.jojohe.procedures.ReturnWineCutterWheel4Procedure;
import net.mcreator.jojohe.procedures.ReturnWineCutterWheel3Procedure;
import net.mcreator.jojohe.procedures.ReturnWineCutterWheel2Procedure;
import net.mcreator.jojohe.procedures.ReturnWineCutterWheel1Procedure;
import net.mcreator.jojohe.procedures.ReturnThunderSplitWheel9Procedure;
import net.mcreator.jojohe.procedures.ReturnThunderSplitWheel8Procedure;
import net.mcreator.jojohe.procedures.ReturnThunderSplitWheel7Procedure;
import net.mcreator.jojohe.procedures.ReturnThunderSplitWheel6Procedure;
import net.mcreator.jojohe.procedures.ReturnThunderSplitWheel5Procedure;
import net.mcreator.jojohe.procedures.ReturnThunderSplitWheel4Procedure;
import net.mcreator.jojohe.procedures.ReturnThunderSplitWheel3Procedure;
import net.mcreator.jojohe.procedures.ReturnThunderSplitWheel2Procedure;
import net.mcreator.jojohe.procedures.ReturnThunderSplitWheel1Procedure;
import net.mcreator.jojohe.procedures.ReturnSunlightYellowWheel9Procedure;
import net.mcreator.jojohe.procedures.ReturnSunlightYellowWheel8Procedure;
import net.mcreator.jojohe.procedures.ReturnSunlightYellowWheel7Procedure;
import net.mcreator.jojohe.procedures.ReturnSunlightYellowWheel6Procedure;
import net.mcreator.jojohe.procedures.ReturnSunlightYellowWheel5Procedure;
import net.mcreator.jojohe.procedures.ReturnSunlightYellowWheel4Procedure;
import net.mcreator.jojohe.procedures.ReturnSunlightYellowWheel3Procedure;
import net.mcreator.jojohe.procedures.ReturnSunlightYellowWheel2Procedure;
import net.mcreator.jojohe.procedures.ReturnSunlightYellowWheel1Procedure;
import net.mcreator.jojohe.procedures.ReturnSendoRippleWheel9Procedure;
import net.mcreator.jojohe.procedures.ReturnSendoRippleWheel8Procedure;
import net.mcreator.jojohe.procedures.ReturnSendoRippleWheel7Procedure;
import net.mcreator.jojohe.procedures.ReturnSendoRippleWheel6Procedure;
import net.mcreator.jojohe.procedures.ReturnSendoRippleWheel5Procedure;
import net.mcreator.jojohe.procedures.ReturnSendoRippleWheel3Procedure;
import net.mcreator.jojohe.procedures.ReturnSendoRippleWheel2Procedure;
import net.mcreator.jojohe.procedures.ReturnSendoRippleWheel1Procedure;
import net.mcreator.jojohe.procedures.ReturnSendoRipple4Procedure;
import net.mcreator.jojohe.procedures.ReturnScarletOverdriveWheel9Procedure;
import net.mcreator.jojohe.procedures.ReturnScarletOverdriveWheel8Procedure;
import net.mcreator.jojohe.procedures.ReturnScarletOverdriveWheel7Procedure;
import net.mcreator.jojohe.procedures.ReturnScarletOverdriveWheel6Procedure;
import net.mcreator.jojohe.procedures.ReturnScarletOverdriveWheel5Procedure;
import net.mcreator.jojohe.procedures.ReturnScarletOverdriveWheel4Procedure;
import net.mcreator.jojohe.procedures.ReturnScarletOverdriveWheel3Procedure;
import net.mcreator.jojohe.procedures.ReturnScarletOverdriveWheel2Procedure;
import net.mcreator.jojohe.procedures.ReturnScarletOverdriveWheel1Procedure;
import net.mcreator.jojohe.procedures.ReturnOverdriveBarrageWheel9Procedure;
import net.mcreator.jojohe.procedures.ReturnOverdriveBarrageWheel8Procedure;
import net.mcreator.jojohe.procedures.ReturnOverdriveBarrageWheel7Procedure;
import net.mcreator.jojohe.procedures.ReturnOverdriveBarrageWheel6Procedure;
import net.mcreator.jojohe.procedures.ReturnOverdriveBarrageWheel5Procedure;
import net.mcreator.jojohe.procedures.ReturnOverdriveBarrageWheel4Procedure;
import net.mcreator.jojohe.procedures.ReturnOverdriveBarrageWheel3Procedure;
import net.mcreator.jojohe.procedures.ReturnOverdriveBarrageWheel2Procedure;
import net.mcreator.jojohe.procedures.ReturnOverdriveBarrageWheel1Procedure;
import net.mcreator.jojohe.procedures.ReturnHamonDashWheel9Procedure;
import net.mcreator.jojohe.procedures.ReturnHamonDashWheel8Procedure;
import net.mcreator.jojohe.procedures.ReturnHamonDashWheel7Procedure;
import net.mcreator.jojohe.procedures.ReturnHamonDashWheel6Procedure;
import net.mcreator.jojohe.procedures.ReturnHamonDashWheel5Procedure;
import net.mcreator.jojohe.procedures.ReturnHamonDashWheel4Procedure;
import net.mcreator.jojohe.procedures.ReturnHamonDashWheel3Procedure;
import net.mcreator.jojohe.procedures.ReturnHamonDashWheel2Procedure;
import net.mcreator.jojohe.procedures.ReturnHamonDashWheel1Procedure;
import net.mcreator.jojohe.procedures.ReturnGroundRippleWheel9Procedure;
import net.mcreator.jojohe.procedures.ReturnGroundRippleWheel8Procedure;
import net.mcreator.jojohe.procedures.ReturnGroundRippleWheel7Procedure;
import net.mcreator.jojohe.procedures.ReturnGroundRippleWheel6Procedure;
import net.mcreator.jojohe.procedures.ReturnGroundRippleWheel5Procedure;
import net.mcreator.jojohe.procedures.ReturnGroundRippleWheel4Procedure;
import net.mcreator.jojohe.procedures.ReturnGroundRippleWheel3Procedure;
import net.mcreator.jojohe.procedures.ReturnGroundRippleWheel2Procedure;
import net.mcreator.jojohe.procedures.ReturnGroundRippleWheel1Procedure;
import net.mcreator.jojohe.procedures.ReturnAfterimagesWheel9Procedure;
import net.mcreator.jojohe.procedures.ReturnAfterimagesWheel8Procedure;
import net.mcreator.jojohe.procedures.ReturnAfterimagesWheel7Procedure;
import net.mcreator.jojohe.procedures.ReturnAfterimagesWheel5Procedure;
import net.mcreator.jojohe.procedures.ReturnAfterimagesWheel4Procedure;
import net.mcreator.jojohe.procedures.ReturnAfterimagesWheel3Procedure;
import net.mcreator.jojohe.procedures.ReturnAfterimagesWheel2Procedure;
import net.mcreator.jojohe.procedures.ReturnAfterimagesWheel1Procedure;
import net.mcreator.jojohe.procedures.ReturnAbilitySlot9Procedure;
import net.mcreator.jojohe.procedures.ReturnAbilitySlot8Procedure;
import net.mcreator.jojohe.procedures.ReturnAbilitySlot7Procedure;
import net.mcreator.jojohe.procedures.ReturnAbilitySlot6Procedure;
import net.mcreator.jojohe.procedures.ReturnAbilitySlot5Procedure;
import net.mcreator.jojohe.procedures.ReturnAbilitySlot4Procedure;
import net.mcreator.jojohe.procedures.ReturnAbilitySlot3Procedure;
import net.mcreator.jojohe.procedures.ReturnAbilitySlot2Procedure;
import net.mcreator.jojohe.procedures.ReturnAbilitySlot1Procedure;
import net.mcreator.jojohe.network.AbilityWheelHamonButtonMessage;
import net.mcreator.jojohe.JojoheMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class AbilityWheelHamonScreen extends AbstractContainerScreen<AbilityWheelHamonMenu> {
	private final static HashMap<String, Object> guistate = AbilityWheelHamonMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_guiarrow_down;
	ImageButton imagebutton_blank_ability_selected;
	ImageButton imagebutton_blank_ability_selected1;
	ImageButton imagebutton_blank_ability_selected2;
	ImageButton imagebutton_blank_ability_selected3;
	ImageButton imagebutton_blank_ability_selected4;
	ImageButton imagebutton_blank_ability_selected5;
	ImageButton imagebutton_blank_ability_selected6;
	ImageButton imagebutton_blank_ability_selected7;
	ImageButton imagebutton_blank_ability_selected8;

	public AbilityWheelHamonScreen(AbilityWheelHamonMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("jojohe:textures/screens/ability_wheel_hamon.png");

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

		if (ReturnWineCutterWheel1Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_wine_cutter.png"), this.leftPos + -51, this.topPos + -49, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnWineCutterWheel2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_wine_cutter.png"), this.leftPos + -17, this.topPos + -49, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnWineCutterWheel3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_wine_cutter.png"), this.leftPos + 18, this.topPos + -49, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnWineCutterWheel4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_wine_cutter.png"), this.leftPos + -51, this.topPos + -15, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnWineCutterWheel5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_wine_cutter.png"), this.leftPos + -17, this.topPos + -15, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnWineCutterWheel6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_wine_cutter.png"), this.leftPos + 18, this.topPos + -15, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnWineCutterWheel7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_wine_cutter.png"), this.leftPos + -51, this.topPos + 19, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnWineCutterWheel8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_wine_cutter.png"), this.leftPos + -17, this.topPos + 19, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnWineCutterWheel9Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_wine_cutter.png"), this.leftPos + 18, this.topPos + 19, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnOverdriveBarrageWheel1Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_overdrive_barrage.png"), this.leftPos + -51, this.topPos + -49, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnOverdriveBarrageWheel2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_overdrive_barrage.png"), this.leftPos + -17, this.topPos + -49, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnOverdriveBarrageWheel3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_overdrive_barrage.png"), this.leftPos + 18, this.topPos + -49, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnOverdriveBarrageWheel4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_overdrive_barrage.png"), this.leftPos + -51, this.topPos + -15, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnOverdriveBarrageWheel5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_overdrive_barrage.png"), this.leftPos + -17, this.topPos + -15, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnOverdriveBarrageWheel6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_overdrive_barrage.png"), this.leftPos + 18, this.topPos + -15, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnOverdriveBarrageWheel7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_overdrive_barrage.png"), this.leftPos + -51, this.topPos + 19, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnOverdriveBarrageWheel8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_overdrive_barrage.png"), this.leftPos + -17, this.topPos + 19, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnOverdriveBarrageWheel9Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_overdrive_barrage.png"), this.leftPos + 18, this.topPos + 19, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnSendoRippleWheel1Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_sendo_overdrive.png"), this.leftPos + -51, this.topPos + -49, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnSendoRippleWheel2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_sendo_overdrive.png"), this.leftPos + -17, this.topPos + -49, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnSendoRippleWheel3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_sendo_overdrive.png"), this.leftPos + 18, this.topPos + -49, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnSendoRipple4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_sendo_overdrive.png"), this.leftPos + -51, this.topPos + -15, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnSendoRippleWheel5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_sendo_overdrive.png"), this.leftPos + -17, this.topPos + -15, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnSendoRippleWheel6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_sendo_overdrive.png"), this.leftPos + 18, this.topPos + -15, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnSendoRippleWheel7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_sendo_overdrive.png"), this.leftPos + -51, this.topPos + 19, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnSendoRippleWheel8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_sendo_overdrive.png"), this.leftPos + -17, this.topPos + 19, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnSendoRippleWheel9Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_sendo_overdrive.png"), this.leftPos + 18, this.topPos + 19, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnZoomPunchWheel1Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_zoom_punch.png"), this.leftPos + -51, this.topPos + -49, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnZoomPunchWheel2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_zoom_punch.png"), this.leftPos + -17, this.topPos + -49, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnZoomPunchWheel3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_zoom_punch.png"), this.leftPos + 18, this.topPos + -49, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnZoomPunchWheel4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_zoom_punch.png"), this.leftPos + -51, this.topPos + -15, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnZoomPunchWheel5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_zoom_punch.png"), this.leftPos + -17, this.topPos + -15, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnZoomPunchWheel6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_zoom_punch.png"), this.leftPos + 18, this.topPos + -15, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnZoomPunchWheel7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_zoom_punch.png"), this.leftPos + -51, this.topPos + 19, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnZoomPunchWheel8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_zoom_punch.png"), this.leftPos + -17, this.topPos + 19, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnZoomPunchWheel9Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_zoom_punch.png"), this.leftPos + 18, this.topPos + 19, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnScarletOverdriveWheel1Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_scarlet_overdrive.png"), this.leftPos + -51, this.topPos + -49, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnScarletOverdriveWheel2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_scarlet_overdrive.png"), this.leftPos + -17, this.topPos + -49, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnScarletOverdriveWheel3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_scarlet_overdrive.png"), this.leftPos + 18, this.topPos + -49, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnScarletOverdriveWheel4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_scarlet_overdrive.png"), this.leftPos + -51, this.topPos + -15, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnScarletOverdriveWheel5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_scarlet_overdrive.png"), this.leftPos + -17, this.topPos + -15, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnScarletOverdriveWheel6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_scarlet_overdrive.png"), this.leftPos + 18, this.topPos + -15, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnScarletOverdriveWheel7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_scarlet_overdrive.png"), this.leftPos + -51, this.topPos + 19, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnScarletOverdriveWheel8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_scarlet_overdrive.png"), this.leftPos + -17, this.topPos + 19, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnScarletOverdriveWheel9Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_scarlet_overdrive.png"), this.leftPos + 17, this.topPos + 19, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnSunlightYellowWheel1Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_sunlight_yellow.png"), this.leftPos + -51, this.topPos + -49, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnSunlightYellowWheel2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_sunlight_yellow.png"), this.leftPos + -17, this.topPos + -49, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnSunlightYellowWheel3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_sunlight_yellow.png"), this.leftPos + 18, this.topPos + -49, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnSunlightYellowWheel4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_sunlight_yellow.png"), this.leftPos + -51, this.topPos + -15, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnSunlightYellowWheel5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_sunlight_yellow.png"), this.leftPos + -17, this.topPos + -15, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnSunlightYellowWheel6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_sunlight_yellow.png"), this.leftPos + 18, this.topPos + -15, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnSunlightYellowWheel7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_sunlight_yellow.png"), this.leftPos + -51, this.topPos + 19, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnSunlightYellowWheel8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_sunlight_yellow.png"), this.leftPos + -17, this.topPos + 19, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnSunlightYellowWheel9Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_sunlight_yellow.png"), this.leftPos + 18, this.topPos + 19, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnGroundRippleWheel1Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_ground_ripple.png"), this.leftPos + -51, this.topPos + -49, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnGroundRippleWheel2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_ground_ripple.png"), this.leftPos + -17, this.topPos + -49, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnGroundRippleWheel3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_ground_ripple.png"), this.leftPos + 18, this.topPos + -49, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnGroundRippleWheel4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_ground_ripple.png"), this.leftPos + -51, this.topPos + -15, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnGroundRippleWheel5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_ground_ripple.png"), this.leftPos + -17, this.topPos + -15, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnGroundRippleWheel6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_ground_ripple.png"), this.leftPos + 18, this.topPos + -15, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnGroundRippleWheel7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_ground_ripple.png"), this.leftPos + -51, this.topPos + 19, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnGroundRippleWheel8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_ground_ripple.png"), this.leftPos + -17, this.topPos + 19, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnGroundRippleWheel9Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_ground_ripple.png"), this.leftPos + 18, this.topPos + 19, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnHamonDashWheel1Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_hamon_dash.png"), this.leftPos + -51, this.topPos + -49, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnHamonDashWheel2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_hamon_dash.png"), this.leftPos + -17, this.topPos + -49, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnHamonDashWheel3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_hamon_dash.png"), this.leftPos + 18, this.topPos + -49, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnHamonDashWheel4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_hamon_dash.png"), this.leftPos + -51, this.topPos + -15, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnHamonDashWheel5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_hamon_dash.png"), this.leftPos + -17, this.topPos + -15, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnHamonDashWheel6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_hamon_dash.png"), this.leftPos + 18, this.topPos + -15, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnHamonDashWheel7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_hamon_dash.png"), this.leftPos + -51, this.topPos + 19, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnHamonDashWheel8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_hamon_dash.png"), this.leftPos + -17, this.topPos + 19, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnHamonDashWheel9Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_hamon_dash.png"), this.leftPos + 18, this.topPos + 19, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnAfterimagesWheel1Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_afterimages.png"), this.leftPos + -51, this.topPos + -49, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnAfterimagesWheel2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_afterimages.png"), this.leftPos + -17, this.topPos + -49, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnAfterimagesWheel3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_afterimages.png"), this.leftPos + 18, this.topPos + -49, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnAfterimagesWheel4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_afterimages.png"), this.leftPos + -51, this.topPos + -15, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnAfterimagesWheel5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_afterimages.png"), this.leftPos + -17, this.topPos + -15, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnAfterimagesWheel5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_afterimages.png"), this.leftPos + 17, this.topPos + -15, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnAfterimagesWheel7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_afterimages.png"), this.leftPos + -51, this.topPos + 19, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnAfterimagesWheel8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_afterimages.png"), this.leftPos + -17, this.topPos + 19, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnAfterimagesWheel9Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_afterimages.png"), this.leftPos + 18, this.topPos + 19, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnThunderSplitWheel1Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_thunder_split.png"), this.leftPos + -51, this.topPos + -49, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnThunderSplitWheel2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_thunder_split.png"), this.leftPos + -17, this.topPos + -49, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnThunderSplitWheel3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_thunder_split.png"), this.leftPos + 18, this.topPos + -49, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnThunderSplitWheel4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_thunder_split.png"), this.leftPos + -51, this.topPos + -15, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnThunderSplitWheel5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_thunder_split.png"), this.leftPos + -17, this.topPos + -15, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnThunderSplitWheel6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_thunder_split.png"), this.leftPos + 18, this.topPos + -15, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnThunderSplitWheel7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_thunder_split.png"), this.leftPos + -51, this.topPos + 19, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnThunderSplitWheel8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_thunder_split.png"), this.leftPos + -17, this.topPos + 19, 0, 0, 32, 32, 32, 32);
		}
		if (ReturnThunderSplitWheel9Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojohe:textures/screens/hamon_thunder_split.png"), this.leftPos + 18, this.topPos + 19, 0, 0, 32, 32, 32, 32);
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
		imagebutton_guiarrow_down = new ImageButton(this.leftPos + -10, this.topPos + 55, 19, 13, 0, 0, 13, new ResourceLocation("jojohe:textures/screens/atlas/imagebutton_guiarrow_down.png"), 19, 26, e -> {
			if (WheelSwitchDisplayProcedure.execute(world, entity)) {
				JojoheMod.PACKET_HANDLER.sendToServer(new AbilityWheelHamonButtonMessage(0, x, y, z));
				AbilityWheelHamonButtonMessage.handleButtonAction(entity, 0, x, y, z);
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
		imagebutton_blank_ability_selected = new ImageButton(this.leftPos + -53, this.topPos + -51, 36, 36, 0, 0, 36, new ResourceLocation("jojohe:textures/screens/atlas/imagebutton_blank_ability_selected.png"), 36, 72, e -> {
			if (true) {
				JojoheMod.PACKET_HANDLER.sendToServer(new AbilityWheelHamonButtonMessage(1, x, y, z));
				AbilityWheelHamonButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_blank_ability_selected", imagebutton_blank_ability_selected);
		this.addRenderableWidget(imagebutton_blank_ability_selected);
		imagebutton_blank_ability_selected1 = new ImageButton(this.leftPos + -19, this.topPos + -51, 36, 36, 0, 0, 36, new ResourceLocation("jojohe:textures/screens/atlas/imagebutton_blank_ability_selected1.png"), 36, 72, e -> {
			if (true) {
				JojoheMod.PACKET_HANDLER.sendToServer(new AbilityWheelHamonButtonMessage(2, x, y, z));
				AbilityWheelHamonButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_blank_ability_selected1", imagebutton_blank_ability_selected1);
		this.addRenderableWidget(imagebutton_blank_ability_selected1);
		imagebutton_blank_ability_selected2 = new ImageButton(this.leftPos + 16, this.topPos + -51, 36, 36, 0, 0, 36, new ResourceLocation("jojohe:textures/screens/atlas/imagebutton_blank_ability_selected2.png"), 36, 72, e -> {
			if (true) {
				JojoheMod.PACKET_HANDLER.sendToServer(new AbilityWheelHamonButtonMessage(3, x, y, z));
				AbilityWheelHamonButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_blank_ability_selected2", imagebutton_blank_ability_selected2);
		this.addRenderableWidget(imagebutton_blank_ability_selected2);
		imagebutton_blank_ability_selected3 = new ImageButton(this.leftPos + -53, this.topPos + -17, 36, 36, 0, 0, 36, new ResourceLocation("jojohe:textures/screens/atlas/imagebutton_blank_ability_selected3.png"), 36, 72, e -> {
			if (true) {
				JojoheMod.PACKET_HANDLER.sendToServer(new AbilityWheelHamonButtonMessage(4, x, y, z));
				AbilityWheelHamonButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_blank_ability_selected3", imagebutton_blank_ability_selected3);
		this.addRenderableWidget(imagebutton_blank_ability_selected3);
		imagebutton_blank_ability_selected4 = new ImageButton(this.leftPos + -19, this.topPos + -17, 36, 36, 0, 0, 36, new ResourceLocation("jojohe:textures/screens/atlas/imagebutton_blank_ability_selected4.png"), 36, 72, e -> {
			if (true) {
				JojoheMod.PACKET_HANDLER.sendToServer(new AbilityWheelHamonButtonMessage(5, x, y, z));
				AbilityWheelHamonButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:imagebutton_blank_ability_selected4", imagebutton_blank_ability_selected4);
		this.addRenderableWidget(imagebutton_blank_ability_selected4);
		imagebutton_blank_ability_selected5 = new ImageButton(this.leftPos + 16, this.topPos + -17, 36, 36, 0, 0, 36, new ResourceLocation("jojohe:textures/screens/atlas/imagebutton_blank_ability_selected5.png"), 36, 72, e -> {
			if (true) {
				JojoheMod.PACKET_HANDLER.sendToServer(new AbilityWheelHamonButtonMessage(6, x, y, z));
				AbilityWheelHamonButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		guistate.put("button:imagebutton_blank_ability_selected5", imagebutton_blank_ability_selected5);
		this.addRenderableWidget(imagebutton_blank_ability_selected5);
		imagebutton_blank_ability_selected6 = new ImageButton(this.leftPos + -53, this.topPos + 17, 36, 36, 0, 0, 36, new ResourceLocation("jojohe:textures/screens/atlas/imagebutton_blank_ability_selected6.png"), 36, 72, e -> {
			if (true) {
				JojoheMod.PACKET_HANDLER.sendToServer(new AbilityWheelHamonButtonMessage(7, x, y, z));
				AbilityWheelHamonButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		});
		guistate.put("button:imagebutton_blank_ability_selected6", imagebutton_blank_ability_selected6);
		this.addRenderableWidget(imagebutton_blank_ability_selected6);
		imagebutton_blank_ability_selected7 = new ImageButton(this.leftPos + -19, this.topPos + 17, 36, 36, 0, 0, 36, new ResourceLocation("jojohe:textures/screens/atlas/imagebutton_blank_ability_selected7.png"), 36, 72, e -> {
			if (true) {
				JojoheMod.PACKET_HANDLER.sendToServer(new AbilityWheelHamonButtonMessage(8, x, y, z));
				AbilityWheelHamonButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		});
		guistate.put("button:imagebutton_blank_ability_selected7", imagebutton_blank_ability_selected7);
		this.addRenderableWidget(imagebutton_blank_ability_selected7);
		imagebutton_blank_ability_selected8 = new ImageButton(this.leftPos + 16, this.topPos + 17, 36, 36, 0, 0, 36, new ResourceLocation("jojohe:textures/screens/atlas/imagebutton_blank_ability_selected8.png"), 36, 72, e -> {
			if (true) {
				JojoheMod.PACKET_HANDLER.sendToServer(new AbilityWheelHamonButtonMessage(9, x, y, z));
				AbilityWheelHamonButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		});
		guistate.put("button:imagebutton_blank_ability_selected8", imagebutton_blank_ability_selected8);
		this.addRenderableWidget(imagebutton_blank_ability_selected8);
	}
}
