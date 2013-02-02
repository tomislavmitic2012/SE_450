package Comparators;

import Country.Country;
import java.util.Comparator;

/**
 * A country comparator.
 *
 * @author Tomislav S. Mitic
 */
public class CountryComparatorByName implements Comparator<Country> {
  private int direction;

  public CountryComparatorByName(boolean ascending) {
    if (ascending) {
      direction = 1;
    } else {
      direction = -1;
    }
  }

  @Override
  public int compare(Country country1, Country country2) {
    return direction * country1.getName().compareTo(country2.getName());
  }
}