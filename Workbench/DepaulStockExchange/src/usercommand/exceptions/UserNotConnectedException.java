package usercommand.exceptions;

/**
 * Throws an exception if the user is not connected.
 *
 * @author Tomislav S. Mitic
 */
public class UserNotConnectedException extends Exception {

  public UserNotConnectedException(String message) {
    super(message);
  }
}