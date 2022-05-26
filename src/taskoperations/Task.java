package taskoperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

public class Task {

	public static void main(String[] args) throws FileNotFoundException {
	    
		    WebDriver driver;
		     
		    InputStream inputStream = new FileInputStream(new File("browserProperties.yaml"));
		    Yaml yaml = new Yaml();
		    Map<String , Object> data = (Map<String, Object>) yaml.load(inputStream);
	        String browsertype = (String) data.get("browser");
	        driver = operations.Browser.start(browsertype);
	        
		    driver.get("https://www.amazon.in/");
		    Select primevideo = new Select(driver.findElement(By.id("searchDropdownBox")));
		    primevideo.selectByVisibleText("Prime Video");
		    
		    WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		    searchbox.sendKeys("Kids Movie");
		    searchbox.submit();  
            driver.close();
   }
}
