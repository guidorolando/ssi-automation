package automation.commonWait;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WaitAppResults {
    private static Logger logger = LogManager.getLogger(WaitAppResults.class);
    private WebDriverWait wait;

    public static void waitForAjax(WebDriver driver){
        int timeout=50;
        try {
            Object ajax = ((JavascriptExecutor) driver).executeScript("return active");
            waitForAjax(driver, timeout);
        }catch (Exception e){
            logger.error(e);
        }
    }

    private static void waitForAjax(WebDriver driver, int timeout)
    {
        Boolean ajaxIsComplete = (Boolean) ((JavascriptExecutor) driver).executeScript("return active");
        try {
            Thread.sleep(50);
            timeout--;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (ajaxIsComplete || timeout==0) {
            WebDriverWait wait = new WebDriverWait(driver, 15);
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loading-overlay")));
            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        }
        else{waitForAjax(driver, timeout);}
    }
}
