package tradeable.exceptions;

/**
 * An exception indicating that an invalid volume has been entered.
 *
 * @author Tomislav S. Mitic
 */
public class InvalidVolumeException extends Exception {

  public InvalidVolumeException(String msg) {
    super(msg);
  }
}