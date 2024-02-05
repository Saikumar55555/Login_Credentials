package Task2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddingCart_to_the_Product {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		
	//Clicking to the login Page
		driver.findElement(By.xpath("//a[@class=\"ico-login\"]")).click();
		
	//The Web Page has to Wait Certain Amount Of time (3000LongSec = 3Sec)
		Thread.sleep(3000);
		
	//Giving Correct Credentials and then Login to Web Page
		
		driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("mynameismike@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("@#$aikumar123");
		driver.findElement(By.xpath("//div[@class=\"buttons\"]/input[@type=\"submit\"]")).submit();
		
		Thread.sleep(3000);
	
	//Go to Apparel & Shoes category and click on Casual Golf Belt, Add it to the Cart
		
		WebElement url = driver.findElement(By.xpath("//li[@class=\"inactive\"]/a[@href=\"/apparel-shoes\"]"));
		url.click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h2[@class=\"product-title\"]//a[@href=\"/blue-and-green-sneaker\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"add-to-cart-button-28\"]")).click();
		
		Thread.sleep(3000);
		
	//Go to books category and click on Fiction Book, Add it to the Cart
		
		driver.findElement(By.xpath("//li[@class=\"inactive\"]//a[@href=\"/books\"]")).click();
		driver.findElement(By.xpath("//h2[@class=\"product-title\"]//a[@href=\"/fiction\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"add-to-cart-button-45\"]")).click();
		
		Thread.sleep(3000);
		
	//Go to Digital Downloads category and click on  Music 2, Add it to the Cart
		
		driver.findElement(By.xpath("//li[@class=\"inactive\"]//a[@href=\"/digital-downloads\"]")).click();
		WebElement music = driver.findElement(By.xpath("//h2[@class=\"product-title\"]//a[@href=\"/music-album-1\"]"));
		music.click();
		driver.findElement(By.xpath("//input[@id=\"add-to-cart-button-51\"]")).click();
		
		Thread.sleep(3000);
		
	//Adding All those Products to the Cart
		
		driver.findElement(By.xpath("//a[@class=\"ico-cart\"]//span[@class=\"cart-qty\"]")).click();
		
		Thread.sleep(3000);
		
	//Clicking On the Check Box	
		
		driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[1]")).click();
		driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[2]")).click();
		driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[3]")).click();
		
	//After All We Have to Update Our Products
		driver.findElement(By.xpath("//input[@name=\"updatecart\"]")).click();
		
	//We Have to TakeScreenShot at the end
	  File srcfile3 =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(srcfile3, new File("C:\\\\Users\\\\RS-EMP\\\\eclipse-workspace\\\\AutomationProject\\\\Screenshot\\\\CartCompleted.jpg"));
		
	}

}
