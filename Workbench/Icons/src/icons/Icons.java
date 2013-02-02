/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package icons;

import javax.swing.JOptionPane;

/**
 *
 * @author tmitic
 */
public class Icons {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    JOptionPane.showMessageDialog(null,
            "Hello World!",
            "Message",
            JOptionPane.INFORMATION_MESSAGE,
            new MarsIcon(50));
  }
}
