package bankrate.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	  WebDriver dr;
	   @FindBy(xpath="")WebElement MortgageMenu;
	   @FindBy(xpath="")WebElement MortgageCalculator;
	   Actions ac = new Actions(dr);
	   public HomePage(WebDriver dr){
		   this.dr=dr;
		   PageFactory.initElements(dr,this);
	   }
	   
	     public void mouseOver()
	     {
	    	
	    	 ac.moveToElement(MortgageMenu).perform();
	     } 
	     
	     
	     public MortgageCalculator clickMortgageCalculator()
	     {
	    	 MortgageCalculator.click();
	    	 return new MortgageCalculator(dr);
	     }

}  
