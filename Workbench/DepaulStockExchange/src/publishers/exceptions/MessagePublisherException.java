package publishers.exceptions;

/**
 * The exception class dealing with exceptions which occur in the publishers.
 *
 * @author Tomislav S. Mitic
 */
public class MessagePublisherException extends Exception {

  public MessagePublisherException(String msg) {
    super(msg);
  }
}