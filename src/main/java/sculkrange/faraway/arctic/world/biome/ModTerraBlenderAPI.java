package sculkrange.faraway.arctic.world.biome;

import net.minecraft.util.Identifier;
import sculkrange.faraway.arctic.FarawayArcticEscape;
import sculkrange.faraway.arctic.world.biome.surface.ModMaterialRules;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;
import terrablender.api.TerraBlenderApi;

public class ModTerraBlenderAPI implements TerraBlenderApi {
    @Override
    public void onTerraBlenderInitialized()
    {
        Regions.register(new ModAncientSnowyMntRegion(new Identifier(FarawayArcticEscape.MOD_ID, "ancientsnowymnt"), 4));

        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, FarawayArcticEscape.MOD_ID, ModMaterialRules.makeRules());
    }

}
