package com.bit.test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BaseTest {

	WebDriver dr;

	public String browserName = "chrome";

	@Before
	public void openBrowser() {

		// dr = new ChromeDriver();
		// dr.manage().window().setSize(new Dimension(1200, 800));
		if (browserName.equalsIgnoreCase("chrome")) {

			dr = new ChromeDriver();
			dr.manage().window().setSize(new Dimension(1200, 800));
		} else if (browserName.equalsIgnoreCase("firefox")) {

			dr = new FirefoxDriver();
			dr.manage().window().setSize(new Dimension(1200, 800));
		} else if (browserName.equalsIgnoreCase("safari")) {
			dr = new SafariDriver();
			dr.manage().window().setSize(new Dimension(1200, 800));
		} else if (browserName.equalsIgnoreCase("internet explorer")) {

			dr = new InternetExplorerDriver();
			dr.manage().window().setSize(new Dimension(1200, 800));
		} else {
			throw new IllegalArgumentException("Unsupported browser: " + browserName);
		}
	}

	@After
	public void tearDownBrowser() throws InterruptedException {

		Thread.sleep(5000);
		// dr.quit();
		if (dr != null) {
			dr.quit();
			dr = null;
		}

	}

}
