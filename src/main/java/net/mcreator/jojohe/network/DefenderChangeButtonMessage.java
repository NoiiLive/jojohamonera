
package net.mcreator.jojohe.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.jojohe.world.inventory.DefenderChangeMenu;
import net.mcreator.jojohe.procedures.MenuCloseProcedure;
import net.mcreator.jojohe.procedures.DefenderEnableChange3Procedure;
import net.mcreator.jojohe.procedures.DefenderEnableChange2Procedure;
import net.mcreator.jojohe.procedures.DefenderEnableChange1Procedure;
import net.mcreator.jojohe.procedures.DefenderDisableChange3Procedure;
import net.mcreator.jojohe.procedures.DefenderDisableChange2Procedure;
import net.mcreator.jojohe.procedures.DefenderDisableChange1Procedure;
import net.mcreator.jojohe.procedures.DefenderChangeToProcedure;
import net.mcreator.jojohe.JojoheMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DefenderChangeButtonMessage {
	private final int buttonID, x, y, z;

	public DefenderChangeButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public DefenderChangeButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(DefenderChangeButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(DefenderChangeButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = DefenderChangeMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			DefenderChangeToProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			MenuCloseProcedure.execute(entity);
		}
		if (buttonID == 2) {

			DefenderDisableChange1Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			DefenderDisableChange2Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			DefenderDisableChange3Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			DefenderEnableChange1Procedure.execute(entity);
		}
		if (buttonID == 6) {

			DefenderEnableChange2Procedure.execute(entity);
		}
		if (buttonID == 7) {

			DefenderEnableChange3Procedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		JojoheMod.addNetworkMessage(DefenderChangeButtonMessage.class, DefenderChangeButtonMessage::buffer, DefenderChangeButtonMessage::new, DefenderChangeButtonMessage::handler);
	}
}
