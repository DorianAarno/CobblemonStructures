package dev.aarno.cobblemon_structures.util;

import com.cobblemon.mod.common.CobblemonItems;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import dev.aarno.cobblemon_structures.villager.MartVillager;
import net.minecraft.village.VillagerProfession;


public class MartTrades {
    public static void registerCustomTrades() {

        TradeOfferHelper.registerVillagerOffers(MartVillager.MART_GUY, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DIAMOND, 1),
                            new ItemStack(CobblemonItems.POKE_BALL, 32),
                            6, 12, 0.075f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DIAMOND, 1),
                            new ItemStack(CobblemonItems.POKE_BALL, 32),
                            6, 12, 0.075f));
                });

        TradeOfferHelper.registerVillagerOffers(MartVillager.MART_GUY, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DIAMOND, 1),
                            new ItemStack(CobblemonItems.POKE_BALL, 32),
                            6, 12, 0.075f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DIAMOND, 1),
                            new ItemStack(CobblemonItems.POKE_BALL, 32),
                            6, 12, 0.075f));
                });

        TradeOfferHelper.registerVillagerOffers(MartVillager.MART_GUY, 3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DIAMOND, 1),
                            new ItemStack(CobblemonItems.POKE_BALL, 32),
                            6, 12, 0.075f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DIAMOND, 1),
                            new ItemStack(CobblemonItems.POKE_BALL, 32),
                            6, 12, 0.075f));
                });

        TradeOfferHelper.registerVillagerOffers(MartVillager.MART_GUY, 4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DIAMOND, 1),
                            new ItemStack(CobblemonItems.POKE_BALL, 32),
                            6, 12, 0.075f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DIAMOND, 1),
                            new ItemStack(CobblemonItems.POKE_BALL, 32),
                            6, 12, 0.075f));
                });

    }
}
