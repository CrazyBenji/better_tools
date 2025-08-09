package net.benji.bettertools.item;

import net.benji.bettertools.BetterToolsCommon;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class BetterToolsItemGroups {
    public static final ResourceKey<CreativeModeTab> BETTER_TOOLS_KEY = createKey("bettertools_itemgroup");

    private static ResourceKey<CreativeModeTab> createKey(String name) {
        return ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(BetterToolsCommon.MOD_ID, name));
    }


    public static void bootstrap(Registry<CreativeModeTab> registry) {
        Registry.register(
                registry,
                BETTER_TOOLS_KEY,
                CreativeModeTab.builder(CreativeModeTab.Row.TOP, 7)
                        .title(Component.translatable("itemgroup.bettertools"))
                        .icon(() -> new ItemStack(BetterToolsItems.IRON_HAMMER))
                        .displayItems(((itemDisplayParameters, output) -> {
                            output.accept(BetterToolsItems.IRON_HAMMER);
                            output.accept(BetterToolsItems.GOLDEN_HAMMER);
                            output.accept(BetterToolsItems.DIAMOND_HAMMER);
                            output.accept(BetterToolsItems.NETHERITE_HAMMER);

                            output.accept(BetterToolsItems.IRON_PAXEL);
                            output.accept(BetterToolsItems.GOLDEN_PAXEL);
                            output.accept(BetterToolsItems.DIAMOND_PAXEL);
                            output.accept(BetterToolsItems.NETHERITE_PAXEL);

                            output.accept(BetterToolsItems.IRON_SCYTHE);
                            output.accept(BetterToolsItems.GOLDEN_SCYTHE);
                            output.accept(BetterToolsItems.DIAMOND_SCYTHE);
                            output.accept(BetterToolsItems.NETHERITE_SCYTHE);

                            output.accept(BetterToolsItems.GLASS_CHIPPER);
                        })).build()
        );
    }

    public static void registerItemGroups() {
        BetterToolsCommon.LOGGER.info("Registering Item Groups for " + BetterToolsCommon.MOD_ID);
        bootstrap(BuiltInRegistries.CREATIVE_MODE_TAB);
    }
}
