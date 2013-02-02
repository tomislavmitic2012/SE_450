package Country;

/**
 * A country with a name and area.
 *
 * @author Tomislav S. Mitic
 */
public class Country implements Comparable<Country> {

    private String name;
    private double area;

    /**
     * Constructs a country.
     *
     * @param aName the name of the country
     * @param anArea the area of the country
     */
    public Country(String aName, double anArea) {
        name = aName;
        area = anArea;
    }

    /**
     * Gets the name of the country.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the area of the country.
     *
     * @return the area
     */
    public double getArea() {
        return area;
    }

    /**
     * Compares two countries by area.
     *
     * @param otherObject the other country
     * @return a negative number if this country has a smaller area than
     * otherCountry, 0 if the areas are the same, a positive number otherwise
     */
    @Override
    public int compareTo(Country other) {
      if(area < other.area) {
        return -1;
      }
      if(area > other.area) {
        return 1;
      }
      return 0;
    }
}