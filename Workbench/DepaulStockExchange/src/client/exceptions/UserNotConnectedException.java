package client.exceptions;

/**
 * An exception that is thrown when the user is currently not connected.
 *
 * @author Tomislav S. Mitic
 */
public class UserNotConnectedException extends Exception {

  public UserNotConnectedException(String message) {
    super(message);
  }
}