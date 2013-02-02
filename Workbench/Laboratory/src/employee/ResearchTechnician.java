package employee;

/**
 * @author Tomislav S. Mitic
 */
public class ResearchTechnician extends Employee {

  public ResearchTechnician() {
    super.setTitle("Reasearch Technician");
  }

  @Override
  public String getResponsibility() {
    return "Acquire laboratory data";
  }
}