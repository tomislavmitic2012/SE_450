package container;

import component.PackageComponent;

/**
 * @author tmitic
 */
public class Package implements PackageComponent {

  private String identifier = null;
  private double weight;

  public Package(String id, double w) {
    identifier = id;
    weight = w;
  }

  @Override
  public double getWeight() {
    return weight;
  }

  @Override
  public String getId() {
    return identifier;
  }

  @Override
  public void addPackage(PackageComponent pc) throws Exception {
    throw new Exception("A Package cannot have Packages added to it!");
  }

  @Override
  public PackageComponent getPackage(String id) {
    return null;
  }

  @Override
  public int getPackageCount() {
    return 1;
  }
}