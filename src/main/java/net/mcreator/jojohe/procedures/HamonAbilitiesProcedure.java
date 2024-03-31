package net.mcreator.jojohe.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.jojohe.network.JojoheModVariables;

public class HamonAbilitiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).AbilitySelected).equals("Wine Cutter")) {
			WineCutterAbilityProcedure.execute(world, x, y, z, entity);
		}
		if (((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).AbilitySelected).equals("Zoom Punch")) {
			ZoomPunchAbilityProcedure.execute(world, x, y, z, entity);
		}
		if (((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).AbilitySelected).equals("Ground Ripple")) {
			GroundRippleAbilityProcedure.execute(world, x, y, z, entity);
		}
		if (((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).AbilitySelected).equals("Overdrive Barrage")) {
			OverdriveBarrageAbilityProcedure.execute(world, x, y, z, entity);
		}
		if (((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).AbilitySelected).equals("Scarlet Overdrive")) {
			ScarletOverdriveAbilityProcedure.execute(world, x, y, z, entity);
		}
		if (((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).AbilitySelected).equals("Hamon Dash")) {
			HamonDashAbilityProcedure.execute(world, x, y, z, entity);
		}
		if (((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).AbilitySelected).equals("Afterimages")) {
			AfterimagesAbilityProcedure.execute(world, x, y, z, entity);
		}
		if (((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).AbilitySelected).equals("Sendo Ripple Overdrive")) {
			SendoOverdriveAbilityProcedure.execute(world, x, y, z, entity);
		}
		if (((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).AbilitySelected).equals("Sunlight Yellow Overdrive")) {
			SunlightOverdriveAbilityProcedure.execute(world, x, y, z, entity);
		}
		if (((entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojoheModVariables.PlayerVariables())).AbilitySelected).equals("Thunder Cross Split")) {
			ThunderSplitAbilityProcedure.execute(world, x, y, z, entity);
		}
	}
}
