package net.mcreator.jojohe.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PlayerJoinNBTResetProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("WorldOfStands", false);
		entity.getPersistentData().putBoolean("StandUser", false);
		entity.getPersistentData().putBoolean("StandSummoned", false);
		entity.getPersistentData().putBoolean("TimeStopped", false);
		entity.getPersistentData().putString("WOSUseAbilityType", "");
	}
}
