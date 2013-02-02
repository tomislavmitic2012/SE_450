package pizza;

/**
 * @author Tomislav S. Mitic
 */
public abstract class ToppingDecorator extends Pizza {

  public ToppingDecorator(Size s) {
    super(s);
  }

  @Override
  public abstract String getDescription();
}