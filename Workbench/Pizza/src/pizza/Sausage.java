package pizza;

/**
 * @author Tomislav S. Mitic
 */
public class Sausage extends ToppingDecorator {

  private Pizza pizza;

  public Sausage(Pizza pizza) {
    super(pizza.getSize());
    this.pizza = pizza;
  }

  @Override
  public String getDescription() {
    return pizza.getDescription() + ", Sausage";
  }

  @Override
  public double cost() {
    double cost = pizza.cost();
    if (getSize() == Pizza.Size.SMALL) {
      cost += 1.20;
    } else if (getSize() == Pizza.Size.MEDIUM) {
      cost += 1.40;
    } else if (getSize() == Pizza.Size.LARGE) {
      cost += 2.00;
    } else if (getSize() == Pizza.Size.XLARGE) {
      cost += 2.80;
    }
    return cost;
  }
}