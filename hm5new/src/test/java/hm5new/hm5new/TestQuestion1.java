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


public class TestQuestion1 {
	
	
	
	Question1 question1= new Question1();

    @Test
    public void test1() {
    	question1.testTriangle("3", "3", "3", "Equilateral");
    }

    @Test
    public void test2() {
    	question1.testTriangle("5", "5", "3", "Isosceles");
    }

    @Test
    public void test3() {
    	question1.testTriangle("4", "5", "6", "Scalene");
    }

    @Test
    public void test4() {
    	question1.testTriangle("1", "2", "5", "Error");
    }

    

    
}


