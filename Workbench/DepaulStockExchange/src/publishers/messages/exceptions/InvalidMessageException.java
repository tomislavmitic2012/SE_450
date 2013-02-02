package publishers.messages.exceptions;

/**
 * The exception that is thrown when a data element that is not in line is set
 * for a market message.
 *
 * @author Tomislav S. Mitic
 */
public class InvalidMessageException extends Exception {

  public InvalidMessageException(String msg) {
    super(msg);
  }
}