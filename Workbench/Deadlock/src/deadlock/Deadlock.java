package deadlock;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Examples of deadlock.
 *
 *
 * @author Tomislav S. Mitic
 */
public class Deadlock {

  static class Friend {
    private final String name;
    private boolean bowed = false;

    public Friend(String name) {
      this.name = name;
    }

    public String getName() {
      return this.name;
    }

    @SuppressWarnings("WaitWhileNotSynced")
    public synchronized void bow(Friend bower) {
      System.out.format("%s: %s has bowed to me!%n", this.name,
              bower.getName());
      this.bowed = true;
      while (!bower.bowed) {
        try {
          this.wait();
        } catch (InterruptedException ex) {
          Logger.getLogger(Deadlock.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
      bower.bowBack(this);
    }

    public synchronized void bowBack(Friend bower) {
      System.out.format("%s: %s has bowed back to me!%n", this.name,
              bower.getName());
      this.notifyAll();
    }
  }
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    final Friend james = new Friend("James");
    final Friend rajesh = new Friend("Rajesh");
    Runnable r1 = new Runnable() {
      @Override
      public void run() {
        james.bow(rajesh);
      }
    };
    Runnable r2 = new Runnable() {
      @Override
      public void run() {
        rajesh.bow(james);
      }
    };
    Thread t1 = new Thread(r1);
    Thread t2 = new Thread(r2);
    t1.start();
    t2.start();
  }
}
