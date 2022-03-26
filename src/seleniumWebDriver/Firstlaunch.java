package seleniumWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstlaunch {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\User data\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.selenium.dev/downloads/");
		
		driver.manage().window().maximize();
		
		String actual=driver.getTitle();
		System.out.println(actual);
		String expected="Downloads | Selenium";
		
		if (expected.equals(actual)) {
			
			System.out.println("title matched-TC Pass");
		}
		else {
			System.out.println("title doesn't macth -TC Fail");
		}
		
		Thread.sleep(8000);
		driver.close();

	}

}