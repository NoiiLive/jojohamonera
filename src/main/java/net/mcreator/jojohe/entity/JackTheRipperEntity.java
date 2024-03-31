
package net.mcreator.jojohe.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RestrictSunGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.MoveBackToVillageGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.BreakDoorGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;

import net.mcreator.jojohe.procedures.AttackHumanProcedure;
import net.mcreator.jojohe.init.JojoheModItems;
import net.mcreator.jojohe.init.JojoheModEntities;

public class JackTheRipperEntity extends Monster {
	public JackTheRipperEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(JojoheModEntities.JACK_THE_RIPPER.get(), world);
	}

	public JackTheRipperEntity(EntityType<JackTheRipperEntity> type, Level world) {
		super(type, world);
		setMaxUpStep(0.6f);
		xpReward = 10;
		setNoAi(false);
		setPersistenceRequired();
		this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(JojoheModItems.JACK_THE_RIPPER_KNIFE.get()));
		this.setItemSlot(EquipmentSlot.CHEST, new ItemStack(JojoheModItems.JACK_THE_RIPPER_ARMOR_CHESTPLATE.get()));
		this.setItemSlot(EquipmentSlot.LEGS, new ItemStack(JojoheModItems.JACK_THE_RIPPER_ARMOR_LEGGINGS.get()));
		this.setItemSlot(EquipmentSlot.FEET, new ItemStack(JojoheModItems.JACK_THE_RIPPER_ARMOR_BOOTS.get()));
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new RestrictSunGoal(this));
		this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, JonathanJoestarEntity.class, true, true));
		this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, WillAZeppeliEntity.class, true, true));
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, REOSpeedwagonEntity.class, true, true));
		this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, TonpettyEntity.class, true, true));
		this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, DireEntity.class, true, true));
		this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, StraizoEntity.class, true, true));
		this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, HamonUser1Entity.class, true, true));
		this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, HamonUser2Entity.class, true, true));
		this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, HamonUser3Entity.class, true, true));
		this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, HamonUser4Entity.class, true, true));
		this.goalSelector.addGoal(12, new MeleeAttackGoal(this, 1.2, false) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}
		});
		this.targetSelector.addGoal(13, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(14, new RandomStrollGoal(this, 1));
		this.goalSelector.addGoal(15, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(16, new FloatGoal(this));
		this.goalSelector.addGoal(17, new MoveBackToVillageGoal(this, 0.6, false));
		this.goalSelector.addGoal(18, new BreakDoorGoal(this, e -> true));
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEAD;
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
		this.spawnAtLocation(new ItemStack(JojoheModItems.JACK_THE_RIPPER_KNIFE.get()));
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
	public void baseTick() {
		super.baseTick();
		AttackHumanProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ(), this);
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.4);
		builder = builder.add(Attributes.MAX_HEALTH, 25);
		builder = builder.add(Attributes.ARMOR, 2);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 4);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		return builder;
	}
}
