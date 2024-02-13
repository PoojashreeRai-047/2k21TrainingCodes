package tsepass.schlrshp.spompracto;

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

import tsepass.schlrshp.spompracto.EpassPageOB;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
Gone

public class EpassTest 
{
	WebDriver driver;
	String parentWindow, childWindow;
	EpassPageOB epp;
	@Before
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\poojasra\\OneDrive - Capgemini\\Documents\\ChromeDriver\\chromedriver.exe");
		driver=new ChromeDriver();
			
	}
	@Test
	public void test_1() throws InterruptedException
	{
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://telanganaepass.cgg.gov.in/");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		System.out.println("testing startedHOMEPAGE");
		
//		pageobjs invoke
		epp=new EpassPageOB(driver);
		
		
		
		epp.Postmatric().click();
		System.out.println("testingoooo");
		Thread.sleep(4000);
//		driver.findElement(By.xpath("//a[contains(text(),'Post Matric')]")).click();
		System.out.println("testing cLICK ON PMtrx");
		epp.AppStatus().click();
		System.out.println("testing startedppppp4");
//      window handling
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		
		parentWindow= it.next();
		childWindow = it.next();
		
		driver.switchTo().window(childWindow);
		driver.switchTo().window(parentWindow);
		driver.switchTo().window(childWindow);
		System.out.println("data to be entered");
//		data to be entered
		Thread.sleep(8000);
		WebElement selectdropdown = driver.findElement(By.xpath("/html/body/div[4]/div/div/form/fieldset/div[2]/div/div[3]/div[2]/select"));
		Select ssctype = new Select(selectdropdown);
		ssctype.selectByVisibleText("SSC Regular");
//		epp.Styp().selectByVisibleText("SSC Regular");	
		epp.SScno().sendKeys("1502115220");
		epp.Appno().sendKeys("202008437870");
		epp.SScyr().sendKeys("2015");
		epp.Dob().sendKeys("04031999");
//		epp.Acyr().selectByVisibleText("2020-2021");
		
		epp.Sbmt().click();
		js.executeScript("window.scrollBy(0,400)");
		System.out.println("testing ended");
	}
	@After
	public void teardown() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.close();
		driver.switchTo().window(parentWindow);
		driver.close();
	}
}
