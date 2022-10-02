package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
WebDriver driver;

public HomePage(WebDriver driver) {
	
	this.driver = driver;
	PageFactory.initElements(driver,this);
	
}
@FindBy(xpath="//em[@class='cms-icon cms-sprite-loggedout ms-3']")
WebElement logo;

public boolean logoDisplayed() {
	
boolean flag =logo.isDisplayed();	
System.out.println("is the logo displayed" +flag);	
	return flag;
}

@FindBy(xpath="//input[@id='cms-login-password']")
WebElement password;
	
public void clickPassWordField() {
	password.click();
}	
@FindBy(xpath="//button[@id='cms-login-submit']")
WebElement loginButton;

public void loginButtonClicked() {
	loginButton.click();
}
@FindBy(id="cms-forgot-userid")
WebElement userId;

public void clickUserIdField() {
	userId.click();
	
}
 
@FindBy(id="cms-unlock-account")
WebElement unlockButton;

public void clickUnlockButtonField() {
	unlockButton.click();
	
}





@FindBy(id="cms-label-tc")
WebElement iAgreeCheckBox;

public void clickIAgreeCheckBoxField() {
	iAgreeCheckBox.click();
	
}



}
