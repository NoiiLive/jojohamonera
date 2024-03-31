package net.mcreator.jojohe.procedures;

import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.jojohe.world.inventory.AbilityWheelMenu;
import net.mcreator.jojohe.network.JojoheModVariables;
import net.mcreator.jojohe.JojoheMod;

import javax.annotation.Nullable;

import io.netty.buffer.Unpooled;

@Mod.EventBusSubscriber
public class PlayerNBTConversionProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("HamonEra") == false) {
			entity.getPersistentData().putBoolean("HamonEra", true);
			JojoheMod.LOGGER.info("Player has JoJo: Hamon Era");
		}
		if (((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).PlayerRace).equals("Hamon User") && entity.getPersistentData().getBoolean("Hamon") == false) {
			entity.getPersistentData().putBoolean("Hamon", true);
			JojoheMod.LOGGER.info("Player is a Hamon User");
		}
		if (((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).PlayerRace).equals("Hamon User") == false && entity.getPersistentData().getBoolean("Hamon") == true) {
			entity.getPersistentData().putBoolean("Hamon", false);
			JojoheMod.LOGGER.info("Player is not a Hamon User");
		}
		if ((((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).PlayerRace).equals("Vampire")
				|| ((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).PlayerRace).equals("Weak Vampire")) && entity.getPersistentData().getBoolean("Vampirism") == false) {
			entity.getPersistentData().putBoolean("Vampirism", true);
			JojoheMod.LOGGER.info("Player is a Vampire");
		}
		if (((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).PlayerRace).equals("Vampire") == false
				&& ((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).PlayerRace).equals("Weak Vampire") == false
				&& entity.getPersistentData().getBoolean("Vampirism") == true) {
			entity.getPersistentData().putBoolean("Vampirism", false);
			JojoheMod.LOGGER.info("Player is not a Vampire");
		}
		if ((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).StandUser == false && entity.getPersistentData().getBoolean("StandUser") == true) {
			{
				boolean _setval = true;
				entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.StandUser = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			JojoheMod.LOGGER.info("Player is a Stand User");
		}
		if ((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).StandUser == true && entity.getPersistentData().getBoolean("StandUser") == false) {
			{
				boolean _setval = false;
				entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.StandUser = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			JojoheMod.LOGGER.info("Player is not a Stand User");
		}
		if ((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).StandSummoned == false && entity.getPersistentData().getBoolean("StandSummoned") == true) {
			{
				boolean _setval = true;
				entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.StandSummoned = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			JojoheMod.LOGGER.info("Player's Stand is Summoned");
		}
		if ((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).StandSummoned == true && entity.getPersistentData().getBoolean("StandSummoned") == false) {
			{
				boolean _setval = false;
				entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.StandSummoned = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			JojoheMod.LOGGER.info("Player's Stand is not Summoned");
		}
		if ((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).TimeStopped == false && entity.getPersistentData().getBoolean("TimeStopped") == true) {
			{
				boolean _setval = true;
				entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.TimeStopped = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			JojoheMod.LOGGER.info("Player is Time Stopped");
		}
		if ((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).TimeStopped == true && entity.getPersistentData().getBoolean("TimeStopped") == false) {
			{
				boolean _setval = false;
				entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.TimeStopped = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			JojoheMod.LOGGER.info("Player is not Time Stopped");
		}
		if (JojoheModVariables.MapVariables.get(world).WorldOfStands == false && entity.getPersistentData().getBoolean("WorldOfStands") == true) {
			JojoheModVariables.MapVariables.get(world).WorldOfStands = true;
			JojoheModVariables.MapVariables.get(world).syncData(world);
			JojoheMod.LOGGER.info("Player has JoJo: World Of Stands");
		}
		if (JojoheModVariables.MapVariables.get(world).WorldOfStands == true && entity.getPersistentData().getBoolean("WorldOfStands") == false) {
			JojoheModVariables.MapVariables.get(world).WorldOfStands = false;
			JojoheModVariables.MapVariables.get(world).syncData(world);
			JojoheMod.LOGGER.info("Player does not have JoJo: World Of Stands");
		}
		if ((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).AbilityWheelGUI != 2 && JojoheModVariables.MapVariables.get(world).WorldOfStands == false) {
			entity.getPersistentData().putDouble("AbilityWheelGUI", 2);
			{
				double _setval = 2;
				entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.AbilityWheelGUI = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			JojoheMod.LOGGER.info("Player Ability Wheel #" + (entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).AbilityWheelGUI);
		}
		if ((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).AbilityWheelGUI == 2 && entity.getPersistentData().getDouble("AbilityWheelGUI") != 2) {
			{
				double _setval = entity.getPersistentData().getDouble("AbilityWheelGUI");
				entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.AbilityWheelGUI = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			JojoheMod.LOGGER.info("Player Ability Wheel #" + (entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).AbilityWheelGUI);
		}
		if ((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).AbilityWheelGUI == 0 || entity.getPersistentData().getDouble("AbilityWheelGUI") == 0) {
			entity.getPersistentData().putDouble("AbilityWheelGUI", 2);
			{
				double _setval = 2;
				entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.AbilityWheelGUI = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			JojoheMod.LOGGER.info("Player Ability Wheel #" + (entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).AbilityWheelGUI);
		}
		if ((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).SwitchWheels == false && entity.getPersistentData().getBoolean("SwitchWheels") == true) {
			{
				boolean _setval = true;
				entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SwitchWheels = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			entity.getPersistentData().putBoolean("SwitchWheels", true);
			entity.getPersistentData().putDouble("AbilityWheelGUI", 2);
			{
				double _setval = 2;
				entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.AbilityWheelGUI = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("AbilityWheel");
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new AbilityWheelMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			JojoheMod.LOGGER.info("Player is Switching Wheels");
		}
		if ((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).SwitchWheels == true && entity.getPersistentData().getBoolean("SwitchWheels") == false) {
			{
				boolean _setval = false;
				entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SwitchWheels = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			entity.getPersistentData().putBoolean("SwitchWheels", false);
			entity.getPersistentData().putDouble("AbilityWheelGUI", 1);
			{
				double _setval = 1;
				entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.AbilityWheelGUI = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			JojoheMod.LOGGER.info("Player is not Switching Wheels");
		}
		if (((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).WOSUseAbilityType).equals(entity.getPersistentData().getString("WOSUseAbilityType")) == false) {
			{
				String _setval = entity.getPersistentData().getString("WOSUseAbilityType");
				entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.WOSUseAbilityType = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			JojoheMod.LOGGER.info("World Of Stands Use Ability Changed To: " + (entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).WOSUseAbilityType);
		}
		if ((entity.getPersistentData().getString("HEUseAbilityType")).equals((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).UseAbilityType) == false) {
			entity.getPersistentData().putString("HEUseAbilityType", ((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).UseAbilityType));
			JojoheMod.LOGGER.info("Hamon Era Use Ability Changed To: " + entity.getPersistentData().getString("HEUseAbilityType"));
		}
	}
}
