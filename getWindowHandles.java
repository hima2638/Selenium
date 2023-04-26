package windowHandles;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class getWindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver","‪D:\\chrome webdriver\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();	
		driver.manage().window().maximize();
		 
		 driver.get("https://demoqa.com/browser-windows");
		 driver.manage().window().maximize();
		 System.out.println(driver.getWindowHandle());
		 driver.findElement(By.id("tabButton")).click();
		Set<String>ids=driver.getWindowHandles();
		System.out.println(ids);// gives all ids
		
		//To retrive specific ids
		//method 1 -iterator
		
		/*Iterator <String> id =ids.iterator();
		String parentid=id.next();
		String childid=id.next();
		System.out.println(parentid);
		System.out.println(childid);------>not working  */
		
		//Method 2  list 
		List <String> ls  =new ArrayList(ids); 
		//or
	/*List <String> ls  =new ArrayList<String>(driver.getWindowHandles());
		
		String parentid=ls.get(0);
		String childid=ls.get(1);
		System.out.println(parentid);
		System.out.println(childid);
		driver.switchTo().window(childid);
		System.out.println("child"+driver.getTitle());//child
		driver.switchTo().window(ls.get(0));
		System.out.println("parent "+driver.getTitle());//parent*/
		
		//Method3 for each loop
		for (String id:ls) {
			String title=driver.switchTo().window(id).getTitle();
			System.out.println("tit "+title);
			
			
		}
		//driver.close();
		driver.quit();
		
	
		
	
		
		
		 
	     

	}

}
