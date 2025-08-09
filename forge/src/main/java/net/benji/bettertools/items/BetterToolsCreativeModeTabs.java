package net.benji.bettertools.items;

import net.benji.bettertools.BetterToolsCommon;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class BetterToolsCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BetterToolsCommon.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BETTER_TOOLS_TAB = CREATIVE_MODE_TABS.register("bettertools_itemgroup",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(BetterToolsItems.IRON_HAMMER.get()))
                    .title(Component.translatable("itemgroup.bettertools"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(BetterToolsItems.IRON_HAMMER.get());
                        pOutput.accept(BetterToolsItems.GOLDEN_HAMMER.get());
                        pOutput.accept(BetterToolsItems.DIAMOND_HAMMER.get());
                        pOutput.accept(BetterToolsItems.NETHERITE_HAMMER.get());

                        pOutput.accept(BetterToolsItems.IRON_PAXEL.get());
                        pOutput.accept(BetterToolsItems.GOLDEN_PAXEL.get());
                        pOutput.accept(BetterToolsItems.DIAMOND_PAXEL.get());
                        pOutput.accept(BetterToolsItems.NETHERITE_PAXEL.get());

                        pOutput.accept(BetterToolsItems.IRON_SCYTHE.get());
                        pOutput.accept(BetterToolsItems.GOLDEN_SCYTHE.get());
                        pOutput.accept(BetterToolsItems.DIAMOND_SCYTHE.get());
                        pOutput.accept(BetterToolsItems.NETHERITE_SCYTHE.get());

                        pOutput.accept(BetterToolsItems.GLASS_CHIPPER.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
