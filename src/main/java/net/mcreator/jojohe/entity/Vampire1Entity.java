
package net.mcreator.jojohe.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.Blocks;
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
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.Difficulty;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;

import net.mcreator.jojohe.procedures.AttackHumanProcedure;
import net.mcreator.jojohe.init.JojoheModItems;
import net.mcreator.jojohe.init.JojoheModEntities;

public class Vampire1Entity extends Monster {
	public Vampire1Entity(PlayMessages.SpawnEntity packet, Level world) {
		this(JojoheModEntities.VAMPIRE_1.get(), world);
	}

	public Vampire1Entity(EntityType<Vampire1Entity> type, Level world) {
		super(type, world);
		setMaxUpStep(0.6f);
		xpReward = 1;
		setNoAi(false);
		this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(JojoheModItems.IRON_KNIFE.get()));
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
		this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, REOSpeedwagonEntity.class, true, true));
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, WillAZeppeliEntity.class, true, true));
		this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, StraizoEntity.class, true, true));
		this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, DireEntity.class, true, true));
		this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, TonpettyEntity.class, true, true));
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
		this.goalSelector.addGoal(14, new MoveBackToVillageGoal(this, 0.6, false));
		this.goalSelector.addGoal(15, new BreakDoorGoal(this, e -> true));
		this.goalSelector.addGoal(16, new RandomStrollGoal(this, 1));
		this.goalSelector.addGoal(17, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(18, new FloatGoal(this));
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEAD;
	}

	@Override
	public double getMyRidingOffset() {
		return -0.35D;
	}

	protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
		super.dropCustomDeathLoot(source, looting, recentlyHitIn);
		this.spawnAtLocation(new ItemStack(Blocks.AIR));
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
		SpawnPlacements.register(JojoheModEntities.VAMPIRE_1.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> (world.getDifficulty() != Difficulty.PEACEFUL && Monster.isDarkEnoughToSpawn(world, pos, random) && Mob.checkMobSpawnRules(entityType, world, reason, pos, random)));
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.5);
		builder = builder.add(Attributes.MAX_HEALTH, 28);
		builder = builder.add(Attributes.ARMOR, 2);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 5);
		builder = builder.add(Attributes.FOLLOW_RANGE, 20);
		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.1);
		builder = builder.add(Attributes.ATTACK_KNOCKBACK, 0.1);
		return builder;
	}
}
