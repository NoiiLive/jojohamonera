
package net.mcreator.jojohe.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.OpenDoorGoal;
import net.minecraft.world.entity.ai.goal.MoveBackToVillageGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;

import net.mcreator.jojohe.procedures.SpeedChoiceMenuProcedure;
import net.mcreator.jojohe.procedures.AttackVampiresProcedure;
import net.mcreator.jojohe.init.JojoheModItems;
import net.mcreator.jojohe.init.JojoheModEntities;

public class REOSpeedwagonEntity extends Monster {
	public REOSpeedwagonEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(JojoheModEntities.REO_SPEEDWAGON.get(), world);
	}

	public REOSpeedwagonEntity(EntityType<REOSpeedwagonEntity> type, Level world) {
		super(type, world);
		setMaxUpStep(0.6f);
		xpReward = 10;
		setNoAi(false);
		setPersistenceRequired();
		this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(JojoheModItems.SPEEDWAGONS_HAMMER.get()));
		this.setItemSlot(EquipmentSlot.HEAD, new ItemStack(JojoheModItems.SPEEDWAGON_ARMOR_HELMET.get()));
		this.setItemSlot(EquipmentSlot.CHEST, new ItemStack(JojoheModItems.SPEEDWAGON_ARMOR_CHESTPLATE.get()));
		this.setItemSlot(EquipmentSlot.LEGS, new ItemStack(JojoheModItems.SPEEDWAGON_ARMOR_LEGGINGS.get()));
		this.setItemSlot(EquipmentSlot.FEET, new ItemStack(JojoheModItems.SPEEDWAGON_ARMOR_BOOTS.get()));
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.getNavigation().getNodeEvaluator().setCanOpenDoors(true);
		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2, false) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}
		});
		this.targetSelector.addGoal(2, new HurtByTargetGoal(this));
		this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, DioBrandoEntity.class, true, true));
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, BrufordEntity.class, true, true));
		this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, ZombieMinionEntity.class, true, true));
		this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, ZombieMinionNOAIEntity.class, true, true));
		this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, TarkusEntity.class, true, true));
		this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, Vampire1Entity.class, true, true));
		this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, Vampire2Entity.class, true, true));
		this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, Vampire3Entity.class, true, true));
		this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, Vampire4Entity.class, true, true));
		this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, HoodedVampire1Entity.class, true, true));
		this.targetSelector.addGoal(13, new NearestAttackableTargetGoal(this, HoodedVampire2Entity.class, true, true));
		this.targetSelector.addGoal(14, new NearestAttackableTargetGoal(this, HoodedVampire3Entity.class, true, true));
		this.targetSelector.addGoal(15, new NearestAttackableTargetGoal(this, HoodedVampire4Entity.class, true, true));
		this.targetSelector.addGoal(16, new NearestAttackableTargetGoal(this, JackTheRipperEntity.class, true, true));
		this.targetSelector.addGoal(17, new NearestAttackableTargetGoal(this, BloodDioEntity.class, true, true));
		this.targetSelector.addGoal(18, new NearestAttackableTargetGoal(this, NecroDioEntity.class, true, true));
		this.targetSelector.addGoal(19, new NearestAttackableTargetGoal(this, ShadowDioEntity.class, true, true));
		this.goalSelector.addGoal(20, new RandomStrollGoal(this, 1));
		this.goalSelector.addGoal(21, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(22, new FloatGoal(this));
		this.goalSelector.addGoal(23, new OpenDoorGoal(this, true));
		this.goalSelector.addGoal(24, new OpenDoorGoal(this, false));
		this.goalSelector.addGoal(25, new MoveBackToVillageGoal(this, 0.6, false));
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
	}

	@Override
	public double getMyRidingOffset() {
		return -0.35D;
	}

	protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
		super.dropCustomDeathLoot(source, looting, recentlyHitIn);
		this.spawnAtLocation(new ItemStack(JojoheModItems.SPEEDWAGONS_HAMMER.get()));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
	}

	@Override
	public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
		ItemStack itemstack = sourceentity.getItemInHand(hand);
		InteractionResult retval = InteractionResult.sidedSuccess(this.level().isClientSide());
		super.mobInteract(sourceentity, hand);
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Entity entity = this;
		Level world = this.level();

		SpeedChoiceMenuProcedure.execute(world, x, y, z, sourceentity);
		return retval;
	}

	@Override
	public void baseTick() {
		super.baseTick();
		AttackVampiresProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ(), this);
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 30);
		builder = builder.add(Attributes.ARMOR, 2);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 4);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		return builder;
	}
}
