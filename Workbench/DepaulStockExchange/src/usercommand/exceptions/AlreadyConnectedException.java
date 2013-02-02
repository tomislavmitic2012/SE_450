package usercommand.exceptions;

/**
 * An Exception that is thrown when a user is already connected to the system.
 *
 * @author Tomislav S. Mitic
 */
public class AlreadyConnectedException extends Exception {

  public AlreadyConnectedException(String message) {
    super(message);
  }
}