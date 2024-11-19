package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;

public class BaseTest {
	static Playwright playwright;
	static Browser browser;
	BrowserContext context;
    Page page;

	
	@BeforeSuite
	 public void initialize() {
		playwright = Playwright.create();
        browser = playwright.chromium().launch(new LaunchOptions().setHeadless(false));
		//browser = playwright.chromium().launch();
	}
    
	@AfterSuite
	 static void closeBrowser() {
	   playwright.close();
	}
	
	@BeforeTest
	void createContextAndPage() {
	    context = browser.newContext();
	    page = context.newPage();
	  }
	
	@AfterTest
	  void closeContext() {
	    context.close();
	}
	
}
