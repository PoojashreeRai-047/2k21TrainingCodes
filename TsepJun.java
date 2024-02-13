package tsepass.schlrshp.slfcod;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TsepJun 
{
	WebDriver driver;
	JavascriptExecutor js;
	String parentWindow, childWindow;
ding gone
	
	@Before
	public void setup() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\poojasra\\OneDrive - Capgemini\\Documents\\ChromeDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//		lets start
		driver.get("https://telanganaepass.cgg.gov.in/");
//		Thread.sleep(4000);
		js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		
		driver.findElement(By.xpath("//a[contains(text(),'Post Matric')]")).click();
		js.executeScript("window.scrollBy(0,400)");
		driver.findElement(By.xpath("/html/body/div[4]/div/div/table/tbody/tr[8]/td[2]/a")).click();
		
		//window handling
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		
		parentWindow= it.next();
		childWindow = it.next();
		
		driver.switchTo().window(childWindow);
		driver.switchTo().window(parentWindow);
		driver.switchTo().window(childWindow);
	}
	
	@After
	public void teardown() 
	{
		System.out.println("closing");
		driver.close();
		driver.switchTo().window(parentWindow);
		driver.close();
		System.out.println("closed");
	}
	
	@Test
	public void testP() throws InterruptedException 
	{
		System.out.println("testing startedppppp");
		
		System.out.println("data to be entered");
		//data to be entered
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
				js=(JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,400)");
				Thread.sleep(4000);
		
		
		System.out.println("testing ended");
	}
	@Test
	public void testG() throws InterruptedException 
	{
		System.out.println("testing startedggggg");
		
		System.out.println("data to be entered");
		//data to be entered
				WebElement selectdropdown = driver.findElement(By.xpath("/html/body/div[4]/div/div/form/fieldset/div[2]/div/div[3]/div[2]/select"));
				Select ssctype = new Select(selectdropdown);
				ssctype.selectByVisibleText("SSC Regular");
				
				driver.findElement(By.xpath("/html/body/div[4]/div/div/form/fieldset/div[2]/div/div[2]/div[2]/input")).sendKeys("1922185720");
				driver.findElement(By.xpath("/html/body/div[4]/div/div/form/fieldset/div[2]/div/div[1]/div[2]/input")).sendKeys("202110908869");
				driver.findElement(By.xpath("/html/body/div[4]/div/div/form/fieldset/div[2]/div/div[2]/div[4]/input")).sendKeys("2019");
				driver.findElement(By.xpath("/html/body/div[4]/div/div/form/fieldset/div[2]/div/div[3]/div[4]/input")).sendKeys("26122003");
				
				WebElement selectAcyr= driver.findElement(By.xpath("/html/body/div[4]/div/div/form/fieldset/div[2]/div/div[1]/div[4]/select"));
				Select Acyr=new Select(selectAcyr);
				Acyr.selectByVisibleText("2021-22");
				driver.findElement(By.xpath("/html/body/div[4]/div/div/form/fieldset/div[2]/div/div[4]/div/center/button")).click();
				js=(JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,400)");
				Thread.sleep(4000);
		
		
		System.out.println("testing ended");
	}
//
	

}
