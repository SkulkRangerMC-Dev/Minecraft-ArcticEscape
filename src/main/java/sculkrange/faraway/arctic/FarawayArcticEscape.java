package sculkrange.faraway.arctic;

import net.fabricmc.api.ModInitializer;

import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sculkrange.faraway.arctic.block.ModBlocks;
import sculkrange.faraway.arctic.datagen.ModItemTagProvider;
import sculkrange.faraway.arctic.item.custom.ModItems;
import sculkrange.faraway.arctic.item.custom.ModItemsGroup;
import sculkrange.faraway.arctic.sound.ModSounds;
import sculkrange.faraway.arctic.world.dimension.ModDimensions;

public class FarawayArcticEscape implements ModInitializer {
	public static final String MOD_ID = "faraway-arctic-escape";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModItems.registerModItems();
		ModItemsGroup.registerItemGroups();
		ModBlocks.registerModBlocks();
		ModSounds.registerSounds();

		CustomPortalBuilder.beginPortal()
				.frameBlock(ModBlocks.ANCIENT_KYANITE)
				.lightWithItem(ModItems.KYANITE_SHARD)
				.destDimID(new Identifier(FarawayArcticEscape.MOD_ID, "ancientsnowymnt"))
				.tintColor(0x87CEEB)
				.registerPortal();


		LOGGER.info("Im sorry Una...");
	}
}