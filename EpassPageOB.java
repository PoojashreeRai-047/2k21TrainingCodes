package tsepass.schlrshp.spompracto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
//tryand try
public class EpassPageOB 
{
	WebDriver driver;
	
	public EpassPageOB(WebDriver driver2) 
	{ 
//		PageFactory.initElements(driver, this);
		this.driver=driver2;
		System.out.println("testing pageobj initialized");
	
	}
//	-------------------------------
	
	@FindBy(xpath="//div[@class='col-md-9']//div[1]//div[1]//div[1]")
	WebElement Pmx;
	
//	By Postmatric= By.id("//a[contains(text(),'Post Matric')]");
	public WebElement Postmatric()
	{
		return Pmx;
//		return driver.findElement(Postmatric);
	}
	
//---------------------------------
	By AppStatus= By.id("/html/body/div[4]/div/div/table/tbody/tr[8]/td[2]/a");
	public WebElement AppStatus() 
	{
		return driver.findElement(AppStatus);
	}
//	-------------------------------	

	By SScno= By.id("/html/body/div[4]/div/div/form/fieldset/div[2]/div/div[2]/div[2]/input");
	public WebElement SScno() 
	{
		return driver.findElement(SScno);
	}
//	-------------------------------	
	By Appno= By.id("/html/body/div[4]/div/div/form/fieldset/div[2]/div/div[1]/div[2]/input");
	public WebElement Appno() 
	{
		return driver.findElement(Appno);
	}
//	-------------------------------	
	By SScyr= By.id("/html/body/div[4]/div/div/form/fieldset/div[2]/div/div[2]/div[4]/input");
	public WebElement SScyr() 
	{
		return driver.findElement(SScyr);
	}
//	-------------------------------	
	By Dob= By.id("/html/body/div[4]/div/div/form/fieldset/div[2]/div/div[3]/div[4]/input");
	public WebElement Dob() 
	{
		return driver.findElement(Dob);
	}
//	-------------------------------????????????
/*	WebElement selectAcyr= driver.findElement(By.xpath("/html/body/div[4]/div/div/form/fieldset/div[2]/div/div[1]/div[4]/select"));
	public Select Acyr() 
	{
		Select Acyr=new Select(selectAcyr);
		
		return Acyr;
	}
	*/
//	-------------------------------	
/*	WebElement selectdropdown = driver.findElement(By.xpath("/html/body/div[4]/div/div/form/fieldset/div[2]/div/div[3]/div[2]/select"));
	public Select Styp() 
	{
		Select ssctype = new Select(selectdropdown);
		return ssctype;
	}
*/	
//	-------------------------------	
	By Sbmt= By.id("/html/body/div[4]/div/div/form/fieldset/div[2]/div/div[4]/div/center/button");
	public WebElement Sbmt() 
	{
		return driver.findElement(Sbmt);
	}
	
}
