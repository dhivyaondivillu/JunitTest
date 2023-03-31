package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.RemovePage;
import util.BrowserFactory;

public class RemoveTest {
	WebDriver driver;

	@Test
	public void ValidateRemoveTest() {

		driver = BrowserFactory.init();

		RemovePage removePage = PageFactory.initElements(driver, RemovePage.class);
		removePage.clickCheckBoxElement();
		removePage.clickRemoveElement();
		removePage.validateDeletedElement();

		BrowserFactory.tearDown();
	}
}