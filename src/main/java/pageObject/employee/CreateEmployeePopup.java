package pageObject.employee;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateEmployeePopup {

    @FindBy(name = "firstName")
    private WebElement firstName;
    @FindBy(name = "lastName")
    private WebElement lastName;
    @FindBy(name = "ci")
    private WebElement ci;
    @FindBy(name = "gender")
    private WebElement gender;
    @FindBy(name = "address")
    private WebElement address;
    @FindBy(name = "birthDate")
    private WebElement dateOfBirth;
    @FindBy(name = "phone")
    private WebElement phone;
    @FindBy(name = "email")
    private WebElement email;
    @FindBy(name = "employeeTypeId")
    private WebElement employeeType;
    @FindBy(name = "salary")
    private WebElement salary;
    @FindBy(xpath = "//button[contains(text(), 'Create')]")
    private WebElement buttonCreate;
    @FindBy(xpath = "//button[contains(text(), 'Cancel')]")
    private WebElement buttonCancel;


    public WebElement getFirstName() {
        return firstName;
    }

    public WebElement getLastName() {
        return lastName;
    }

    public WebElement getCi() {
        return ci;
    }

    public WebElement getGender() {
        return gender;
    }

    public WebElement getAddress() {
        return address;
    }

    public WebElement getDateOfBirth() {
        return dateOfBirth;
    }

    public WebElement getPhone() {
        return phone;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement getEmployeeType() {
        return employeeType;
    }

    public WebElement getSalary() {
        return salary;
    }

    public WebElement getButtonCreate() {
        return buttonCreate;
    }

    public WebElement getButtonCancel() {
        return buttonCancel;
    }


    public void setValueFirstName(String firstName) {
        getFirstName().sendKeys(firstName);
    }

    public void setValueLastName(String lastName) {
        getLastName().sendKeys(lastName);
    }

    public void setValueCi(String ci) {
        getCi().sendKeys(ci);
    }

    public void setValueGender(String gender) {
        getGender().sendKeys(gender);
    }

    public void setValueAddress(String address) {
        getAddress().sendKeys(address);
    }

    public void setValueBirthDate(String birthDate) {
        getDateOfBirth().sendKeys(birthDate);
    }

    public void setValuePhone(String phone) {
        getPhone().sendKeys(phone);
    }

    public void setValueEmail(String email) {
        getEmail().sendKeys(email);
    }

    public void setValueEmployeeType(String employeeTypeId) {
        getEmployeeType().sendKeys(employeeTypeId);
    }

    public void setValueSalary(String salary) {
        getSalary().sendKeys(salary);
    }

    public void clickCreate() {
        getButtonCreate().click();
    }
}
