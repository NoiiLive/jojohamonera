
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jojohe.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.jojohe.JojoheMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class JojoheModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, JojoheMod.MODID);
	public static final RegistryObject<CreativeModeTab> PHANTOM_BLOOD = REGISTRY.register("phantom_blood",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.jojohe.phantom_blood")).icon(() -> new ItemStack(JojoheModItems.STONE_MASK_HELMET.get())).displayItems((parameters, tabData) -> {
				tabData.accept(JojoheModItems.STONE_MASK_HELMET.get());
				tabData.accept(JojoheModItems.BLOODY_STONE_MASK_HELMET.get());
				tabData.accept(JojoheModItems.IRON_KNIFE.get());
				tabData.accept(JojoheModItems.BLOODY_IRON_KNIFE.get());
				tabData.accept(JojoheModItems.VAMPIRE_BLOOD_IRON_KNIFE.get());
				tabData.accept(JojoheModItems.LUCK.get());
				tabData.accept(JojoheModItems.PLUCK.get());
				tabData.accept(JojoheModItems.SPEEDWAGONS_HAMMER.get());
				tabData.accept(JojoheModItems.TARKUS_GREATSWORD.get());
				tabData.accept(JojoheModItems.JACK_THE_RIPPER_KNIFE.get());
				tabData.accept(JojoheModItems.BOXING_GLOVE.get());
				tabData.accept(JojoheModItems.BLUE_BOXING_GLOVE.get());
				tabData.accept(JojoheModItems.RED_WINE.get());
				tabData.accept(JojoheModItems.BLOOD_BOTTLE.get());
				tabData.accept(JojoheModItems.WHITE_UMBRELLA.get());
				tabData.accept(JojoheModItems.LIGHT_GRAY_UMBRELLA.get());
				tabData.accept(JojoheModItems.GRAY_UMBRELLA.get());
				tabData.accept(JojoheModItems.BLACK_UMBRELLA.get());
				tabData.accept(JojoheModItems.BROWN_UMBRELLA.get());
				tabData.accept(JojoheModItems.RED_UMBRELLA.get());
				tabData.accept(JojoheModItems.ORANGE_UMBRELLA.get());
				tabData.accept(JojoheModItems.YELLOW_UMBRELLA.get());
				tabData.accept(JojoheModItems.LIME_UMBRELLA.get());
				tabData.accept(JojoheModItems.GREEN_UMBRELLA.get());
				tabData.accept(JojoheModItems.CYAN_UMBRELLA.get());
				tabData.accept(JojoheModItems.LIGHT_BLUE_UMBRELLA.get());
				tabData.accept(JojoheModItems.BLUE_UMBRELLA.get());
				tabData.accept(JojoheModItems.PURPLE_UMBRELLA.get());
				tabData.accept(JojoheModItems.MAGENTA_UMBRELLA.get());
				tabData.accept(JojoheModItems.PINK_UMBRELLA.get());
				tabData.accept(JojoheModItems.HAMON_BREATHING_MASK_HELMET.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> PHANTOM_BLOOD_ARMOR = REGISTRY.register("phantom_blood_armor",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.jojohe.phantom_blood_armor")).icon(() -> new ItemStack(JojoheModItems.ZEPPELI_ARMOR_HELMET.get())).displayItems((parameters, tabData) -> {
				tabData.accept(JojoheModItems.JONATHAN_ARMOR_CHESTPLATE.get());
				tabData.accept(JojoheModItems.JONATHAN_ARMOR_LEGGINGS.get());
				tabData.accept(JojoheModItems.JONATHAN_ARMOR_BOOTS.get());
				tabData.accept(JojoheModItems.DIO_ARMOR_CHESTPLATE.get());
				tabData.accept(JojoheModItems.DIO_ARMOR_LEGGINGS.get());
				tabData.accept(JojoheModItems.DIO_ARMOR_BOOTS.get());
				tabData.accept(JojoheModItems.ZEPPELI_ARMOR_HELMET.get());
				tabData.accept(JojoheModItems.ZEPPELI_ARMOR_CHESTPLATE.get());
				tabData.accept(JojoheModItems.ZEPPELI_ARMOR_LEGGINGS.get());
				tabData.accept(JojoheModItems.ZEPPELI_ARMOR_BOOTS.get());
				tabData.accept(JojoheModItems.SPEEDWAGON_ARMOR_HELMET.get());
				tabData.accept(JojoheModItems.SPEEDWAGON_ARMOR_CHESTPLATE.get());
				tabData.accept(JojoheModItems.SPEEDWAGON_ARMOR_LEGGINGS.get());
				tabData.accept(JojoheModItems.SPEEDWAGON_ARMOR_BOOTS.get());
				tabData.accept(JojoheModItems.TONPETTY_ARMOR_CHESTPLATE.get());
				tabData.accept(JojoheModItems.TONPETTY_ARMOR_LEGGINGS.get());
				tabData.accept(JojoheModItems.TONPETTY_ARMOR_BOOTS.get());
				tabData.accept(JojoheModItems.DIRE_ARMOR_CHESTPLATE.get());
				tabData.accept(JojoheModItems.DIRE_ARMOR_LEGGINGS.get());
				tabData.accept(JojoheModItems.DIRE_ARMOR_BOOTS.get());
				tabData.accept(JojoheModItems.STRAIZO_ARMOR_HELMET.get());
				tabData.accept(JojoheModItems.STRAIZO_ARMOR_CHESTPLATE.get());
				tabData.accept(JojoheModItems.STRAIZO_ARMOR_LEGGINGS.get());
				tabData.accept(JojoheModItems.STRAIZO_ARMOR_BOOTS.get());
				tabData.accept(JojoheModItems.BRUFORD_ARMOR_HELMET.get());
				tabData.accept(JojoheModItems.BRUFORD_ARMOR_CHESTPLATE.get());
				tabData.accept(JojoheModItems.BRUFORD_ARMOR_LEGGINGS.get());
				tabData.accept(JojoheModItems.BRUFORD_ARMOR_BOOTS.get());
				tabData.accept(JojoheModItems.TARKUS_ARMOR_HELMET.get());
				tabData.accept(JojoheModItems.TARKUS_ARMOR_CHESTPLATE.get());
				tabData.accept(JojoheModItems.TARKUS_ARMOR_LEGGINGS.get());
				tabData.accept(JojoheModItems.TARKUS_ARMOR_BOOTS.get());
				tabData.accept(JojoheModItems.JACK_THE_RIPPER_ARMOR_CHESTPLATE.get());
				tabData.accept(JojoheModItems.JACK_THE_RIPPER_ARMOR_LEGGINGS.get());
				tabData.accept(JojoheModItems.JACK_THE_RIPPER_ARMOR_BOOTS.get());
				tabData.accept(JojoheModItems.INJURED_DIO_CLOAK_HELMET.get());
				tabData.accept(JojoheModItems.INJURED_DIO_CLOAK_CHESTPLATE.get());
				tabData.accept(JojoheModItems.INJURED_DIO_CLOAK_LEGGINGS.get());
				tabData.accept(JojoheModItems.INJURED_DIO_CLOAK_BOOTS.get());
				tabData.accept(JojoheModItems.KEMPO_MASTER_ARMOR_HELMET.get());
				tabData.accept(JojoheModItems.KEMPO_MASTER_ARMOR_CHESTPLATE.get());
				tabData.accept(JojoheModItems.KEMPO_MASTER_ARMOR_LEGGINGS.get());
				tabData.accept(JojoheModItems.KEMPO_MASTER_ARMOR_BOOTS.get());
				tabData.accept(JojoheModItems.TATTOO_ARMOR_CHESTPLATE.get());
				tabData.accept(JojoheModItems.TATTOO_ARMOR_LEGGINGS.get());
				tabData.accept(JojoheModItems.TATTOO_ARMOR_BOOTS.get());
				tabData.accept(JojoheModItems.YOUNG_DIO_ARMOR_CHESTPLATE.get());
				tabData.accept(JojoheModItems.YOUNG_DIO_ARMOR_LEGGINGS.get());
				tabData.accept(JojoheModItems.YOUNG_DIO_ARMOR_BOOTS.get());
				tabData.accept(JojoheModItems.YOUNG_DIO_COATLESS_CHESTPLATE.get());
				tabData.accept(JojoheModItems.YOUNG_DIO_SHIRT_BLACK_CHESTPLATE.get());
				tabData.accept(JojoheModItems.YOUNG_JONATHAN_ARMOR_CHESTPLATE.get());
				tabData.accept(JojoheModItems.YOUNG_JONATHAN_ARMOR_LEGGINGS.get());
				tabData.accept(JojoheModItems.YOUNG_JONATHAN_ARMOR_BOOTS.get());
				tabData.accept(JojoheModItems.YOUNG_JONATHAN_SHIRT_CHESTPLATE.get());
				tabData.accept(JojoheModItems.JONATHAN_BOXING_ARMOR_CHESTPLATE.get());
				tabData.accept(JojoheModItems.JONATHAN_BOXING_ARMOR_LEGGINGS.get());
				tabData.accept(JojoheModItems.JONATHAN_BOXING_ARMOR_BOOTS.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> PHANTOM_BLOOD_MUSIC = REGISTRY.register("phantom_blood_music",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.jojohe.phantom_blood_music")).icon(() -> new ItemStack(JojoheModItems.INTERTWINE_DESTINIES.get())).displayItems((parameters, tabData) -> {
				tabData.accept(JojoheModItems.SONO_CHI_NO_SADAME.get());
				tabData.accept(JojoheModItems.ROUNDABOUT.get());
				tabData.accept(JojoheModItems.STONE_MASK_PROLOGUE.get());
				tabData.accept(JojoheModItems.DESTINIES_BROUGHT_TOGETHER.get());
				tabData.accept(JojoheModItems.JOESTAR_FAMILY.get());
				tabData.accept(JojoheModItems.TWO_BOYS.get());
				tabData.accept(JojoheModItems.INTERTWINE_DESTINIES.get());
				tabData.accept(JojoheModItems.LOVE_LIVELY.get());
				tabData.accept(JojoheModItems.FROM_THE_DARK_ABYSS.get());
				tabData.accept(JojoheModItems.PARTING_REGRETS.get());
				tabData.accept(JojoheModItems.HIDDEN_FEELINGS.get());
				tabData.accept(JojoheModItems.LIGHTNING_SPEED.get());
				tabData.accept(JojoheModItems.SUSPICION.get());
				tabData.accept(JojoheModItems.GAPS_OF_THE_HEART.get());
				tabData.accept(JojoheModItems.STONE_MASK_THE_SECRET.get());
				tabData.accept(JojoheModItems.RESULTS_OF_THE_PLOT.get());
				tabData.accept(JojoheModItems.STRUTTING_THE_OGRE_STREET.get());
				tabData.accept(JojoheModItems.A_FINE_FELLOW_SHOWS_UP.get());
				tabData.accept(JojoheModItems.FATHERS_LOVE.get());
				tabData.accept(JojoheModItems.SUDDEN_TURN.get());
				tabData.accept(JojoheModItems.A_SUPERHUMAN_REBORN.get());
				tabData.accept(JojoheModItems.TRANSCEND.get());
				tabData.accept(JojoheModItems.DETERMINATION.get());
				tabData.accept(JojoheModItems.HEART_OF_DARKNESS.get());
				tabData.accept(JojoheModItems.A_DUO_OF_COURAGE.get());
				tabData.accept(JojoheModItems.PERSISTENCE_INNOCENT_STREAM.get());
				tabData.accept(JojoheModItems.HEARTBEAT.get());
				tabData.accept(JojoheModItems.SILENT_HORIZON.get());
				tabData.accept(JojoheModItems.FULL_BODY_COURAGE.get());
				tabData.accept(JojoheModItems.FRIENDSHIP.get());
				tabData.accept(JojoheModItems.RETURN_FROM_THE_VERGE_OF_DEATH.get());
				tabData.accept(JojoheModItems.MYSTERIOUS_VISITOR.get());
				tabData.accept(JojoheModItems.OVERDRIVE.get());
				tabData.accept(JojoheModItems.HERMETIC_ARTS_USER.get());
				tabData.accept(JojoheModItems.WAVES_OF_SUN_UNDISCOVERED_POWER.get());
				tabData.accept(JojoheModItems.UNDISCOVERED_POWER_ANCIENT_FRUITS.get());
				tabData.accept(JojoheModItems.CAPTURE_THE_TARGET.get());
				tabData.accept(JojoheModItems.KNIGHTS_OF_TERROR.get());
				tabData.accept(JojoheModItems.WITH_HUMANITY_AFFECTION_AND_NOBILITY.get());
				tabData.accept(JojoheModItems.A_PEACE_THAT_EMBRACES.get());
				tabData.accept(JojoheModItems.CARVE_OUT_YOUR_RIPPLE.get());
				tabData.accept(JojoheModItems.LOOKING_TOWARD_TOMORROW.get());
				tabData.accept(JojoheModItems.PARTING.get());
				tabData.accept(JojoheModItems.DEPTHS_OF_THE_PALE_DARKNESS.get());
				tabData.accept(JojoheModItems.CHAINED_POWER.get());
				tabData.accept(JojoheModItems.CONVICTION.get());
				tabData.accept(JojoheModItems.A_MOMENTS_HAPPINESS.get());
				tabData.accept(JojoheModItems.CONFRONTATION.get());
				tabData.accept(JojoheModItems.DECISIVE_BATTLE_OVERLAPPING_DESTINIES.get());
				tabData.accept(JojoheModItems.DAWN.get());
				tabData.accept(JojoheModItems.THE_TALE_OF_THEIR_LOVE.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> PHANTOM_BLOOD_SPAWN = REGISTRY.register("phantom_blood_spawn",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.jojohe.phantom_blood_spawn")).icon(() -> new ItemStack(JojoheModItems.JONATHAN_JOESTAR_SPAWN_EGG.get())).displayItems((parameters, tabData) -> {
				tabData.accept(JojoheModItems.JONATHAN_JOESTAR_SPAWN_EGG.get());
				tabData.accept(JojoheModItems.SHADOW_DIO_SPAWN_EGG.get());
				tabData.accept(JojoheModItems.BLOOD_DIO_SPAWN_EGG.get());
				tabData.accept(JojoheModItems.NECRO_DIO_SPAWN_EGG.get());
				tabData.accept(JojoheModItems.REO_SPEEDWAGON_SPAWN_EGG.get());
				tabData.accept(JojoheModItems.TONPETTY_SPAWN_EGG.get());
				tabData.accept(JojoheModItems.DIRE_SPAWN_EGG.get());
				tabData.accept(JojoheModItems.STRAIZO_SPAWN_EGG.get());
				tabData.accept(JojoheModItems.BRUFORD_SPAWN_EGG.get());
				tabData.accept(JojoheModItems.TARKUS_SPAWN_EGG.get());
				tabData.accept(JojoheModItems.JACK_THE_RIPPER_SPAWN_EGG.get());
				tabData.accept(JojoheModItems.KEMPO_MASTER_SPAWN_EGG.get());
				tabData.accept(JojoheModItems.TATTOO_SPAWN_EGG.get());
				tabData.accept(JojoheModItems.DIO_BRANDO_SPAWN_EGG.get());
				tabData.accept(JojoheModItems.WILL_A_ZEPPELI_SPAWN_EGG.get());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(JojoheModBlocks.MAGENTA_WALLPAPER_DARK_OAK.get().asItem());
			tabData.accept(JojoheModBlocks.MAGENTA_WALLPAPER.get().asItem());
			tabData.accept(JojoheModBlocks.DARK_BLUE_WOOL.get().asItem());
			tabData.accept(JojoheModBlocks.RED_WOOL_STAIRS.get().asItem());
			tabData.accept(JojoheModBlocks.LIMESTONE.get().asItem());
			tabData.accept(JojoheModBlocks.LIMESTONE_BRICKS.get().asItem());
			tabData.accept(JojoheModBlocks.CHISELED_LIMESTONE.get().asItem());
			tabData.accept(JojoheModBlocks.LIMESTONE_BRICK_STAIRS.get().asItem());
			tabData.accept(JojoheModBlocks.LIMESTONE_STAIRS.get().asItem());
			tabData.accept(JojoheModBlocks.LIMESTONE_SLABS.get().asItem());
			tabData.accept(JojoheModBlocks.LIMESTONE_BRICK_SLABS.get().asItem());
			tabData.accept(JojoheModBlocks.DARK_OAK_PANEL.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
			tabData.accept(JojoheModBlocks.FANCY_WHITE_DOOR.get().asItem());
			tabData.accept(JojoheModBlocks.FANCY_WHITE_TRAPDOOR.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(JojoheModItems.VAMPIRE_1_SPAWN_EGG.get());
			tabData.accept(JojoheModItems.VAMPIRE_2_SPAWN_EGG.get());
			tabData.accept(JojoheModItems.VAMPIRE_3_SPAWN_EGG.get());
			tabData.accept(JojoheModItems.VAMPIRE_4_SPAWN_EGG.get());
			tabData.accept(JojoheModItems.HOODED_VAMPIRE_1_SPAWN_EGG.get());
			tabData.accept(JojoheModItems.HOODED_VAMPIRE_2_SPAWN_EGG.get());
			tabData.accept(JojoheModItems.HOODED_VAMPIRE_3_SPAWN_EGG.get());
			tabData.accept(JojoheModItems.HOODED_VAMPIRE_4_SPAWN_EGG.get());
			tabData.accept(JojoheModItems.HAMON_USER_1_SPAWN_EGG.get());
			tabData.accept(JojoheModItems.HAMON_USER_2_SPAWN_EGG.get());
			tabData.accept(JojoheModItems.HAMON_USER_3_SPAWN_EGG.get());
			tabData.accept(JojoheModItems.HAMON_USER_4_SPAWN_EGG.get());
			tabData.accept(JojoheModItems.WHITE_CLOTH.get());
			tabData.accept(JojoheModItems.LIGHT_GRAY_CLOTH.get());
			tabData.accept(JojoheModItems.GRAY_CLOTH.get());
			tabData.accept(JojoheModItems.BLACK_CLOTH.get());
			tabData.accept(JojoheModItems.BROWN_CLOTH.get());
			tabData.accept(JojoheModItems.RED_CLOTH.get());
			tabData.accept(JojoheModItems.ORANGE_CLOTH.get());
			tabData.accept(JojoheModItems.YELLOW_CLOTH.get());
			tabData.accept(JojoheModItems.LIME_CLOTH.get());
			tabData.accept(JojoheModItems.GREEN_CLOTH.get());
			tabData.accept(JojoheModItems.CYAN_CLOTH.get());
			tabData.accept(JojoheModItems.LIGHT_BLUE_CLOTH.get());
			tabData.accept(JojoheModItems.BLUE_CLOTH.get());
			tabData.accept(JojoheModItems.PURPLE_CLOTH.get());
			tabData.accept(JojoheModItems.MAGENTA_CLOTH.get());
			tabData.accept(JojoheModItems.PINK_CLOTH.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(JojoheModItems.PHILOSOPHERS_STONE.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(JojoheModItems.DUMBELL.get());
		}
	}
}
