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

        TradeOfferHelper.registerVillagerOffers(MartVillager.RETAILER, 1,
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

        TradeOfferHelper.registerVillagerOffers(MartVillager.RETAILER, 2,
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
//
        TradeOfferHelper.registerVillagerOffers(MartVillager.RETAILER, 3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.IRON_INGOT, 3),
                            new ItemStack(CobblemonItems.ULTRA_BALL, 5),
                            999999, 12, 0.065f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.IRON_INGOT, 10),
                            new ItemStack(CobblemonItems.HYPER_POTION, 3),
                            999999, 12, 0.065f));
                });

        TradeOfferHelper.registerVillagerOffers(MartVillager.RETAILER, 4,
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


    }
}
