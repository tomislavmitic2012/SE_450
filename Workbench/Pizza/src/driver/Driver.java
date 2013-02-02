package driver;

import java.util.logging.Level;
import java.util.logging.Logger;
import pizza.DeepDish;
import pizza.GreenPepper;
import pizza.Pizza;
import pizza.Pizza.Size;
import pizza.PizzaFactory;
import pizza.Sausage;

/**
 * @author Tomislav S. Mitic
 */
public class Driver {

  public static void main(String args[]) {
    Pizza p1 = new DeepDish(Size.LARGE);
    p1 = new Sausage(p1);
    p1 = new GreenPepper(p1);
    System.out.println(p1.getDescription() + " $" + p1.cost());

    try {
      Pizza p = PizzaFactory.buildPizza(Size.XLARGE, "Deep Dish", "Sausage",
              "Sausage", "Green Pepper", "Spinach");
      System.out.println(p.getDescription() + " $" + p.cost());
    } catch (Exception e) {
      Logger.getLogger(Driver.class.getName()).log(Level.SEVERE, null, e);
    }
  }
}