package safelock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Random;

/**
 * @author Tomislav S. Mitic
 */
public class Safelock {

  static class Friend {

    private final String name;
    private final Lock lock = new ReentrantLock();

    public Friend(String name) {
      this.name = name;
    }

    public String getName() {
      return this.name;
    }

    public boolean impendingBow(Friend bower) {
      Boolean myLock = false;
      Boolean yourLock = false;
      try {
        myLock = lock.tryLock();
        yourLock = bower.lock.tryLock();
      } finally {
        if (!(myLock && yourLock)) {
          if (myLock) {
            lock.unlock();
          }
          if (yourLock) {
            bower.lock.unlock();
          }
        }
      }
      return myLock && yourLock;
    }

    public void bow(Friend bower) {
      if (impendingBow(bower)) {
        try {
          System.out.format("%s: %s has bowed to me!%n",
            this.name, bower.getName());
          bower.bowBack(this);
        } finally {
          lock.unlock();
          bower.lock.unlock();
        }
      } else {
        System.out.format("%s: %s started to bow to me, but saw"
                + " that I was already bowing to him.%n", this.name,
                bower.getName());
      }
    }

    public void bowBack(Friend bower) {
      System.out.format("%s: %s has bowed back to me!%n",
              this.name, bower.getName());
    }
  }

  static class BowLoop implements Runnable {
    private Friend bower;
    private Friend bowee;

    public BowLoop(Friend bower, Friend bowee) {
      this.bower = bower;
      this.bowee = bowee;
    }

    @Override
    @SuppressWarnings("SleepWhileInLoop")
    public void run() {
      Random random = new Random();
      while (true) {
        try {
          Thread.sleep(random.nextInt(10));
        } catch (InterruptedException e) {}
        bowee.bow(bower);
      }
    }
  }

  public static void main(String[] args) {
    final Friend james = new Friend("James");
    final Friend rajesh = new Friend("Rajesh");
    new Thread(new BowLoop(james, rajesh)).start();
    new Thread(new BowLoop(rajesh, james)).start();
  }
}