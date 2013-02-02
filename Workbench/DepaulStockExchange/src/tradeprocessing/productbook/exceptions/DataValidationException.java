package tradeprocessing.productbook.exceptions;

/**
 * A data validation exception used by the ProductBook.
 *
 * @author Tomislav S. Mitic
 */
public class DataValidationException extends Exception {

  public DataValidationException(String msg) {
    super(msg);
  }
}