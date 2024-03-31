package net.mcreator.jojohe.network;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.level.saveddata.SavedData;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import net.mcreator.jojohe.JojoheMod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class JojoheModVariables {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		JojoheMod.addNetworkMessage(SavedDataSyncMessage.class, SavedDataSyncMessage::buffer, SavedDataSyncMessage::new, SavedDataSyncMessage::handler);
		JojoheMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			clone.AbilityType = original.AbilityType;
			clone.JoinedWorld = original.JoinedWorld;
			clone.HamonWarrior = original.HamonWarrior;
			clone.HamonDefender = original.HamonDefender;
			clone.HamonWisdom = original.HamonWisdom;
			clone.HamonHermit = original.HamonHermit;
			clone.AbilityRoot = original.AbilityRoot;
			clone.VampireOriginal = original.VampireOriginal;
			clone.VampireBlood = original.VampireBlood;
			clone.VampireShadow = original.VampireShadow;
			clone.VampireNecro = original.VampireNecro;
			clone.HumanBoxing = original.HumanBoxing;
			clone.HumanStreetFighter = original.HumanStreetFighter;
			clone.HumanCyborg = original.HumanCyborg;
			clone.PillarMan = original.PillarMan;
			clone.PillarWind = original.PillarWind;
			clone.PillarFlame = original.PillarFlame;
			clone.PillarLight = original.PillarLight;
			clone.PillarUltimate = original.PillarUltimate;
			clone.HamonTrickster = original.HamonTrickster;
			clone.HamonBubbly = original.HamonBubbly;
			clone.HamonStylish = original.HamonStylish;
			clone.DisplayValue = original.DisplayValue;
			clone.JoJoMuscles = original.JoJoMuscles;
			clone.StandUser = original.StandUser;
			clone.StandSummoned = original.StandSummoned;
			clone.TimeStopped = original.TimeStopped;
			clone.AbilityWheelGUI = original.AbilityWheelGUI;
			clone.PlayerRace = original.PlayerRace;
			clone.MaxHamonBar = original.MaxHamonBar;
			clone.MaxBloodBar = original.MaxBloodBar;
			clone.AbilitySlot1 = original.AbilitySlot1;
			clone.AbilitySlot2 = original.AbilitySlot2;
			clone.AbilitySlot3 = original.AbilitySlot3;
			clone.AbilitySlot4 = original.AbilitySlot4;
			clone.AbilitySlot5 = original.AbilitySlot5;
			clone.AbilitySlot6 = original.AbilitySlot6;
			clone.AbilitySlot7 = original.AbilitySlot7;
			clone.AbilitySlot8 = original.AbilitySlot8;
			clone.AbilitySlot9 = original.AbilitySlot9;
			clone.UseAbilityType = original.UseAbilityType;
			clone.WOSUseAbilityType = original.WOSUseAbilityType;
			clone.AbilityCost1 = original.AbilityCost1;
			clone.AbilityCost2 = original.AbilityCost2;
			clone.AbilityCost3 = original.AbilityCost3;
			clone.AbilityCost4 = original.AbilityCost4;
			clone.AbilityCost5 = original.AbilityCost5;
			clone.AbilityCost6 = original.AbilityCost6;
			clone.AbilityCost7 = original.AbilityCost7;
			clone.AbilityCost8 = original.AbilityCost8;
			clone.AbilityCost9 = original.AbilityCost9;
			clone.AbilityCDLength1 = original.AbilityCDLength1;
			clone.AbilityCDLength2 = original.AbilityCDLength2;
			clone.AbilityCDLength3 = original.AbilityCDLength3;
			clone.AbilityCDLength4 = original.AbilityCDLength4;
			clone.AbilityCDLength5 = original.AbilityCDLength5;
			clone.AbilityCDLength6 = original.AbilityCDLength6;
			clone.AbilityCDLength7 = original.AbilityCDLength7;
			clone.AbilityCDLength8 = original.AbilityCDLength8;
			clone.AbilityCDLength9 = original.AbilityCDLength9;
			clone.CurrentEXP = original.CurrentEXP;
			clone.MaxEXP = original.MaxEXP;
			clone.PlayerLevel = original.PlayerLevel;
			clone.SkillPoints = original.SkillPoints;
			clone.PassiveEXPCD = original.PassiveEXPCD;
			clone.HamonEnvious = original.HamonEnvious;
			clone.PlayerStrength = original.PlayerStrength;
			clone.PlayerSpeed = original.PlayerSpeed;
			clone.PlayerDurability = original.PlayerDurability;
			clone.PlayerWillpower = original.PlayerWillpower;
			clone.PlayerMaxStrength = original.PlayerMaxStrength;
			clone.PlayerMaxSpeed = original.PlayerMaxSpeed;
			clone.PlayerMaxDurability = original.PlayerMaxDurability;
			clone.PlayerMaxWillpower = original.PlayerMaxWillpower;
			clone.HumanMastery = original.HumanMastery;
			clone.HamonMastery = original.HamonMastery;
			clone.VampireMastery = original.VampireMastery;
			clone.PillarmanMastery = original.PillarmanMastery;
			clone.MaxHumanMastery = original.MaxHumanMastery;
			clone.MaxHamonMastery = original.MaxHamonMastery;
			clone.MaxVampireMastery = original.MaxVampireMastery;
			clone.MaxPillarmanMastery = original.MaxPillarmanMastery;
			clone.HumanOriginal = original.HumanOriginal;
			clone.HumanKnight = original.HumanKnight;
			clone.VampireWeak = original.VampireWeak;
			clone.UnlockedHamonMoves = original.UnlockedHamonMoves;
			clone.UnlockedHumanMoves = original.UnlockedHumanMoves;
			clone.UnlockedVampireMoves = original.UnlockedVampireMoves;
			clone.UnlockedPillarmanMoves = original.UnlockedPillarmanMoves;
			if (!event.isWasDeath()) {
				clone.BloodBar = original.BloodBar;
				clone.HamonBar = original.HamonBar;
				clone.AbilityGate = original.AbilityGate;
				clone.AbilitySelected = original.AbilitySelected;
				clone.FleshbudOwner = original.FleshbudOwner;
				clone.Fleshbudded = original.Fleshbudded;
				clone.ZombieGate = original.ZombieGate;
				clone.DisableDamage = original.DisableDamage;
				clone.SwitchWheels = original.SwitchWheels;
				clone.HamonRegenCD = original.HamonRegenCD;
				clone.BloodRegenCD = original.BloodRegenCD;
				clone.AbilityCooldown1 = original.AbilityCooldown1;
				clone.AbilityCooldown2 = original.AbilityCooldown2;
				clone.AbilityCooldown3 = original.AbilityCooldown3;
				clone.AbilityCooldown4 = original.AbilityCooldown4;
				clone.AbilityCooldown5 = original.AbilityCooldown5;
				clone.AbilityCooldown6 = original.AbilityCooldown6;
				clone.AbilityCooldown7 = original.AbilityCooldown7;
				clone.AbilityCooldown8 = original.AbilityCooldown8;
				clone.AbilityCooldown9 = original.AbilityCooldown9;
				clone.ChargingHamon = original.ChargingHamon;
				clone.SwitcherSlot = original.SwitcherSlot;
				clone.RebindAbility = original.RebindAbility;
				clone.RebindAbilityCost = original.RebindAbilityCost;
				clone.RebindAbilityCD = original.RebindAbilityCD;
			}
		}

		@SubscribeEvent
		public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				SavedData mapdata = MapVariables.get(event.getEntity().level());
				SavedData worlddata = WorldVariables.get(event.getEntity().level());
				if (mapdata != null)
					JojoheMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(0, mapdata));
				if (worlddata != null)
					JojoheMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(1, worlddata));
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				SavedData worlddata = WorldVariables.get(event.getEntity().level());
				if (worlddata != null)
					JojoheMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(1, worlddata));
			}
		}
	}

	public static class WorldVariables extends SavedData {
		public static final String DATA_NAME = "jojohe_worldvars";

		public static WorldVariables load(CompoundTag tag) {
			WorldVariables data = new WorldVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level level && !level.isClientSide())
				JojoheMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(level::dimension), new SavedDataSyncMessage(1, this));
		}

		static WorldVariables clientSide = new WorldVariables();

		public static WorldVariables get(LevelAccessor world) {
			if (world instanceof ServerLevel level) {
				return level.getDataStorage().computeIfAbsent(e -> WorldVariables.load(e), WorldVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class MapVariables extends SavedData {
		public static final String DATA_NAME = "jojohe_mapvars";
		public boolean WorldOfStands = false;

		public static MapVariables load(CompoundTag tag) {
			MapVariables data = new MapVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			WorldOfStands = nbt.getBoolean("WorldOfStands");
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.putBoolean("WorldOfStands", WorldOfStands);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level && !world.isClientSide())
				JojoheMod.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new SavedDataSyncMessage(0, this));
		}

		static MapVariables clientSide = new MapVariables();

		public static MapVariables get(LevelAccessor world) {
			if (world instanceof ServerLevelAccessor serverLevelAcc) {
				return serverLevelAcc.getLevel().getServer().getLevel(Level.OVERWORLD).getDataStorage().computeIfAbsent(e -> MapVariables.load(e), MapVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class SavedDataSyncMessage {
		private final int type;
		private SavedData data;

		public SavedDataSyncMessage(FriendlyByteBuf buffer) {
			this.type = buffer.readInt();
			CompoundTag nbt = buffer.readNbt();
			if (nbt != null) {
				this.data = this.type == 0 ? new MapVariables() : new WorldVariables();
				if (this.data instanceof MapVariables mapVariables)
					mapVariables.read(nbt);
				else if (this.data instanceof WorldVariables worldVariables)
					worldVariables.read(nbt);
			}
		}

		public SavedDataSyncMessage(int type, SavedData data) {
			this.type = type;
			this.data = data;
		}

		public static void buffer(SavedDataSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeInt(message.type);
			if (message.data != null)
				buffer.writeNbt(message.data.save(new CompoundTag()));
		}

		public static void handler(SavedDataSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer() && message.data != null) {
					if (message.type == 0)
						MapVariables.clientSide = (MapVariables) message.data;
					else
						WorldVariables.clientSide = (WorldVariables) message.data;
				}
			});
			context.setPacketHandled(true);
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("jojohe", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public double AbilityType = 0.0;
		public double JoinedWorld = 0.0;
		public double BloodBar = -1.0;
		public double HamonBar = -1.0;
		public boolean AbilityGate = false;
		public boolean HamonWarrior = false;
		public boolean HamonDefender = false;
		public String AbilitySelected = "None";
		public boolean HamonWisdom = false;
		public boolean HamonHermit = false;
		public String AbilityRoot = "none";
		public boolean VampireOriginal = false;
		public boolean VampireBlood = false;
		public boolean VampireShadow = false;
		public boolean VampireNecro = false;
		public boolean HumanBoxing = false;
		public boolean HumanStreetFighter = false;
		public boolean HumanCyborg = false;
		public boolean PillarMan = false;
		public boolean PillarWind = false;
		public boolean PillarFlame = false;
		public boolean PillarLight = false;
		public boolean PillarUltimate = false;
		public boolean HamonTrickster = false;
		public boolean HamonBubbly = false;
		public boolean HamonStylish = false;
		public boolean DisplayValue = false;
		public String FleshbudOwner = "none";
		public boolean Fleshbudded = false;
		public boolean ZombieGate = false;
		public boolean JoJoMuscles = false;
		public boolean DisableDamage = false;
		public boolean StandUser = false;
		public boolean StandSummoned = false;
		public boolean TimeStopped = false;
		public double AbilityWheelGUI = 2.0;
		public boolean SwitchWheels = false;
		public String PlayerRace = "Human";
		public double HamonRegenCD = 0.0;
		public double BloodRegenCD = 0.0;
		public double AbilityCooldown1 = 0.0;
		public double AbilityCooldown2 = 0.0;
		public double AbilityCooldown3 = 0.0;
		public double AbilityCooldown4 = 0.0;
		public double AbilityCooldown5 = 0.0;
		public double AbilityCooldown6 = 0.0;
		public double AbilityCooldown7 = 0.0;
		public double AbilityCooldown8 = 0.0;
		public double AbilityCooldown9 = 0.0;
		public double MaxHamonBar = -1.0;
		public double MaxBloodBar = -1.0;
		public String AbilitySlot1 = "None";
		public String AbilitySlot2 = "None";
		public String AbilitySlot3 = "None";
		public String AbilitySlot4 = "None";
		public String AbilitySlot5 = "None";
		public String AbilitySlot6 = "None";
		public String AbilitySlot7 = "None";
		public String AbilitySlot8 = "None";
		public String AbilitySlot9 = "None";
		public String UseAbilityType = "Wheel";
		public String WOSUseAbilityType = "";
		public double AbilityCost1 = 0.0;
		public double AbilityCost2 = 0.0;
		public double AbilityCost3 = 0.0;
		public double AbilityCost4 = 0.0;
		public double AbilityCost5 = 0.0;
		public double AbilityCost6 = 0.0;
		public double AbilityCost7 = 0.0;
		public double AbilityCost8 = 0.0;
		public double AbilityCost9 = 0.0;
		public double AbilityCDLength1 = 0.0;
		public double AbilityCDLength2 = 0.0;
		public double AbilityCDLength3 = 0.0;
		public double AbilityCDLength4 = 0.0;
		public double AbilityCDLength5 = 0.0;
		public double AbilityCDLength6 = 0.0;
		public double AbilityCDLength7 = 0.0;
		public double AbilityCDLength8 = 0.0;
		public double AbilityCDLength9 = 0.0;
		public double CurrentEXP = 0.0;
		public double MaxEXP = 100.0;
		public double PlayerLevel = 1.0;
		public double SkillPoints = 0.0;
		public double PassiveEXPCD = 0.0;
		public boolean ChargingHamon = false;
		public double SwitcherSlot = 0.0;
		public boolean HamonEnvious = false;
		public double PlayerStrength = 0.0;
		public double PlayerSpeed = 0.0;
		public double PlayerDurability = 0.0;
		public double PlayerWillpower = 0.0;
		public double PlayerMaxStrength = 50.0;
		public double PlayerMaxSpeed = 50.0;
		public double PlayerMaxDurability = 50.0;
		public double PlayerMaxWillpower = 100.0;
		public double HumanMastery = 0.0;
		public double HamonMastery = 0.0;
		public double VampireMastery = 0.0;
		public double PillarmanMastery = 0.0;
		public double MaxHumanMastery = 0.0;
		public double MaxHamonMastery = 0.0;
		public double MaxVampireMastery = 0.0;
		public double MaxPillarmanMastery = 0.0;
		public boolean HumanOriginal = false;
		public boolean HumanKnight = false;
		public String RebindAbility = "none";
		public double RebindAbilityCost = 0;
		public double RebindAbilityCD = 0;
		public boolean VampireWeak = false;
		public String UnlockedHamonMoves = "";
		public String UnlockedHumanMoves = "";
		public String UnlockedVampireMoves = "";
		public String UnlockedPillarmanMoves = "";

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				JojoheMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new PlayerVariablesSyncMessage(this));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putDouble("AbilityType", AbilityType);
			nbt.putDouble("JoinedWorld", JoinedWorld);
			nbt.putDouble("BloodBar", BloodBar);
			nbt.putDouble("HamonBar", HamonBar);
			nbt.putBoolean("AbilityGate", AbilityGate);
			nbt.putBoolean("HamonWarrior", HamonWarrior);
			nbt.putBoolean("HamonDefender", HamonDefender);
			nbt.putString("AbilitySelected", AbilitySelected);
			nbt.putBoolean("HamonWisdom", HamonWisdom);
			nbt.putBoolean("HamonHermit", HamonHermit);
			nbt.putString("AbilityRoot", AbilityRoot);
			nbt.putBoolean("VampireOriginal", VampireOriginal);
			nbt.putBoolean("VampireBlood", VampireBlood);
			nbt.putBoolean("VampireShadow", VampireShadow);
			nbt.putBoolean("VampireNecro", VampireNecro);
			nbt.putBoolean("HumanBoxing", HumanBoxing);
			nbt.putBoolean("HumanStreetFighter", HumanStreetFighter);
			nbt.putBoolean("HumanCyborg", HumanCyborg);
			nbt.putBoolean("PillarMan", PillarMan);
			nbt.putBoolean("PillarWind", PillarWind);
			nbt.putBoolean("PillarFlame", PillarFlame);
			nbt.putBoolean("PillarLight", PillarLight);
			nbt.putBoolean("PillarUltimate", PillarUltimate);
			nbt.putBoolean("HamonTrickster", HamonTrickster);
			nbt.putBoolean("HamonBubbly", HamonBubbly);
			nbt.putBoolean("HamonStylish", HamonStylish);
			nbt.putBoolean("DisplayValue", DisplayValue);
			nbt.putString("FleshbudOwner", FleshbudOwner);
			nbt.putBoolean("Fleshbudded", Fleshbudded);
			nbt.putBoolean("ZombieGate", ZombieGate);
			nbt.putBoolean("JoJoMuscles", JoJoMuscles);
			nbt.putBoolean("DisableDamage", DisableDamage);
			nbt.putBoolean("StandUser", StandUser);
			nbt.putBoolean("StandSummoned", StandSummoned);
			nbt.putBoolean("TimeStopped", TimeStopped);
			nbt.putDouble("AbilityWheelGUI", AbilityWheelGUI);
			nbt.putBoolean("SwitchWheels", SwitchWheels);
			nbt.putString("PlayerRace", PlayerRace);
			nbt.putDouble("HamonRegenCD", HamonRegenCD);
			nbt.putDouble("BloodRegenCD", BloodRegenCD);
			nbt.putDouble("AbilityCooldown1", AbilityCooldown1);
			nbt.putDouble("AbilityCooldown2", AbilityCooldown2);
			nbt.putDouble("AbilityCooldown3", AbilityCooldown3);
			nbt.putDouble("AbilityCooldown4", AbilityCooldown4);
			nbt.putDouble("AbilityCooldown5", AbilityCooldown5);
			nbt.putDouble("AbilityCooldown6", AbilityCooldown6);
			nbt.putDouble("AbilityCooldown7", AbilityCooldown7);
			nbt.putDouble("AbilityCooldown8", AbilityCooldown8);
			nbt.putDouble("AbilityCooldown9", AbilityCooldown9);
			nbt.putDouble("MaxHamonBar", MaxHamonBar);
			nbt.putDouble("MaxBloodBar", MaxBloodBar);
			nbt.putString("AbilitySlot1", AbilitySlot1);
			nbt.putString("AbilitySlot2", AbilitySlot2);
			nbt.putString("AbilitySlot3", AbilitySlot3);
			nbt.putString("AbilitySlot4", AbilitySlot4);
			nbt.putString("AbilitySlot5", AbilitySlot5);
			nbt.putString("AbilitySlot6", AbilitySlot6);
			nbt.putString("AbilitySlot7", AbilitySlot7);
			nbt.putString("AbilitySlot8", AbilitySlot8);
			nbt.putString("AbilitySlot9", AbilitySlot9);
			nbt.putString("UseAbilityType", UseAbilityType);
			nbt.putString("WOSUseAbilityType", WOSUseAbilityType);
			nbt.putDouble("AbilityCost1", AbilityCost1);
			nbt.putDouble("AbilityCost2", AbilityCost2);
			nbt.putDouble("AbilityCost3", AbilityCost3);
			nbt.putDouble("AbilityCost4", AbilityCost4);
			nbt.putDouble("AbilityCost5", AbilityCost5);
			nbt.putDouble("AbilityCost6", AbilityCost6);
			nbt.putDouble("AbilityCost7", AbilityCost7);
			nbt.putDouble("AbilityCost8", AbilityCost8);
			nbt.putDouble("AbilityCost9", AbilityCost9);
			nbt.putDouble("AbilityCDLength1", AbilityCDLength1);
			nbt.putDouble("AbilityCDLength2", AbilityCDLength2);
			nbt.putDouble("AbilityCDLength3", AbilityCDLength3);
			nbt.putDouble("AbilityCDLength4", AbilityCDLength4);
			nbt.putDouble("AbilityCDLength5", AbilityCDLength5);
			nbt.putDouble("AbilityCDLength6", AbilityCDLength6);
			nbt.putDouble("AbilityCDLength7", AbilityCDLength7);
			nbt.putDouble("AbilityCDLength8", AbilityCDLength8);
			nbt.putDouble("AbilityCDLength9", AbilityCDLength9);
			nbt.putDouble("CurrentEXP", CurrentEXP);
			nbt.putDouble("MaxEXP", MaxEXP);
			nbt.putDouble("PlayerLevel", PlayerLevel);
			nbt.putDouble("SkillPoints", SkillPoints);
			nbt.putDouble("PassiveEXPCD", PassiveEXPCD);
			nbt.putBoolean("ChargingHamon", ChargingHamon);
			nbt.putDouble("SwitcherSlot", SwitcherSlot);
			nbt.putBoolean("HamonEnvious", HamonEnvious);
			nbt.putDouble("PlayerStrength", PlayerStrength);
			nbt.putDouble("PlayerSpeed", PlayerSpeed);
			nbt.putDouble("PlayerDurability", PlayerDurability);
			nbt.putDouble("PlayerWillpower", PlayerWillpower);
			nbt.putDouble("PlayerMaxStrength", PlayerMaxStrength);
			nbt.putDouble("PlayerMaxSpeed", PlayerMaxSpeed);
			nbt.putDouble("PlayerMaxDurability", PlayerMaxDurability);
			nbt.putDouble("PlayerMaxWillpower", PlayerMaxWillpower);
			nbt.putDouble("HumanMastery", HumanMastery);
			nbt.putDouble("HamonMastery", HamonMastery);
			nbt.putDouble("VampireMastery", VampireMastery);
			nbt.putDouble("PillarmanMastery", PillarmanMastery);
			nbt.putDouble("MaxHumanMastery", MaxHumanMastery);
			nbt.putDouble("MaxHamonMastery", MaxHamonMastery);
			nbt.putDouble("MaxVampireMastery", MaxVampireMastery);
			nbt.putDouble("MaxPillarmanMastery", MaxPillarmanMastery);
			nbt.putBoolean("HumanOriginal", HumanOriginal);
			nbt.putBoolean("HumanKnight", HumanKnight);
			nbt.putString("RebindAbility", RebindAbility);
			nbt.putDouble("RebindAbilityCost", RebindAbilityCost);
			nbt.putDouble("RebindAbilityCD", RebindAbilityCD);
			nbt.putBoolean("VampireWeak", VampireWeak);
			nbt.putString("UnlockedHamonMoves", UnlockedHamonMoves);
			nbt.putString("UnlockedHumanMoves", UnlockedHumanMoves);
			nbt.putString("UnlockedVampireMoves", UnlockedVampireMoves);
			nbt.putString("UnlockedPillarmanMoves", UnlockedPillarmanMoves);
			return nbt;
		}

		public void readNBT(Tag Tag) {
			CompoundTag nbt = (CompoundTag) Tag;
			AbilityType = nbt.getDouble("AbilityType");
			JoinedWorld = nbt.getDouble("JoinedWorld");
			BloodBar = nbt.getDouble("BloodBar");
			HamonBar = nbt.getDouble("HamonBar");
			AbilityGate = nbt.getBoolean("AbilityGate");
			HamonWarrior = nbt.getBoolean("HamonWarrior");
			HamonDefender = nbt.getBoolean("HamonDefender");
			AbilitySelected = nbt.getString("AbilitySelected");
			HamonWisdom = nbt.getBoolean("HamonWisdom");
			HamonHermit = nbt.getBoolean("HamonHermit");
			AbilityRoot = nbt.getString("AbilityRoot");
			VampireOriginal = nbt.getBoolean("VampireOriginal");
			VampireBlood = nbt.getBoolean("VampireBlood");
			VampireShadow = nbt.getBoolean("VampireShadow");
			VampireNecro = nbt.getBoolean("VampireNecro");
			HumanBoxing = nbt.getBoolean("HumanBoxing");
			HumanStreetFighter = nbt.getBoolean("HumanStreetFighter");
			HumanCyborg = nbt.getBoolean("HumanCyborg");
			PillarMan = nbt.getBoolean("PillarMan");
			PillarWind = nbt.getBoolean("PillarWind");
			PillarFlame = nbt.getBoolean("PillarFlame");
			PillarLight = nbt.getBoolean("PillarLight");
			PillarUltimate = nbt.getBoolean("PillarUltimate");
			HamonTrickster = nbt.getBoolean("HamonTrickster");
			HamonBubbly = nbt.getBoolean("HamonBubbly");
			HamonStylish = nbt.getBoolean("HamonStylish");
			DisplayValue = nbt.getBoolean("DisplayValue");
			FleshbudOwner = nbt.getString("FleshbudOwner");
			Fleshbudded = nbt.getBoolean("Fleshbudded");
			ZombieGate = nbt.getBoolean("ZombieGate");
			JoJoMuscles = nbt.getBoolean("JoJoMuscles");
			DisableDamage = nbt.getBoolean("DisableDamage");
			StandUser = nbt.getBoolean("StandUser");
			StandSummoned = nbt.getBoolean("StandSummoned");
			TimeStopped = nbt.getBoolean("TimeStopped");
			AbilityWheelGUI = nbt.getDouble("AbilityWheelGUI");
			SwitchWheels = nbt.getBoolean("SwitchWheels");
			PlayerRace = nbt.getString("PlayerRace");
			HamonRegenCD = nbt.getDouble("HamonRegenCD");
			BloodRegenCD = nbt.getDouble("BloodRegenCD");
			AbilityCooldown1 = nbt.getDouble("AbilityCooldown1");
			AbilityCooldown2 = nbt.getDouble("AbilityCooldown2");
			AbilityCooldown3 = nbt.getDouble("AbilityCooldown3");
			AbilityCooldown4 = nbt.getDouble("AbilityCooldown4");
			AbilityCooldown5 = nbt.getDouble("AbilityCooldown5");
			AbilityCooldown6 = nbt.getDouble("AbilityCooldown6");
			AbilityCooldown7 = nbt.getDouble("AbilityCooldown7");
			AbilityCooldown8 = nbt.getDouble("AbilityCooldown8");
			AbilityCooldown9 = nbt.getDouble("AbilityCooldown9");
			MaxHamonBar = nbt.getDouble("MaxHamonBar");
			MaxBloodBar = nbt.getDouble("MaxBloodBar");
			AbilitySlot1 = nbt.getString("AbilitySlot1");
			AbilitySlot2 = nbt.getString("AbilitySlot2");
			AbilitySlot3 = nbt.getString("AbilitySlot3");
			AbilitySlot4 = nbt.getString("AbilitySlot4");
			AbilitySlot5 = nbt.getString("AbilitySlot5");
			AbilitySlot6 = nbt.getString("AbilitySlot6");
			AbilitySlot7 = nbt.getString("AbilitySlot7");
			AbilitySlot8 = nbt.getString("AbilitySlot8");
			AbilitySlot9 = nbt.getString("AbilitySlot9");
			UseAbilityType = nbt.getString("UseAbilityType");
			WOSUseAbilityType = nbt.getString("WOSUseAbilityType");
			AbilityCost1 = nbt.getDouble("AbilityCost1");
			AbilityCost2 = nbt.getDouble("AbilityCost2");
			AbilityCost3 = nbt.getDouble("AbilityCost3");
			AbilityCost4 = nbt.getDouble("AbilityCost4");
			AbilityCost5 = nbt.getDouble("AbilityCost5");
			AbilityCost6 = nbt.getDouble("AbilityCost6");
			AbilityCost7 = nbt.getDouble("AbilityCost7");
			AbilityCost8 = nbt.getDouble("AbilityCost8");
			AbilityCost9 = nbt.getDouble("AbilityCost9");
			AbilityCDLength1 = nbt.getDouble("AbilityCDLength1");
			AbilityCDLength2 = nbt.getDouble("AbilityCDLength2");
			AbilityCDLength3 = nbt.getDouble("AbilityCDLength3");
			AbilityCDLength4 = nbt.getDouble("AbilityCDLength4");
			AbilityCDLength5 = nbt.getDouble("AbilityCDLength5");
			AbilityCDLength6 = nbt.getDouble("AbilityCDLength6");
			AbilityCDLength7 = nbt.getDouble("AbilityCDLength7");
			AbilityCDLength8 = nbt.getDouble("AbilityCDLength8");
			AbilityCDLength9 = nbt.getDouble("AbilityCDLength9");
			CurrentEXP = nbt.getDouble("CurrentEXP");
			MaxEXP = nbt.getDouble("MaxEXP");
			PlayerLevel = nbt.getDouble("PlayerLevel");
			SkillPoints = nbt.getDouble("SkillPoints");
			PassiveEXPCD = nbt.getDouble("PassiveEXPCD");
			ChargingHamon = nbt.getBoolean("ChargingHamon");
			SwitcherSlot = nbt.getDouble("SwitcherSlot");
			HamonEnvious = nbt.getBoolean("HamonEnvious");
			PlayerStrength = nbt.getDouble("PlayerStrength");
			PlayerSpeed = nbt.getDouble("PlayerSpeed");
			PlayerDurability = nbt.getDouble("PlayerDurability");
			PlayerWillpower = nbt.getDouble("PlayerWillpower");
			PlayerMaxStrength = nbt.getDouble("PlayerMaxStrength");
			PlayerMaxSpeed = nbt.getDouble("PlayerMaxSpeed");
			PlayerMaxDurability = nbt.getDouble("PlayerMaxDurability");
			PlayerMaxWillpower = nbt.getDouble("PlayerMaxWillpower");
			HumanMastery = nbt.getDouble("HumanMastery");
			HamonMastery = nbt.getDouble("HamonMastery");
			VampireMastery = nbt.getDouble("VampireMastery");
			PillarmanMastery = nbt.getDouble("PillarmanMastery");
			MaxHumanMastery = nbt.getDouble("MaxHumanMastery");
			MaxHamonMastery = nbt.getDouble("MaxHamonMastery");
			MaxVampireMastery = nbt.getDouble("MaxVampireMastery");
			MaxPillarmanMastery = nbt.getDouble("MaxPillarmanMastery");
			HumanOriginal = nbt.getBoolean("HumanOriginal");
			HumanKnight = nbt.getBoolean("HumanKnight");
			RebindAbility = nbt.getString("RebindAbility");
			RebindAbilityCost = nbt.getDouble("RebindAbilityCost");
			RebindAbilityCD = nbt.getDouble("RebindAbilityCD");
			VampireWeak = nbt.getBoolean("VampireWeak");
			UnlockedHamonMoves = nbt.getString("UnlockedHamonMoves");
			UnlockedHumanMoves = nbt.getString("UnlockedHumanMoves");
			UnlockedVampireMoves = nbt.getString("UnlockedVampireMoves");
			UnlockedPillarmanMoves = nbt.getString("UnlockedPillarmanMoves");
		}
	}

	public static class PlayerVariablesSyncMessage {
		private final PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
					variables.AbilityType = message.data.AbilityType;
					variables.JoinedWorld = message.data.JoinedWorld;
					variables.BloodBar = message.data.BloodBar;
					variables.HamonBar = message.data.HamonBar;
					variables.AbilityGate = message.data.AbilityGate;
					variables.HamonWarrior = message.data.HamonWarrior;
					variables.HamonDefender = message.data.HamonDefender;
					variables.AbilitySelected = message.data.AbilitySelected;
					variables.HamonWisdom = message.data.HamonWisdom;
					variables.HamonHermit = message.data.HamonHermit;
					variables.AbilityRoot = message.data.AbilityRoot;
					variables.VampireOriginal = message.data.VampireOriginal;
					variables.VampireBlood = message.data.VampireBlood;
					variables.VampireShadow = message.data.VampireShadow;
					variables.VampireNecro = message.data.VampireNecro;
					variables.HumanBoxing = message.data.HumanBoxing;
					variables.HumanStreetFighter = message.data.HumanStreetFighter;
					variables.HumanCyborg = message.data.HumanCyborg;
					variables.PillarMan = message.data.PillarMan;
					variables.PillarWind = message.data.PillarWind;
					variables.PillarFlame = message.data.PillarFlame;
					variables.PillarLight = message.data.PillarLight;
					variables.PillarUltimate = message.data.PillarUltimate;
					variables.HamonTrickster = message.data.HamonTrickster;
					variables.HamonBubbly = message.data.HamonBubbly;
					variables.HamonStylish = message.data.HamonStylish;
					variables.DisplayValue = message.data.DisplayValue;
					variables.FleshbudOwner = message.data.FleshbudOwner;
					variables.Fleshbudded = message.data.Fleshbudded;
					variables.ZombieGate = message.data.ZombieGate;
					variables.JoJoMuscles = message.data.JoJoMuscles;
					variables.DisableDamage = message.data.DisableDamage;
					variables.StandUser = message.data.StandUser;
					variables.StandSummoned = message.data.StandSummoned;
					variables.TimeStopped = message.data.TimeStopped;
					variables.AbilityWheelGUI = message.data.AbilityWheelGUI;
					variables.SwitchWheels = message.data.SwitchWheels;
					variables.PlayerRace = message.data.PlayerRace;
					variables.HamonRegenCD = message.data.HamonRegenCD;
					variables.BloodRegenCD = message.data.BloodRegenCD;
					variables.AbilityCooldown1 = message.data.AbilityCooldown1;
					variables.AbilityCooldown2 = message.data.AbilityCooldown2;
					variables.AbilityCooldown3 = message.data.AbilityCooldown3;
					variables.AbilityCooldown4 = message.data.AbilityCooldown4;
					variables.AbilityCooldown5 = message.data.AbilityCooldown5;
					variables.AbilityCooldown6 = message.data.AbilityCooldown6;
					variables.AbilityCooldown7 = message.data.AbilityCooldown7;
					variables.AbilityCooldown8 = message.data.AbilityCooldown8;
					variables.AbilityCooldown9 = message.data.AbilityCooldown9;
					variables.MaxHamonBar = message.data.MaxHamonBar;
					variables.MaxBloodBar = message.data.MaxBloodBar;
					variables.AbilitySlot1 = message.data.AbilitySlot1;
					variables.AbilitySlot2 = message.data.AbilitySlot2;
					variables.AbilitySlot3 = message.data.AbilitySlot3;
					variables.AbilitySlot4 = message.data.AbilitySlot4;
					variables.AbilitySlot5 = message.data.AbilitySlot5;
					variables.AbilitySlot6 = message.data.AbilitySlot6;
					variables.AbilitySlot7 = message.data.AbilitySlot7;
					variables.AbilitySlot8 = message.data.AbilitySlot8;
					variables.AbilitySlot9 = message.data.AbilitySlot9;
					variables.UseAbilityType = message.data.UseAbilityType;
					variables.WOSUseAbilityType = message.data.WOSUseAbilityType;
					variables.AbilityCost1 = message.data.AbilityCost1;
					variables.AbilityCost2 = message.data.AbilityCost2;
					variables.AbilityCost3 = message.data.AbilityCost3;
					variables.AbilityCost4 = message.data.AbilityCost4;
					variables.AbilityCost5 = message.data.AbilityCost5;
					variables.AbilityCost6 = message.data.AbilityCost6;
					variables.AbilityCost7 = message.data.AbilityCost7;
					variables.AbilityCost8 = message.data.AbilityCost8;
					variables.AbilityCost9 = message.data.AbilityCost9;
					variables.AbilityCDLength1 = message.data.AbilityCDLength1;
					variables.AbilityCDLength2 = message.data.AbilityCDLength2;
					variables.AbilityCDLength3 = message.data.AbilityCDLength3;
					variables.AbilityCDLength4 = message.data.AbilityCDLength4;
					variables.AbilityCDLength5 = message.data.AbilityCDLength5;
					variables.AbilityCDLength6 = message.data.AbilityCDLength6;
					variables.AbilityCDLength7 = message.data.AbilityCDLength7;
					variables.AbilityCDLength8 = message.data.AbilityCDLength8;
					variables.AbilityCDLength9 = message.data.AbilityCDLength9;
					variables.CurrentEXP = message.data.CurrentEXP;
					variables.MaxEXP = message.data.MaxEXP;
					variables.PlayerLevel = message.data.PlayerLevel;
					variables.SkillPoints = message.data.SkillPoints;
					variables.PassiveEXPCD = message.data.PassiveEXPCD;
					variables.ChargingHamon = message.data.ChargingHamon;
					variables.SwitcherSlot = message.data.SwitcherSlot;
					variables.HamonEnvious = message.data.HamonEnvious;
					variables.PlayerStrength = message.data.PlayerStrength;
					variables.PlayerSpeed = message.data.PlayerSpeed;
					variables.PlayerDurability = message.data.PlayerDurability;
					variables.PlayerWillpower = message.data.PlayerWillpower;
					variables.PlayerMaxStrength = message.data.PlayerMaxStrength;
					variables.PlayerMaxSpeed = message.data.PlayerMaxSpeed;
					variables.PlayerMaxDurability = message.data.PlayerMaxDurability;
					variables.PlayerMaxWillpower = message.data.PlayerMaxWillpower;
					variables.HumanMastery = message.data.HumanMastery;
					variables.HamonMastery = message.data.HamonMastery;
					variables.VampireMastery = message.data.VampireMastery;
					variables.PillarmanMastery = message.data.PillarmanMastery;
					variables.MaxHumanMastery = message.data.MaxHumanMastery;
					variables.MaxHamonMastery = message.data.MaxHamonMastery;
					variables.MaxVampireMastery = message.data.MaxVampireMastery;
					variables.MaxPillarmanMastery = message.data.MaxPillarmanMastery;
					variables.HumanOriginal = message.data.HumanOriginal;
					variables.HumanKnight = message.data.HumanKnight;
					variables.RebindAbility = message.data.RebindAbility;
					variables.RebindAbilityCost = message.data.RebindAbilityCost;
					variables.RebindAbilityCD = message.data.RebindAbilityCD;
					variables.VampireWeak = message.data.VampireWeak;
					variables.UnlockedHamonMoves = message.data.UnlockedHamonMoves;
					variables.UnlockedHumanMoves = message.data.UnlockedHumanMoves;
					variables.UnlockedVampireMoves = message.data.UnlockedVampireMoves;
					variables.UnlockedPillarmanMoves = message.data.UnlockedPillarmanMoves;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
