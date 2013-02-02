package publishers;

import price.Price;
import publishers.exceptions.MessagePublisherException;

/**
 * A interface specifying the behaviors a TickerPublisher should implement.
 *
 * @author Tomislav S. Mitic
 */
public interface TickerPublisherSpecific extends MessagePublisherCommon {

  /**
   * Notifies users of the last sale out for the given stock.
   * (Stock Symbol, Price)
   *
   * @param product
   * @param p
   */
  public void publishTicker(String product, Price p)
          throws MessagePublisherException;
}