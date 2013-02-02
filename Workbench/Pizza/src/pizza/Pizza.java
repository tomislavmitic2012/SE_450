package pizza;

/**
 * @author Tomislav S. Mitic
 */
public abstract class Pizza {

  public enum Size {
    UNDEFINED, SMALL, MEDIUM, LARGE, XLARGE
  }
  private String description = "Unknown Pizza";
  private Size size = Size.UNDEFINED;

  public Pizza(Size s) {
    size = s;
  }

  public String getDescription() {
    if (getSize() == Size.SMALL) {
      return "Small, " + description;
    } else if (getSize() == Size.MEDIUM) {
      return "Medium, " + description;
    } else if (getSize() == Size.LARGE) {
      return "Large, " + description;
    } else if (getSize() == Size.XLARGE) {
      return "Extra Large, " + description;
    }
    return description;
  }

  public Size getSize() {
    return size;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public abstract double cost();
}