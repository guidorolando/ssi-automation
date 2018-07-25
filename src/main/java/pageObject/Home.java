package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home {
    @FindBy(css = "#ssiga-navbar-collapse > ul > ul > li.active > a")
    private WebElement homeTab;

    public WebElement gethomeTab() {
        return homeTab;
    }

    public void clickHomeTab() {
        homeTab.click();
    }
}
