package seleniumTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchBrowserTest {
	
	public static void main(String arg[]) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		System.out.println(driver.getCurrentUrl());		
	  driver.findElement(By.xpath("//*[@id='nav-search']")).sendKeys("apple");
	  
	  
	  
	}

	}
