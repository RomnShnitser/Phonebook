package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperUser extends HelperBase {

	// Constructor
	public HelperUser(WebDriver wd) {
		super(wd);
	}
	//##############################################################################################################
	// !!Methods

	// Open login/Registration form
	public void openLoginRegistrationForm() {
		click(By.xpath("//*[@href='/login']"));
	}

	// Filling Login Registration Form with Email and Password
	public void fillingLoginRegistrationForm(String email, String text) {
		type(By.xpath("//form//input[1]"));
		type(By.xpath("//form//input[2]"));
	}

	// Click button Login
	public void submitLogin() {
		click(By.xpath("//form//button[1]"));
	}

	// Click button Registration
	public void submitRegistration() {
		click(By.xpath("//form//button[2]"));
	}





}
