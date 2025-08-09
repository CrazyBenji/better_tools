package net.benji.bettertools.data;

import net.benji.bettertools.BetterToolsCommon;
import net.benji.bettertools.item.BetterToolsItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.FrameType;
import net.minecraft.advancements.AdvancementRewards;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

public class BetterToolsAdvancementProvider extends FabricAdvancementProvider {
    public BetterToolsAdvancementProvider(FabricDataOutput output) {
        super(output);
    }

    public Advancement getAdvancement(String id) {
        return Advancement.Builder.advancement().build(new ResourceLocation("minecraft", id));
    }

    @Override
    public void generateAdvancement(Consumer<Advancement> consumer) {
        Advancement getHammer = Advancement.Builder.advancement()
                .parent(getAdvancement("story/iron_tools"))
                .display(
                        BetterToolsItems.IRON_HAMMER,
                        Component.translatable("advancements.story.get_hammer.title"),
                        Component.translatable("advancements.story.get_hammer.description"),
                        null,
                        FrameType.TASK,
                        true,
                        true,
                        false
                )
                .addCriterion("hammer", InventoryChangeTrigger.TriggerInstance.hasItems(BetterToolsItems.IRON_HAMMER))
                .save(consumer, BetterToolsCommon.MOD_ID + ":story/get_hammer");

        Advancement getPaxel = Advancement.Builder.advancement()
                .parent(getAdvancement("story/iron_tools"))
                .display(
                        BetterToolsItems.IRON_PAXEL,
                        Component.translatable("advancements.story.get_paxel.title"),
                        Component.translatable("advancements.story.get_paxel.description"),
                        null,
                        FrameType.TASK,
                        true,
                        true,
                        false
                )
                .addCriterion("got_paxel", InventoryChangeTrigger.TriggerInstance.hasItems(BetterToolsItems.IRON_PAXEL))
                .save(consumer, BetterToolsCommon.MOD_ID + ":story/get_paxel");

        Advancement getScythe = Advancement.Builder.advancement()
                .parent(getAdvancement("story/iron_tools"))
                .display(
                        BetterToolsItems.IRON_SCYTHE,
                        Component.translatable("advancements.story.get_scythe.title"),
                        Component.translatable("advancements.story.get_scythe.description"),
                        null,
                        FrameType.TASK,
                        true,
                        true,
                        false
                )
                .addCriterion("got_scythe", InventoryChangeTrigger.TriggerInstance.hasItems(BetterToolsItems.IRON_SCYTHE))
                .save(consumer, BetterToolsCommon.MOD_ID + ":story/get_scythe");

        Advancement getNetheriteScythe = Advancement.Builder.advancement()
                .parent(getAdvancement("husbandry/obtain_netherite_hoe"))
                .display(
                        BetterToolsItems.NETHERITE_SCYTHE,
                        Component.translatable("advancements.husbandry.get_netherite_scythe.title"),
                        Component.translatable("advancements.husbandry.get_netherite_scythe.description"),
                        null,
                        FrameType.CHALLENGE,
                        true,
                        true,
                        true
                )
                .rewards(
                        new AdvancementRewards.Builder().addExperience(100).build()
                )
                .addCriterion("got_netherite_scythe", InventoryChangeTrigger.TriggerInstance.hasItems(BetterToolsItems.NETHERITE_SCYTHE))
                .save(consumer, BetterToolsCommon.MOD_ID + ":husbandry/get_netherite_scythe");

        Advancement getGlassChipper = Advancement.Builder.advancement()
                .parent(getAdvancement("story/iron_tools"))
                .display(BetterToolsItems.GLASS_CHIPPER,
                        Component.translatable("advancements.story.get_glass_chipper.title"),
                        Component.translatable("advancements.story.get_glass_chipper.description"),
                        null,
                        FrameType.TASK,
                        true,
                        true,
                        false
                )
                .addCriterion("got_glass_chipper", InventoryChangeTrigger.TriggerInstance.hasItems(BetterToolsItems.GLASS_CHIPPER))
                .save(consumer, BetterToolsCommon.MOD_ID + ":story/get_glass_chipper");
    }
}
