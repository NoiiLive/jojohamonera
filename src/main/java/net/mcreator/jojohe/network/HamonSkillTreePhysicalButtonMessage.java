
package net.mcreator.jojohe.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.jojohe.world.inventory.HamonSkillTreePhysicalMenu;
import net.mcreator.jojohe.procedures.UnlockedOverdriveProcedure;
import net.mcreator.jojohe.procedures.UnlockedGroundRippleProcedure;
import net.mcreator.jojohe.procedures.UnlockZoomPunchProcedure;
import net.mcreator.jojohe.procedures.UnlockTornadoOverdriveProcedure;
import net.mcreator.jojohe.procedures.UnlockThunderSplitProcedure;
import net.mcreator.jojohe.procedures.UnlockSunlightYellowOverdriveProcedure;
import net.mcreator.jojohe.procedures.UnlockSendoWaveKickProcedure;
import net.mcreator.jojohe.procedures.UnlockOverdriveBarrageProcedure;
import net.mcreator.jojohe.procedures.OpenStatPageKeybindProcedure;
import net.mcreator.jojohe.procedures.OpenSkillTreeRangedProcedure;
import net.mcreator.jojohe.procedures.OpenSkillTreeMovementProcedure;
import net.mcreator.jojohe.JojoheMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HamonSkillTreePhysicalButtonMessage {
	private final int buttonID, x, y, z;

	public HamonSkillTreePhysicalButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public HamonSkillTreePhysicalButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(HamonSkillTreePhysicalButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(HamonSkillTreePhysicalButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = HamonSkillTreePhysicalMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			OpenSkillTreeMovementProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			OpenSkillTreeRangedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			OpenStatPageKeybindProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 12) {

			UnlockZoomPunchProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 13) {

			UnlockThunderSplitProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 14) {

			UnlockedGroundRippleProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 15) {

			UnlockOverdriveBarrageProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 16) {

			UnlockSunlightYellowOverdriveProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 17) {

			UnlockedOverdriveProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 18) {

			UnlockSendoWaveKickProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 19) {

			UnlockTornadoOverdriveProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		JojoheMod.addNetworkMessage(HamonSkillTreePhysicalButtonMessage.class, HamonSkillTreePhysicalButtonMessage::buffer, HamonSkillTreePhysicalButtonMessage::new, HamonSkillTreePhysicalButtonMessage::handler);
	}
}
