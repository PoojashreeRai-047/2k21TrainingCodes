package tsepass.schlrshp.spompracto;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Tsepass 
{
	WebDriver driver;
	JavascriptExecutor js;
	String parentWindow, childWindow;
	
//	Epassportal testcase using TestNG and DataProvider 
	
	@BeforeTest
	public void setup() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\poojasra\\OneDrive - Capgemini\\Documents\\ChromeDriver\\chromedriver.exe");
//		driver=new ChromeDriver();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.get("https://www.google.com");
	}
	@Test (dataProvider="getdata")
	public void testcase_1(
			String Sscno, String Appno,
			String Sscyr, String Dob, String Acdyr
			) throws InterruptedException 
//	testcase1 executing 2diff datasets as 2 dif tstcases Using DataProvider
	{

		driver.manage().window().maximize();
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));   **********

		
		driver.get("https://telanganaepass.cgg.gov.in/");
		Thread.sleep(1000);
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
		
		
		System.out.println("data to be entered");
		//data to be entered
		WebElement selectdropdown = driver.findElement(By.xpath("/html/body/div[4]/div/div/form/fieldset/div[2]/div/div[3]/div[2]/select"));
		Select ssctype = new Select(selectdropdown);
		ssctype.selectByVisibleText("SSC Regular");
		driver.findElement(By.xpath("/html/body/div[4]/div/div/form/fieldset/div[2]/div/div[2]/div[2]/input")).sendKeys(
//		"1502115220");
		Sscno);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/form/fieldset/div[2]/div/div[1]/div[2]/input")).sendKeys(
//		"202008437870");
		Appno);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/form/fieldset/div[2]/div/div[2]/div[4]/input")).sendKeys(
//		"2015");
		Sscyr);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/form/fieldset/div[2]/div/div[3]/div[4]/input")).sendKeys(
//		"04031999");
		Dob);
		
		WebElement selectAcyr= driver.findElement(By.xpath("/html/body/div[4]/div/div/form/fieldset/div[2]/div/div[1]/div[4]/select"));
		Select Acyr=new Select(selectAcyr);
		Acyr.selectByVisibleText(
//		"2020-21");
		Acdyr);
		
		driver.findElement(By.xpath("/html/body/div[4]/div/div/form/fieldset/div[2]/div/div[4]/div/center/button")).click();
		js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
	
		Thread.sleep(15000);  //15secs
/*		
		  System.out.println("ele1");
		  WebElement element1 = driver.findElement(By.xpath("//div[@id='scrollone']"));
	      Actions builder1 = new Actions(driver);
	      builder1.moveToElement(element1).clickAndHold().perform();
	      
	      System.out.println("ele2");
	      WebElement element2 = driver.findElement(By.xpath("//div[@id='scrollone']"));
	      Actions builder2 = new Actions(driver);
	      builder2.moveToElement(element2).perform();
	      
	      System.out.println("ele3");
	      WebElement element3 = driver.findElement(By.id("scrollone"));
	      Actions builder3 = new Actions(driver);
	      builder3.moveToElement(element3).release().perform();
	      Thread.sleep(3000);
*/
		
	}
	@DataProvider
	Object[][] getdata() 
	{
		Object[][] data=new Object[2][5];
//		obj[no.datasets=no.testcases /users/rows/][columns/each_user_data]
 
		data[0][0]="1502115220";
		data[0][1]="202008437870";
		data[0][2]="2015";
		data[0][3]="04031999";
		data[0][4]="2020-21";
		
		data[1][0]="1922185720";
		data[1][1]="202110908869";
		data[1][2]="2019";
		data[1][3]="26122003";
		data[1][4]="2021-22";	
		
		return data;
	}
	
	
	@AfterTest
	public void teardown() 
	{
		driver.close();
		driver.switchTo().window(parentWindow);
		driver.close();	
	}


}
