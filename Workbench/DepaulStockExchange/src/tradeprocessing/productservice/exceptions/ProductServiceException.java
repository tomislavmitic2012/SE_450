package tradeprocessing.productservice.exceptions;

/**
 * An exception that is thrown by the ProductService.
 *
 * @author Tomislav S. Mitic
 */
public class ProductServiceException extends Exception {

  public ProductServiceException(String message) {
    super(message);
  }
}