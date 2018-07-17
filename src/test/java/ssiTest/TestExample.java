package ssiTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testSetup.TestBase;

public class TestExample extends TestBase{
    private WebDriver driver;

    @BeforeClass
    public void init(){
        driver=getWebDriver();}

    @Test
    public void TestCero(){
        System.out.println("este es el inicio del test");
    }
    @Test(dependsOnMethods = {"TestCero"})
    public void testUno(){
        System.out.println("insertar datos");
    }
    @Test(dependsOnMethods = {"testUno"})
    public void testAlfa(){
        System.out.println("actualizar datos");
    }
    @Test(dependsOnMethods = {"testAlfa"})
    public void testBeta(){
        System.out.println("borrar datos");
    }
}
