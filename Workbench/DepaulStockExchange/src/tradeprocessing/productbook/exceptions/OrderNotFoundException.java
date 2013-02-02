package tradeprocessing.productbook.exceptions;

/**
 * Exception that is thrown when an order can't be found.
 *
 * @author Tomislav S. Mitic
 */
public class OrderNotFoundException extends Exception {

  public OrderNotFoundException(String msg) {
    super(msg);
  }
}