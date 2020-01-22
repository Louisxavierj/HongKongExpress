package org.travel;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectFlightPage extends BaseClass{
	public SelectFlightPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@class='ng-tns-c0-0 price-rate ng-star-inserted']")
	private WebElement selectFlight;
	
	@FindBy(xpath="(//button[@class='button btn-secondary'])[1]")
	private WebElement FlightType;
	
	@FindBy(xpath="//span[contains(text(),'Continue')]")
	private WebElement btnContinue;
	
	@FindBy(xpath="//button[@class='button btn-action']")
	private WebElement btnNext;

	public WebElement getSelectFlight() {
		return selectFlight;
	}

	public WebElement getFlightType() {
		return FlightType;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

	public WebElement getBtnNext() {
		return btnNext;
	}
	
}
