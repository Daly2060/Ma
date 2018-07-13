package bankrate.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.Before;

public class Base 
{
  WebDriver dr;
  @Before
  public void openBrowser(String Filename) throws IOException{
	  FileInputStream f = new FileInputStream("config.properties");
	  Properties p =new Properties();
	  p.load(f);
	  String s = p.getProperty("http://www.Bankrate.com");
	  
	    if(s.equals("Firefox")){
	    	System.getProperty("", "");
	    	FirefoxDriver dr;
		  System.out.println("open firefox browser");
		  
	  }else if(s.equals("Chrome")){
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DALY\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		  ChromeDriver dr;
		  System.out.println("open Chrome browser");
	  }
		  dr.get(p.getProperty("http://www.Bankrate.com"));
	  }
  
  {
	  
  }
}
