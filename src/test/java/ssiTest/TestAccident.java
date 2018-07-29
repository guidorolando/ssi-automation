package ssiTest;

import automation.Accident;
import automation.IncidentAgent;
import automation.commonWait.WaitAppResults;
import automation.Employee;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.Home;
import testSetup.TestBase;

public class TestAccident extends TestBase{
    private WebDriver driver;
    private Home home;
    private Accident accident;
    private Accident assign;
    private Employee employee;
    private IncidentAgent incidentAgent;

    @BeforeClass
    public void init(){
        driver = getWebDriver();
        home = PageFactory.initElements(driver, Home.class);
        accident = PageFactory.initElements(driver, Accident.class);
        assign = PageFactory.initElements(driver, Accident.class);
        employee = PageFactory.initElements(driver, Employee.class);
        incidentAgent = PageFactory.initElements(driver, IncidentAgent.class);
    }

    @Test
    public void testGoToHomeSsi(){
        home.clickHomeTab();
        //WaitAppResults.waitForAjax(driver);
        System.out.println("click en home");
    }

    @Test(dependsOnMethods = {"testGoToHomeSsi"})
    public void testGoToAccident(){
        home.clickAccidentTab();
        //WaitAppResults.waitForAjax(driver);
        //WaitAppResults.waitForAjax(driver);
        //WaitAppResults.waitForAjax(driver);
        accident.createAccident();
        System.out.println("Accident in progress");

    }

    @Test(dependsOnMethods = {"testGoToHomeSsi"})
    public void testGoToEmployeeList(){
        employee.goToEmployeeListTab();
        System.out.println("click en EmployeeList");
    }

    @Test
    public void testOpenPopupCreateEmployee(){
        employee.goToEmployeeListTab();
        employee.openPopupCreateEmployee();
        employee.setFirstName("guido");
        employee.setLastName("llanos");
        employee.setCi("111111111");
        employee.setGender("MALE");
        employee.setAddress("sacaba");
        employee.setBirthDate("01-01-2018");
        employee.setPhone("77777777");
        employee.setEmail("guido@gmail.com");
        employee.setEmployeeType("Obrero");
        employee.setSalary("12");
        employee.clickCreate();
        System.out.println("open popup create employee");
    }

    @Test
    public void testAddIncidentAgent() {
        home.clickAccidentTab();
        accident.openPopupCreateAccident();
        incidentAgent.createIncidentAgent("new Incident Agent");
    }

}
