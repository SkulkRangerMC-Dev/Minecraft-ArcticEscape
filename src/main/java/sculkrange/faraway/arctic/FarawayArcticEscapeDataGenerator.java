package sculkrange.faraway.arctic;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;
import sculkrange.faraway.arctic.datagen.ModItemTagProvider;
import sculkrange.faraway.arctic.datagen.ModWorldGenerator;
import sculkrange.faraway.arctic.world.biome.ModBiomes;
import sculkrange.faraway.arctic.world.dimension.ModDimensions;

public class FarawayArcticEscapeDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(ModItemTagProvider::new);
		pack.addProvider(ModWorldGenerator::new);
	}
		@Override
		public void buildRegistry(RegistryBuilder registryBuilder) {
			registryBuilder.addRegistry(RegistryKeys.BIOME, ModBiomes::bootstrap);
			registryBuilder.addRegistry(RegistryKeys.DIMENSION_TYPE, ModDimensions::bootstrapType);
	}
}