package net.benji.bettertools.data;

import net.benji.bettertools.BetterToolsCommon;
import net.benji.bettertools.data.loot.AddItemModifier;
import net.benji.bettertools.items.BetterToolsItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.*;
import net.minecraftforge.common.data.GlobalLootModifierProvider;

import java.util.List;

public class BetterToolsGlobalLootModifierProviderForge extends GlobalLootModifierProvider {

    public static final List<Block> GLASS_BLOCKS = List.of(
            Blocks.GLASS,
            Blocks.WHITE_STAINED_GLASS,
            Blocks.LIGHT_GRAY_STAINED_GLASS,
            Blocks.GRAY_STAINED_GLASS,
            Blocks.BLACK_STAINED_GLASS,
            Blocks.BROWN_STAINED_GLASS,
            Blocks.RED_STAINED_GLASS,
            Blocks.ORANGE_STAINED_GLASS,
            Blocks.YELLOW_STAINED_GLASS,
            Blocks.LIME_STAINED_GLASS,
            Blocks.GREEN_STAINED_GLASS,
            Blocks.CYAN_STAINED_GLASS,
            Blocks.LIGHT_BLUE_STAINED_GLASS,
            Blocks.BLUE_STAINED_GLASS,
            Blocks.PURPLE_STAINED_GLASS,
            Blocks.MAGENTA_STAINED_GLASS,
            Blocks.PINK_STAINED_GLASS,
            Blocks.GLASS_PANE,
            Blocks.WHITE_STAINED_GLASS_PANE,
            Blocks.LIGHT_GRAY_STAINED_GLASS_PANE,
            Blocks.GRAY_STAINED_GLASS_PANE,
            Blocks.BLACK_STAINED_GLASS_PANE,
            Blocks.BROWN_STAINED_GLASS_PANE,
            Blocks.RED_STAINED_GLASS_PANE,
            Blocks.ORANGE_STAINED_GLASS_PANE,
            Blocks.YELLOW_STAINED_GLASS_PANE,
            Blocks.LIME_STAINED_GLASS_PANE,
            Blocks.GREEN_STAINED_GLASS_PANE,
            Blocks.CYAN_STAINED_GLASS_PANE,
            Blocks.LIGHT_BLUE_STAINED_GLASS_PANE,
            Blocks.BLUE_STAINED_GLASS_PANE,
            Blocks.PURPLE_STAINED_GLASS_PANE,
            Blocks.MAGENTA_STAINED_GLASS_PANE,
            Blocks.PINK_STAINED_GLASS_PANE
    );

    public BetterToolsGlobalLootModifierProviderForge(PackOutput output) {
        super(output, BetterToolsCommon.MOD_ID);
    }

    @Override
    protected void start() {
        for (Block b : GLASS_BLOCKS) {
            this.addGlassChipperDrop(b);
        }
        this.addGlassChipperDrop(Blocks.GLOWSTONE);
        this.addGlassChipperDrop(Blocks.SEA_LANTERN);
    }

    public void addGlassChipperDrop(Block block) {
        this.add(block.getDescriptionId().substring(16) + "_from_glass_chipper",
                new AddItemModifier(
                        new LootItemCondition[]{
                                LootItemBlockStatePropertyCondition.hasBlockStateProperties(block).build(),
                                MatchTool.toolMatches(ItemPredicate.Builder.item().of(BetterToolsItems.GLASS_CHIPPER.get())).build()
                        },
                        block.asItem()
                ));
    }
}
