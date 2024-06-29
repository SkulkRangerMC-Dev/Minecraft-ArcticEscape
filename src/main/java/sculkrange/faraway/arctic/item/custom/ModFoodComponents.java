package sculkrange.faraway.arctic.item.custom;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;

public class ModFoodComponents {
    public static final FoodComponent SNOWY_BERRY = new FoodComponent.Builder().hunger(3).saturationModifier(1.95f).alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 1000, 3),100).build();

}
