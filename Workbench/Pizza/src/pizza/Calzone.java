package pizza;

/**
 * @author Tomislav S. Mitic
 */
public class Calzone extends Pizza {

  public Calzone(Size s) {
    super(s);
    setDescription("Calzone");
  }

  @Override
  public double cost() {
    return 12.99;
  }
}