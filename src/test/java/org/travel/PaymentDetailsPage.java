package org.travel;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentDetailsPage extends BaseClass{
	public PaymentDetailsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//td[contains(text(),'HKD 4,334')]")
	private WebElement price;

	public WebElement getPrice() {
		return price;
	}
	
	

}
