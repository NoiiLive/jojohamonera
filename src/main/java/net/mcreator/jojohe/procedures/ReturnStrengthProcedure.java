package net.mcreator.jojohe.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jojohe.network.JojoheModVariables;

public class ReturnStrengthProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		if ((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).PlayerStrength == (entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new JojoheModVariables.PlayerVariables())).PlayerMaxStrength) {
			return "Strength : MAX/" + new java.text.DecimalFormat("##").format((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).PlayerMaxStrength);
		}
		return "Strength : " + new java.text.DecimalFormat("##").format((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).PlayerStrength) + "/"
				+ new java.text.DecimalFormat("##").format((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).PlayerMaxStrength);
	}
}
