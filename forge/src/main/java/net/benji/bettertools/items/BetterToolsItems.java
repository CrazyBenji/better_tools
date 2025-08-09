package net.benji.bettertools.items;

import net.benji.bettertools.BetterToolsCommon;
import net.benji.bettertools.item.custom.GlassChipperItem;
import net.benji.bettertools.item.custom.HammerItem;
import net.benji.bettertools.item.custom.PaxelItem;
import net.benji.bettertools.item.custom.ScytheItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BetterToolsItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BetterToolsCommon.MOD_ID);

    public static final RegistryObject<Item> IRON_HAMMER = ITEMS.register("iron_hammer",
            () -> new HammerItem(Tiers.IRON, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_HAMMER = ITEMS.register("golden_hammer",
            () -> new HammerItem(Tiers.GOLD, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_HAMMER = ITEMS.register("diamond_hammer",
            () -> new HammerItem(Tiers.DIAMOND, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_HAMMER = ITEMS.register("netherite_hammer",
            () -> new HammerItem(Tiers.NETHERITE, 1, -2.8F, new Item.Properties()));

    public static final RegistryObject<Item> IRON_SCYTHE = ITEMS.register("iron_scythe",
            () -> new ScytheItem(Tiers.IRON, 3, -3.2F, new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_SCYTHE = ITEMS.register("golden_scythe",
            () -> new ScytheItem(Tiers.GOLD, 3, -3.2F, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_SCYTHE = ITEMS.register("diamond_scythe",
            () -> new ScytheItem(Tiers.DIAMOND, 3, -3.2F, new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_SCYTHE = ITEMS.register("netherite_scythe",
            () -> new ScytheItem(Tiers.NETHERITE, 3, -3.2F, new Item.Properties()));

    public static final RegistryObject<Item> IRON_PAXEL = ITEMS.register("iron_paxel",
            () -> new PaxelItem(Tiers.IRON, 2, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_PAXEL = ITEMS.register("golden_paxel",
            () -> new PaxelItem(Tiers.GOLD, 2, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_PAXEL = ITEMS.register("diamond_paxel",
            () -> new PaxelItem(Tiers.DIAMOND, 2, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_PAXEL = ITEMS.register("netherite_paxel",
            () -> new PaxelItem(Tiers.NETHERITE, 2, -2.8F, new Item.Properties()));

    public static final RegistryObject<Item> GLASS_CHIPPER = ITEMS.register("glass_chipper",
            () -> new GlassChipperItem(Tiers.IRON, 0, -3.2F, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
