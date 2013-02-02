/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sortcountry;

import Comparators.CountryComparatorByName;
import Country.Country;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author tmitic
 */
public class SortCountry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

      List<Country> countries = new ArrayList<>();
      countries.add(new Country("Uruguay", 176220));
      countries.add(new Country("Thailand", 514000));
      countries.add(new Country("Belgium", 30510));

      Collections.sort(countries);
      // Now the array list is sorted by area
      for (Country c : countries) {
        System.out.println(c.getName() + "  " + c.getArea());
      }

      System.out.println();

      Comparator<Country> comp = new CountryComparatorByName(true);
      Collections.sort(countries, comp);

      // Now the array list is sorted by country name ascending
      for (Country c : countries) {
        System.out.println(c.getName() + "  " + c.getArea());
      }

      System.out.println();

      Comparator<Country> comp2 = new CountryComparatorByName(false);
      Collections.sort(countries, comp2);

      // Now the array list is sorted by country name descending
      for (Country c : countries) {
        System.out.println(c.getName() + "  " + c.getArea());
      }
    }
}
