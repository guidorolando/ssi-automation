package automation;

import automation.commonWait.WaitAppResults;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObject.AccidentPage;
import pageObject.AccidentPopupPage;

public class Accident {

    private WebDriver driver;
    private AccidentPage accident;
    private AccidentPopupPage accidentPopupPage;

    public Accident(WebDriver driver){
        this.driver = driver;
        accident = PageFactory.initElements(driver, AccidentPage.class);
        accidentPopupPage = PageFactory.initElements(driver, AccidentPopupPage.class);
    }

    public void createAccident(){
        accident.clickButtonCreate();
        WaitAppResults.waitForAjax(driver);
        WaitAppResults.waitForAjax(driver);
        accidentPopupPage.selectEmployee("carmen guzman 7676764");
        accidentPopupPage.selectAccidentDate("06062018");
        accidentPopupPage.setAccidentHr("0000");
        accidentPopupPage.selectAccidentDay("Monday");
        accidentPopupPage.selectIncidentType("Alta");
        WaitAppResults.waitForAjax(driver);
        accidentPopupPage.selectIncidentAgent("Medios de transporte");
        WaitAppResults.waitForAjax(driver);
        accidentPopupPage.setAffectParts("some explain");
        accidentPopupPage.setAccidentSite("some explain");
        accidentPopupPage.clickCreateAcc();
    }

}
