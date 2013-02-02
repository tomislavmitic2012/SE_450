package tradeprocessing.productservice.exceptions;

/**
 * A exception that is thrown when an invalid market state is encountered.
 *
 * @author Tomislav S. Mitic
 */
public class InvalidMarketStateTransitionException extends Exception {

  public InvalidMarketStateTransitionException(String msg) {
    super(msg);
  }
}