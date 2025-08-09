package net.benji.bettertools.item;

import net.benji.bettertools.BetterToolsCommon;
import net.benji.bettertools.item.custom.GlassChipperItem;
import net.benji.bettertools.item.custom.HammerItem;
import net.benji.bettertools.item.custom.PaxelItem;
import net.benji.bettertools.item.custom.ScytheItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tiers;

public class BetterToolsItems {
    public static final Item IRON_HAMMER = Items.registerItem(new ResourceLocation(BetterToolsCommon.MOD_ID, "iron_hammer"),
            new HammerItem(Tiers.IRON, 1, -2.8F, new Item.Properties()));
    public static final Item GOLDEN_HAMMER = Items.registerItem(new ResourceLocation(BetterToolsCommon.MOD_ID, "golden_hammer"),
            new HammerItem(Tiers.GOLD, 1, -2.8F, new Item.Properties()));
    public static final Item DIAMOND_HAMMER = Items.registerItem(new ResourceLocation(BetterToolsCommon.MOD_ID, "diamond_hammer"),
            new HammerItem(Tiers.DIAMOND, 1, -2.8F, new Item.Properties()));
    public static final Item NETHERITE_HAMMER = Items.registerItem(new ResourceLocation(BetterToolsCommon.MOD_ID, "netherite_hammer"),
            new HammerItem(Tiers.NETHERITE, 1, -2.8F, new Item.Properties()));

    public static final Item IRON_PAXEL = Items.registerItem(new ResourceLocation(BetterToolsCommon.MOD_ID, "iron_paxel"),
            new PaxelItem(Tiers.IRON, 2, -2.8F, new Item.Properties()));
    public static final Item GOLDEN_PAXEL = Items.registerItem(new ResourceLocation(BetterToolsCommon.MOD_ID, "golden_paxel"),
            new PaxelItem(Tiers.GOLD, 2, -2.8F, new Item.Properties()));
    public static final Item DIAMOND_PAXEL = Items.registerItem(new ResourceLocation(BetterToolsCommon.MOD_ID, "diamond_paxel"),
            new PaxelItem(Tiers.DIAMOND, 2, -2.8F, new Item.Properties()));
    public static final Item NETHERITE_PAXEL = Items.registerItem(new ResourceLocation(BetterToolsCommon.MOD_ID, "netherite_paxel"),
            new PaxelItem(Tiers.NETHERITE, 2, -2.8F, new Item.Properties()));

    public static final Item IRON_SCYTHE = Items.registerItem(new ResourceLocation(BetterToolsCommon.MOD_ID, "iron_scythe"),
            new ScytheItem(Tiers.IRON, 3, -3.2F, new Item.Properties()));
    public static final Item GOLDEN_SCYTHE = Items.registerItem(new ResourceLocation(BetterToolsCommon.MOD_ID, "golden_scythe"),
            new ScytheItem(Tiers.GOLD, 3, -3.2F, new Item.Properties()));
    public static final Item DIAMOND_SCYTHE = Items.registerItem(new ResourceLocation(BetterToolsCommon.MOD_ID, "diamond_scythe"),
            new ScytheItem(Tiers.DIAMOND, 3, -3.2F, new Item.Properties()));
    public static final Item NETHERITE_SCYTHE = Items.registerItem(new ResourceLocation(BetterToolsCommon.MOD_ID, "netherite_scythe"),
            new ScytheItem(Tiers.NETHERITE, 3, -3.2F, new Item.Properties()));

    public static final Item GLASS_CHIPPER = Items.registerItem(new ResourceLocation(BetterToolsCommon.MOD_ID, "glass_chipper"),
            new GlassChipperItem(Tiers.IRON, 0, -3.2F, new Item.Properties()));

    public static void registerModItems() {
        BetterToolsCommon.LOGGER.info("Registering Mod Items for " + BetterToolsCommon.MOD_ID);
    }
}
