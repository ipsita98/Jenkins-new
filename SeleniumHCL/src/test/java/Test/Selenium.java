package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium {
  @Test
  public void f() {
	  
System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhasw\\eclipse-workspace\\Selenium1\\drivers\\chromedriver.exe");
	  
	  WebDriver d1;
	  d1 = new ChromeDriver();
	  
	  d1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	  d1.get("http://leafground.com/pages/Calendar.html");
	  
	  JavascriptExecutor jse=(JavascriptExecutor) d1;
	  
	  jse.executeScript("document.getElementById('datepicker').value='16/12/2021'");
	  
  }
}
