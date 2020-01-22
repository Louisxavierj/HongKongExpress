package org.travel;


import org.baseclass.BaseClass;
import org.baseclass.ExcelIntegration;

public class HKExpress extends ExcelIntegration {
	public static void main(String[] args) throws Exception {
		BaseClass.getBrowser("chrome");
		BaseClass.getUrl("https://www.hkexpress.com/en-hk/");
		LogInPage login = new LogInPage();
		BaseClass.clickOnWebElement(login.getSignInbtn());
		SignInPage signIn = new SignInPage();
		BaseClass.sendkeys(signIn.getEmail(), getData(0, 0));
		BaseClass.sendkeys(signIn.getPassWord(), getData(1, 0));
		BaseClass.clickOnWebElement(signIn.getBtnSingIn());
		
		SearchPage searchpage= new SearchPage();
		BaseClass.clickOnWebElement(searchpage.getTriptype());
		BaseClass.clickOnWebElement(searchpage.getOneway());
		BaseClass.sendkeys(searchpage.getFrom(), getData(2, 1));
		BaseClass.robotEnter();
		BaseClass.sendkeys(searchpage.getTo(), getData(3, 1));
		BaseClass.robotEnter();
		BaseClass.clickOnWebElement(searchpage.getDate());
		BaseClass.clickOnWebElement(searchpage.getBtnFindFlight());
		
		SelectFlightPage sfp = new SelectFlightPage();
		BaseClass.clickOnWebElement(sfp.getSelectFlight());
		BaseClass.clickOnWebElement(sfp.getFlightType());
		BaseClass.clickOnWebElement(sfp.getBtnNext());
		
		GuestDetails gd = new GuestDetails();
		BaseClass.JavascriptClick(gd.getBtnNext());
		
		AddExtraPage aep=new AddExtraPage();
		BaseClass.JavascriptClick(aep.getBtnNext());
		
		SelectSeatPage ssp=new SelectSeatPage();
		BaseClass.JavascriptClick(ssp.getBtnNext());
		
		PaymentDetailsPage pdp=new PaymentDetailsPage();
		BaseClass.getTextFromtheElement(pdp.getPrice());
		
		System.out.println("***End***");
		
	}
}
