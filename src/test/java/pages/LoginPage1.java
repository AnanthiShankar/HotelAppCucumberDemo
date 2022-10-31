package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;


public class LoginPage1 {
	WebDriver driver;
	public LoginPage1(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="username")
	private WebElement uName;
	
	@FindAll({ //uses And and Connection so it should have id and name
		@FindBy(id="password"),
		@FindBy(name="password")
		
	})
	private WebElement pwd;
	
	@FindAll({ //uses And and Connection so it should have id and name
		@FindBy(id="login"),
		@FindBy(name="login"),
		@FindBy(className="button")
		})
	private WebElement lbtn;
	/**
	 * @param user
	 * @param pass
	 */
	public void loginAction() {
		// TODO Auto-generated method stub
		//uName.sendKeys(user);
		//pwd.sendKeys(pass);
		lbtn.click();
		
	}
	public void userid(String user) {
		// TODO Auto-generated method stub
		uName.sendKeys(user);
		
		
	}
	public void password(String pass) {
		// TODO Auto-generated method stub
		pwd.sendKeys(pass);
		
		
	}
	

}
