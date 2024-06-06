package scriptone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_module {
	@FindBy(id = "username")
	private WebElement loginbtn;
	@FindBy(id="password")
	private WebElement Passwordbtn;
	public Login_module(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void loginbutton() {
		loginbtn.sendKeys("admin@gmail.com");
	}
	public void passwordbtn() {
		Passwordbtn.sendKeys("Agri_@dmin");
	}
	

}
