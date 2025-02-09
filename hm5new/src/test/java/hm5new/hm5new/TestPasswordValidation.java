package hm5new.hm5new;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestPasswordValidation {
	
	
	PasswordValidation question2=new PasswordValidation();
    @Test
    public void test1() {
        question2.testCharacterInput("passw0rd", "Valid Value");
    }

    @Test
    public void test2() {
    	question2.testCharacterInput("aaa22221", "Invalid value");
    }

    @Test
    public void test3() {
    	question2.testCharacterInput("ABC123", "Invalid value");
    }

    @Test
    public void test4() {
    	question2.testCharacterInput("Abc12@#", "Invalid value");
    }

	
		
		
		
	    
	}



