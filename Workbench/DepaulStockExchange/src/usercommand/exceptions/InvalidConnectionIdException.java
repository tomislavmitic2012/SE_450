package usercommand.exceptions;

/**
 * An exception that is thrown when the user ID is invalid.
 *
 * @author Tomislav S. Mitic
 */
public class InvalidConnectionIdException extends Exception {

  public InvalidConnectionIdException(String message) {
    super(message);
  }
}