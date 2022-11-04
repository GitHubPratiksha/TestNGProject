package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class baseClass {

	public WebDriver driver;
	public Properties prop;
	public void initializeDriver() throws IOException {
		
		//Data reading 
		//FileInputStream fs= new FileInputStream("C:\\Users\\dixit\\eclipse-workspace\\MavenDemo\\src\\main\\java\\Resources\\Data.properties");
		
		FileInputStream fs= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\Data.properties");
		
		//accessing data.properties file
		 prop= new Properties();
		//loading the files which is already read
		prop.load(fs);
		String browserName=prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\dixit\\OneDrive\\Desktop\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
			 driver= new ChromeDriver();  
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\dixit\\OneDrive\\Desktop\\FireFoxDriver\\geckodriver-v0.32.0-win64\\geckodriver.exe");

			    driver = new FirefoxDriver();   
		
			
		}
		else {
			
			System.out.println("browser value not found");
		}
		
		
		
	}
	
	@BeforeMethod
	//launch URL method 
	public void launchURL() throws IOException {
		
		initializeDriver();
		//this driver has scope
		String url= prop.getProperty("url");
		driver.get(url);
		
		
		
	}

}
