package bankrate.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class MortgageCalculator { 
	   
	WebDriver dr;

	public MortgageCalculator(WebDriver dr)
	{ 
		this.dr=dr;
	} 
	
	public void homePrice()
	{
		dr.findElement(By.xpath("")).sendKeys("700000");
	}
	
	public void downPayment()
	{
		dr.findElement(By.xpath("")).sendKeys("140000");
	}
	
	public void mortgageTerm()
	{
		dr.findElement(By.xpath("")).sendKeys("30");
	}
	public void annualInterestRate(){
		dr.findElement(By.xpath("")).sendKeys("4%");
	}
	public void calculate()
	{
		dr.findElement(By.xpath("")).click();
	}
	
	public void verifyMortgage()
	{
		//if(i>=2000 && i <=3000){
			
		} 
	public void backTohome(){
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
