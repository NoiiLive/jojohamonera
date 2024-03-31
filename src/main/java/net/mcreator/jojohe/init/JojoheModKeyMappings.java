
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jojohe.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.jojohe.network.UseAbilityMessage;
import net.mcreator.jojohe.network.UseAbility9Message;
import net.mcreator.jojohe.network.UseAbility8Message;
import net.mcreator.jojohe.network.UseAbility7Message;
import net.mcreator.jojohe.network.UseAbility6Message;
import net.mcreator.jojohe.network.UseAbility5Message;
import net.mcreator.jojohe.network.UseAbility4Message;
import net.mcreator.jojohe.network.UseAbility3Message;
import net.mcreator.jojohe.network.UseAbility2Message;
import net.mcreator.jojohe.network.UseAbility1Message;
import net.mcreator.jojohe.network.OpenPlayerStatsMessage;
import net.mcreator.jojohe.network.ChargeHamonMessage;
import net.mcreator.jojohe.network.ChangeAbilityMessage;
import net.mcreator.jojohe.JojoheMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class JojoheModKeyMappings {
	public static final KeyMapping CHANGE_ABILITY = new KeyMapping("key.jojohe.change_ability", GLFW.GLFW_KEY_X, "key.categories.jojohe") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				JojoheMod.PACKET_HANDLER.sendToServer(new ChangeAbilityMessage(0, 0));
				ChangeAbilityMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping USE_ABILITY = new KeyMapping("key.jojohe.use_ability", GLFW.GLFW_KEY_Z, "key.categories.jojohe") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				JojoheMod.PACKET_HANDLER.sendToServer(new UseAbilityMessage(0, 0));
				UseAbilityMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping OPEN_PLAYER_STATS = new KeyMapping("key.jojohe.open_player_stats", GLFW.GLFW_KEY_H, "key.categories.jojohe") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				JojoheMod.PACKET_HANDLER.sendToServer(new OpenPlayerStatsMessage(0, 0));
				OpenPlayerStatsMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping CHARGE_HAMON = new KeyMapping("key.jojohe.charge_hamon", GLFW.GLFW_KEY_B, "key.categories.jojohe") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				JojoheMod.PACKET_HANDLER.sendToServer(new ChargeHamonMessage(0, 0));
				ChargeHamonMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping USE_ABILITY_1 = new KeyMapping("key.jojohe.use_ability_1", GLFW.GLFW_KEY_KP_1, "key.categories.jojohekeybinds") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				JojoheMod.PACKET_HANDLER.sendToServer(new UseAbility1Message(0, 0));
				UseAbility1Message.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping USE_ABILITY_2 = new KeyMapping("key.jojohe.use_ability_2", GLFW.GLFW_KEY_KP_2, "key.categories.jojohekeybinds") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				JojoheMod.PACKET_HANDLER.sendToServer(new UseAbility2Message(0, 0));
				UseAbility2Message.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping USE_ABILITY_3 = new KeyMapping("key.jojohe.use_ability_3", GLFW.GLFW_KEY_KP_3, "key.categories.jojohekeybinds") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				JojoheMod.PACKET_HANDLER.sendToServer(new UseAbility3Message(0, 0));
				UseAbility3Message.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping USE_ABILITY_4 = new KeyMapping("key.jojohe.use_ability_4", GLFW.GLFW_KEY_KP_4, "key.categories.jojohekeybinds") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				JojoheMod.PACKET_HANDLER.sendToServer(new UseAbility4Message(0, 0));
				UseAbility4Message.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping USE_ABILITY_5 = new KeyMapping("key.jojohe.use_ability_5", GLFW.GLFW_KEY_KP_5, "key.categories.jojohekeybinds") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				JojoheMod.PACKET_HANDLER.sendToServer(new UseAbility5Message(0, 0));
				UseAbility5Message.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping USE_ABILITY_6 = new KeyMapping("key.jojohe.use_ability_6", GLFW.GLFW_KEY_KP_6, "key.categories.jojohekeybinds") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				JojoheMod.PACKET_HANDLER.sendToServer(new UseAbility6Message(0, 0));
				UseAbility6Message.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping USE_ABILITY_7 = new KeyMapping("key.jojohe.use_ability_7", GLFW.GLFW_KEY_KP_7, "key.categories.jojohekeybinds") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				JojoheMod.PACKET_HANDLER.sendToServer(new UseAbility7Message(0, 0));
				UseAbility7Message.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping USE_ABILITY_8 = new KeyMapping("key.jojohe.use_ability_8", GLFW.GLFW_KEY_KP_8, "key.categories.jojohekeybinds") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				JojoheMod.PACKET_HANDLER.sendToServer(new UseAbility8Message(0, 0));
				UseAbility8Message.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping USE_ABILITY_9 = new KeyMapping("key.jojohe.use_ability_9", GLFW.GLFW_KEY_KP_9, "key.categories.jojohekeybinds") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				JojoheMod.PACKET_HANDLER.sendToServer(new UseAbility9Message(0, 0));
				UseAbility9Message.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(CHANGE_ABILITY);
		event.register(USE_ABILITY);
		event.register(OPEN_PLAYER_STATS);
		event.register(CHARGE_HAMON);
		event.register(USE_ABILITY_1);
		event.register(USE_ABILITY_2);
		event.register(USE_ABILITY_3);
		event.register(USE_ABILITY_4);
		event.register(USE_ABILITY_5);
		event.register(USE_ABILITY_6);
		event.register(USE_ABILITY_7);
		event.register(USE_ABILITY_8);
		event.register(USE_ABILITY_9);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				CHANGE_ABILITY.consumeClick();
				USE_ABILITY.consumeClick();
				OPEN_PLAYER_STATS.consumeClick();
				CHARGE_HAMON.consumeClick();
				USE_ABILITY_1.consumeClick();
				USE_ABILITY_2.consumeClick();
				USE_ABILITY_3.consumeClick();
				USE_ABILITY_4.consumeClick();
				USE_ABILITY_5.consumeClick();
				USE_ABILITY_6.consumeClick();
				USE_ABILITY_7.consumeClick();
				USE_ABILITY_8.consumeClick();
				USE_ABILITY_9.consumeClick();
			}
		}
	}
}
