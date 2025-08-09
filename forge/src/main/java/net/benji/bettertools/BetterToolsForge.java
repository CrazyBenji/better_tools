package net.benji.bettertools;

import net.benji.bettertools.data.loot.BetterToolsLootModifiers;
import net.benji.bettertools.enchantment.BetterToolsEnchantments;
import net.benji.bettertools.items.BetterToolsCreativeModeTabs;
import net.benji.bettertools.items.BetterToolsItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(BetterToolsCommon.MOD_ID)
public class BetterToolsForge {
    
    public BetterToolsForge() {
    
        // Use Forge to bootstrap the Common mod.
        BetterToolsCommon.LOGGER.info("Hello Forge world!");
        BetterToolsCommon.init();

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        BetterToolsItems.register(modEventBus);
        BetterToolsCreativeModeTabs.register(modEventBus);
        BetterToolsEnchantments.register(modEventBus);
        BetterToolsLootModifiers.register(modEventBus);
    }
}