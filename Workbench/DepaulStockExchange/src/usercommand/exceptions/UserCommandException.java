package usercommand.exceptions;

/**
 * An exception that is thrown when invalid input is encountered in the
 * UserCommandService.
 *
 * @author Tomislav S. Mitic
 */
public class UserCommandException extends Exception {

  public UserCommandException(String message) {
    super(message);
  }
}