package tradeprocessing.productbook.exceptions;

/**
 * An exception thrown by the ProductService facade if no such product exists in
 * the product book.
 *
 * @author Tomislav S. Mitic
 */
public class NoSuchProductException extends Exception {

  public NoSuchProductException(String msg) {
    super(msg);
  }
}