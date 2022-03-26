package seleniumWebDriver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class T1 {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "E:\\User data\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//Step-1
		WebDriver driver =new ChromeDriver();
		
		//step-2
		driver.manage().window().maximize();
		
		//step-3
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		//Step-4-scrolling
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-600)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(3000);
		//Step-5 use of select class
		WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));
		 Select sel=new Select(dropdown);
		 
		 sel.selectByVisibleText("Option3");
		  sel.selectByIndex(0);
		 
		 List<WebElement> option=sel.getOptions();
		 
		 for (WebElement el1:option) {
			 
			 System.out.println(el1.getText());
		 }
		
		 WebElement checkBox=driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		 checkBox.click();
		 Thread.sleep(10000);
		 driver.close();
	}

}