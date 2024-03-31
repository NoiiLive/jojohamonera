package net.mcreator.jojohe.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.core.registries.Registries;

import net.mcreator.jojohe.network.JojoheModVariables;

public class HamonMaskDurabilityProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).PlayerRace).equals("Hamon User")) {
			if (!((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).UnlockedHamonMoves).contains("ChargedBreathing")) {
				if (entity.getPersistentData().getDouble("MaskCD") > 0) {
					entity.getPersistentData().putDouble("MaskCD", (entity.getPersistentData().getDouble("MaskCD") - 1));
				}
				if (entity.getPersistentData().getDouble("MaskCD") <= 0) {
					entity.getPersistentData().putDouble("MaskCD", 1200);
					if ((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).HamonMastery < (entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new JojoheModVariables.PlayerVariables())).MaxHamonMastery) {
						{
							double _setval = (entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).HamonMastery + 1;
							entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.HamonMastery = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							ItemStack _ist = itemstack;
							if (_ist.hurt(1, RandomSource.create(), null)) {
								_ist.shrink(1);
								_ist.setDamageValue(0);
							}
						}
					} else if ((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).MaxHamonMastery < 100) {
						{
							double _setval = (entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).MaxHamonMastery + 1;
							entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.MaxHamonMastery = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							ItemStack _ist = itemstack;
							if (_ist.hurt(1, RandomSource.create(), null)) {
								_ist.shrink(1);
								_ist.setDamageValue(0);
							}
						}
					}
				}
				if (entity.getPersistentData().getDouble("MaskHamonCD") > 0) {
					entity.getPersistentData().putDouble("MaskHamonCD", (entity.getPersistentData().getDouble("MaskHamonCD") - 1));
					if (entity.isSprinting()) {
						entity.getPersistentData().putDouble("MaskHamonCD", (entity.getPersistentData().getDouble("MaskHamonCD") - 1));
					}
				}
				if (entity.getPersistentData().getDouble("MaskHamonCD") <= 0) {
					if ((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).HamonBar > 0) {
						{
							double _setval = (entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).HamonBar - 1;
							entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.HamonBar = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						entity.getPersistentData().putDouble("MaskHamonCD", 200);
					} else if ((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).HamonBar == 0) {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.DRY_OUT)), 2);
						entity.getPersistentData().putDouble("MaskHamonCD", 40);
					}
					{
						double _setval = 300;
						entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.HamonRegenCD = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
			if (((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).UnlockedHamonMoves).contains("ChargedBreathing")) {
				if (entity.getPersistentData().getDouble("MaskCD") > 0) {
					entity.getPersistentData().putDouble("MaskCD", (entity.getPersistentData().getDouble("MaskCD") - 1));
				}
				if (entity.getPersistentData().getDouble("MaskCD") <= 0) {
					entity.getPersistentData().putDouble("MaskCD", 600);
					if ((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).HamonMastery < (entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new JojoheModVariables.PlayerVariables())).MaxHamonMastery) {
						{
							double _setval = (entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).HamonMastery + 1;
							entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.HamonMastery = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							ItemStack _ist = itemstack;
							if (_ist.hurt(1, RandomSource.create(), null)) {
								_ist.shrink(1);
								_ist.setDamageValue(0);
							}
						}
					} else if ((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).MaxHamonMastery < 100) {
						{
							double _setval = (entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).MaxHamonMastery + 1;
							entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.MaxHamonMastery = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
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
		if (!(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BINDING_CURSE, itemstack) != 0)) {
			itemstack.enchant(Enchantments.BINDING_CURSE, 1);
		}
	}
}
