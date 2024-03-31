
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jojohe.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.jojohe.client.gui.WisdomLearnScreen;
import net.mcreator.jojohe.client.gui.WisdomChangeScreen;
import net.mcreator.jojohe.client.gui.WarriorLearnScreen;
import net.mcreator.jojohe.client.gui.WarriorChangeScreen;
import net.mcreator.jojohe.client.gui.VampireSkillTreeSupportScreen;
import net.mcreator.jojohe.client.gui.VampireSkillTreeSpecialScreen;
import net.mcreator.jojohe.client.gui.VampireSkillTreeRangedScreen;
import net.mcreator.jojohe.client.gui.VampireSkillTreePhysicalScreen;
import net.mcreator.jojohe.client.gui.VampireSkillTreeMovementScreen;
import net.mcreator.jojohe.client.gui.VampireChangeScreen;
import net.mcreator.jojohe.client.gui.TopHatFetchScreen;
import net.mcreator.jojohe.client.gui.StreetFighterChangeScreen;
import net.mcreator.jojohe.client.gui.StreetFightLearnScreen;
import net.mcreator.jojohe.client.gui.SpeedwagonChoiceScreen;
import net.mcreator.jojohe.client.gui.SpawnGUIVampScreen;
import net.mcreator.jojohe.client.gui.SpawnGUIScreen;
import net.mcreator.jojohe.client.gui.SpawnGUIHamonScreen;
import net.mcreator.jojohe.client.gui.ShadowVampireQuestScreen;
import net.mcreator.jojohe.client.gui.ShadowVampireLearnScreen;
import net.mcreator.jojohe.client.gui.ShadowChangeScreen;
import net.mcreator.jojohe.client.gui.RoseFetchScreen;
import net.mcreator.jojohe.client.gui.PlayerStatMenuScreen;
import net.mcreator.jojohe.client.gui.NecroVampireQuestScreen;
import net.mcreator.jojohe.client.gui.NecroVampireLearnScreen;
import net.mcreator.jojohe.client.gui.NecroChangeScreen;
import net.mcreator.jojohe.client.gui.MaskFetchTonpettyScreen;
import net.mcreator.jojohe.client.gui.MaskFetchScreen;
import net.mcreator.jojohe.client.gui.MaskDestroyScreen;
import net.mcreator.jojohe.client.gui.HumanSkillTreeSpecialScreen;
import net.mcreator.jojohe.client.gui.HumanSkillTreeRangedScreen;
import net.mcreator.jojohe.client.gui.HumanSkillTreePhysicalScreen;
import net.mcreator.jojohe.client.gui.HermitChangeScreen;
import net.mcreator.jojohe.client.gui.HamonSkillTreeSupportScreen;
import net.mcreator.jojohe.client.gui.HamonSkillTreeSpecialScreen;
import net.mcreator.jojohe.client.gui.HamonSkillTreeProjectileScreen;
import net.mcreator.jojohe.client.gui.HamonSkillTreePhysicalScreen;
import net.mcreator.jojohe.client.gui.HamonSkillTreeMovementScreen;
import net.mcreator.jojohe.client.gui.HamonLearnTonpettyScreen;
import net.mcreator.jojohe.client.gui.HamonLearnScreen;
import net.mcreator.jojohe.client.gui.DefenderLearnScreen;
import net.mcreator.jojohe.client.gui.DefenderChangeScreen;
import net.mcreator.jojohe.client.gui.BoxingChangeScreen;
import net.mcreator.jojohe.client.gui.BookFetchScreen;
import net.mcreator.jojohe.client.gui.BloodVampireQuestScreen;
import net.mcreator.jojohe.client.gui.BloodVampireLearnScreen;
import net.mcreator.jojohe.client.gui.BloodChangeScreen;
import net.mcreator.jojohe.client.gui.AbilityWheelVampireScreen;
import net.mcreator.jojohe.client.gui.AbilityWheelScreen;
import net.mcreator.jojohe.client.gui.AbilityWheelHamonScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class JojoheModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(JojoheModMenus.SPAWN_GUI.get(), SpawnGUIScreen::new);
			MenuScreens.register(JojoheModMenus.SPAWN_GUI_HAMON.get(), SpawnGUIHamonScreen::new);
			MenuScreens.register(JojoheModMenus.SPAWN_GUI_VAMP.get(), SpawnGUIVampScreen::new);
			MenuScreens.register(JojoheModMenus.MASK_DESTROY.get(), MaskDestroyScreen::new);
			MenuScreens.register(JojoheModMenus.MASK_FETCH.get(), MaskFetchScreen::new);
			MenuScreens.register(JojoheModMenus.TOP_HAT_FETCH.get(), TopHatFetchScreen::new);
			MenuScreens.register(JojoheModMenus.WARRIOR_LEARN.get(), WarriorLearnScreen::new);
			MenuScreens.register(JojoheModMenus.HAMON_LEARN.get(), HamonLearnScreen::new);
			MenuScreens.register(JojoheModMenus.WARRIOR_CHANGE.get(), WarriorChangeScreen::new);
			MenuScreens.register(JojoheModMenus.DEFENDER_CHANGE.get(), DefenderChangeScreen::new);
			MenuScreens.register(JojoheModMenus.WISDOM_CHANGE.get(), WisdomChangeScreen::new);
			MenuScreens.register(JojoheModMenus.HERMIT_CHANGE.get(), HermitChangeScreen::new);
			MenuScreens.register(JojoheModMenus.WISDOM_LEARN.get(), WisdomLearnScreen::new);
			MenuScreens.register(JojoheModMenus.DEFENDER_LEARN.get(), DefenderLearnScreen::new);
			MenuScreens.register(JojoheModMenus.BOOK_FETCH.get(), BookFetchScreen::new);
			MenuScreens.register(JojoheModMenus.ROSE_FETCH.get(), RoseFetchScreen::new);
			MenuScreens.register(JojoheModMenus.MASK_FETCH_TONPETTY.get(), MaskFetchTonpettyScreen::new);
			MenuScreens.register(JojoheModMenus.HAMON_LEARN_TONPETTY.get(), HamonLearnTonpettyScreen::new);
			MenuScreens.register(JojoheModMenus.BLOOD_VAMPIRE_QUEST.get(), BloodVampireQuestScreen::new);
			MenuScreens.register(JojoheModMenus.SHADOW_VAMPIRE_QUEST.get(), ShadowVampireQuestScreen::new);
			MenuScreens.register(JojoheModMenus.NECRO_VAMPIRE_QUEST.get(), NecroVampireQuestScreen::new);
			MenuScreens.register(JojoheModMenus.BLOOD_VAMPIRE_LEARN.get(), BloodVampireLearnScreen::new);
			MenuScreens.register(JojoheModMenus.SHADOW_VAMPIRE_LEARN.get(), ShadowVampireLearnScreen::new);
			MenuScreens.register(JojoheModMenus.NECRO_VAMPIRE_LEARN.get(), NecroVampireLearnScreen::new);
			MenuScreens.register(JojoheModMenus.VAMPIRE_CHANGE.get(), VampireChangeScreen::new);
			MenuScreens.register(JojoheModMenus.BLOOD_CHANGE.get(), BloodChangeScreen::new);
			MenuScreens.register(JojoheModMenus.SHADOW_CHANGE.get(), ShadowChangeScreen::new);
			MenuScreens.register(JojoheModMenus.NECRO_CHANGE.get(), NecroChangeScreen::new);
			MenuScreens.register(JojoheModMenus.SPEEDWAGON_CHOICE.get(), SpeedwagonChoiceScreen::new);
			MenuScreens.register(JojoheModMenus.STREET_FIGHT_LEARN.get(), StreetFightLearnScreen::new);
			MenuScreens.register(JojoheModMenus.STREET_FIGHTER_CHANGE.get(), StreetFighterChangeScreen::new);
			MenuScreens.register(JojoheModMenus.BOXING_CHANGE.get(), BoxingChangeScreen::new);
			MenuScreens.register(JojoheModMenus.ABILITY_WHEEL.get(), AbilityWheelScreen::new);
			MenuScreens.register(JojoheModMenus.ABILITY_WHEEL_HAMON.get(), AbilityWheelHamonScreen::new);
			MenuScreens.register(JojoheModMenus.ABILITY_WHEEL_VAMPIRE.get(), AbilityWheelVampireScreen::new);
			MenuScreens.register(JojoheModMenus.HAMON_SKILL_TREE_PHYSICAL.get(), HamonSkillTreePhysicalScreen::new);
			MenuScreens.register(JojoheModMenus.HAMON_SKILL_TREE_PROJECTILE.get(), HamonSkillTreeProjectileScreen::new);
			MenuScreens.register(JojoheModMenus.HAMON_SKILL_TREE_MOVEMENT.get(), HamonSkillTreeMovementScreen::new);
			MenuScreens.register(JojoheModMenus.HAMON_SKILL_TREE_SPECIAL.get(), HamonSkillTreeSpecialScreen::new);
			MenuScreens.register(JojoheModMenus.HAMON_SKILL_TREE_SUPPORT.get(), HamonSkillTreeSupportScreen::new);
			MenuScreens.register(JojoheModMenus.VAMPIRE_SKILL_TREE_PHYSICAL.get(), VampireSkillTreePhysicalScreen::new);
			MenuScreens.register(JojoheModMenus.VAMPIRE_SKILL_TREE_RANGED.get(), VampireSkillTreeRangedScreen::new);
			MenuScreens.register(JojoheModMenus.VAMPIRE_SKILL_TREE_SPECIAL.get(), VampireSkillTreeSpecialScreen::new);
			MenuScreens.register(JojoheModMenus.VAMPIRE_SKILL_TREE_SUPPORT.get(), VampireSkillTreeSupportScreen::new);
			MenuScreens.register(JojoheModMenus.VAMPIRE_SKILL_TREE_MOVEMENT.get(), VampireSkillTreeMovementScreen::new);
			MenuScreens.register(JojoheModMenus.PLAYER_STAT_MENU.get(), PlayerStatMenuScreen::new);
			MenuScreens.register(JojoheModMenus.HUMAN_SKILL_TREE_PHYSICAL.get(), HumanSkillTreePhysicalScreen::new);
			MenuScreens.register(JojoheModMenus.HUMAN_SKILL_TREE_RANGED.get(), HumanSkillTreeRangedScreen::new);
			MenuScreens.register(JojoheModMenus.HUMAN_SKILL_TREE_SPECIAL.get(), HumanSkillTreeSpecialScreen::new);
		});
	}
}
