package Pomscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomfb {
	
	//declaration
		@FindBy(id="email")
		private WebElement uname;
		@FindBy(id="pass")
		private WebElement pwdname;
		@FindBy(name="login")
		private WebElement loginbutton;
		
	//intialization
		public Pomfb(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
	//utilization
		public void clicklogin()
		{
			loginbutton.click();
		}
		public void username(String un)
		{
			uname.sendKeys(un);
		}
		public void pwdbox(String pwd)
		{
			pwdname.sendKeys(pwd);
		}

}
