package pageObject.incidentagent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateIncidentAgentPopup {
    @FindBy(id = "incidentAgentNameId")
    private WebElement incidentAgentName;
    @FindBy(xpath = "//app-incident-agent-add//button[contains(text(), 'Create')]")
    private WebElement buttonCreate;
    @FindBy(xpath = "//app-incident-agent-add//button[contains(text(), 'Cancel')]")
    private WebElement buttonCancel;

    public WebElement getIncidentAgentName() {
        return incidentAgentName;
    }

    public WebElement getButtonCreate() {
        return buttonCreate;
    }

    public WebElement getButtonCancel() {
        return buttonCancel;
    }

    public void clickButtonCreate() {
        buttonCreate.click();
    }

    public void clickButtonCancel() {
        buttonCancel.click();
    }

    public void setIncidentAgentName(String incidentAgentName) {
        this.incidentAgentName.sendKeys(incidentAgentName);
    }
}
