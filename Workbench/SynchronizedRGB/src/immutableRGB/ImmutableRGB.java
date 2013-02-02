package immutableRGB;

/**
 * @author Tomislav S. Mitic
 */
public class ImmutableRGB {

  // Values must be between 0 and 255
  private int red;
  private int green;
  private int blue;
  private String name;

  private void check(int redIn, int greenIn, int blueIn) {
    if (redIn < 0 || redIn > 255 || greenIn < 0 || greenIn > 255 ||
            blueIn < 0 || blueIn > 255) {
      throw new IllegalArgumentException();
    }
  }

  public ImmutableRGB(int redIn, int greenIn, int blueIn, String nameIn) {
    check (redIn, greenIn, greenIn);
    red = redIn;
    green = greenIn;
    blue = blueIn;
    name = nameIn;
  }

  public synchronized int getRGB() {
    return ((red << 16) | (green << 8) | blue);
  }

  public synchronized String getName() {
    return name;
  }

  public synchronized ImmutableRGB invert() {
    return new ImmutableRGB(255 - red, 255 - green, 255 - green,
            "Inverse of " + name);
  }
}