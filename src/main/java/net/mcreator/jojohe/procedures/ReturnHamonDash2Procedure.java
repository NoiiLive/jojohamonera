package net.mcreator.jojohe.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jojohe.network.JojoheModVariables;

public class ReturnHamonDash2Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).AbilitySlot2).equals("Hamon Dash")
				&& ((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).AbilitySelected).equals("Hamon Dash") == false) {
			if ((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).AbilityCooldown2 == 0) {
				return true;
			}
		}
		return false;
	}
}