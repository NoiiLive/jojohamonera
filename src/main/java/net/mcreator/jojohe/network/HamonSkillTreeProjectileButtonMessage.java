
package net.mcreator.jojohe.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.jojohe.world.inventory.HamonSkillTreeProjectileMenu;
import net.mcreator.jojohe.procedures.UnlockWineCutterProcedure;
import net.mcreator.jojohe.procedures.UnlockTurquoiseBlueProcedure;
import net.mcreator.jojohe.procedures.OpenStatPageKeybindProcedure;
import net.mcreator.jojohe.procedures.OpenSkillTreeSpecialProcedure;
import net.mcreator.jojohe.procedures.OpenSkillTreePhysicalProcedure;
import net.mcreator.jojohe.JojoheMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HamonSkillTreeProjectileButtonMessage {
	private final int buttonID, x, y, z;

	public HamonSkillTreeProjectileButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public HamonSkillTreeProjectileButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(HamonSkillTreeProjectileButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(HamonSkillTreeProjectileButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = HamonSkillTreeProjectileMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			OpenSkillTreePhysicalProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			OpenSkillTreeSpecialProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			OpenStatPageKeybindProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 11) {

			UnlockWineCutterProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 12) {

			UnlockTurquoiseBlueProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		JojoheMod.addNetworkMessage(HamonSkillTreeProjectileButtonMessage.class, HamonSkillTreeProjectileButtonMessage::buffer, HamonSkillTreeProjectileButtonMessage::new, HamonSkillTreeProjectileButtonMessage::handler);
	}
}
