package lhrsra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chraccs {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\poojasra\\OneDrive - Capgemini\\Documents\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
/*		
		driver.get("https://www.tutorialspoint.com/index.htm");
		driver.manage().window().fullscreen();
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get("https://www.spicejet.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		Thread.sleep(3000);
*/		
		driver.get("https://engineerdiaries.com/test");
		driver.findElement(By.id("fullName")).sendKeys("Raip");
		driver.findElement(By.name("phoneNumber")).sendKeys("7889");
		driver.findElement(By.className("form-control")).click();
		
		
//		driver.findElement(By)  form-control
		Thread.sleep(10000);
		driver.close();	
	}

}
