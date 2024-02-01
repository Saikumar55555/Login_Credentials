package Task1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginCredentials {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		
		//Clicking to the login Page
		driver.findElement(By.xpath("//a[@class=\"ico-login\"]")).click();
		
		Thread.sleep(3000);
		
		//Giving Invalid Email and Valid Password
		driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("kumarsaikumar");
		driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("@#$aikumar123");
		driver.findElement(By.xpath("//input[@id=\"RememberMe\"]")).submit();
		
		//Taking Screenshot while We are Giving wrong Email
		File srcfile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile, new File("C:\\Users\\RS-EMP\\eclipse-workspace\\AutomationProject\\Screenshot\\GivingWrongEmail.jpg"));
		
		System.out.println("ScreenShot Captured With the Name Of GivingWrongEmail");
		
		
		String s1 = driver.findElement(By.xpath("//span[@for=\"Email\"]")).getText();
		System.out.println(s1);
		
		
		//System.out.println("Please Enter A Invalid Email Address");
		driver.navigate().refresh();
		
		
		
		//Giving Valid Email and Invalid Password
		driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("sairootshell@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("$aikumar123");
		driver.findElement(By.xpath("//input[@id=\"RememberMe\"]")).submit();
		
		////Taking Screenshot while We are Giving wrong Password
		File srcfile1 =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile1, new File("C:\\Users\\RS-EMP\\eclipse-workspace\\AutomationProject\\Screenshot\\GivingWrongPassword.jpg"));
		
		String s2 = driver.findElement(By.xpath("//div[@class=\"validation-summary-errors\"]")).getText();
		System.out.println(s2);
		
		System.out.println("ScreenShot Captured With the Name of GivingWrongPassword");
		
		
		Thread.sleep(3000);
		
		//Clear the Existing Data
		driver.findElement(By.xpath("//input[@id=\"Email\"]")).clear();
		
		
		//driver.navigate().refresh();
		Thread.sleep(3000);
		
		//Giving Correct Valid Crendentials
		driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("sairootshell@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("@#$aikumar123");
		driver.findElement(By.xpath("//div[@class=\"buttons\"]/input[@type=\"submit\"]")).submit();
		
		////Taking Screenshot With Correct Credentials
		File srcfile2 =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile2, new File("C:\\Users\\RS-EMP\\eclipse-workspace\\AutomationProject\\Screenshot\\GivingCorrectCredentials.jpg"));
		
		System.out.println("ScreenShot Captured With Correct Crendentials");
		
		//After then Log out My Account
		driver.findElement(By.xpath("//div[@class=\"header-links\"]//a[@class=\"ico-logout\"]")).click();
		
		Thread.sleep(3000);
		
		driver.close();
		
		
		
		
	}

}
