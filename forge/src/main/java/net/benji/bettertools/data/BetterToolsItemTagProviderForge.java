package net.benji.bettertools.data;

import net.benji.bettertools.BetterToolsCommon;
import net.benji.bettertools.items.BetterToolsItems;
import net.benji.bettertools.util.BetterToolsTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class BetterToolsItemTagProviderForge extends ItemTagsProvider {
    public BetterToolsItemTagProviderForge(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, BetterToolsCommon.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(BetterToolsTags.Items.HAMMERS)
                .add(BetterToolsItems.IRON_HAMMER.get())
                .add(BetterToolsItems.GOLDEN_HAMMER.get())
                .add(BetterToolsItems.DIAMOND_HAMMER.get())
                .add(BetterToolsItems.NETHERITE_HAMMER.get());

        this.tag(BetterToolsTags.Items.PAXELS)
                .add(BetterToolsItems.IRON_PAXEL.get())
                .add(BetterToolsItems.GOLDEN_PAXEL.get())
                .add(BetterToolsItems.DIAMOND_PAXEL.get())
                .add(BetterToolsItems.NETHERITE_PAXEL.get());

        this.tag(BetterToolsTags.Items.SCYTHES)
                .add(BetterToolsItems.IRON_SCYTHE.get())
                .add(BetterToolsItems.GOLDEN_SCYTHE.get())
                .add(BetterToolsItems.DIAMOND_SCYTHE.get())
                .add(BetterToolsItems.NETHERITE_SCYTHE.get());

        this.tag(BetterToolsTags.Items.GLASS_CHIPPERS)
                .add(BetterToolsItems.GLASS_CHIPPER.get());
    }
}
