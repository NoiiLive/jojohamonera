package net.mcreator.jojohe.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jojohe.network.JojoheModVariables;

public class ReturnAfterimages9Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).AbilitySlot9).equals("Afterimages")
				&& ((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).AbilitySelected).equals("Afterimages") == false) {
			if ((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).AbilityCooldown9 == 0) {
				return true;
			}
		}
		return false;
	}
}