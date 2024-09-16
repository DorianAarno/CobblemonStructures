package dev.aarno.cobblemon_structures.villager;

import com.google.common.collect.ImmutableSet;
import dev.aarno.cobblemon_structures.CobblemonStructures;
import dev.aarno.cobblemon_structures.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

public class MartVillager {

    public static final RegistryKey<PointOfInterestType> RETAILER_POI_KEY = poiKey("retailerpoi");
    public static final PointOfInterestType RETAILER_POI = registerPoi("retailerpoi", ModBlocks.MART_CASH_REGISTER);

    public static final VillagerProfession RETAILER = registerProfession("retailer", RETAILER_POI_KEY);


    private static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type) {
        return Registry.register(Registries.VILLAGER_PROFESSION, new Identifier(CobblemonStructures.MOD_ID, name),
                new VillagerProfession(name, entry -> entry.matchesKey(type), entry -> entry.matchesKey(type),
                        ImmutableSet.of(), ImmutableSet.of(), SoundEvents.ENTITY_VILLAGER_WORK_SHEPHERD));
    }

    private static PointOfInterestType registerPoi(String name, Block block) {
        return PointOfInterestHelper.register(new Identifier(CobblemonStructures.MOD_ID, name), 2, 5, block);
    }

    private static RegistryKey<PointOfInterestType> poiKey(String name) {
        return RegistryKey.of(RegistryKeys.POINT_OF_INTEREST_TYPE, new Identifier(CobblemonStructures.MOD_ID, name));
    }

    public static void registerVillagers() {
        CobblemonStructures.LOGGER.info("Registering Mart Guy " + CobblemonStructures.MOD_ID);
    }
}
