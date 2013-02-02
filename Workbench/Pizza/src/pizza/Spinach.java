package pizza;

/**
 * @author Tomislav S. Mitic
 */
public class Spinach extends ToppingDecorator {

  private Pizza pizza;

  public Spinach(Pizza pizza) {
    super(pizza.getSize());
    this.pizza = pizza;
  }

  @Override
  public String getDescription() {
    return pizza.getDescription() + ", Spinach";
  }

  @Override
  public double cost() {
    double cost = pizza.cost();
    if (getSize() == Pizza.Size.SMALL) {
      cost += 0.90;
    } else if (getSize() == Pizza.Size.MEDIUM) {
      cost += 1.10;
    } else if (getSize() == Pizza.Size.LARGE) {
      cost += 1.35;
    } else if (getSize() == Pizza.Size.XLARGE) {
      cost += 1.80;
    }
    return cost;
  }
}