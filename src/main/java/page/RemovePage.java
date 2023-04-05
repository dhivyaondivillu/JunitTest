package page;

import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RemovePage extends BasePage {
	WebDriver driver;

	public RemovePage(WebDriver driver) {
		this.driver = driver;
	}

	// WebElement
	@FindBy(how = How.NAME, using = "todo[0]")
	WebElement CHECKBOX_ELEMENT;
	@FindBy(how = How.CSS, using = "input[value='Remove']")
	WebElement REMOVE_BUTTON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"todos-content\"]/form/ul/li[0]/a")
	WebElement DELETED_ELEMENT;
	@FindBy(how = How.NAME, using = "data")
	WebElement ADD_ELEMENT;
	@FindBy(how = How.CSS, using = "input[value='Add']")
	WebElement SUBMIT_ELEMENT;

	public void clickCheckBoxElement() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CHECKBOX_ELEMENT.click();
	}

	public void clickRemoveElement() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		REMOVE_BUTTON_ELEMENT.click();

	}

	public void insertAddElement() {
		String addName = "Hello" + generateRandomNum(99);
		ADD_ELEMENT.sendKeys(addName);

	}

	public void clickSubmitElement() {
		waitForElement(driver, 2, SUBMIT_ELEMENT);
		SUBMIT_ELEMENT.click();

	}

	public void validateDeletedElement() {
		try {
			Assert.assertTrue("Single Element is Present", DELETED_ELEMENT.isDisplayed());
		} catch (NoSuchElementException e) {
			System.out.println("Single Element is Deleted");

		}

	}

}
