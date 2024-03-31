package net.mcreator.jojohe.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class FleshbudCooldownProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("FleshbudFreeze") > 0) {
			entity.getPersistentData().putDouble("FleshbudFreeze", (entity.getPersistentData().getDouble("FleshbudFreeze") - 1));
		}
		if (entity.getPersistentData().getDouble("FleshbudFreeze") == 1) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Fleshbud Freeze is Ready!"), true);
		}
		if (entity.getPersistentData().getDouble("FleshbudBoost") > 0) {
			entity.getPersistentData().putDouble("FleshbudBoost", (entity.getPersistentData().getDouble("FleshbudBoost") - 1));
		}
		if (entity.getPersistentData().getDouble("FleshbudBoost") == 1) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Fleshbud Boost is Ready!"), true);
		}
		if (entity.getPersistentData().getDouble("FleshbudSacrifice") > 0) {
			entity.getPersistentData().putDouble("FleshbudSacrifice", (entity.getPersistentData().getDouble("FleshbudSacrifice") - 1));
		}
		if (entity.getPersistentData().getDouble("FleshbudSacrifice") == 1) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Fleshbud Sacrifice is Ready!"), true);
		}
		if (entity.getPersistentData().getDouble("FleshbudWeaken") > 0) {
			entity.getPersistentData().putDouble("FleshbudWeaken", (entity.getPersistentData().getDouble("FleshbudWeaken") - 1));
		}
		if (entity.getPersistentData().getDouble("FleshbudWeaken") == 1) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Fleshbud Weaken is Ready!"), true);
		}
	}
}
