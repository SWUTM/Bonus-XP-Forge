
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.swutm.bonusxp.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.swutm.bonusxp.bonusxp;
import net.swutm.bonusxp.enchantment.BonusXPEnchantment;

public class BonusXpModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, bonusxp.MOD_ID);
	public static final RegistryObject<Enchantment> BONUS_XP = REGISTRY.register("bonus_xp", () -> new BonusXPEnchantment());
}
