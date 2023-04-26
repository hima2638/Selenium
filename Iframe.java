package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver","‪D:\\chrome webdriver\\chromedriver.exe");
		 WebDriver driver =  new ChromeDriver();	
		driver.manage().window().maximize();
		 
		 driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		 driver.manage().window().maximize();
		 driver.switchTo().frame(0);
		 driver.findElement(By.linkText("org.openqa.selenium.bidi")).click();
		 driver.switchTo().defaultContent();
		 driver.switchTo().frame("packageFrame");
		 driver.findElement(By.xpath("//a[@title='interface in org.openqa.selenium.bidi']")).click();
		 driver.switchTo().defaultContent();
		 WebElement ele = driver.findElement(By.name("classFrame"));
		 driver.switchTo().frame(ele);
		 WebElement e =driver.findElement(By.id("search"));
		 e.click();
		 e.sendKeys("hi");
		 
		 
	}

}
