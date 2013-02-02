package pizza;

/**
 * @author Tomislav S. Mitic
 */
public class GreenPepper extends ToppingDecorator {

  private Pizza pizza;

  public GreenPepper(Pizza pizza) {
    super(pizza.getSize());
    this.pizza = pizza;
  }

  @Override
  public String getDescription() {
    return pizza.getDescription() + ", Green Pepper";
  }

  @Override
  public double cost() {
    double cost = pizza.cost();
    if (getSize() == Size.SMALL) {
      cost += 0.80;
    } else if (getSize() == Size.MEDIUM) {
      cost += 1.00;
    } else if (getSize() == Size.LARGE) {
      cost += 1.20;
    } else if (getSize() == Size.XLARGE) {
      cost += 1.40;
    }
    return cost;
  }
}