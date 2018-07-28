package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home {
    @FindBy(css = "#ssiga-navbar-collapse > ul > ul > li.active > a")
    private WebElement homeTab;

    @FindBy(css = "li.\\#:nth-child(2) > a")
    private WebElement accidentTab;

    @FindBy(css = "li.dropdown:nth-child(3) > a")
    private WebElement employeeTab;

    public void clickAccidentTab(){
        accidentTab.click();
    }

    public WebElement getAccidentTab() {
        return accidentTab;
    }

    public WebElement gethomeTab() {
        return homeTab;
    }

    public void clickHomeTab() {
        homeTab.click();
    }
}
