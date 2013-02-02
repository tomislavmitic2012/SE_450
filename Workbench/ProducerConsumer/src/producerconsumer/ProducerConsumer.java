/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package producerconsumer;

import consumer.Consumer;
import drop.Drop;
import producer.Producer;

/**
 *
 * @author tmitic
 */
public class ProducerConsumer {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Drop drop = new Drop();
    (new Thread(new Producer(drop))).start();
    (new Thread(new Consumer(drop))).start();
  }
}
