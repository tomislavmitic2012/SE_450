package pizza;

import pizza.Pizza.Size;

/**
 * @author Tomislav S. Mitic
 */
public class PizzaFactory {

  public static Pizza buildPizza(Size sz, String type, String... details)
          throws Exception {
    Pizza p = makePizza(sz, type);
    for (String s : details) {
      p = makeTopping(s, p);
    }
    return p;
  }

  private static Pizza makeTopping(String type, Pizza p) throws Exception {
    switch (type.toLowerCase().trim()) {
      case "green pepper":
        return new GreenPepper(p);
      case "sausage":
        return new Sausage(p);
      case "spinach":
        return new Spinach(p);
      default:
        throw new Exception("Unknown topping: " + type);
    }
  }

  private static Pizza makePizza(Size sz, String type) throws Exception {
    switch(type.toLowerCase().trim()) {
      case "thin crust":
        return new ThinCrust(sz);
      case "deep dish":
        return new DeepDish(sz);
      case "calzone":
        return new Calzone(sz);
      default:
        throw new Exception("Unknown type: " + type);
    }
  }
}