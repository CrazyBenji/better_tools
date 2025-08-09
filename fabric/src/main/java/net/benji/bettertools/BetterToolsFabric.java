package net.benji.bettertools;

import net.benji.bettertools.enchantment.BetterToolsEnchantments;
import net.benji.bettertools.item.BetterToolsItemGroups;
import net.benji.bettertools.item.BetterToolsItems;
import net.fabricmc.api.ModInitializer;

public class BetterToolsFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        BetterToolsCommon.init();

        BetterToolsItems.registerModItems();
        BetterToolsItemGroups.registerItemGroups();
        BetterToolsEnchantments.registerModEnchantments();
    }
}
