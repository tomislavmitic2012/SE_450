package laboratory;

import employee.AdministrativeAssistant;
import employee.BloodDriveCanvasser;
import employee.ComputerSecurityOfficer;
import employee.Employee;
import employee.PrincipleInvestigator;
import employee.ResearchTechnician;
import employee.SafetyCaptain;

/**
 * @author Tomislav S. Mitic
 */
public class Laboratory {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    System.out.println();
    System.out.println("-- Research Laboratory --");
    System.out.println();

    Employee investigator01 = new PrincipleInvestigator();
    investigator01 = new SafetyCaptain(investigator01);
    System.out.println(investigator01.getTitle() +
            "\n\tResponsibilities include " +
            investigator01.getResponsibility());

    Employee investigator02 = new PrincipleInvestigator();
    investigator02 = new SafetyCaptain(investigator02);
    investigator02 = new BloodDriveCanvasser(investigator02);
    System.out.println(investigator02.getTitle() +
            "\n\tResponsibilities include " +
            investigator02.getResponsibility());

    Employee technician = new ResearchTechnician();
    technician = new ComputerSecurityOfficer(technician);
    technician = new BloodDriveCanvasser(technician);
    System.out.println(technician.getTitle() +
            "\n\tResponsibilities include " +
            technician.getResponsibility());

    Employee admin = new AdministrativeAssistant();
    admin = new BloodDriveCanvasser(admin);
    System.out.println(admin.getTitle() +
            "\n\tResponsibilities include " +
            admin.getResponsibility());
  }
}
