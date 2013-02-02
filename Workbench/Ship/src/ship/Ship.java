package ship;

import component.PackageComponent;
import container.Package;
import container.ShippingContainer;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Tomislav S. Mitic
 */
public class Ship {

  private Map<String, PackageComponent> cargo =
          new HashMap<>();

  public double getWeight() {
    double wgt = 0;
    for (PackageComponent pc : cargo.values()) {
      wgt += pc.getWeight();
    }
    return wgt;
  }

  public void addPackage(PackageComponent p) {
    cargo.put(p.getId(), p);
  }

  public PackageComponent getPackage(String id) {
    if (cargo.containsKey(id)) {
      return cargo.get(id);
    }

    PackageComponent p = null;
    for (PackageComponent pc : cargo.values()) {
      p = pc.getPackage(id);
      if (p!= null) { return p; }
    }
    return null;
  }

  public int getPackageCount() {
    int cnt = 0;
    for (PackageComponent pc : cargo.values()) {
      cnt += pc.getPackageCount();
    }
    return cnt;
  }

  /**
   * @param args the command line arguments
   */
  @SuppressWarnings("CallToThreadDumpStack")
  public static void main(String[] args) {

    // Build a ship
    Ship theShip = new Ship();

    // Create some empty shipping containers
    PackageComponent sc1 = new ShippingContainer("SC1");
    PackageComponent sc2 = new ShippingContainer("SC2");
    PackageComponent sc3 = new ShippingContainer("SC3");

    // Create some individual package object
    PackageComponent p1 = new Package("P1", 101.4);
    PackageComponent p2 = new Package("P2", 122.8);
    PackageComponent p3 = new Package("P3", 143.2);
    PackageComponent p4 = new Package("P4", 164.9);
    PackageComponent p5 = new Package("P5", 185.5);
    PackageComponent p6 = new Package("P6", 206.1);
    PackageComponent p7 = new Package("P7", 227.6);

    try {
      // Fill ShippingContainer 3 with some packages
      sc3.addPackage(p6);
      sc3.addPackage(p7);

      // Put ShippingContainer 3 INTO ShippingContainer 2, and add more package
      // to ShippingContainer 2
      sc2.addPackage(sc3);
      sc2.addPackage(p5);
      sc2.addPackage(p4);

      // Now put some packages into ShippingContainer 1 -
      // but no ShippingContainers
      sc1.addPackage(p3);
      sc1.addPackage(p2);

      // Now put the 2 top-level ShippingContainers (1 & 2) AND one individual
      // package on the Ship
      theShip.addPackage(sc1);
      theShip.addPackage(sc2);
      theShip.addPackage(p1);
    } catch(Exception e) {
      e.printStackTrace();
    }

    // Next - get the individual package count
    System.out.println("Num. Packages: " + theShip.getPackageCount());

    // Now get the total weight of the Ship's contents
    System.out.println("Total Package Weight: " + theShip.getWeight());
  }
}
