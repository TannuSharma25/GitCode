package operations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser {
	
	public static  WebDriver start(String browser) {
		
     if(browser.equalsIgnoreCase("chrome")) {
		   
			System.setProperty("webdriver.chrome.driver", "./Chromedriver/chromedriver.exe");
			    return new ChromeDriver();
     	   }
           else if((browser.equalsIgnoreCase("Firefox")))
		   {
			   System.setProperty("webdriver.Firefox.driver", "/Firefox/Firefox Installer.exe");
				return  new FirefoxDriver();
	       }
           else if(browser.equalsIgnoreCase("IEbrowsers" ))
           {
        	   System.setProperty("webdriver.IE browsers.driver", "./IE browsers/IE browsers.exe");
				return  new InternetExplorerDriver();
           }
	       else {
			   System.setProperty("webdriver.chrome.driver", "./Chromedriver/chromedriver.exe");
		       return new ChromeDriver();
		   }
   }
 }
