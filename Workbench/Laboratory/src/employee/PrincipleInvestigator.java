package employee;

/**
 * @author Tomislav S. Mitic
 */
public class PrincipleInvestigator extends Employee {

  public PrincipleInvestigator() {
    super.setTitle("Principle Invesitogator");
  }

  @Override
  public String getResponsibility() {
    return "Analyze laborator data";
  }
}