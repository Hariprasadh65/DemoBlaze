package Blaze_Products;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.create.base.Base_Class_HP;

public class Phone_Blaze extends Base_Class_HP {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
		 driver = browser("chrome");
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 go("https://www.demoblaze.com/");
		
		
		
		WebElement element = driver.findElement(By.id("login2"));
		click(element);
		Thread.sleep(3000);
		WebElement username = driver.findElement(By.id("loginusername"));
		sendkeys(username, "Hari23");
		
		WebElement paswd = driver.findElement(By.id("loginpassword"));
		sendkeys(paswd, "6595");
		
		WebElement button = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]"));
		click(button);
		
		Thread.sleep(5000);
	
		WebElement phn = driver.findElement(By.xpath("//div[@class='container']/div/div/div/a[2]"));
		click(phn);
		
		WebElement htc = driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div[7]/div/a/img"));
		click(htc);
		
		WebElement addcart = driver.findElement(By.cssSelector("a.btn"));
		click(addcart);
		
		Thread.sleep(3000);
		
		alert("accept");
		
		Thread.sleep(2000);
		WebElement cart = driver.findElement(By.id("cartur"));
		cart.click();
		Thread.sleep(2000);
		WebElement order = driver.findElement(By.cssSelector("button.btn.btn-success"));
		click(order);
		Thread.sleep(2000);
		WebElement name = driver.findElement(By.id("name"));
		sendkeys(name, "Prasadh");
		
		WebElement country = driver.findElement(By.id("country"));
		sendkeys(country, "INDIA");
	
		WebElement city = driver.findElement(By.id("city"));
		sendkeys(city, "Chennai");
		
		WebElement credit = driver.findElement(By.id("card"));
		sendkeys(credit, "78945612");
		
		WebElement month = driver.findElement(By.id("month"));
		sendkeys(month, "May");
		
		WebElement year = driver.findElement(By.id("year"));
		sendkeys(year, "2020");
		
		Thread.sleep(1000);
		WebElement purchase = driver.findElement(By.cssSelector("button.btn.btn-primary"));
		click(purchase);
		
		
		WebElement ok = driver.findElement(By.cssSelector("button.confirm.btn.btn-lg.btn-primary"));
		click(ok);
		
		close();
		
	}
	
	
	
	
}

