package price.exceptions;

/**
 * An exception that is thrown on validation of a Price object.
 *
 * @author Tomislav S. Mitic
 */
public class PriceException extends Exception {

  public PriceException(String message) {
    super(message);
  }
}