package hm5new.hm5new;
import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Question1 {

	static WebDriver browser;

    @Before
    public void setup() {
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.34.0-win32\\geckodriver.exe");
        browser = new FirefoxDriver();
        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        browser.get("https://testpages.eviltester.com/styled/apps/triangle/triangle001.html");
    }
    
    
    
    public void testTriangle(String side1, String side2, String side3, String expectedResulte) {
        WebElement a = browser.findElement(By.id("side1"));
        WebElement b = browser.findElement(By.id("side2"));
        WebElement c = browser.findElement(By.id("side3"));

        a.clear();
        a.sendKeys(side1);
        b.clear();
        b.sendKeys(side2);
        c.clear();
        c.sendKeys(side3);

        browser.findElement(By.id("Identify Triangle Type")).click();

        WebElement result = browser.findElement(By.id("triangle-type"));
        String actualResult = result.getText().trim();

        System.out.println("Expected: " + expectedResulte + ", Actual: " + actualResult);
        assertEquals(expectedResulte, actualResult);
    }

}

	


