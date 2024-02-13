package tsepass.schlrshp.spompracto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeSetter 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\POOJASRA\\OneDrive - Capgemini\\Documents\\ChromeDriver\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();  if error rises
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.google.com");
		
		
		System.out.println("normal webdriver didn't work");
		driver.manage().window().maximize();
		System.out.println("used chromeOptions to execute");

	}

}
