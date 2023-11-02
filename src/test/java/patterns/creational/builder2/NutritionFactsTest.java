package patterns.creational.builder2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NutritionFactsTest {

    @Test
    @DisplayName("instantiating a new object")
    void instantiating_new_object() {
        NutritionFacts value = new NutritionFacts
                .Builder(240, 8)
                .calories(100)
                .sodium(35)
                .carbohydrate(27)
                .build();

        Assertions.assertEquals(240, value.getServingSize());
        Assertions.assertEquals(8, value.getServings());
        Assertions.assertEquals(100, value.getCalories());
        Assertions.assertEquals(35, value.getSodium());
        Assertions.assertEquals(27, value.getCarbohydrate());
        Assertions.assertEquals(0, value.getFat());
    }

}