package net.benji.bettertools.data;

import net.benji.bettertools.item.BetterToolsItems;
import net.benji.bettertools.util.BetterToolsTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;

import java.util.concurrent.CompletableFuture;

public class BetterToolsItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public BetterToolsItemTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider arg) {
        getOrCreateTagBuilder(BetterToolsTags.Items.HAMMERS)
                .add(BetterToolsItems.IRON_HAMMER)
                .add(BetterToolsItems.GOLDEN_HAMMER)
                .add(BetterToolsItems.DIAMOND_HAMMER)
                .add(BetterToolsItems.NETHERITE_HAMMER);

        getOrCreateTagBuilder(BetterToolsTags.Items.PAXELS)
                .add(BetterToolsItems.IRON_PAXEL)
                .add(BetterToolsItems.GOLDEN_PAXEL)
                .add(BetterToolsItems.DIAMOND_PAXEL)
                .add(BetterToolsItems.NETHERITE_PAXEL);

        getOrCreateTagBuilder(BetterToolsTags.Items.SCYTHES)
                .add(BetterToolsItems.IRON_SCYTHE)
                .add(BetterToolsItems.GOLDEN_SCYTHE)
                .add(BetterToolsItems.DIAMOND_SCYTHE)
                .add(BetterToolsItems.NETHERITE_SCYTHE);

        getOrCreateTagBuilder(BetterToolsTags.Items.GLASS_CHIPPERS)
                .add(BetterToolsItems.GLASS_CHIPPER);
    }
}
