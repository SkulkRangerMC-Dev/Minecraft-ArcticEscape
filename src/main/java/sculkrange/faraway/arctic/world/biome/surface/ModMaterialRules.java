package sculkrange.faraway.arctic.world.biome.surface;
import sculkrange.faraway.arctic.block.ModBlocks;
import sculkrange.faraway.arctic.world.biome.ModBiomes;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;

public class ModMaterialRules {
    private static final MaterialRules.MaterialRule DIRT = makeStateRule(Blocks.DIRT);
    private static final MaterialRules.MaterialRule GRASS_BLOCK = makeStateRule(Blocks.GRASS_BLOCK);
    private static final MaterialRules.MaterialRule ANCIENT_KYANITE = makeStateRule(ModBlocks.ANCIENT_KYANITE);

    public static MaterialRules.MaterialRule makeRules() {
        MaterialRules.MaterialCondition isAtOrAboveWaterLevel = MaterialRules.water(-1, 0);

        MaterialRules.MaterialRule grassSurface = MaterialRules.sequence(MaterialRules.condition(isAtOrAboveWaterLevel, GRASS_BLOCK), DIRT);

        return MaterialRules.sequence(
                MaterialRules.sequence(MaterialRules.condition(MaterialRules.biome(ModBiomes.ANCIENT_MOUNTAIN_PLAINS),
                                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, ANCIENT_KYANITE)),
                        MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING, ANCIENT_KYANITE)),

                MaterialRules.sequence(MaterialRules.condition(MaterialRules.biome(ModBiomes.ANCIENT_SNOWY_MOUNTAIN),
                                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, ANCIENT_KYANITE)),
                        MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING, ANCIENT_KYANITE)),


                // Default to a grass and dirt surface
                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, grassSurface)
        );
    }

    private static MaterialRules.MaterialRule makeStateRule(Block block) {
        return MaterialRules.block(block.getDefaultState());
    }
}