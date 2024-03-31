package net.mcreator.jojohe.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jojohe.network.JojoheModVariables;

public class ReturnWillpowerProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		if ((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).PlayerWillpower == (entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new JojoheModVariables.PlayerVariables())).PlayerMaxWillpower) {
			return "Willpower : MAX/" + new java.text.DecimalFormat("##").format((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).PlayerMaxWillpower);
		}
		return "Willpower : " + new java.text.DecimalFormat("##").format((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).PlayerWillpower) + "/"
				+ new java.text.DecimalFormat("##").format((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).PlayerMaxWillpower);
	}
}
