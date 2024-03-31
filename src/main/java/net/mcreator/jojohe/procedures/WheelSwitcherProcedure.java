package net.mcreator.jojohe.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jojohe.network.JojoheModVariables;
import net.mcreator.jojohe.JojoheMod;

public class WheelSwitcherProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		boolean GATE = false;
		GATE = false;
		if ((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).AbilityWheelGUI == 1 && GATE == false) {
			entity.getPersistentData().putDouble("AbilityWheelGUI", 2);
			{
				double _setval = 2;
				entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.AbilityWheelGUI = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			entity.getPersistentData().putBoolean("SwitchWheels", true);
			JojoheMod.LOGGER.info("Switch to Hamon Era");
			JojoheMod.LOGGER.info("---");
			GATE = true;
		}
		if ((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).AbilityWheelGUI == 2 && GATE == false) {
			entity.getPersistentData().putDouble("AbilityWheelGUI", 1);
			{
				double _setval = 1;
				entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.AbilityWheelGUI = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			entity.getPersistentData().putBoolean("SwitchWheels", false);
			JojoheMod.LOGGER.info("Switch to World of Stands");
			JojoheMod.LOGGER.info("---");
			GATE = true;
		}
	}
}
