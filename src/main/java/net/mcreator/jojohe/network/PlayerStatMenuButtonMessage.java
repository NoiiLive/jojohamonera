
package net.mcreator.jojohe.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.jojohe.world.inventory.PlayerStatMenuMenu;
import net.mcreator.jojohe.procedures.WillpowerStatAddProcedure;
import net.mcreator.jojohe.procedures.StrengthStatAddProcedure;
import net.mcreator.jojohe.procedures.SpeedStatAddProcedure;
import net.mcreator.jojohe.procedures.OpenSkillTreePhysicalProcedure;
import net.mcreator.jojohe.procedures.DurabilityStatAddProcedure;
import net.mcreator.jojohe.JojoheMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PlayerStatMenuButtonMessage {
	private final int buttonID, x, y, z;

	public PlayerStatMenuButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public PlayerStatMenuButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(PlayerStatMenuButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(PlayerStatMenuButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = PlayerStatMenuMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			OpenSkillTreePhysicalProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			WillpowerStatAddProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			DurabilityStatAddProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			SpeedStatAddProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			StrengthStatAddProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		JojoheMod.addNetworkMessage(PlayerStatMenuButtonMessage.class, PlayerStatMenuButtonMessage::buffer, PlayerStatMenuButtonMessage::new, PlayerStatMenuButtonMessage::handler);
	}
}
