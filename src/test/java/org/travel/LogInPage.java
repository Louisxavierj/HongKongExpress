package org.travel;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage extends BaseClass {
	public LogInPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()='Sign in']")
	private WebElement signInbtn;

	public WebElement getSignInbtn() {
		return signInbtn;
	}
	
	
	

}
