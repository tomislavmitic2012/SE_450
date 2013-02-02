package container;

import component.PackageComponent;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Tomislav S. Miticx
 */
public class ShippingContainer implements PackageComponent {

  private String identifier = null;
  private Map<String, PackageComponent> items
          = new HashMap<>();

  public ShippingContainer(String id) {
    identifier = id;
  }

  @Override
  public double getWeight() {
    double wgt = 0;
    for (PackageComponent pc : items.values()) {
      wgt += pc.getWeight();
    }
    return wgt;
  }

  @Override
  public String getId() {
    return identifier;
  }

  @Override
  public void addPackage(PackageComponent p) {
    items.put(p.getId(), p);
  }

  @Override
  public PackageComponent getPackage(String id) {
    if (items.containsKey(id)) {
      return items.get(id);
    }

    PackageComponent p = null;
    for (PackageComponent pc : items.values()) {
      p = pc.getPackage(id);
      if (p != null) { return p; }
    }
    return null;
  }

  @Override
  public int getPackageCount() {
    int cnt = 0;
    for (PackageComponent pc : items.values()) {
      cnt += pc.getPackageCount();
    }
    return cnt;
  }
}