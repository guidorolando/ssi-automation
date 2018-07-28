package ssiTest;

import automation.Accident;
import automation.Employee;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.Home;
import testSetup.TestBase;

public class TestExample extends TestBase{
    private WebDriver driver;
    private Home home;
    private Accident assign;
    private Employee employee;

    @BeforeClass
    public void init(){
        driver=getWebDriver();
        home = PageFactory.initElements(driver, Home.class);
        assign = PageFactory.initElements(driver, Accident.class);
        employee = PageFactory.initElements(driver, Employee.class);
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
        employee.setBirthDate("2018-01-01");
        employee.setPhone("77777777");
        employee.setEmail("guido@gmail.com");
        employee.setEmployeeType("Obrero");
        employee.setSalary("12");
        employee.clickCreate();
        System.out.println("open popup create employee");
    }

}
