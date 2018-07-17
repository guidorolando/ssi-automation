package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AssignmentPage {

    @FindBy(css = "#ssiga-navbar-collapse > ul > ul > li:nth-child(5) > a")
    private WebElement assignmentTab;

    public WebElement getAssignmentTab() {
        return assignmentTab;
    }

    public void clickAssignmentTab() {
        assignmentTab.click();
    }
}
