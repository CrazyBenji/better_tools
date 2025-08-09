package net.benji.bettertools.util;

import net.benji.bettertools.BetterToolsCommon;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class BetterToolsTags {
    public static class Blocks {
        public static final TagKey<Block> PAXEL_MINEABLE = createTag("mineable/paxel");
        public static final TagKey<Block> GLASS_CHIPPER_MINEABLE = createTag("mineable/glass_chipper");

        private static TagKey<Block> createTag(String name) {
            return TagKey.create(Registries.BLOCK, new ResourceLocation(BetterToolsCommon.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> HAMMERS = createTag("hammers");
        public static final TagKey<Item> PAXELS = createTag("paxels");
        public static final TagKey<Item> SCYTHES = createTag("scythes");
        public static final TagKey<Item> GLASS_CHIPPERS = createTag("glass_chippers");

        private static TagKey<Item> createTag(String name) {
            return TagKey.create(Registries.ITEM, new ResourceLocation(BetterToolsCommon.MOD_ID, name));
        }
    }
}
