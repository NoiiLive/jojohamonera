package net.mcreator.jojohe.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.mcreator.jojohe.network.JojoheModVariables;

public class UmbrellaDurabilityProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SURVIVAL;
				} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SURVIVAL;
				}
				return false;
			}
		}.checkGamemode(entity)) {
			if (world.dayTime() % 24000 < 13000) {
				if (entity.isInWaterRainOrBubble() == false) {
					if (world.canSeeSkyFromBelowWater(BlockPos.containing(entity.getX(), entity.getY() + 1, entity.getZ())) == true) {
						if (((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).PlayerRace).equals("Vampire")
								|| ((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).PlayerRace).equals("Weak Vampire")) {
							if (entity.getPersistentData().getDouble("UmbrellaCD") > 0) {
								entity.getPersistentData().putDouble("UmbrellaCD", (entity.getPersistentData().getDouble("UmbrellaCD") - 1));
							}
							if (entity.getPersistentData().getDouble("UmbrellaCD") == 0) {
								if (itemstack.getEnchantmentLevel(Enchantments.UNBREAKING) == 1) {
									entity.getPersistentData().putDouble("UmbrellaCD", 100);
									if (((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).AbilityRoot).equals("Shadow")) {
										{
											ItemStack _ist = itemstack;
											if (_ist.hurt(5, RandomSource.create(), null)) {
												_ist.shrink(1);
												_ist.setDamageValue(0);
											}
										}
									} else {
										{
											ItemStack _ist = itemstack;
											if (_ist.hurt(1, RandomSource.create(), null)) {
												_ist.shrink(1);
												_ist.setDamageValue(0);
											}
										}
									}
								} else if (itemstack.getEnchantmentLevel(Enchantments.UNBREAKING) == 2) {
									entity.getPersistentData().putDouble("UmbrellaCD", 150);
									if (((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).AbilityRoot).equals("Shadow")) {
										{
											ItemStack _ist = itemstack;
											if (_ist.hurt(5, RandomSource.create(), null)) {
												_ist.shrink(1);
												_ist.setDamageValue(0);
											}
										}
									} else {
										{
											ItemStack _ist = itemstack;
											if (_ist.hurt(1, RandomSource.create(), null)) {
												_ist.shrink(1);
												_ist.setDamageValue(0);
											}
										}
									}
								} else if (itemstack.getEnchantmentLevel(Enchantments.UNBREAKING) == 3) {
									entity.getPersistentData().putDouble("UmbrellaCD", 200);
									if (((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).AbilityRoot).equals("Shadow")) {
										{
											ItemStack _ist = itemstack;
											if (_ist.hurt(5, RandomSource.create(), null)) {
												_ist.shrink(1);
												_ist.setDamageValue(0);
											}
										}
									} else {
										{
											ItemStack _ist = itemstack;
											if (_ist.hurt(1, RandomSource.create(), null)) {
												_ist.shrink(1);
												_ist.setDamageValue(0);
											}
										}
									}
								} else {
									entity.getPersistentData().putDouble("UmbrellaCD", 50);
									if (((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).AbilityRoot).equals("Shadow")) {
										{
											ItemStack _ist = itemstack;
											if (_ist.hurt(5, RandomSource.create(), null)) {
												_ist.shrink(1);
												_ist.setDamageValue(0);
											}
										}
									} else {
										{
											ItemStack _ist = itemstack;
											if (_ist.hurt(1, RandomSource.create(), null)) {
												_ist.shrink(1);
												_ist.setDamageValue(0);
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
