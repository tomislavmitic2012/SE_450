package publishers.messages;

import price.Price;

/**
 * The MarketDataDTO class is based upon the "Data Transfer Object" pattern.
 * This DTO will be used to encapsulate a set of data elements that detail the
 * values that make up the current market. This information is needed by many
 * components of our trading system so rather then pass "real" market data
 * objects from the trading system, or pass each of the 5 data elements
 * individually, this DTO will be used to facilitate the data transfer.
 *
 * @author Tomislav S. Mitic
 */
public class MarketDataDTO {

  /**
   * The stock product (i.e., IBM, GOOG, AAPL, etc.) that these market data
   * elements describe.
   */
  public String product;

  /**
   * The current BUY side price of the Stock.
   */
  public Price buyPrice;

  /**
   * The current BUY side volume (quantity) of the Stock.
   */
  public int buyVolume;

  /**
   * The current SELL side price of the Stock.
   */
  public Price sellPrice;

  /**
   * The current SELL side volume (quantity) of the Stock.
   */
  public int sellVolume;

  public MarketDataDTO(String product, Price buyPrice, int buyVolume,
          Price sellPrice, int sellVolume) {
    this.product = product;
    this.buyPrice = buyPrice;
    this.buyVolume = buyVolume;
    this.sellPrice = sellPrice;
    this.sellVolume = sellVolume;
  }

  @Override
  public String toString() {
    return "Product: " + product + ". Buy Price: " + buyPrice +
            ", Buy Volume: " + buyVolume + ", Sell Price: " + sellPrice +
            ", Sell Volume: " + sellVolume;
  }
}