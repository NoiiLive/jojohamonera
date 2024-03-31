
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jojohe.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.jojohe.entity.ZoomPunchRProjectileEntity;
import net.mcreator.jojohe.entity.ZombieMinionNOAIEntity;
import net.mcreator.jojohe.entity.ZombieMinionEntity;
import net.mcreator.jojohe.entity.WineCutterProjectileEntity;
import net.mcreator.jojohe.entity.WillAZeppeliEntity;
import net.mcreator.jojohe.entity.VampireSteedNOAIEntity;
import net.mcreator.jojohe.entity.VampireSteedEntityEntity;
import net.mcreator.jojohe.entity.Vampire4Entity;
import net.mcreator.jojohe.entity.Vampire3Entity;
import net.mcreator.jojohe.entity.Vampire2Entity;
import net.mcreator.jojohe.entity.Vampire1Entity;
import net.mcreator.jojohe.entity.TonpettyEntity;
import net.mcreator.jojohe.entity.TattooEntity;
import net.mcreator.jojohe.entity.TarkusEntity;
import net.mcreator.jojohe.entity.StraizoEntity;
import net.mcreator.jojohe.entity.SpeedBladeHatProjectileEntity;
import net.mcreator.jojohe.entity.SpaceRipperProjectileEntity;
import net.mcreator.jojohe.entity.ShadowDioEntity;
import net.mcreator.jojohe.entity.REOSpeedwagonEntity;
import net.mcreator.jojohe.entity.NecroDioEntity;
import net.mcreator.jojohe.entity.KnifeThrownProjectileEntity;
import net.mcreator.jojohe.entity.KempoMasterEntity;
import net.mcreator.jojohe.entity.JonathanJoestarEntity;
import net.mcreator.jojohe.entity.JackTheRipperEntity;
import net.mcreator.jojohe.entity.HoodedVampire4Entity;
import net.mcreator.jojohe.entity.HoodedVampire3Entity;
import net.mcreator.jojohe.entity.HoodedVampire2Entity;
import net.mcreator.jojohe.entity.HoodedVampire1Entity;
import net.mcreator.jojohe.entity.HamonUser4Entity;
import net.mcreator.jojohe.entity.HamonUser3Entity;
import net.mcreator.jojohe.entity.HamonUser2Entity;
import net.mcreator.jojohe.entity.HamonUser1Entity;
import net.mcreator.jojohe.entity.HamonShadowEntity;
import net.mcreator.jojohe.entity.DogHumanChimeraNOAIEntity;
import net.mcreator.jojohe.entity.DogHumanChimeraEntity;
import net.mcreator.jojohe.entity.DireEntity;
import net.mcreator.jojohe.entity.DioBrandoEntity;
import net.mcreator.jojohe.entity.ChamberEntityEntity;
import net.mcreator.jojohe.entity.CatBirdChimeraNOAIEntity;
import net.mcreator.jojohe.entity.CatBirdChimeraEntity;
import net.mcreator.jojohe.entity.BrufordEntity;
import net.mcreator.jojohe.entity.BloodDioEntity;
import net.mcreator.jojohe.JojoheMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class JojoheModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, JojoheMod.MODID);
	public static final RegistryObject<EntityType<JonathanJoestarEntity>> JONATHAN_JOESTAR = register("jonathan_joestar",
			EntityType.Builder.<JonathanJoestarEntity>of(JonathanJoestarEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(JonathanJoestarEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ShadowDioEntity>> SHADOW_DIO = register("shadow_dio", EntityType.Builder.<ShadowDioEntity>of(ShadowDioEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(69)
			.setUpdateInterval(3).setCustomClientFactory(ShadowDioEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BloodDioEntity>> BLOOD_DIO = register("blood_dio",
			EntityType.Builder.<BloodDioEntity>of(BloodDioEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(69).setUpdateInterval(3).setCustomClientFactory(BloodDioEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NecroDioEntity>> NECRO_DIO = register("necro_dio",
			EntityType.Builder.<NecroDioEntity>of(NecroDioEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(69).setUpdateInterval(3).setCustomClientFactory(NecroDioEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<REOSpeedwagonEntity>> REO_SPEEDWAGON = register("reo_speedwagon",
			EntityType.Builder.<REOSpeedwagonEntity>of(REOSpeedwagonEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(REOSpeedwagonEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TonpettyEntity>> TONPETTY = register("tonpetty",
			EntityType.Builder.<TonpettyEntity>of(TonpettyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TonpettyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DireEntity>> DIRE = register("dire",
			EntityType.Builder.<DireEntity>of(DireEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DireEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StraizoEntity>> STRAIZO = register("straizo",
			EntityType.Builder.<StraizoEntity>of(StraizoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(StraizoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BrufordEntity>> BRUFORD = register("bruford",
			EntityType.Builder.<BrufordEntity>of(BrufordEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(69).setUpdateInterval(3).setCustomClientFactory(BrufordEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TarkusEntity>> TARKUS = register("tarkus",
			EntityType.Builder.<TarkusEntity>of(TarkusEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(69).setUpdateInterval(3).setCustomClientFactory(TarkusEntity::new).fireImmune().sized(0.8f, 2.3f));
	public static final RegistryObject<EntityType<JackTheRipperEntity>> JACK_THE_RIPPER = register("jack_the_ripper",
			EntityType.Builder.<JackTheRipperEntity>of(JackTheRipperEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(JackTheRipperEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<KempoMasterEntity>> KEMPO_MASTER = register("kempo_master",
			EntityType.Builder.<KempoMasterEntity>of(KempoMasterEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KempoMasterEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TattooEntity>> TATTOO = register("tattoo",
			EntityType.Builder.<TattooEntity>of(TattooEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TattooEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Vampire1Entity>> VAMPIRE_1 = register("vampire_1",
			EntityType.Builder.<Vampire1Entity>of(Vampire1Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Vampire1Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Vampire2Entity>> VAMPIRE_2 = register("vampire_2",
			EntityType.Builder.<Vampire2Entity>of(Vampire2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Vampire2Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Vampire3Entity>> VAMPIRE_3 = register("vampire_3",
			EntityType.Builder.<Vampire3Entity>of(Vampire3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Vampire3Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Vampire4Entity>> VAMPIRE_4 = register("vampire_4",
			EntityType.Builder.<Vampire4Entity>of(Vampire4Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Vampire4Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HoodedVampire1Entity>> HOODED_VAMPIRE_1 = register("hooded_vampire_1",
			EntityType.Builder.<HoodedVampire1Entity>of(HoodedVampire1Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HoodedVampire1Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HoodedVampire2Entity>> HOODED_VAMPIRE_2 = register("hooded_vampire_2",
			EntityType.Builder.<HoodedVampire2Entity>of(HoodedVampire2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HoodedVampire2Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HoodedVampire3Entity>> HOODED_VAMPIRE_3 = register("hooded_vampire_3",
			EntityType.Builder.<HoodedVampire3Entity>of(HoodedVampire3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HoodedVampire3Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HoodedVampire4Entity>> HOODED_VAMPIRE_4 = register("hooded_vampire_4",
			EntityType.Builder.<HoodedVampire4Entity>of(HoodedVampire4Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HoodedVampire4Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HamonUser1Entity>> HAMON_USER_1 = register("hamon_user_1",
			EntityType.Builder.<HamonUser1Entity>of(HamonUser1Entity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HamonUser1Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HamonUser2Entity>> HAMON_USER_2 = register("hamon_user_2",
			EntityType.Builder.<HamonUser2Entity>of(HamonUser2Entity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HamonUser2Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HamonUser3Entity>> HAMON_USER_3 = register("hamon_user_3",
			EntityType.Builder.<HamonUser3Entity>of(HamonUser3Entity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HamonUser3Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HamonUser4Entity>> HAMON_USER_4 = register("hamon_user_4",
			EntityType.Builder.<HamonUser4Entity>of(HamonUser4Entity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HamonUser4Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ZombieMinionEntity>> ZOMBIE_MINION = register("zombie_minion",
			EntityType.Builder.<ZombieMinionEntity>of(ZombieMinionEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ZombieMinionEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ZombieMinionNOAIEntity>> ZOMBIE_MINION_NOAI = register("zombie_minion_noai",
			EntityType.Builder.<ZombieMinionNOAIEntity>of(ZombieMinionNOAIEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(1).setUpdateInterval(3).setCustomClientFactory(ZombieMinionNOAIEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ChamberEntityEntity>> CHAMBER_ENTITY = register("chamber_entity",
			EntityType.Builder.<ChamberEntityEntity>of(ChamberEntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(1).setUpdateInterval(3).setCustomClientFactory(ChamberEntityEntity::new)

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<CatBirdChimeraEntity>> CAT_BIRD_CHIMERA = register("cat_bird_chimera",
			EntityType.Builder.<CatBirdChimeraEntity>of(CatBirdChimeraEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CatBirdChimeraEntity::new)

					.sized(0.5f, 1f));
	public static final RegistryObject<EntityType<DogHumanChimeraEntity>> DOG_HUMAN_CHIMERA = register("dog_human_chimera",
			EntityType.Builder.<DogHumanChimeraEntity>of(DogHumanChimeraEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DogHumanChimeraEntity::new)

					.sized(0.5f, 1f));
	public static final RegistryObject<EntityType<VampireSteedEntityEntity>> VAMPIRE_STEED_ENTITY = register("vampire_steed_entity",
			EntityType.Builder.<VampireSteedEntityEntity>of(VampireSteedEntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(VampireSteedEntityEntity::new)

					.sized(1f, 1.8f));
	public static final RegistryObject<EntityType<VampireSteedNOAIEntity>> VAMPIRE_STEED_NOAI = register("vampire_steed_noai",
			EntityType.Builder.<VampireSteedNOAIEntity>of(VampireSteedNOAIEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(VampireSteedNOAIEntity::new)

					.sized(1f, 1.8f));
	public static final RegistryObject<EntityType<DogHumanChimeraNOAIEntity>> DOG_HUMAN_CHIMERA_NOAI = register("dog_human_chimera_noai",
			EntityType.Builder.<DogHumanChimeraNOAIEntity>of(DogHumanChimeraNOAIEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DogHumanChimeraNOAIEntity::new)

					.sized(0.5f, 1f));
	public static final RegistryObject<EntityType<CatBirdChimeraNOAIEntity>> CAT_BIRD_CHIMERA_NOAI = register("cat_bird_chimera_noai",
			EntityType.Builder.<CatBirdChimeraNOAIEntity>of(CatBirdChimeraNOAIEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CatBirdChimeraNOAIEntity::new)

					.sized(0.5f, 1f));
	public static final RegistryObject<EntityType<HamonShadowEntity>> HAMON_SHADOW = register("hamon_shadow",
			EntityType.Builder.<HamonShadowEntity>of(HamonShadowEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HamonShadowEntity::new)

					.sized(0.1f, 0.1f));
	public static final RegistryObject<EntityType<SpaceRipperProjectileEntity>> SPACE_RIPPER_PROJECTILE = register("projectile_space_ripper_projectile",
			EntityType.Builder.<SpaceRipperProjectileEntity>of(SpaceRipperProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(SpaceRipperProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ZoomPunchRProjectileEntity>> ZOOM_PUNCH_R_PROJECTILE = register("projectile_zoom_punch_r_projectile", EntityType.Builder
			.<ZoomPunchRProjectileEntity>of(ZoomPunchRProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(ZoomPunchRProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SpeedBladeHatProjectileEntity>> SPEED_BLADE_HAT_PROJECTILE = register("projectile_speed_blade_hat_projectile",
			EntityType.Builder.<SpeedBladeHatProjectileEntity>of(SpeedBladeHatProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(SpeedBladeHatProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<KnifeThrownProjectileEntity>> KNIFE_THROWN_PROJECTILE = register("projectile_knife_thrown_projectile",
			EntityType.Builder.<KnifeThrownProjectileEntity>of(KnifeThrownProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(KnifeThrownProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<WineCutterProjectileEntity>> WINE_CUTTER_PROJECTILE = register("projectile_wine_cutter_projectile", EntityType.Builder.<WineCutterProjectileEntity>of(WineCutterProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(WineCutterProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DioBrandoEntity>> DIO_BRANDO = register("dio_brando",
			EntityType.Builder.<DioBrandoEntity>of(DioBrandoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DioBrandoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WillAZeppeliEntity>> WILL_A_ZEPPELI = register("will_a_zeppeli",
			EntityType.Builder.<WillAZeppeliEntity>of(WillAZeppeliEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WillAZeppeliEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			JonathanJoestarEntity.init();
			ShadowDioEntity.init();
			BloodDioEntity.init();
			NecroDioEntity.init();
			REOSpeedwagonEntity.init();
			TonpettyEntity.init();
			DireEntity.init();
			StraizoEntity.init();
			BrufordEntity.init();
			TarkusEntity.init();
			JackTheRipperEntity.init();
			KempoMasterEntity.init();
			TattooEntity.init();
			Vampire1Entity.init();
			Vampire2Entity.init();
			Vampire3Entity.init();
			Vampire4Entity.init();
			HoodedVampire1Entity.init();
			HoodedVampire2Entity.init();
			HoodedVampire3Entity.init();
			HoodedVampire4Entity.init();
			HamonUser1Entity.init();
			HamonUser2Entity.init();
			HamonUser3Entity.init();
			HamonUser4Entity.init();
			ZombieMinionEntity.init();
			ZombieMinionNOAIEntity.init();
			ChamberEntityEntity.init();
			CatBirdChimeraEntity.init();
			DogHumanChimeraEntity.init();
			VampireSteedEntityEntity.init();
			VampireSteedNOAIEntity.init();
			DogHumanChimeraNOAIEntity.init();
			CatBirdChimeraNOAIEntity.init();
			HamonShadowEntity.init();
			DioBrandoEntity.init();
			WillAZeppeliEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(JONATHAN_JOESTAR.get(), JonathanJoestarEntity.createAttributes().build());
		event.put(SHADOW_DIO.get(), ShadowDioEntity.createAttributes().build());
		event.put(BLOOD_DIO.get(), BloodDioEntity.createAttributes().build());
		event.put(NECRO_DIO.get(), NecroDioEntity.createAttributes().build());
		event.put(REO_SPEEDWAGON.get(), REOSpeedwagonEntity.createAttributes().build());
		event.put(TONPETTY.get(), TonpettyEntity.createAttributes().build());
		event.put(DIRE.get(), DireEntity.createAttributes().build());
		event.put(STRAIZO.get(), StraizoEntity.createAttributes().build());
		event.put(BRUFORD.get(), BrufordEntity.createAttributes().build());
		event.put(TARKUS.get(), TarkusEntity.createAttributes().build());
		event.put(JACK_THE_RIPPER.get(), JackTheRipperEntity.createAttributes().build());
		event.put(KEMPO_MASTER.get(), KempoMasterEntity.createAttributes().build());
		event.put(TATTOO.get(), TattooEntity.createAttributes().build());
		event.put(VAMPIRE_1.get(), Vampire1Entity.createAttributes().build());
		event.put(VAMPIRE_2.get(), Vampire2Entity.createAttributes().build());
		event.put(VAMPIRE_3.get(), Vampire3Entity.createAttributes().build());
		event.put(VAMPIRE_4.get(), Vampire4Entity.createAttributes().build());
		event.put(HOODED_VAMPIRE_1.get(), HoodedVampire1Entity.createAttributes().build());
		event.put(HOODED_VAMPIRE_2.get(), HoodedVampire2Entity.createAttributes().build());
		event.put(HOODED_VAMPIRE_3.get(), HoodedVampire3Entity.createAttributes().build());
		event.put(HOODED_VAMPIRE_4.get(), HoodedVampire4Entity.createAttributes().build());
		event.put(HAMON_USER_1.get(), HamonUser1Entity.createAttributes().build());
		event.put(HAMON_USER_2.get(), HamonUser2Entity.createAttributes().build());
		event.put(HAMON_USER_3.get(), HamonUser3Entity.createAttributes().build());
		event.put(HAMON_USER_4.get(), HamonUser4Entity.createAttributes().build());
		event.put(ZOMBIE_MINION.get(), ZombieMinionEntity.createAttributes().build());
		event.put(ZOMBIE_MINION_NOAI.get(), ZombieMinionNOAIEntity.createAttributes().build());
		event.put(CHAMBER_ENTITY.get(), ChamberEntityEntity.createAttributes().build());
		event.put(CAT_BIRD_CHIMERA.get(), CatBirdChimeraEntity.createAttributes().build());
		event.put(DOG_HUMAN_CHIMERA.get(), DogHumanChimeraEntity.createAttributes().build());
		event.put(VAMPIRE_STEED_ENTITY.get(), VampireSteedEntityEntity.createAttributes().build());
		event.put(VAMPIRE_STEED_NOAI.get(), VampireSteedNOAIEntity.createAttributes().build());
		event.put(DOG_HUMAN_CHIMERA_NOAI.get(), DogHumanChimeraNOAIEntity.createAttributes().build());
		event.put(CAT_BIRD_CHIMERA_NOAI.get(), CatBirdChimeraNOAIEntity.createAttributes().build());
		event.put(HAMON_SHADOW.get(), HamonShadowEntity.createAttributes().build());
		event.put(DIO_BRANDO.get(), DioBrandoEntity.createAttributes().build());
		event.put(WILL_A_ZEPPELI.get(), WillAZeppeliEntity.createAttributes().build());
	}
}
