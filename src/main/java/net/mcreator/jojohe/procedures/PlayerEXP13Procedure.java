package net.mcreator.jojohe.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jojohe.network.JojoheModVariables;

public class PlayerEXP13Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).CurrentEXP
				/ (entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).MaxEXP) * 100 <= 45
				&& ((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).CurrentEXP
						/ (entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).MaxEXP) * 100 > 40.5) {
			return true;
		}
		return false;
	}
}
