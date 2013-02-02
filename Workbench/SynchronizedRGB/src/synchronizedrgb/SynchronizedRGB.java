package synchronizedrgb;

/**
 * @author Tomislav S. Mitic
 */
public class SynchronizedRGB {

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

  public SynchronizedRGB(int redIn, int greenIn, int blueIn, String nameIn) {
    check (redIn, greenIn, greenIn);
    red = redIn;
    green = greenIn;
    blue = blueIn;
    name = nameIn;
  }

  public void set(int redIn, int greenIn, int blueIn, String nameIn) {
    check(redIn, greenIn, blueIn);
    synchronized(this) {
      red = redIn;
      green = greenIn;
      blue = blueIn;
      name = nameIn;
    }
  }

  public synchronized int getRGB() {
    return ((red << 16) | (green << 8) | blue);
  }

  public synchronized String getName() {
    return name;
  }

  public synchronized void invert() {
    red = 255 - red;
    green = 255 - green;
    blue = 255 - green;
    name = "Inverse of " + name;
  }
}