package com.bit.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.bit.data.SharedDataTest;

/*
 * Navigate to Kids Shoe Page 
 * Click on kids shoes
 * Navigate to shop all
 * Navigate to HEYDUDE "Boys' Wally Stretch Washable Slip-Ons (Youth)"
 * Add to Bag 
 * Checkout after Adding up everything as a User
 * Remove And Edit in checkout (different Quantity Input)
 * Proceed to Checkout
 * Click to Guest Page 
 * Input all The required fields 
 * Navigate to Back to Shopping Bag
 * Remove All items 
 * Back to Original shopping Page
 * 
 * 
 */

/*
 * Test Cases :
 * 
 * Open Browser (ChromeDriver)
 * Navigate to Website  "Dillard's-The Style of Your Life: Official Site of Dillards"
 * Verify The HomePage URl & Title
 * Hover over to Kids And Then Click on the Element "KIDS SHOES"
 * Verify Url And Title
 * Assertion on Text "KIDS SHOES" Page 
 * Click on shop all link 
 * Verify The Url & Title 
 * Verify the Elements on HEYDUDE "Boys' Wally Stretch Washable Slip-Ons (Youth)" (Price , Name , Ratings)
 * Click on the element and navigate to the current Page
 * Verify The Current Page 
 * Click on Size Chart, 
 * Click on Color , 
 *  add Quantity
 * Click Add to Bag
 * Verify the Page 
 * click on checkout 
 * verify the Page 
 * Click on the Continiue shopping 
 * Verify HomePageUrl ANd Title 
 * Click Add to Cart Button
 * Remove the item from Cart
 * Verify Page 
 * Click Continue Shopping 
 * Verify the Page 
 * Sysout "Job Done : Ticket is Good to Go"
 * Tear Down The Browser.
 * 
 */

public class ScenarioTest {

	WebDriver dr;
	CommonClassTest code;

	public ScenarioTest(WebDriver dr) {
		this.dr = dr;

	}

	public void verify_kids_Shoes_Page() {

		code = new CommonClassTest(dr);

		code.goToAnyWebsite(SharedDataTest.expectedHomePageUrl);
		code.verifyUrl(SharedDataTest.expectedHomePageUrl);
		code.verifyTitle(SharedDataTest.expectedHomePageTiltle);
		code.hover_over_To_Any_Element(By.xpath("//*[@id=\"topcat_Kids\"]"));
		code.clickOnAnyElement(By.xpath("//*[@id=\"main_nav\"]/section/div[2]/div[2]/h2[3]/a"));
		

	}
	
	public void loopPractice() {
		
	}

}
