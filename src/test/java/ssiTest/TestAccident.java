package ssiTest;

import automation.Accident;
import automation.commonWait.WaitAppResults;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.Home;
import testSetup.TestBase;

public class TestAccident extends TestBase{
    private WebDriver driver;
    private Home home;
    private Accident accident;

    @BeforeClass
    public void init(){
        driver = getWebDriver();
        home = PageFactory.initElements(driver, Home.class);
        accident = PageFactory.initElements(driver, Accident.class);
    }

    @Test
    public void testGoToHomeSsi(){
        home.clickHomeTab();
        WaitAppResults.waitForAjax(driver);
        System.out.println("click en home");
    }

    @Test(dependsOnMethods = {"testGoToHomeSsi"})
    public void testGoToAccident(){
        home.clickAccidentTab();
        WaitAppResults.waitForAjax(driver);
        WaitAppResults.waitForAjax(driver);
        WaitAppResults.waitForAjax(driver);
        accident.createAccident();
        System.out.println("Accident in progress");
    }

}
