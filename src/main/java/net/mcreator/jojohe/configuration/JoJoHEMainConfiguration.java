package net.mcreator.jojohe.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

public class JoJoHEMainConfiguration {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SPEC;
	public static final ForgeConfigSpec.ConfigValue<Double> EXPMULTIPLIER;
	public static final ForgeConfigSpec.ConfigValue<Double> LEVELSKILLPOINTS;
	public static final ForgeConfigSpec.ConfigValue<Boolean> LOSEABILITYDEATH;
	public static final ForgeConfigSpec.ConfigValue<Boolean> PLAYERABILITYSELECTION;
	static {
		BUILDER.push("Player Configuration");
		EXPMULTIPLIER = BUILDER.comment("Changes how much EXP is added per level-up, high values may make leveling difficult (Default: 25)").define("EXP Multiplier", (double) 25);
		LEVELSKILLPOINTS = BUILDER.comment("Changes how many Skill Points are given per level-up (Default: 5)").define("Skill Points Per Level", (double) 5);
		LOSEABILITYDEATH = BUILDER.comment("Allows the losing of Abilities on death (Default: false)").define("Lose Ability on Death", false);
		PLAYERABILITYSELECTION = BUILDER.comment("Allows players to choose their abilities on spawn (Default: false)").define("Player Ability Selection", false);
		BUILDER.pop();

		SPEC = BUILDER.build();
	}

}
