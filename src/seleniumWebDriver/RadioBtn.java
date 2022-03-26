package seleniumWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtn {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\User data\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://vctcpune.com/selenium/practice.html");
	      Thread.sleep(3000);
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			//for scrolling
			JavascriptExecutor js=(JavascriptExecutor)driver;
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,600)");
			Thread.sleep(3000);
			
			List <WebElement> radiobuttons=driver.findElements(By.xpath("//*[@id='serviceid1']//div//div/div[1]//input"));
			for (WebElement ref:radiobuttons) {
				String s=ref.getAttribute("value");
				System.out.println(s);
				
				if (s.equals("Radio1")) {
					System.out.println("in Radio1");
					ref.click();
					Thread.sleep(3000);
				}
				if (s.equals("Radio2")) {
					System.out.println("in Radio2");
					ref.click();
					Thread.sleep(3000);
					
				}
				if (s.equals("Radio3")) {
					System.out.println("in Radio3");
					ref.click();
					Thread.sleep(3000);
					
				}
				if (s.equals("Radio4")) {
					System.out.println("in Radio4");
					ref.click();
					Thread.sleep(3000);
					
				}
				
	}
			driver.close();
			

}
}
