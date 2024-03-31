package net.mcreator.jojohe.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jojohe.network.JojoheModVariables;

public class ReturnSkillPointsProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "\u00A7f[\u00A76\u00A7l" + new java.text.DecimalFormat("##").format((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).SkillPoints) + "\u00A7f] Skill Points";
	}
}
