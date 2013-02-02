package client.exceptions;

/**
 * A exception that is thrown when trying to set the data of a TradeableUserData
 * object.
 *
 * @author Tomislav S. Mitic
 */
public class TradeableUserDataException extends Exception {

  public TradeableUserDataException(String msg) {
    super(msg);
  }
}