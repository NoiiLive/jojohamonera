
package net.mcreator.jojohe.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.jojohe.world.inventory.StreetFighterChangeMenu;
import net.mcreator.jojohe.procedures.StreetFighterEnableChange3Procedure;
import net.mcreator.jojohe.procedures.StreetFighterEnableChange2Procedure;
import net.mcreator.jojohe.procedures.StreetFighterEnableChange1Procedure;
import net.mcreator.jojohe.procedures.StreetFighterDisableChange3Procedure;
import net.mcreator.jojohe.procedures.StreetFighterDisableChange2Procedure;
import net.mcreator.jojohe.procedures.StreetFighterDisableChange1Procedure;
import net.mcreator.jojohe.procedures.StreetFighterChangeToProcedure;
import net.mcreator.jojohe.procedures.MenuCloseProcedure;
import net.mcreator.jojohe.JojoheMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class StreetFighterChangeButtonMessage {
	private final int buttonID, x, y, z;

	public StreetFighterChangeButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public StreetFighterChangeButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(StreetFighterChangeButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(StreetFighterChangeButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = StreetFighterChangeMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			StreetFighterChangeToProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			MenuCloseProcedure.execute(entity);
		}
		if (buttonID == 2) {

			StreetFighterDisableChange2Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			StreetFighterDisableChange3Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			StreetFighterEnableChange2Procedure.execute(entity);
		}
		if (buttonID == 5) {

			StreetFighterEnableChange3Procedure.execute(entity);
		}
		if (buttonID == 6) {

			StreetFighterEnableChange1Procedure.execute(entity);
		}
		if (buttonID == 7) {

			StreetFighterDisableChange1Procedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		JojoheMod.addNetworkMessage(StreetFighterChangeButtonMessage.class, StreetFighterChangeButtonMessage::buffer, StreetFighterChangeButtonMessage::new, StreetFighterChangeButtonMessage::handler);
	}
}
