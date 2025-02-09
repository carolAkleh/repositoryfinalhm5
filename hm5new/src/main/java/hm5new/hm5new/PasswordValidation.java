package hm5new.hm5new;
import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PasswordValidation {
	
	static WebDriver browser;

    @Before
    public void setup() {
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.34.0-win32\\geckodriver.exe");
        browser = new FirefoxDriver();
        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        browser.get("https://testpages.eviltester.com/styled/apps/7charval/simple7charvalidation.html");
    }
    
    
    
    public void testCharacterInput(String input, String expectedResulte) {
        WebElement inputField = browser.findElement(By.id("Check Input"));
        inputField.clear();
        inputField.sendKeys(input);

        browser.findElement(By.cssSelector("input[type='submit']")).click();

        WebElement result = browser.findElement(By.id("char-message"));
        String actualMessage = result.getText().trim();

        System.out.println("Testing input: " + input);
        System.out.println("Expected: " + expectedResulte + ", Actual: " + actualMessage);
        
        assertEquals(expectedResulte, actualMessage);
    }
    
    
    
    
    

}




	
	
	
	
	
		



