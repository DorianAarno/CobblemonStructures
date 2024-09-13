package dev.aarno.cobblemon_structures.village;

import net.fabric_extras.structure_pool.api.StructurePoolAPI;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.Identifier;


public class AddToVillage {

    public static void injectStructureIntoPool(MinecraftServer server, String targetPoolPath, String structureIdPath, int weight, int spawnLimit) {
        // Target structure pool
        var targetPool = new Identifier(targetPoolPath);
        // Our structure (found amongst data files)
        var structureId = new Identifier(structureIdPath);
        // Inject the structure into the pool
        StructurePoolAPI.injectIntoStructurePool(
                server,
                targetPool, // Target structure pool
                structureId, // Our structure (found amongst data files)
                weight // Weight (higher numbers increase relative spawn chance)
        );
        // Limit how many times the structure can spawn
        StructurePoolAPI.limitSpawn(targetPool, structureId, spawnLimit);
    }
}
