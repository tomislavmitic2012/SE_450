package price;

import price.exceptions.InvalidPriceOperation;

/**
 * The Price class will be used to represent the various prices used throughout
 * the application (Order prices, Quote prices, Trade prices, Ticker
 * Prices, etc). Price objects, like String objects, should be immutable
 * (unchangeable once created).
 *
 * @author Tomislav S. Mitic
 */
public class Price implements Comparable<Price> {

  Price self = this;
  boolean isMarketPrice;
  long value;

  private final int BEFORE = -1;
  private final int EQUAL = 0;
  private final int AFTER = 1;

  Price(long value) {
    self.value = value;
    self.isMarketPrice = false;
  }

  Price() {
    self.value = 0;
    self.isMarketPrice = true;
  }

  public Price add(Price p) throws InvalidPriceOperation {
    if (self.isMarket()) {
      throw new InvalidPriceOperation("Invalid Price Operation in add: "
              + "Current Price is a Market Price!");
    }
    if (p.isMarket()) {
      throw new InvalidPriceOperation("Invalid Price Operation in add: "
              + "Price passed in is a Market Price!");
    }
    return new Price(self.value + p.value);
  }

  public Price subtract(Price p) throws InvalidPriceOperation {
    if (self.isMarket()) {
      throw new InvalidPriceOperation("Invalid Price Operation in subtract:"
              + " Current Price is a Market Price!");
    }
    if (p.isMarket()) {
      throw new InvalidPriceOperation("Invalid Price Operation in subtract:"
              + " Price passed in is a Market Price!");
    }
    return new Price(self.value - p.value);
  }

  public Price multiply(int p) throws InvalidPriceOperation {
    if (self.isMarket()) {
      throw new InvalidPriceOperation("Invalid Price Operation in multiply: "
              + "Current Price is a Market Price!");
    }
    return new Price(self.value * p);
  }

  public boolean isMarket() {
    return self.isMarketPrice;
  }

  public boolean isNegative() {
    return ((self.isMarket() || self.value >= 0) ?
            false : true );
  }

  public boolean greaterOrEqual(Price p) {
    if (p.isMarket() || self.isMarket()) { return false; }
    int comparison = self.compareTo(p);
    return ((comparison == self.AFTER || comparison == self.EQUAL) ?
            true : false);
  }

  public boolean greaterThan(Price p) {
    if (p.isMarket() || self.isMarket()) { return false; }
    int comparison = self.compareTo(p);
    return (comparison == self.AFTER ? true : false);
  }

  public boolean lessOrEqual(Price p) {
    if (p.isMarket() || self.isMarket()) { return false; }
    int comparison = self.compareTo(p);
    return ((comparison == self.BEFORE || comparison == self.EQUAL) ?
            true : false);
  }

  public boolean lessThan(Price p) {
    if (p.isMarket() || self.isMarket()) { return false; }
    int comparison = self.compareTo(p);
    return (comparison == self.BEFORE ? true : false);
  }

  public boolean equals(Price p) {
    if (p.isMarket() || self.isMarket()) { return false; }
    return ((self.compareTo(p) == self.EQUAL) ? true : false);
  }

  @Override
  public int compareTo(Price p) {
    // checks to see is self and p are the same object
    if (self.value == p.value) { return self.EQUAL; }

    if (self.value < p.value) { return self.BEFORE; }
    if (self.value > p.value) { return self.AFTER; }

    // Default is equal
    return self.EQUAL;
  }

  @Override
  public String toString() {
    return (self.isMarket() ? "MKT" : String.format("$%,.2f", self.value / 100.0));
  }
}