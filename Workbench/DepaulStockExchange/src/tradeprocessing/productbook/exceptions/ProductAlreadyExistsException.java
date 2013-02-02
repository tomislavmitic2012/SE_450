package tradeprocessing.productbook.exceptions;

/**
 * An exception that is thrown when you are trying to add a product book that
 * already exists.
 *
 * @author Tomislav S. Mitic
 */
public class ProductAlreadyExistsException extends Exception {

  public ProductAlreadyExistsException(String msg) {
    super(msg);
  }
}