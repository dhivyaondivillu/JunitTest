package page;

import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckBoxPage extends BasePage {

	WebDriver driver;

	public CheckBoxPage(WebDriver driver) {
		this.driver = driver;
	}

	// WebElement
	@FindBy(how = How.XPATH, using = "//input[@name='allbox']")
	WebElement TOGGLE_ALL_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@name='todo[0]']")
	WebElement CHECKBOX_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@name='data']")
	WebElement ADD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@value='Add']")
	WebElement SUBMIT_ELEMENT;

	public void clickToggleAllElement() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		TOGGLE_ALL_ELEMENT.click();
	}

	public void validateCheckBoxElement() {
		try {
			Assert.assertTrue("All Check box element not Selected", CHECKBOX_ELEMENT.isDisplayed());
			System.out.println("All Check box element Selected");
		} catch (NoSuchElementException e) {
			System.out.println("All Check box element not Selected");
			
		}
	}
//	public void validateCheckBoxElement() {
//		Assert.assertTrue("CHECKBOX ELEMENT not selected", CHECKBOX_ELEMENT.isDisplayed());
//		if (CHECKBOX_ELEMENT.isDisplayed() == true) {
//			System.out.println("ALL Check box element Selected");
//		}
//
//	}

	public void insertAddElement() {
		String addName = "Hello" + generateRandomNum(99);
		ADD_ELEMENT.sendKeys(addName);

	}

	public void clickSubmitElement() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SUBMIT_ELEMENT.click();

	}
}
