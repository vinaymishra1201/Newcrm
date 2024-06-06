package basicgen_Lib;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	public Propertyfille pdata=new Propertyfille();
	@BeforeMethod
	public void openapp() throws IOException {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(pdata.getpropertyfile("url"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
	}
}
