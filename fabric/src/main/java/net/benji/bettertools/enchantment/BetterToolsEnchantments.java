package net.benji.bettertools.enchantment;

import net.benji.bettertools.BetterToolsCommon;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;

public class BetterToolsEnchantments {
    public static final Enchantment REAPING = register("reaping", new ReapingEnchantment(Enchantment.Rarity.VERY_RARE, EquipmentSlot.MAINHAND));


    protected static Enchantment register(String name, Enchantment enchantment) {
        return Registry.register(BuiltInRegistries.ENCHANTMENT, new ResourceLocation(BetterToolsCommon.MOD_ID, name), enchantment);
    }

    public static void registerModEnchantments() {
        BetterToolsCommon.LOGGER.info("Registering Enchantments for " + BetterToolsCommon.MOD_ID);
    }

}
