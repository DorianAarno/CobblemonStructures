package dev.aarno.cobblemon_structures;

import dev.aarno.cobblemon_structures.block.ModBlocks;
import dev.aarno.cobblemon_structures.item.ModItems;
import dev.aarno.cobblemon_structures.util.MartTrades;
import dev.aarno.cobblemon_structures.villager.MartVillager;
import net.fabricmc.api.ModInitializer;
import dev.aarno.cobblemon_structures.worldgen.village.AddToVillage;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CobblemonStructures implements ModInitializer {
    public static final String MOD_ID = "cobblemon_structures";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static final String VILLAGE_POKECENTER_PATH = "village/pokecenter";
    public static final String VILLAGE_POKEMART_PATH = "village/pokemart";
    public static final String TEST = "village/testd";


    @Override
    public void onInitialize() {
        ServerLifecycleEvents.SERVER_STARTING.register(server -> {
            AddToVillage.injectStructureIntoPool(server, "minecraft:village/plains/houses", MOD_ID + ":" + VILLAGE_POKECENTER_PATH, 500, 1);
            AddToVillage.injectStructureIntoPool(server, "minecraft:village/plains/houses", MOD_ID + ":" + TEST, 500, 1);
            AddToVillage.injectStructureIntoPool(server, "minecraft:village/desert/houses", MOD_ID + ":" + VILLAGE_POKECENTER_PATH, 500, 1);
            AddToVillage.injectStructureIntoPool(server, "minecraft:village/savanna/houses", MOD_ID + ":" + VILLAGE_POKECENTER_PATH, 500, 1);
            AddToVillage.injectStructureIntoPool(server, "minecraft:village/taiga/houses", MOD_ID + ":" + VILLAGE_POKECENTER_PATH, 500, 1);
            AddToVillage.injectStructureIntoPool(server, "minecraft:village/snowy/houses", MOD_ID + ":" + VILLAGE_POKECENTER_PATH, 500, 1);

            AddToVillage.injectStructureIntoPool(server, "minecraft:village/plains/houses", MOD_ID + ":" + VILLAGE_POKEMART_PATH, 500, 1);
            AddToVillage.injectStructureIntoPool(server, "minecraft:village/desert/houses", MOD_ID + ":" + VILLAGE_POKEMART_PATH, 500, 1);
            AddToVillage.injectStructureIntoPool(server, "minecraft:village/savanna/houses", MOD_ID + ":" + VILLAGE_POKEMART_PATH, 500, 1);
            AddToVillage.injectStructureIntoPool(server, "minecraft:village/taiga/houses", MOD_ID + ":" + VILLAGE_POKEMART_PATH, 500, 1);
            AddToVillage.injectStructureIntoPool(server, "minecraft:village/snowy/houses", MOD_ID + ":" + VILLAGE_POKEMART_PATH, 500, 1);
        });

        MartVillager.registerVillagers();
        MartTrades.registerCustomTrades();
        ModBlocks.initialize();
        ModItems.registerItems();
    }
}