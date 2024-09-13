package dev.aarno.cobblemon_structures;

import net.fabricmc.api.ModInitializer;
import dev.aarno.cobblemon_structures.village.AddToVillage;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;


public class CobblemonStructures implements ModInitializer {
    public static final String MOD_NAME = "cobblemon_structures";
    public static final String VILLAGE_POKECENTER_PATH = "village/amey_pokecenter_final2";
    public static final String TEST = "village/testd";

    @Override
    public void onInitialize() {
        ServerLifecycleEvents.SERVER_STARTING.register(server -> {
            AddToVillage.injectStructureIntoPool(server, "minecraft:village/plains/houses", MOD_NAME + ":" + VILLAGE_POKECENTER_PATH, 500, 1);
            AddToVillage.injectStructureIntoPool(server, "minecraft:village/plains/houses", MOD_NAME + ":" + TEST, 500, 1);
            AddToVillage.injectStructureIntoPool(server, "minecraft:village/desert/houses", MOD_NAME + ":" + VILLAGE_POKECENTER_PATH, 500, 1);
            AddToVillage.injectStructureIntoPool(server, "minecraft:village/savanna/houses", MOD_NAME + ":" + VILLAGE_POKECENTER_PATH, 500, 1);
            AddToVillage.injectStructureIntoPool(server, "minecraft:village/taiga/houses", MOD_NAME + ":" + VILLAGE_POKECENTER_PATH, 500, 1);
        });

    }
}