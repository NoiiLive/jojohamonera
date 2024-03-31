
package net.mcreator.jojohe.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.jojohe.world.inventory.HamonSkillTreeMovementMenu;
import net.mcreator.jojohe.procedures.UnlockStickingHamonProcedure;
import net.mcreator.jojohe.procedures.UnlockLifeMagnetismProcedure;
import net.mcreator.jojohe.procedures.UnlockHamonDashProcedure;
import net.mcreator.jojohe.procedures.UnlockAfterimagesProcedure;
import net.mcreator.jojohe.procedures.OpenStatPageKeybindProcedure;
import net.mcreator.jojohe.procedures.OpenSkillTreeSupportProcedure;
import net.mcreator.jojohe.procedures.OpenSkillTreePhysicalProcedure;
import net.mcreator.jojohe.JojoheMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HamonSkillTreeMovementButtonMessage {
	private final int buttonID, x, y, z;

	public HamonSkillTreeMovementButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public HamonSkillTreeMovementButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(HamonSkillTreeMovementButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(HamonSkillTreeMovementButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = HamonSkillTreeMovementMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			OpenSkillTreeSupportProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			OpenSkillTreePhysicalProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			OpenStatPageKeybindProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 9) {

			UnlockAfterimagesProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 10) {

			UnlockHamonDashProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 11) {

			UnlockLifeMagnetismProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 12) {

			UnlockStickingHamonProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		JojoheMod.addNetworkMessage(HamonSkillTreeMovementButtonMessage.class, HamonSkillTreeMovementButtonMessage::buffer, HamonSkillTreeMovementButtonMessage::new, HamonSkillTreeMovementButtonMessage::handler);
	}
}
