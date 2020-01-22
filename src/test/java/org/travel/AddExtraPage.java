package org.travel;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddExtraPage extends BaseClass{
	public AddExtraPage() {

		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[@class='button btn-action']")
	private WebElement btnNext;
	public WebElement getBtnNext() {
		return btnNext;
	}
	
}
