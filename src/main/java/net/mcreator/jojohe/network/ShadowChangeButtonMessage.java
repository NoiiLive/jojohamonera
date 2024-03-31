
package net.mcreator.jojohe.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.jojohe.world.inventory.ShadowChangeMenu;
import net.mcreator.jojohe.procedures.ShadowEnableChange3Procedure;
import net.mcreator.jojohe.procedures.ShadowEnableChange2Procedure;
import net.mcreator.jojohe.procedures.ShadowEnableChange1Procedure;
import net.mcreator.jojohe.procedures.ShadowDisableChange3Procedure;
import net.mcreator.jojohe.procedures.ShadowDisableChange2Procedure;
import net.mcreator.jojohe.procedures.ShadowDisableChange1Procedure;
import net.mcreator.jojohe.procedures.ShadowChangeToProcedure;
import net.mcreator.jojohe.procedures.MenuCloseProcedure;
import net.mcreator.jojohe.JojoheMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ShadowChangeButtonMessage {
	private final int buttonID, x, y, z;

	public ShadowChangeButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public ShadowChangeButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(ShadowChangeButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(ShadowChangeButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = ShadowChangeMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			ShadowChangeToProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			MenuCloseProcedure.execute(entity);
		}
		if (buttonID == 2) {

			ShadowDisableChange1Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			ShadowDisableChange2Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			ShadowDisableChange3Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			ShadowEnableChange1Procedure.execute(entity);
		}
		if (buttonID == 6) {

			ShadowEnableChange2Procedure.execute(entity);
		}
		if (buttonID == 7) {

			ShadowEnableChange3Procedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		JojoheMod.addNetworkMessage(ShadowChangeButtonMessage.class, ShadowChangeButtonMessage::buffer, ShadowChangeButtonMessage::new, ShadowChangeButtonMessage::handler);
	}
}
