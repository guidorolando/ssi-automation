package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObject.AssignmentPage;

public class Accident {

    private WebDriver driver;
    private AssignmentPage assign;

    public Accident(WebDriver driver){
        this.driver = driver;
        assign = PageFactory.initElements(driver, AssignmentPage.class);
    }
    public void goToAssignmentTab(){
        assign.clickAssignmentTab();
    }

}
