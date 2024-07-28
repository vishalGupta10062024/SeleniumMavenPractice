package seleniumTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testNGClass {
	
	@Test
	public static void function() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		WebElement searchBox=driver.findElement(By.name("q"));
		searchBox.sendKeys("iphone 15 pro max");
		searchBox.submit();
	}

}
