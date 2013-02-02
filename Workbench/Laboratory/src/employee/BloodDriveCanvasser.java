package employee;

/**
 * @author Tomislav S. Mitic
 */
public class BloodDriveCanvasser extends EmployeeDecorator {

  Employee employee;

  public BloodDriveCanvasser(Employee employee) {
    this.employee = employee;
  }

  @Override
  public String getTitle() {
    return employee.getTitle() + "\n\tBlood Drive Canvasser";
  }

  @Override
  public String getResponsibility() {
    return employee.getResponsibility() + "\n\tand canvass employees for the"
            + " quarterly blood drive";
  }
}