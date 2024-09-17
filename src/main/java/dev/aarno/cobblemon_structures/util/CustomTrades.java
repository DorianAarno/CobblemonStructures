package dev.aarno.cobblemon_structures.util;

import com.cobblemon.mod.common.CobblemonItems;
import dev.aarno.cobblemon_structures.villager.CustomVillagers;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;


public class CustomTrades {
    public static void registerCustomTrades() {
        // Retailer Trades
        TradeOfferHelper.registerVillagerOffers(CustomVillagers.RETAILER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.COAL, 10),
                            new ItemStack(CobblemonItems.POKE_BALL, 15),
                            999999, 2, 0.045f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.COPPER_INGOT, 8),
                            new ItemStack(CobblemonItems.FULL_HEAL, 3),
                            999999, 2, 0.045f));
                });

        TradeOfferHelper.registerVillagerOffers(CustomVillagers.RETAILER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.IRON_INGOT, 3),
                            new ItemStack(CobblemonItems.GREAT_BALL, 10),
                            999999, 6, 0.055f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.IRON_INGOT, 2),
                            new ItemStack(Items.COAL, 3),
                            new ItemStack(CobblemonItems.SUPER_POTION, 3),
                            999999, 6, 0.055f));
                });

        TradeOfferHelper.registerVillagerOffers(CustomVillagers.RETAILER, 3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.IRON_INGOT, 3),
                            new ItemStack(CobblemonItems.ULTRA_BALL, 5),
                            999999, 10, 0.065f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.IRON_INGOT, 10),
                            new ItemStack(CobblemonItems.HYPER_POTION, 3),
                            999999, 10, 0.065f));
                });

        TradeOfferHelper.registerVillagerOffers(CustomVillagers.RETAILER, 4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.IRON_INGOT, 12),
                            new ItemStack(Items.COAL, 10),
                            new ItemStack(CobblemonItems.MAX_POTION, 2),
                            999999, 18, 0.075f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DIAMOND, 8),
                            new ItemStack(Items.IRON_INGOT, 32),
                            new ItemStack(CobblemonItems.ABILITY_CAPSULE, 1),
                            999999, 18, 0.075f));
                });


        // Wandering Retailer Trades
        TradeOfferHelper.registerVillagerOffers(CustomVillagers.WANDERING_RETAILER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DIAMOND, 4),
                            new ItemStack(Items.IRON_INGOT, 12),
                            new ItemStack(CobblemonItems.LEFTOVERS, 1),
                            999999, 100, 0.045f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DIAMOND, 3),
                            new ItemStack(Items.IRON_INGOT, 9),
                            new ItemStack(CobblemonItems.EXPERT_BELT, 1),
                            999999, 100, 0.045f));
                });

        TradeOfferHelper.registerVillagerOffers(CustomVillagers.WANDERING_RETAILER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DIAMOND, 6),
                            new ItemStack(Items.IRON_INGOT, 24),
                            new ItemStack(CobblemonItems.LIFE_ORB, 1),
                            999999, 100, 0.055f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DIAMOND, 5),
                            new ItemStack(Items.IRON_INGOT, 15),
                            new ItemStack(CobblemonItems.ROCKY_HELMET, 1),
                            999999, 100, 0.055f));
                });

        TradeOfferHelper.registerVillagerOffers(CustomVillagers.WANDERING_RETAILER, 3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DIAMOND, 8),
                            new ItemStack(Items.IRON_INGOT, 16),
                            new ItemStack(CobblemonItems.CHOICE_SPECS, 1),
                            999999, 100, 0.045f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DIAMOND, 6),
                            new ItemStack(Items.IRON_INGOT, 30),
                            new ItemStack(CobblemonItems.ASSAULT_VEST, 1),
                            999999, 100, 0.045f));
                });

        TradeOfferHelper.registerVillagerOffers(CustomVillagers.WANDERING_RETAILER, 4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DIAMOND, 8),
                            new ItemStack(Items.IRON_INGOT, 16),
                            new ItemStack(CobblemonItems.CHOICE_BAND, 1),
                            999999, 100, 0.055f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DIAMOND, 8),
                            new ItemStack(Items.IRON_INGOT, 16),
                            new ItemStack(CobblemonItems.CHOICE_SCARF, 1),
                            999999, 100, 0.055f));
                });

        // Drug Dealer Trades
        TradeOfferHelper.registerVillagerOffers(CustomVillagers.DRUG_DEALER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.GOLD_INGOT, 20),
                            new ItemStack(Items.IRON_INGOT, 20),
                            new ItemStack(CobblemonItems.HP_UP, 1),
                            999999, 100, 0.045f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.GOLD_INGOT, 20),
                            new ItemStack(Items.IRON_INGOT, 20),
                            new ItemStack(CobblemonItems.PP_UP, 1),
                            999999, 100, 0.045f));
                });

        TradeOfferHelper.registerVillagerOffers(CustomVillagers.DRUG_DEALER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.GOLD_INGOT, 24),
                            new ItemStack(Items.IRON_INGOT, 24),
                            new ItemStack(CobblemonItems.ZINC, 1),
                            999999, 100, 0.055f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.GOLD_INGOT, 24),
                            new ItemStack(Items.IRON_INGOT, 24),
                            new ItemStack(CobblemonItems.IRON, 1),
                            999999, 100, 0.055f));
                });

        TradeOfferHelper.registerVillagerOffers(CustomVillagers.DRUG_DEALER, 3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.GOLD_INGOT, 28),
                            new ItemStack(Items.IRON_INGOT, 28),
                            new ItemStack(CobblemonItems.CARBOS, 1),
                            999999, 100, 0.045f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.GOLD_INGOT, 28),
                            new ItemStack(Items.IRON_INGOT, 28),
                            new ItemStack(CobblemonItems.PP_MAX, 1),
                            999999, 100, 0.045f));
                });

        TradeOfferHelper.registerVillagerOffers(CustomVillagers.DRUG_DEALER, 4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.GOLD_INGOT, 32),
                            new ItemStack(Items.IRON_INGOT, 32),
                            new ItemStack(CobblemonItems.PROTEIN, 1),
                            999999, 100, 0.055f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.GOLD_INGOT, 32),
                            new ItemStack(Items.IRON_INGOT, 32),
                            new ItemStack(CobblemonItems.CALCIUM, 1),
                            999999, 100, 0.055f));
                });

    }
}
