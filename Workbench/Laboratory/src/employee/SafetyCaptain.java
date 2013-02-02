package employee;

/**
 * @author Tomislav S. Mitic
 */
public class SafetyCaptain extends EmployeeDecorator {

  Employee employee;

  public SafetyCaptain(Employee employee) {
    this.employee = employee;
  }

  @Override
  public String getTitle() {
    return employee.getTitle() + "\n\tSafety Captain";
  }

  @Override
  public String getResponsibility() {
    return employee.getResponsibility() + "\n\tand perform quarterly safety"
            + " inspections";
  }
}