
package net.mcreator.jojohe.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.jojohe.world.inventory.BoxingChangeMenu;
import net.mcreator.jojohe.procedures.MenuCloseProcedure;
import net.mcreator.jojohe.procedures.HermitEnableChange3Procedure;
import net.mcreator.jojohe.procedures.HermitEnableChange2Procedure;
import net.mcreator.jojohe.procedures.HermitEnableChange1Procedure;
import net.mcreator.jojohe.procedures.HermitDisableChange3Procedure;
import net.mcreator.jojohe.procedures.HermitDisableChange2Procedure;
import net.mcreator.jojohe.procedures.HermitDisableChange1Procedure;
import net.mcreator.jojohe.procedures.HermitChangeToProcedure;
import net.mcreator.jojohe.JojoheMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BoxingChangeButtonMessage {
	private final int buttonID, x, y, z;

	public BoxingChangeButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public BoxingChangeButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(BoxingChangeButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(BoxingChangeButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = BoxingChangeMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			HermitChangeToProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			MenuCloseProcedure.execute(entity);
		}
		if (buttonID == 2) {

			HermitDisableChange2Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			HermitDisableChange3Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			HermitEnableChange2Procedure.execute(entity);
		}
		if (buttonID == 5) {

			HermitEnableChange3Procedure.execute(entity);
		}
		if (buttonID == 6) {

			HermitEnableChange1Procedure.execute(entity);
		}
		if (buttonID == 7) {

			HermitDisableChange1Procedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		JojoheMod.addNetworkMessage(BoxingChangeButtonMessage.class, BoxingChangeButtonMessage::buffer, BoxingChangeButtonMessage::new, BoxingChangeButtonMessage::handler);
	}
}
