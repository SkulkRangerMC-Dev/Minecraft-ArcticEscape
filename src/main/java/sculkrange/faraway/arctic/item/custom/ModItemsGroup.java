package sculkrange.faraway.arctic.item.custom;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import sculkrange.faraway.arctic.FarawayArcticEscape;
import sculkrange.faraway.arctic.block.ModBlocks;

public class ModItemsGroup {
    public static final ItemGroup ARCTIC_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(FarawayArcticEscape.MOD_ID, "kyanite_shard"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.arctic"))
                    .icon(() -> new ItemStack(ModItems.KYANITE_SHARD)).entries((displayContext, entries) -> {
                        entries.add(ModItems.KYANITE_SHARD);
                        entries.add(ModItems.SNOWY_BERRY);

                        entries.add(ModBlocks.ANCIENT_KYANITE);
                    }).build());


    public static void registerItemGroups(){
        FarawayArcticEscape.LOGGER.info("Several Artifacts, lost to history and time itself");
    }
}
