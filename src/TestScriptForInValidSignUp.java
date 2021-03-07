

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Pages.InvalidSignUp;
import methods.Methods;
import utils.CreateBrowser;

public class TestScriptForInValidSignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=CreateBrowser.openBrowser("Edge");
		Methods.maxWindow(driver);
		Methods.implicitWait(driver);
		driver.get("http://automationpractice.com/");
		InvalidSignUp obj = PageFactory.initElements(driver, InvalidSignUp.class);
		obj.setSignIn();
		obj.setEmailInput("akash@gmail.com");
		obj.setSubmitButton();
		obj.setErrorMessege();
	}

}
