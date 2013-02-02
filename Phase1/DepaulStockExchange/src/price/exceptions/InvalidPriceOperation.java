package price.exceptions;

/**
 * An exception indicating that an invalid operation on a Price object occurred.
 *
 * @author Tomislav S. Mitic
 */
public class InvalidPriceOperation extends Exception {
  public InvalidPriceOperation(String msg) {
    super(msg);
  }
}