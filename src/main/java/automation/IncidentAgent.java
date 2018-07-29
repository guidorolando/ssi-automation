package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObject.AccidentPage;
import pageObject.employee.CreateEmployeePopup;
import pageObject.employee.EmployeeListPage;
import pageObject.incidentagent.CreateIncidentAgentPopup;

public class IncidentAgent {
    private WebDriver driver;
    private Accident accident;
    private CreateIncidentAgentPopup createIncidentAgentPopup;

    public IncidentAgent(WebDriver driver){
        this.driver = driver;
        accident = PageFactory.initElements(driver, Accident.class);
        createIncidentAgentPopup = PageFactory.initElements(driver, CreateIncidentAgentPopup.class);
    }
    public void createIncidentAgent(String incidentAgentName) {
        createIncidentAgentPopup.setIncidentAgentName(incidentAgentName);
        createIncidentAgentPopup.clickButtonCreate();
    }
}
