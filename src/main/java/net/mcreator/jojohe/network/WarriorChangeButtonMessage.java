
package net.mcreator.jojohe.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.jojohe.world.inventory.WarriorChangeMenu;
import net.mcreator.jojohe.procedures.WarriorEnableChange3Procedure;
import net.mcreator.jojohe.procedures.WarriorEnableChange2Procedure;
import net.mcreator.jojohe.procedures.WarriorEnableChange1Procedure;
import net.mcreator.jojohe.procedures.WarriorDisableChange3Procedure;
import net.mcreator.jojohe.procedures.WarriorDisableChange2Procedure;
import net.mcreator.jojohe.procedures.WarriorDisableChange1Procedure;
import net.mcreator.jojohe.procedures.WarriorChangeToProcedure;
import net.mcreator.jojohe.procedures.MenuCloseProcedure;
import net.mcreator.jojohe.JojoheMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class WarriorChangeButtonMessage {
	private final int buttonID, x, y, z;

	public WarriorChangeButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public WarriorChangeButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(WarriorChangeButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(WarriorChangeButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = WarriorChangeMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			WarriorChangeToProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			MenuCloseProcedure.execute(entity);
		}
		if (buttonID == 2) {

			WarriorDisableChange1Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			WarriorDisableChange2Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			WarriorDisableChange3Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			WarriorEnableChange1Procedure.execute(entity);
		}
		if (buttonID == 6) {

			WarriorEnableChange2Procedure.execute(entity);
		}
		if (buttonID == 7) {

			WarriorEnableChange3Procedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		JojoheMod.addNetworkMessage(WarriorChangeButtonMessage.class, WarriorChangeButtonMessage::buffer, WarriorChangeButtonMessage::new, WarriorChangeButtonMessage::handler);
	}
}
