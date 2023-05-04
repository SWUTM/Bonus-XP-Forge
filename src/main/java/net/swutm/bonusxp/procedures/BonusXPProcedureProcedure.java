package net.swutm.bonusxp.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.Entity;

import net.swutm.bonusxp.init.BonusXpModEnchantments;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class BonusXPProcedureProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(),
					event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity sourceentity) {
		execute(null, world, x, y, z, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (EnchantmentHelper.getItemEnchantmentLevel(BonusXpModEnchantments.BONUS_XP.get(),
				(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 1) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 10));
		} else if (EnchantmentHelper.getItemEnchantmentLevel(BonusXpModEnchantments.BONUS_XP.get(),
				(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 2) {
			if (Math.random() >= 1) {
				if (world instanceof Level _level && !_level.isClientSide())
					_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 10));
			} else {
				if (Math.random() >= 0.7) {
					if (world instanceof Level _level && !_level.isClientSide())
						_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 10));
				}
			}
		} else if (EnchantmentHelper.getItemEnchantmentLevel(BonusXpModEnchantments.BONUS_XP.get(),
				(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 3) {
			if (Math.random() >= 1) {
				if (world instanceof Level _level && !_level.isClientSide())
					_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 10));
			} else {
				if (Math.random() >= 0.7) {
					if (world instanceof Level _level && !_level.isClientSide())
						_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 10));
				} else {
					if (Math.random() >= 0.5) {
						if (world instanceof Level _level && !_level.isClientSide())
							_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 10));
					} else {
						if (Math.random() >= 0.4) {
							if (world instanceof Level _level && !_level.isClientSide())
								_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 20));
						} else {
							if (Math.random() >= 0.2) {
								if (world instanceof Level _level && !_level.isClientSide())
									_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 20));
							} else {
								if (Math.random() >= 0.1) {
									if (world instanceof Level _level && !_level.isClientSide())
										_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 30));
								} else {
									if (Math.random() >= 0.05) {
										if (world instanceof Level _level && !_level.isClientSide())
											_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 30));
									} else {
										if (world instanceof Level _level && !_level.isClientSide())
											_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 50));
									}
								}
							}
						}
					}
				}
			}
		}
		else if (EnchantmentHelper.getItemEnchantmentLevel(BonusXpModEnchantments.BONUS_XP.get(),
				(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 4) {
			if (Math.random() >= 1) {
				if (world instanceof Level _level && !_level.isClientSide())
					_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 10));
			} else {
				if (Math.random() >= 0.7) {
					if (world instanceof Level _level && !_level.isClientSide())
						_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 10));
				} else {
					if (Math.random() >= 0.5) {
						if (world instanceof Level _level && !_level.isClientSide())
							_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 20));
					} else {
						if (Math.random() >= 0.4) {
							if (world instanceof Level _level && !_level.isClientSide())
								_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 20));
						} else {
							if (Math.random() >= 0.2) {
								if (world instanceof Level _level && !_level.isClientSide())
									_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 20));
							} else {
								if (Math.random() >= 0.1) {
									if (world instanceof Level _level && !_level.isClientSide())
										_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 30));
								} else {
									if (Math.random() >= 0.05) {
										if (world instanceof Level _level && !_level.isClientSide())
											_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 50));
									} else {
										if (world instanceof Level _level && !_level.isClientSide())
											_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 70));
									}
								}
							}
						}
					}
				}
			}
		}
		else if (EnchantmentHelper.getItemEnchantmentLevel(BonusXpModEnchantments.BONUS_XP.get(),
				(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 5) {
			if (Math.random() >= 1) {
				if (world instanceof Level _level && !_level.isClientSide())
					_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 20));
			} else {
				if (Math.random() >= 0.7) {
					if (world instanceof Level _level && !_level.isClientSide())
						_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 20));
				} else {
					if (Math.random() >= 0.5) {
						if (world instanceof Level _level && !_level.isClientSide())
							_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 20));
					} else {
						if (Math.random() >= 0.4) {
							if (world instanceof Level _level && !_level.isClientSide())
								_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 30));
						} else {
							if (Math.random() >= 0.2) {
								if (world instanceof Level _level && !_level.isClientSide())
									_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 30));
							} else {
								if (Math.random() >= 0.1) {
									if (world instanceof Level _level && !_level.isClientSide())
										_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 50));
								} else {
									if (Math.random() >= 0.05) {
										if (world instanceof Level _level && !_level.isClientSide())
											_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 50));
									} else {
										if (world instanceof Level _level && !_level.isClientSide())
											_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 700));
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
