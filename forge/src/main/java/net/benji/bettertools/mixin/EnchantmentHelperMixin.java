package net.benji.bettertools.mixin;

import net.benji.bettertools.enchantment.ReapingEnchantment;
import net.benji.bettertools.item.custom.ScytheItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(EnchantmentHelper.class)
public class EnchantmentHelperMixin {

    @Unique
    private static Enchantment betterTools$currentEnchantment;

    @Redirect(method = "getAvailableEnchantmentResults", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/enchantment/Enchantment;isDiscoverable()Z"))
    private static boolean isDiscoverable(Enchantment enchantment) {
        betterTools$currentEnchantment = enchantment;

        return enchantment.isDiscoverable();
    }

    @Redirect(method = "getAvailableEnchantmentResults", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/enchantment/Enchantment;canApplyAtEnchantingTable(Lnet/minecraft/world/item/ItemStack;)Z"))
    private static boolean canApplyAtEnchantingTable(Enchantment enchantment, ItemStack itemStack) {

        if (betterTools$currentEnchantment instanceof ReapingEnchantment) {
            return itemStack.getItem() instanceof ScytheItem;
        }

        return enchantment.canApplyAtEnchantingTable(itemStack);
    }

}
