package tsepass.schlrshp.slfcod;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CodeRuneer 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\POOJASRA\\OneDrive - Capgemini\\Documents\\ChromeDriver\\chromedriver.exe");
		
//		WebDriver driver=new ChromeDriver();  if error rises
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
//		Thread.sleep(3000);
		driver.get("https://telanganaepass.cgg.gov.in/");
//		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		
		driver.findElement(By.xpath("//a[contains(text(),'Post Matric')]")).click();
		js.executeScript("window.scrollBy(0,400)");
		driver.findElement(By.xpath("/html/body/div[4]/div/div/table/tbody/tr[8]/td[2]/a")).click();
		
		//window handling
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		
		String parentWindow= it.next();
		String childWindow = it.next();
		
		driver.switchTo().window(childWindow);
		driver.switchTo().window(parentWindow);
		driver.switchTo().window(childWindow);
//		Thread.sleep(4000);
		
		WebElement selectdropdown = driver.findElement(By.xpath("/html/body/div[4]/div/div/form/fieldset/div[2]/div/div[3]/div[2]/select"));
		Select ssctype = new Select(selectdropdown);
		ssctype.selectByVisibleText("SSC Regular");
		
		driver.findElement(By.xpath("/html/body/div[4]/div/div/form/fieldset/div[2]/div/div[2]/div[2]/input")).sendKeys("1502115220");
		driver.findElement(By.xpath("/html/body/div[4]/div/div/form/fieldset/div[2]/div/div[1]/div[2]/input")).sendKeys("202008437870");
		driver.findElement(By.xpath("/html/body/div[4]/div/div/form/fieldset/div[2]/div/div[2]/div[4]/input")).sendKeys("2015");
		driver.findElement(By.xpath("/html/body/div[4]/div/div/form/fieldset/div[2]/div/div[3]/div[4]/input")).sendKeys("04031999");
		
		WebElement selectAcyr= driver.findElement(By.xpath("/html/body/div[4]/div/div/form/fieldset/div[2]/div/div[1]/div[4]/select"));
		Select Acyr=new Select(selectAcyr);
		Acyr.selectByVisibleText("2020-21");
		driver.findElement(By.xpath("/html/body/div[4]/div/div/form/fieldset/div[2]/div/div[4]/div/center/button")).click();
//		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,400)");
		
		
		Thread.sleep(15000);
		driver.close();
		driver.switchTo().window(parentWindow);
		driver.close();
		
	}
//	driver.findElement(By.xpath(""));
}
