package net.benji.bettertools.enchantment;

import net.benji.bettertools.item.custom.ScytheItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.DamageEnchantment;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import org.jetbrains.annotations.NotNull;

public class ReapingEnchantment extends Enchantment {

    public ReapingEnchantment(Rarity weight, EquipmentSlot... slots) {
        super(weight, EnchantmentCategory.DIGGER, slots);
    }

    @Override
    public float getDamageBonus(int level, MobType group) {
        return 1.5F * level;
    }

    @Override
    public boolean checkCompatibility(@NotNull Enchantment other) {
        return !(other instanceof DamageEnchantment);
    }

    @Override
    public int getMaxLevel() {
        return 4;
    }

    @Override
    public boolean canEnchant(ItemStack stack) {
        return stack.getItem() instanceof ScytheItem;
    }


}
