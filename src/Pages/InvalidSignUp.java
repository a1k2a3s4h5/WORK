package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class InvalidSignUp {

	public WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Sign in')]")
	public WebElement signInXpath;
	
	@FindBy(id="email_create")
	public WebElement emailInputId;
	
	@FindBy(id="SubmitCreate")
	public WebElement createAnAccountId;
	
	@FindBy(how=How.XPATH,using="//li[contains(text(),'An account using this')]")
	public WebElement errorXpath;
	
	public void setSignIn() {
		signInXpath.click();
	}
	
	public void setEmailInput(String email_input) {
		emailInputId.click();
		emailInputId.clear();
		emailInputId.sendKeys(email_input);
	}
	
	public void setSubmitButton() {
		createAnAccountId.click();
	}
	public void setErrorMessege() {
		String errorMsg = errorXpath.getText();
		if(errorMsg!=null) {
			System.out.println("Test case pass.");
		}
		else
			System.out.println("Test case failed.");
	}
	
}
