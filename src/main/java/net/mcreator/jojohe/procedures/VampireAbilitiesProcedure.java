package net.mcreator.jojohe.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.jojohe.network.JojoheModVariables;

public class VampireAbilitiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).AbilitySelected).equals("Minions")) {
			MinionAbilityProcedure.execute(world, x, y, z, entity);
		}
		if (((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).AbilitySelected).equals("Invisibility")) {
			InvisibilityAbilityProcedure.execute(world, x, y, z, entity);
		}
		if (((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).AbilitySelected).equals("Claw Barrage")) {
			ClawBarrageAbilityProcedure.execute(world, x, y, z, entity);
		}
		if (((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).AbilitySelected).equals("Chimeras")) {
			ChimeraAbilityProcedure.execute(world, x, y, z, entity);
		}
		if (((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).AbilitySelected).equals("Freeze")) {
			FreezeAbilityProcedure.execute(entity);
		}
		if (((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).AbilitySelected).equals("Shadow Teleport")) {
			ShadowTeleportAbilityProcedure.execute(world, x, y, z, entity);
		}
		if (((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).AbilitySelected).equals("Wry")) {
			WryyyAbilityProcedure.execute(world, x, y, z, entity);
		}
		if (((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).AbilitySelected).equals("Vampire Steed")) {
			VampireSteedAbilityProcedure.execute(world, x, y, z, entity);
		}
		if (((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).AbilitySelected).equals("Space Ripper Stingy Eyes")) {
			SpaceRipperAbilityProcedure.execute(world, x, y, z, entity);
		}
		if (((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).AbilitySelected).equals("Fleshbud")) {
			FleshbudAbilityProcedure.execute(world, x, y, z, entity);
		}
		if (((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).AbilitySelected).equals("Resilience")) {
			ResilienceAbilityProcedure.execute(world, x, y, z, entity);
		}
		if (((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).AbilitySelected).equals("Undead Army")) {
			UndeadArmyAbilityProcedure.execute(world, x, y, z, entity);
		}
	}
}
