
package net.mcreator.jojohe.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.jojohe.world.inventory.AbilityWheelHamonMenu;
import net.mcreator.jojohe.procedures.WheelSwitcherProcedure;
import net.mcreator.jojohe.procedures.ChangeAbility9Procedure;
import net.mcreator.jojohe.procedures.ChangeAbility8Procedure;
import net.mcreator.jojohe.procedures.ChangeAbility7Procedure;
import net.mcreator.jojohe.procedures.ChangeAbility6Procedure;
import net.mcreator.jojohe.procedures.ChangeAbility5Procedure;
import net.mcreator.jojohe.procedures.ChangeAbility4Procedure;
import net.mcreator.jojohe.procedures.ChangeAbility3Procedure;
import net.mcreator.jojohe.procedures.ChangeAbility2Procedure;
import net.mcreator.jojohe.procedures.ChangeAbility1Procedure;
import net.mcreator.jojohe.JojoheMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AbilityWheelHamonButtonMessage {
	private final int buttonID, x, y, z;

	public AbilityWheelHamonButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public AbilityWheelHamonButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(AbilityWheelHamonButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(AbilityWheelHamonButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = AbilityWheelHamonMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			WheelSwitcherProcedure.execute(entity);
		}
		if (buttonID == 1) {

			ChangeAbility1Procedure.execute(entity);
		}
		if (buttonID == 2) {

			ChangeAbility2Procedure.execute(entity);
		}
		if (buttonID == 3) {

			ChangeAbility3Procedure.execute(entity);
		}
		if (buttonID == 4) {

			ChangeAbility4Procedure.execute(entity);
		}
		if (buttonID == 5) {

			ChangeAbility5Procedure.execute(entity);
		}
		if (buttonID == 6) {

			ChangeAbility6Procedure.execute(entity);
		}
		if (buttonID == 7) {

			ChangeAbility7Procedure.execute(entity);
		}
		if (buttonID == 8) {

			ChangeAbility8Procedure.execute(entity);
		}
		if (buttonID == 9) {

			ChangeAbility9Procedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		JojoheMod.addNetworkMessage(AbilityWheelHamonButtonMessage.class, AbilityWheelHamonButtonMessage::buffer, AbilityWheelHamonButtonMessage::new, AbilityWheelHamonButtonMessage::handler);
	}
}
