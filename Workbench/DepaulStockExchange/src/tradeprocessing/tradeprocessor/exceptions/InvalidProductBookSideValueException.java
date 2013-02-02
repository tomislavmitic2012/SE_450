package tradeprocessing.tradeprocessor.exceptions;

/**
 * Exception thrown when an invalid value for a ProductBookSide is passed into a
 * constructor for a TradeProcessor.
 *
 * @author Tomislav S. Mitic
 */
public class InvalidProductBookSideValueException extends Exception {

  public InvalidProductBookSideValueException(String msg) {
    super(msg);
  }
}