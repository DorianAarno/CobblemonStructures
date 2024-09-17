package dev.aarno.cobblemon_structures.item;

import dev.aarno.cobblemon_structures.CobblemonStructures;
import dev.aarno.cobblemon_structures.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final RegistryKey<ItemGroup> CUSTOM_ITEM_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), new Identifier(CobblemonStructures.MOD_ID, "item_group"));
    public static final ItemGroup CUSTOM_ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(Items.LECTERN))
            .displayName(Text.translatable("itemGroup." + CobblemonStructures.MOD_ID))
            .build();

    // Register the group.
    public static void registerItems() {
        Registry.register(Registries.ITEM_GROUP, CUSTOM_ITEM_GROUP_KEY, CUSTOM_ITEM_GROUP);
        ItemGroupEvents.modifyEntriesEvent(CUSTOM_ITEM_GROUP_KEY).register(itemGroup -> {
            itemGroup.add(ModBlocks.MART_CASH_REGISTER.asItem());
            itemGroup.add(ModBlocks.RUSTY_MART_CASH_REGISTER.asItem());
            itemGroup.add(ModBlocks.DIRTY_MART_CASH_REGISTER.asItem());
            // ...
        });
    }

}
