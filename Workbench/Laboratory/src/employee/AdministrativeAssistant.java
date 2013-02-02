package employee;

/**
 * @author Tomislav S. Mitic
 */
public class AdministrativeAssistant extends Employee {

  public AdministrativeAssistant() {
    super.setTitle("Administrative Assistant");
  }

  @Override
  public String getResponsibility() {
    return "Provide secretarial support";
  }
}