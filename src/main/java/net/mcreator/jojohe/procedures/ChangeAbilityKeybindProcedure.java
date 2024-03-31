package net.mcreator.jojohe.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.jojohe.network.JojoheModVariables;

public class ChangeAbilityKeybindProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			String _setval = "Keybind";
			entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.UseAbilityType = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal("Abilities will now be switched using Keybinds (Default Keybinds: Numpad)"), false);
		{
			double _setval = 0;
			entity.getCapability(JojoheModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SwitcherSlot = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
