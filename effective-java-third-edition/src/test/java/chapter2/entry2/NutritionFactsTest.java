package chapter2.entry2;

import org.junit.jupiter.api.Test;

class NutritionFactsTest {

  @Test
  void testBuilder() {
    NutritionFacts cocaCola =
        new NutritionFacts.Builder(240, 8).calories(100).sodium(35).carbohydrate(27).build();
  }

}
