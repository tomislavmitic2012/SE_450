package drop;

/**
 * @author Tomislav S. Mitic
 */
public class Drop {
  // Message sent from producer to consumer.
  private String message;

  // True if consumer should wait for producer to send
  // message, false if producer shoudl wait for consumer
  // to retrieve message.
  private boolean empty = true;

  public synchronized String take() {
    // Wait until message is available
    while (empty) {
      try {
        wait();
      } catch (InterruptedException e) {}
    }
    // Toggle status
    empty = true;

    // Notify producer that status has changed.
    notifyAll();
    return message;
  }

  public synchronized void put(String message) {
    // wait until message has been retrieved
    while (!empty) {
      try {
        wait();
      } catch (InterruptedException e) {}
    }
    // Toggle status
    empty = false;

    // Store message
    this.message = message;

    // Notify consumer that status has changed.
    notifyAll();
  }
}