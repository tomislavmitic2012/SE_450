package employee;

/**
 * @author Tomislav S. Mitic
 */
public abstract class Employee {

  private String title = "Employee";

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public abstract String getResponsibility();
}