package com.create.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class_HP {
	
	public static WebDriver driver;
// ********BROWSER LAUNCH****
	public static WebDriver browser(String type) {
		
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driver//chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//Driver//geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if (type.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"//Driver//IEDriverServer.exe");
		}
		driver.manage().window().maximize();
		
		return driver;

	}
//******GET*******	
	public static void go(String value) {
		driver.get(value);
	}
//*****NAVIGATE 
	
	public static void navigate(String value) {
	driver.navigate().to(value);
	}
	
	public static void forward() {
		driver.navigate().forward();
	}
	
	public static void backward() {
		driver.navigate().back();
	}
	
	public static void refresh() {
		driver.navigate().refresh();
	}
	
//*****sendkeys
	
	public static void sendkeys(WebElement element, String value) {
		element.sendKeys(value);
	}
	
//*** mouse based action
	
	public static void mousehover(WebElement element, String type) {
		Actions ac = new Actions(driver);
		if (type.equalsIgnoreCase("contextclick")) {
		
			ac.contextClick().build().perform();
		}
		else if (type.equalsIgnoreCase("move")) {
			ac.moveToElement(element).build().perform();
		}
		
	}
	
	
	public static void alert(String type) {
		Alert alert = driver.switchTo().alert();
		
		if (type.equalsIgnoreCase("accept")) {
			String text = alert.getText();
			System.out.println(text);
			alert.accept();
		}
		else if (type.equalsIgnoreCase("dismiss")) {
			alert.dismiss();
		}
	
	}
	
	public static void imwait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public void exwatit() {
	
	}
	
	public static void click(WebElement element) {
		element.click();

	}
	public static void close() {
		driver.close();
	}

}
