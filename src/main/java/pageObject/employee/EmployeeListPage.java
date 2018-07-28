package pageObject.employee;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeeListPage {
    @FindBy(css = "#ssiga-navbar-collapse > ul > ul > li:nth-child(3) > a")
    private WebElement employeeListTab;

    @FindBy(css = "#ssiga-navbar-collapse > ul > ul > li:nth-child(3) > ul > li:nth-child(2) > a")
    private WebElement employeeListMenuTab;

    public WebElement getEmployeeListTab() {
        return employeeListTab;
    }

    public void clickEmployeeListTab() {
        employeeListTab.click();
    }

    public WebElement getEmployeeListMenuTab() {
        return employeeListMenuTab;
    }

    public void clickEmployeeListMenuTab() {
        employeeListMenuTab.click();
    }





    @FindBy(xpath = "//*[contains(text(), 'Add Employee')]")
    private WebElement buttonAddEmployee;

    public WebElement getButtonAddEmployee() {
        return buttonAddEmployee;
    }

    public void clickButtonAddEmployee() {
        buttonAddEmployee.click();
    }

}
