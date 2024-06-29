package sculkrange.faraway.arctic.item.custom;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import sculkrange.faraway.arctic.FarawayArcticEscape;
import sculkrange.faraway.arctic.sound.ModSounds;

public class ModItems {
    public static final Item KYANITE_SHARD = registerItem("kyanite_shard", new Item(new FabricItemSettings()));
    public static final Item SNOWY_BERRY = registerItem("snowy_berry", new Item(new FabricItemSettings().food(ModFoodComponents.SNOWY_BERRY)));
    public static final Item HELIOS_DISC = registerItem("helios_disc", new MusicDiscItem(7, ModSounds.HELIOS, new FabricItemSettings().maxCount(1), 109));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(KYANITE_SHARD);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(FarawayArcticEscape.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FarawayArcticEscape.LOGGER.info("Items of the past. Mustn't be forgotten");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
