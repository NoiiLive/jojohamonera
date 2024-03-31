
package net.mcreator.jojohe.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.jojohe.world.inventory.HamonSkillTreeSupportMenu;
import net.mcreator.jojohe.procedures.UnlockRepellingHamonProcedure;
import net.mcreator.jojohe.procedures.UnlockPrecognitionProcedure;
import net.mcreator.jojohe.procedures.UnlockHamonHealingProcedure;
import net.mcreator.jojohe.procedures.UnlockHamonDetectorProcedure;
import net.mcreator.jojohe.procedures.UnlockDeepPassProcedure;
import net.mcreator.jojohe.procedures.OpenStatPageKeybindProcedure;
import net.mcreator.jojohe.procedures.OpenSkillTreeSpecialProcedure;
import net.mcreator.jojohe.procedures.OpenSkillTreeMovementProcedure;
import net.mcreator.jojohe.JojoheMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HamonSkillTreeSupportButtonMessage {
	private final int buttonID, x, y, z;

	public HamonSkillTreeSupportButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public HamonSkillTreeSupportButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(HamonSkillTreeSupportButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(HamonSkillTreeSupportButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = HamonSkillTreeSupportMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			OpenSkillTreeSpecialProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			OpenSkillTreeMovementProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			OpenStatPageKeybindProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 10) {

			UnlockDeepPassProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 11) {

			UnlockHamonDetectorProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 12) {

			UnlockHamonHealingProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 13) {

			UnlockRepellingHamonProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 14) {

			UnlockPrecognitionProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		JojoheMod.addNetworkMessage(HamonSkillTreeSupportButtonMessage.class, HamonSkillTreeSupportButtonMessage::buffer, HamonSkillTreeSupportButtonMessage::new, HamonSkillTreeSupportButtonMessage::handler);
	}
}
