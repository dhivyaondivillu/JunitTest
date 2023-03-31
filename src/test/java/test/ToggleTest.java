package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.ToggleAllPage;
import util.BrowserFactory;

public class ToggleTest {
	WebDriver driver;

	@Test
	public void ValidateToggleTest() {

		driver = BrowserFactory.init();

		ToggleAllPage toggleAllPage = PageFactory.initElements(driver, ToggleAllPage.class);
		toggleAllPage.clickToggleAllElement();
		toggleAllPage.clickRemoveElement();
		toggleAllPage.validateDeletedElement();
		toggleAllPage.insertAddElement();
		toggleAllPage.clickSubmitElement();

		BrowserFactory.tearDown();
	}
}
