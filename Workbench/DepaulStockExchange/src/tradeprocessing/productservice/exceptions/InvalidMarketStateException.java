package tradeprocessing.productservice.exceptions;

/**
 * An exception that is thrown when trying to perform an action in an invalid
 * market state.
 *
 * @author Tomislav S. Mitic
 */
public class InvalidMarketStateException extends Exception {

  public InvalidMarketStateException(String msg) {
    super(msg);
  }
}