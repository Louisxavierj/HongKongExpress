package org.travel;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BaseClass {
	public SearchPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="outboundDepartureStation_mc")
	private WebElement from;
	
	@FindBy (id="outboundArrivalStation_mc")
	private WebElement to;
	
	
	
	@FindBy(xpath="(// button[@class='ui-input'])[3]")
	private WebElement triptype;
	
	@FindBy(id="triptype-0")
	private WebElement oneway;
	
	@FindBy(id="outboundStartDate")
	private WebElement outdate;
	
	@FindBy(xpath="(//span[@class='custom-day ng-star-inserted'])[28]")
	private WebElement date;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement btnFindFlight;

	public WebElement getFrom() {
		return from;
	}

	public WebElement getTo() {
		return to;
	}

	public WebElement getTriptype() {
		return triptype;
	}

	public WebElement getOneway() {
		return oneway;
	}

	public WebElement getOutdate() {
		return outdate;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getBtnFindFlight() {
		return btnFindFlight;
	}
	
}