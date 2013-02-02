package pizza;

/**
 * @author Tomislav S. Mitic
 */
public class DeepDish extends Pizza {

  public DeepDish(Size s) {
    super(s);
    setDescription("Deep Dish");
  }

  @Override
  public double cost() {
    return 14.99;
  }
}