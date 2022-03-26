package seleniumWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","E:\\User data\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();                      
        
        driver.get("https://vctcpune.com/selenium/practice.html");
        driver.manage().window().maximize();
        
        JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(3000);
		
		List <WebElement> radiobuttons=driver.findElements(By.xpath("//*[@id='serviceid1']//div//div/div[1]//input"));
		for (WebElement ref:radiobuttons) {
			String s=ref.getAttribute("value");
			System.out.println(s);
			
        driver.close();
        
	}
	}
}
