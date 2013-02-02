package icons;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

/**
 * @author Tomislav S. Mitic
 */
public class MarsIcon implements Icon {

  private int size;

  /**
   * Constructs a Mars icon of a given size.
   * @param aSize the size of the icon
   */
  public MarsIcon(int aSize) {
    size = aSize;
  }

  @Override
  public int getIconWidth() {
    return size;
  }

  @Override
  public int getIconHeight() {
    return size;
  }

  @Override
  public void paintIcon(Component c, Graphics g, int x, int y) {
    Graphics2D g2 = (Graphics2D) g;
    Ellipse2D.Double planet = new Ellipse2D.Double(x, y, size, size);
    g2.setColor(Color.RED);
    g2.fill(planet);
  }
}