package sculkrange.faraway.arctic.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import sculkrange.faraway.arctic.FarawayArcticEscape;

public class ModTags {
    public static class Blocks {

    }

    public static class Items {



        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(FarawayArcticEscape.MOD_ID, name));
        }
    }
}
