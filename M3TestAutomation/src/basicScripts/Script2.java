package basicScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script2
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver    driver = new ChromeDriver();
		driver.get("https://www.shoppersstack.com");
		Thread.sleep(2000);
		driver.close(); //->close only tab
//		driver.quit();//-> close entire browser
		
	}

}
