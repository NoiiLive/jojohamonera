package net.mcreator.jojohe.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.jojohe.network.JojoheModVariables;
import net.mcreator.jojohe.init.JojoheModMobEffects;
import net.mcreator.jojohe.init.JojoheModEnchantments;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PillarmanConstantProcedure {
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
		if (((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).PlayerRace).equals("Pillarman")) {
			if (((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).AbilityRoot).equals("PillarMan")) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(JojoheModMobEffects.VAMPIRISM.get(), 696969, 0, false, false));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 60, 1, false, false));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 60, 1, false, false));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 60, 2, false, false));
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"attribute @p minecraft:generic.max_health base set 28");
				if (entity.isInWaterRainOrBubble()) {
					entity.clearFire();
				} else {
					if (EnchantmentHelper.getItemEnchantmentLevel(JojoheModEnchantments.SUNSCREEN.get(), (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)) != 0
							&& (entity instanceof ServerPlayer _plr9 && _plr9.level() instanceof ServerLevel
									&& _plr9.getAdvancements().getOrStartProgress(_plr9.server.getAdvancements().getAdvancement(new ResourceLocation("jojohe:sunscreen_achieve"))).isDone()) == false) {
						if (entity instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojohe:sunscreen_achieve"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					} else {
						if (EnchantmentHelper.getItemEnchantmentLevel(JojoheModEnchantments.SUNSCREEN.get(), (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)) != 0) {
						} else {
							if (world instanceof Level _lvl13 && _lvl13.isDay() && world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 1, z)) == true && (entity instanceof ServerPlayer _plr15 && _plr15.level() instanceof ServerLevel
									&& _plr15.getAdvancements().getOrStartProgress(_plr15.server.getAdvancements().getAdvancement(new ResourceLocation("jojohe:hothot"))).isDone()) == false) {
								if (entity instanceof LivingEntity _entity)
									_entity.hurt(new DamageSource(_entity.level().registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)) {
										@Override
										public Component getLocalizedDeathMessage(LivingEntity _msgEntity) {
											String _translatekey = "death.attack." + "sunlight";
											if (this.getEntity() == null && this.getDirectEntity() == null) {
												return _msgEntity.getKillCredit() != null
														? Component.translatable(_translatekey + ".player", _msgEntity.getDisplayName(), _msgEntity.getKillCredit().getDisplayName())
														: Component.translatable(_translatekey, _msgEntity.getDisplayName());
											} else {
												Component _component = this.getEntity() == null ? this.getDirectEntity().getDisplayName() : this.getEntity().getDisplayName();
												ItemStack _itemstack = ItemStack.EMPTY;
												if (this.getEntity() instanceof LivingEntity _livingentity)
													_itemstack = _livingentity.getMainHandItem();
												return !_itemstack.isEmpty() && _itemstack.hasCustomHoverName()
														? Component.translatable(_translatekey + ".item", _msgEntity.getDisplayName(), _component, _itemstack.getDisplayName())
														: Component.translatable(_translatekey, _msgEntity.getDisplayName(), _component);
											}
										}
									}, 2);
								if (entity instanceof ServerPlayer _player) {
									Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojohe:hothot"));
									AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
									if (!_ap.isDone()) {
										for (String criteria : _ap.getRemainingCriteria())
											_player.getAdvancements().award(_adv, criteria);
									}
								}
							} else {
								if (world instanceof Level _lvl18 && _lvl18.isDay() && world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 1, z)) == true) {
									if (entity instanceof LivingEntity _entity)
										_entity.hurt(new DamageSource(_entity.level().registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)) {
											@Override
											public Component getLocalizedDeathMessage(LivingEntity _msgEntity) {
												String _translatekey = "death.attack." + "sunlight";
												if (this.getEntity() == null && this.getDirectEntity() == null) {
													return _msgEntity.getKillCredit() != null
															? Component.translatable(_translatekey + ".player", _msgEntity.getDisplayName(), _msgEntity.getKillCredit().getDisplayName())
															: Component.translatable(_translatekey, _msgEntity.getDisplayName());
												} else {
													Component _component = this.getEntity() == null ? this.getDirectEntity().getDisplayName() : this.getEntity().getDisplayName();
													ItemStack _itemstack = ItemStack.EMPTY;
													if (this.getEntity() instanceof LivingEntity _livingentity)
														_itemstack = _livingentity.getMainHandItem();
													return !_itemstack.isEmpty() && _itemstack.hasCustomHoverName()
															? Component.translatable(_translatekey + ".item", _msgEntity.getDisplayName(), _component, _itemstack.getDisplayName())
															: Component.translatable(_translatekey, _msgEntity.getDisplayName(), _component);
												}
											}
										}, 2);
								}
							}
						}
					}
				}
				if (entity instanceof LivingEntity _livEnt21 && _livEnt21.hasEffect(JojoheModMobEffects.HAMON.get())) {
					if (entity instanceof LivingEntity _entity)
						_entity.hurt(new DamageSource(_entity.level().registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)) {
							@Override
							public Component getLocalizedDeathMessage(LivingEntity _msgEntity) {
								String _translatekey = "death.attack." + "hamonpower";
								if (this.getEntity() == null && this.getDirectEntity() == null) {
									return _msgEntity.getKillCredit() != null
											? Component.translatable(_translatekey + ".player", _msgEntity.getDisplayName(), _msgEntity.getKillCredit().getDisplayName())
											: Component.translatable(_translatekey, _msgEntity.getDisplayName());
								} else {
									Component _component = this.getEntity() == null ? this.getDirectEntity().getDisplayName() : this.getEntity().getDisplayName();
									ItemStack _itemstack = ItemStack.EMPTY;
									if (this.getEntity() instanceof LivingEntity _livingentity)
										_itemstack = _livingentity.getMainHandItem();
									return !_itemstack.isEmpty() && _itemstack.hasCustomHoverName()
											? Component.translatable(_translatekey + ".item", _msgEntity.getDisplayName(), _component, _itemstack.getDisplayName())
											: Component.translatable(_translatekey, _msgEntity.getDisplayName(), _component);
								}
							}
						}, 2);
				}
			}
		}
	}
}
