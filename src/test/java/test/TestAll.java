package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.CheckBoxPage;
import page.RemovePage;
import page.ToggleAllPage;
import util.BrowserFactory;

public class TestAll {
	WebDriver driver;

	@Test
	public void ValidateTestAll() {

		driver = BrowserFactory.init();
		CheckBoxPage checkBoxPage = PageFactory.initElements(driver, CheckBoxPage.class);
		checkBoxPage.clickToggleAllElement();
		checkBoxPage.validateCheckBoxElement();
		checkBoxPage.insertAddElement();
		checkBoxPage.clickSubmitElement();
		
		RemovePage removePage = PageFactory.initElements(driver, RemovePage.class);
		removePage.clickCheckBoxElement();
		removePage.clickRemoveElement();
		removePage.validateDeletedElement();
		
		ToggleAllPage toggleAllPage = PageFactory.initElements(driver, ToggleAllPage.class);
		toggleAllPage.clickToggleAllElement();
		toggleAllPage.clickRemoveElement();
		toggleAllPage.validateDeletedElement();
		toggleAllPage.insertAddElement();
		toggleAllPage.clickSubmitElement();

		

}
}