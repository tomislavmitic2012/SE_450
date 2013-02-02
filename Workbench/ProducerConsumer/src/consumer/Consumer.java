package consumer;

import drop.Drop;
import java.util.Random;

/**
 * @author Tomislav S. Mitic
 */
public class Consumer implements Runnable {

  private Drop drop;

  public Consumer(Drop dropIn) {
    drop = dropIn;
  }

  @Override
  @SuppressWarnings("SleepWhileInLoop")
  public void run() {
    Random random = new Random();
    for (String message = drop.take(); !message.equals("DONE");
            message = drop.take()) {
      System.out.format("MESSAGE RECEIVED: %s%n", message);
      try {
        Thread.sleep(random.nextInt(5000));
      } catch(InterruptedException e) {}
    }
  }
}