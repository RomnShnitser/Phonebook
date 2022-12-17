package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplicationManager {
	WebDriver wd;

	HelperUser user;

	// Getter for User
	public HelperUser getUser() {
		return user;
	}

	// Initialization (Driver for site, website address)
	public void initialization() {
		wd = new ChromeDriver();
		wd.navigate().to("https://telranedu.web.app/home");
		HelperUser user = new HelperUser(wd);
	}

	// Stop website and Quit
	public void stop() {
		wd.quit();
	}
}
