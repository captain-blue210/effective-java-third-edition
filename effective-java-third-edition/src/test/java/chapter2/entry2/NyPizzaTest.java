package chapter2.entry2;

import static chapter2.entry2.NyPizza.Size.SMALL;
import static chapter2.entry2.Pizza.Topping.HAM;
import static chapter2.entry2.Pizza.Topping.ONION;
import static chapter2.entry2.Pizza.Topping.SAUSAGE;
import org.junit.jupiter.api.Test;

class NyPizzaTest {

  @Test
  void testBuilder() {
    NyPizza pizza = new NyPizza.Builder(SMALL).addTopping(SAUSAGE).addTopping(ONION).build();
    Calzone calzone = new Calzone.Builder().addTopping(HAM).sauceInside().build();
  }

}
