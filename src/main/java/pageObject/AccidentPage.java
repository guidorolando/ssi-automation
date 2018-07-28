package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccidentPage {

    @FindBy(css = ".btn-success")
    private WebElement buttonCreateAcc;

    public void clickButtonCreate() {
        buttonCreateAcc.click();
    }

    public WebElement getButtonCreateAcc() {
        return buttonCreateAcc;
    }
}
