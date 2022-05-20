import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.findElement(By.id("input-username")).sendKeys("usernameV");
		driver.findElement(By.id("input-firstname")).sendKeys("firstnameV");
		driver.findElement(By.id("input-lastname")).sendKeys("lastnameV");
		driver.findElement(By.id("input-email")).sendKeys("emailV@gvx.com");
		driver.findElement(By.id("input-password")).sendKeys("passwordV");
		driver.findElement(By.id("input-country")).sendKeys("India");
		

	}

}
