package net.mcreator.jojohe.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jojohe.network.JojoheModVariables;

public class ReturnAbilityCooldown5Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).AbilityCooldown5 > 0
				&& ((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).AbilitySlot5)
						.equals((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).AbilitySelected) == false) {
			return true;
		}
		return false;
	}
}