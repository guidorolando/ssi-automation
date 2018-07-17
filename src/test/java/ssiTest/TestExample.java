package ssiTest;

import automation.Assignment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.Home;
import testSetup.TestBase;

public class TestExample extends TestBase{
    private WebDriver driver;
    private Home home;
    private Assignment assign;

    @BeforeClass
    public void init(){
        driver=getWebDriver();
        home = PageFactory.initElements(driver, Home.class);
        assign = PageFactory.initElements(driver, Assignment.class);
    }

    @Test
    public void testGoToHomeSsi(){
        home.clickHomeTab();
        System.out.println("click en home");
    }
    @Test(dependsOnMethods = {"testGoToHomeSsi"})
    public void testGoToAssignment(){
        assign.goToAssignmentTab();
        System.out.println("click en Assignment");
    }

}
