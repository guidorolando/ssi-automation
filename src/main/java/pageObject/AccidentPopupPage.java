package pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.Key;

public class AccidentPopupPage {

    @FindBy(id = "employeeId")
    private WebElement employeDropdown;

    @FindBy(id = "accidentDateId")
    private WebElement accidentDate;

    @FindBy(id = "accidentHrId")
    private WebElement accidentHr;

    @FindBy(id = "accidentDayId")
    private WebElement accidentDay;

    @FindBy(id = "incidentName")
    private WebElement incidentNameDropdown;

    @FindBy(id = "incidentAgent")
    private WebElement incidentAgentDropdown;

    @FindBy(css = "#affectedPartsId")
    private WebElement affectPartsText;

    @FindBy(css = "#accidentSiteId")
    private WebElement accidentSiteText;

    @FindBy(css = ".btn-primary")
    private WebElement buttonCreate;

    @FindBy(css = "button.btn-danger:nth-child(2)")
    private WebElement ButtonCancel;

    public void selectEmployee(String employeeName){
        employeDropdown.sendKeys(employeeName);
        employeDropdown.sendKeys(Keys.TAB);
    }

    public void selectAccidentDate(String dateAccident){
        accidentDate.sendKeys(dateAccident);
        accidentDate.sendKeys(Keys.TAB);
    }

    public void setAccidentHr(String hrasAcc){
        accidentHr.sendKeys(hrasAcc);
        accidentHr.sendKeys(Keys.TAB);
    }
    public void selectAccidentDay(String dayAcc){
        accidentDay.sendKeys(dayAcc);
        accidentDay.sendKeys(Keys.TAB);
    }

    public void selectIncidentType(String incName){
        incidentNameDropdown.sendKeys(incName);
        incidentNameDropdown.sendKeys(Keys.TAB);
    }

    public void selectIncidentAgent(String incAgentName){
        incidentAgentDropdown.sendKeys(incAgentName);
        incidentAgentDropdown.sendKeys(Keys.TAB);
    }

    public void setAffectParts(String explainaffect){
        affectPartsText.clear();
        affectPartsText.sendKeys(explainaffect);
        affectPartsText.sendKeys(Keys.TAB);
    }

    public void setAccidentSite(String site){
        accidentSiteText.clear();
        accidentSiteText.sendKeys(site);
        accidentSiteText.sendKeys(Keys.TAB);
    }

    public void clickCreateAcc(){
        buttonCreate.click();
    }

    public WebElement getEmployeDropdown() {
        return employeDropdown;
    }

    public WebElement getAccidentDate() {
        return accidentDate;
    }

    public WebElement getAccidentHr() {
        return accidentHr;
    }

    public WebElement getAccidentDay() {
        return accidentDay;
    }

    public WebElement getIncidentNameDropdown() {
        return incidentNameDropdown;
    }

    public WebElement getIncidentAgentDropdown() {
        return incidentAgentDropdown;
    }

    public WebElement getAffectPartsText() {
        return affectPartsText;
    }

    public WebElement getAccidentSiteText() {
        return accidentSiteText;
    }

    public WebElement getButtonCreate() {
        return buttonCreate;
    }

    public WebElement getButtonCancel() {
        return ButtonCancel;
    }
}
