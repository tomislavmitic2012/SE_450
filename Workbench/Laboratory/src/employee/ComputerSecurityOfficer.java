package employee;

/**
 * @author Tomislav S. Mitic
 */
public class ComputerSecurityOfficer extends EmployeeDecorator {

  Employee employee;

  public ComputerSecurityOfficer(Employee employee) {
    this.employee = employee;
  }

  @Override
  public String getTitle() {
    return employee.getTitle() + "\n\tComputer Security Officer";
  }

  @Override
  public String getResponsibility() {
    return employee.getResponsibility() + "\n\tand handle computer"
            + " security issues";
  }
}