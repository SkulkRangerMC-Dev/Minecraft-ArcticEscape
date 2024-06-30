package sculkrange.faraway.arctic.world.biome;

import com.mojang.datafixers.util.Pair;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.biome.source.util.MultiNoiseUtil;
import terrablender.api.Region;

import java.util.function.Consumer;

public class ModAncientSnowyMntRegion extends Region {
    public ModAncientSnowyMntRegion(Identifier name, int weight) {
        super(name, terrablender.api.RegionType.OVERWORLD, weight);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<MultiNoiseUtil.NoiseHypercube, RegistryKey<Biome>>> mapper) {
        this.addModifiedVanillaOverworldBiomes(mapper, modifiedVanillaOverworldBuilder -> {
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.SNOWY_PLAINS, ModBiomes.ANCIENT_MOUNTAIN_PLAINS);
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.SNOWY_SLOPES, ModBiomes.ANCIENT_SNOWY_MOUNTAIN);
        });
    }
}