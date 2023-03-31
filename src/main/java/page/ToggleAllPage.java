package page;

import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ToggleAllPage extends BasePage {
	WebDriver driver;

	public ToggleAllPage(WebDriver driver) {
		this.driver = driver;
	}

	// WebElement
	@FindBy(how = How.XPATH, using = "//input[@name='allbox']")
	WebElement TOGGLE_ALL_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@value='Remove']")
	WebElement REMOVE_BUTTON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"todos-content\"]/form/ul/li[0]/a")
	WebElement DELETED_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@name='data']")
	WebElement ADD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@value='Add']")
	WebElement SUBMIT_ELEMENT;

	public void clickToggleAllElement() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		TOGGLE_ALL_ELEMENT.click();
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

	public void validateDeletedElement() {
		try {
			Assert.assertTrue("Delete Element present", DELETED_ELEMENT.isDisplayed());
			return;
		} catch (NoSuchElementException e) {
			System.out.println("RemovedAll Element");
			return;
		}
	}

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
