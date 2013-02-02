package price;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

/**
 * Price objects should not be created (i.e., "new Price(...)") by classes
 * across the entire application. This would couple other classes to the
 * specifics of Price object creation. Instead, a globally accessible "Factory"
 * called PriceFactory will perform the creation of Price objects i.e.,
 * using the Factory design pattern).
 *
 * When a Price object is needed by some component of the application, all that is needed is a call to the
 * PriceFactory to create a Price object using a provided value:
 *
 *      // Create a “limit” price object representing the String “$194.90”
 *      Price myPrice1 = PriceFactory.makeLimitPrice("194.90");
 *
 *      // Create a “market” price object - no price value is needed.
 *      Price myPrice3 = PriceFactory.makeMarketPrice();
 *
 * @author Tomislav S. Mitic
 */
public class PriceFactory {

  private static Map<String, Price> flyweights = new HashMap<>();

  public static Price makeLimitPrice(long value) {
    String key = value + "";
    Price p = PriceFactory.flyweights.get(key);
    if (p == null) {
      p = new Price(value);
      PriceFactory.flyweights.put(key, p);
    }
    return p;
  }

  public static Price makeLimitPrice(String str)
          throws NumberFormatException, IllegalArgumentException {
    long parsedValue = PriceFactory.parseDollarAmount(str);
    return PriceFactory.makeLimitPrice(parsedValue);
  }

  public static Price makeMarketPrice() {
    Price p = PriceFactory.flyweights.get("MKT");
    if (p == null) {
      p = new Price();
      PriceFactory.flyweights.put("MKT", p);
    }
    return p;
  }

  private static long parseDollarAmount(String str)
          throws NumberFormatException, IllegalArgumentException {
    if (str == null || str.isEmpty()) {
      return 0;
    }
    DecimalFormat formatter = new DecimalFormat("#.00");
    return Long.parseLong(formatter.format(Double.parseDouble(
            str.replaceAll("[^-.0-9]", ""))).replaceAll("\\.", ""));
  }
}