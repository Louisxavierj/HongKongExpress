package org.travel;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends BaseClass{
	public SignInPage() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="user")
	private WebElement email;
	
	@FindBy(id="surname")
	private WebElement passWord;
	
	@FindBy(xpath="//button[contains(text(),'Sign in')]")
	private WebElement btnSingIn;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getBtnSingIn() {
		return btnSingIn;
	}
	
}
