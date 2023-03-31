package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.CheckBoxPage;
import util.BrowserFactory;

public class CheckedONTest {
	WebDriver driver;

	@Test
	public void ValidateCheckedON() {

		driver = BrowserFactory.init();

		CheckBoxPage checkBoxPage = PageFactory.initElements(driver, CheckBoxPage.class);
		checkBoxPage.clickToggleAllElement();
		checkBoxPage.validateCheckBoxElement();
		checkBoxPage.insertAddElement();
		checkBoxPage.clickSubmitElement();

		//BrowserFactory.tearDown();

	}

}
