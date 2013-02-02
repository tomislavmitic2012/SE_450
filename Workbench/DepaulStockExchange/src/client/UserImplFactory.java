package client;

import client.exceptions.UserException;

/**
 * A factory used to create new users.
 *
 * @author Tomislav S. Mitic
 */
public class UserImplFactory {

  public static UserImpl createUser(String userName)
          throws UserException {
    return new UserImpl(userName);
  }
}