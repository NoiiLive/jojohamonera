
package net.mcreator.jojohe.enchantment;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.entity.EquipmentSlot;

import java.util.List;

public class MetalSilverOverdriveEnchantment extends Enchantment {
	public MetalSilverOverdriveEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.RARE, EnchantmentCategory.WEAPON, slots);
	}

	@Override
	public int getMaxLevel() {
		return 5;
	}

	@Override
	protected boolean checkCompatibility(Enchantment ench) {
		return List.of(Enchantments.UNBREAKING, Enchantments.SWEEPING_EDGE, Enchantments.MOB_LOOTING, Enchantments.MENDING, Enchantments.FIRE_ASPECT, Enchantments.KNOCKBACK, Enchantments.VANISHING_CURSE, Enchantments.BINDING_CURSE).contains(ench);
	}

	@Override
	public boolean isDiscoverable() {
		return false;
	}

	@Override
	public boolean isTradeable() {
		return false;
	}
}
