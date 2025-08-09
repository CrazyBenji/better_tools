package net.benji.bettertools.data;

import net.benji.bettertools.items.BetterToolsItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class BetterToolsRecipeProviderForge extends RecipeProvider implements IConditionBuilder {
    public BetterToolsRecipeProviderForge(PackOutput output) {
        super(output);
    }

    public void generatePaxelRecipe(Consumer<FinishedRecipe> writer, Item pickaxe, Item axe, Item shovel, Item output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, output, 1)
                .pattern("abc")
                .pattern(" s ")
                .pattern(" s ")
                .define('a', pickaxe)
                .define('b', axe)
                .define('c', shovel)
                .define('s', Items.STICK)
                .unlockedBy(getHasName(pickaxe), has(pickaxe))
                .save(writer);
    }

    public void generateHammerRecipe(Consumer<FinishedRecipe> writer, Item ingot, Item block, Item output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, output, 1)
                .pattern("mbm")
                .pattern("msm")
                .pattern(" s ")
                .define('m', ingot)
                .define('b', block)
                .define('s', Items.STICK)
                .unlockedBy(getHasName(ingot), has(ingot))
                .save(writer);
    }

    public void generateSickleRecipe(Consumer<FinishedRecipe> writer, Item ingot, Item output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, output, 1)
                .pattern("mmm")
                .pattern(" s ")
                .pattern("s  ")
                .define('m', ingot)
                .define('s', Items.STICK)
                .unlockedBy(getHasName(ingot), has(ingot))
                .save(writer);
    }

    @Override
    public void buildRecipes(@NotNull Consumer<FinishedRecipe> writer) {
        generateHammerRecipe(writer, Items.IRON_INGOT, Items.IRON_BLOCK, BetterToolsItems.IRON_HAMMER.get());
        generateHammerRecipe(writer, Items.GOLD_INGOT, Items.GOLD_BLOCK, BetterToolsItems.GOLDEN_HAMMER.get());
        generateHammerRecipe(writer, Items.DIAMOND, Items.DIAMOND_BLOCK, BetterToolsItems.DIAMOND_HAMMER.get());
        netheriteSmithing(writer, BetterToolsItems.DIAMOND_HAMMER.get(), RecipeCategory.TOOLS, BetterToolsItems.NETHERITE_HAMMER.get());

        generateSickleRecipe(writer, Items.IRON_INGOT, BetterToolsItems.IRON_SCYTHE.get());
        generateSickleRecipe(writer, Items.GOLD_INGOT, BetterToolsItems.GOLDEN_SCYTHE.get());
        generateSickleRecipe(writer, Items.DIAMOND, BetterToolsItems.DIAMOND_SCYTHE.get());
        netheriteSmithing(writer, BetterToolsItems.DIAMOND_SCYTHE.get(), RecipeCategory.TOOLS, BetterToolsItems.NETHERITE_SCYTHE.get());

        generatePaxelRecipe(writer, Items.IRON_PICKAXE, Items.IRON_AXE, Items.IRON_SHOVEL, BetterToolsItems.IRON_PAXEL.get());
        generatePaxelRecipe(writer, Items.GOLDEN_PICKAXE, Items.GOLDEN_AXE, Items.GOLDEN_SHOVEL, BetterToolsItems.GOLDEN_PAXEL.get());
        generatePaxelRecipe(writer, Items.DIAMOND_PICKAXE, Items.DIAMOND_AXE, Items.DIAMOND_SHOVEL, BetterToolsItems.DIAMOND_PAXEL.get());
        netheriteSmithing(writer, BetterToolsItems.DIAMOND_PAXEL.get(), RecipeCategory.TOOLS, BetterToolsItems.NETHERITE_PAXEL.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, BetterToolsItems.GLASS_CHIPPER.get(), 1)
                .pattern(" i")
                .pattern("s ")
                .define('i', Items.IRON_INGOT)
                .define('s', Items.STICK)
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .save(writer);
    }
}
