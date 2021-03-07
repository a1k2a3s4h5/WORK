import org.testng.annotations.Test;

import Pages.InvalidSignUp;
import methods.Methods;
import utils.CreateBrowser;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver=CreateBrowser.openBrowser("Edge");
	InvalidSignUp obj;
  @Test
  public void f() {
	  
		obj.setEmailInput("akash@gmail.com");
		obj.setSubmitButton();
		obj.setErrorMessege();
  }
  @Test
  public void f_2() {
		obj.setEmailInput("raman@yahoo.com");
		obj.setSubmitButton();
		obj.setErrorMessege();
  }
  @BeforeTest
  public void beforeMethod() {
	  	//WebDriver driver=CreateBrowser.openBrowser("Edge");
		Methods.maxWindow(driver);
		Methods.implicitWait(driver);
		driver.get("http://automationpractice.com/");
		obj = PageFactory.initElements(driver, InvalidSignUp.class);
		obj.setSignIn();
		}

  @AfterTest
  public void afterMethod() {
	  
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
