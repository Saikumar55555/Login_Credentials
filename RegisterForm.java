package Task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterForm {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@class=\"ico-register\"]")).click();
		
		//Gender 
		driver.findElement(By.xpath("//input[@id=\"gender-male\"]")).click();
		
		//First Name 
		driver.findElement(By.xpath("//input[@id=\"FirstName\"]")).sendKeys("Uruvakili");
		
		//Last Name
		driver.findElement(By.xpath("//input[@id=\"LastName\"]")).sendKeys("Sai Kumar");
		
		//Email
		driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("sairootshell@gmail.com");
		
		//Giving Valid Password
		driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("@#$aikumar123");
		
		//Conform Password
		driver.findElement(By.xpath("//input[@id=\"ConfirmPassword\"]")).sendKeys("@#$aikumar123");
		
		//Submit form
		driver.findElement(By.xpath("//input[@id=\"register-button\"]")).submit();
		
		//Going Back to the main Page
		driver.findElement(By.xpath("//input[@class=\"button-1 register-continue-button\"]")).click();
		
		//Mail		 : sairootshell@gmail.com
		//password   : @#$aikumar123
	}

}
