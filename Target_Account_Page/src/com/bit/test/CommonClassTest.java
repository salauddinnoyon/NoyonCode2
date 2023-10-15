package com.bit.test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CommonClassTest {

	WebDriver dr;

	public CommonClassTest(WebDriver dr) {
		this.dr = dr;
	}

	public void verifyTitle(String expectedTitle) {

		String actualTitle = dr.getTitle();

		if (actualTitle.equals(expectedTitle)) {

			System.out.println("Title Matched");

		} else {
			System.out.println("Title did not Matched with : " + actualTitle);
		}
	}

	public void verifyUrl(String expectedUrl) {

		String actualUrl = dr.getCurrentUrl();

		if (actualUrl.contains(expectedUrl)) {

			System.out.println("URL Matched");

		} else {
			System.out.println("URL is not Matched with : " + actualUrl);
		}
	}

	public void goToAnyWebsite(String url) {

		// dr.get(url);

		if (dr == null) {
			throw new IllegalStateException("Driver is not initialized. Call setupDriver() first.");
		}
		dr.get(url);
	}

	public void verifyElementDisplayed(By locator) {

		boolean result = dr.findElement(locator).isDisplayed();
		System.out.println("Is element displayed ?" + result);

		if (result) {

			System.out.println("Element is displayed");
		} else {
			System.out.println("Element is not displayed");
		}

	}

	public void clickOnAnyElement(By locator) {

		dr.findElement(locator).click();
	}

	public void typeOnAnyElement(By locator, String text) {

		dr.findElement(locator).clear();
		dr.findElement(locator).sendKeys(text);
		System.out.println(text);
	}
	
	

	public void hover_over_To_Any_Element(By locator) {

		WebElement ele = dr.findElement(locator);
		Actions a = new Actions(dr);

		a.moveToElement(ele).perform();
	}

	public void getAnyText(By locator) {
		String text = dr.findElement(locator).getText();
		System.out.println(text);

	}

	public void selectAnOptionFromDropdown(By locator, int index) {

		Select s = new Select(dr.findElement(locator));
		s.selectByIndex(index);
	}

	public void selectAnOptionFromDropdown(By locator, String text) {

		new Select(dr.findElement(locator)).selectByVisibleText(text);
		;

	}

	public void selectAnOptionFromDropdown(String value, By locator) {

		Select s = new Select(dr.findElement(locator));
		s.selectByValue(value);

	}

	public void navigateBack() throws InterruptedException {
		dr.navigate().back();
		Thread.sleep(5000);
	}

	public void verifyText(By locator, String expectedText) {

		String actualText = dr.findElement(locator).getText();

		if (actualText.equals(expectedText)) {
			System.out.println("expectedText is matched with : " + actualText);

		} else {
			System.out.println("expectedText is not matched with : " + actualText);
		}

	}

	public void clickOnEleFromAList(By locator, int index) {

		dr.findElements(locator).get(index).click();

	}
	
	
	public void scrollUpOrDown(int startPix, int endPix) {

		JavascriptExecutor jsx = (JavascriptExecutor) dr;
		jsx.executeScript("window.scrollBy(" + startPix + "," + endPix + ")", "");
	}
	
	public void scrollToTheFooter() {

		JavascriptExecutor jsx = (JavascriptExecutor) dr;
		jsx.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}

}
