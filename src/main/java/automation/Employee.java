package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObject.employee.CreateEmployeePopup;
import pageObject.employee.EmployeeListPage;

public class Employee {
    private WebDriver driver;
    private EmployeeListPage employee;
    private CreateEmployeePopup createEmployeePopup;

    public Employee(WebDriver driver){
        this.driver = driver;
        employee = PageFactory.initElements(driver, EmployeeListPage.class);
        createEmployeePopup = PageFactory.initElements(driver, CreateEmployeePopup.class);
    }
    public void goToEmployeeListTab(){
        employee.clickEmployeeListTab();
        employee.clickEmployeeListMenuTab();
    }
    public void openPopupCreateEmployee() {
        employee.clickButtonAddEmployee();
    }

    public void setFirstName(String firstName) {
        createEmployeePopup.setValueFirstName(firstName);
    }
    public void setLastName(String lastName) {
        createEmployeePopup.setValueLastName(lastName);
    }
    public void setCi(String ci) {
        createEmployeePopup.setValueCi(ci);
    }
    public void setGender(String gender) {
        createEmployeePopup.setValueGender(gender);
    }
    public void setAddress(String address) {
        createEmployeePopup.setValueAddress(address);
    }
    public void setBirthDate(String birthDate) {
        createEmployeePopup.setValueBirthDate(birthDate);
    }
    public void setPhone(String phone) {
        createEmployeePopup.setValuePhone(phone);
    }
    public void setEmail(String email) {
        createEmployeePopup.setValueEmail(email);
    }
    public void setEmployeeType(String employeeType) {
        createEmployeePopup.setValueEmployeeType(employeeType);
    }
    public void setSalary(String salary) {
        createEmployeePopup.setValueSalary(salary);
    }
    public void clickCreate() {
        createEmployeePopup.clickCreate();
    }
}
