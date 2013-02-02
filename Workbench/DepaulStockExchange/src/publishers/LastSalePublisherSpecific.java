package publishers;

import price.Price;
import publishers.exceptions.MessagePublisherException;

/**
 * An interface specifying the specific behaviors a LastSalePublisher
 * should implement.
 *
 * @author Tomislav S. Mitic
 */
public interface LastSalePublisherSpecific extends MessagePublisherCommon {

  /**
   * Notifies users of the last sale out for the given stock.
   * (Stock Symbol, Price, Volume)
   *
   * @param product
   * @param p
   * @param v
   */
  public void publishLastSale(String product, Price p, int v)
          throws MessagePublisherException;
}