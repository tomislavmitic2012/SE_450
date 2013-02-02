package pizza;

/**
 * @author Tomislav S. Mitic
 */
public class ThinCrust extends Pizza {

  public ThinCrust(Size s) {
    super(s);
    setDescription("Thin Crust");
  }

  @Override
  public double cost() {
    return 10.99;
  }
}