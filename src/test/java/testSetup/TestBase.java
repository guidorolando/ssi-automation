package testSetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TestBase {
    private WebDriver driver;
    private Properties props;
    private String appURL;
    private String browserType;

    private void loadProperties(){
        props = new Properties();
        InputStream input=getClass().getResourceAsStream("/ssi-automation.properties");

        try{
            props.load(input);
        }catch (IOException ex){
            ex.printStackTrace();
        }finally {
            if (input!=null){
                try{
                    input.close();
                }   catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
    @BeforeSuite
    public void intSuite(){
        loadProperties();
        appURL = props.getProperty("ServerPath");
        browserType = props.getProperty("Browser");
        setDriver(browserType,appURL);
    }

    public WebDriver getWebDriver(){
        return driver;
    }

    private void setDriver(String browserType, String appURL){
        if(driver == null){
            if(browserType.equals("chrome")){
                driver=initChromeDriver(appURL);
            }
            /*else if (browserType.equals("firefox")){
                driver=initFirefoxDriver(appURL);
            }
            */
            else {
                driver = initIExplorer(appURL);
            }
        }else{
            driver.get(appURL);
        }
    }

    private WebDriver initIExplorer(String appURL) {
        return driver;
    }

    private WebDriver initChromeDriver(String appURL) {
        String pathDriver = "resources/driver/chromedriver.exe";
        String path = getClass().getResource("/driver/chromedriver.exe").getFile();
        System.setProperty("webdriver.chrome.driver", path);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(appURL);
        return driver;
    }
}
