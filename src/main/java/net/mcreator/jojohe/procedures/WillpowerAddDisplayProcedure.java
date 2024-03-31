package net.mcreator.jojohe.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jojohe.network.JojoheModVariables;

public class WillpowerAddDisplayProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).PlayerWillpower < (entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new JojoheModVariables.PlayerVariables())).PlayerMaxWillpower && (entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).SkillPoints > 0) {
			return true;
		}
		return false;
	}
}
