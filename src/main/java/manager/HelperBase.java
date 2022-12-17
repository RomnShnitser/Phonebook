package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class HelperBase {
	WebDriver wd;

	public HelperBase(WebDriver wd) {
		this.wd = wd;
	}

	// If there is an element on page (List size is grater than zero)
	public boolean isElementPresent(By locator) {
		return wd.findElements(locator).size() > 0;
	}

	// Type - Find element by locator, click it and clear, "type" send keys
	public void type(By locator) {
		WebElement element = wd.findElement(locator);
		element.click();
		element.clear();
		element.sendKeys(text);
	}

	// Click Method - Find Element and Click on it
	public void click(By locator) {
		wd.findElement(locator).click();
	}

	//Pause (Get seconds)
	public void pause(int time) {
		wd.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
}
