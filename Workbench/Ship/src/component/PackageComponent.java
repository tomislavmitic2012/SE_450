package component;

/**
 * @author Tomislav S. Mitic
 */
public interface PackageComponent {

  double getWeight();
  String getId();
  void addPackage(PackageComponent pc) throws Exception;
  PackageComponent getPackage(String id);
  int getPackageCount();
}