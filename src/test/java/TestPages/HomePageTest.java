package TestPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseClass;

public class HomePageTest extends BaseClass{
	
	private static final boolean True = false;
	
	
@Test(enabled = false,priority=2)
public void logoTest() {
homePage.logoDisplayed();				
	}
	
@Test	(enabled = false,priority=1)
public void clickPassWordFieldTest1() {
	homePage.clickPassWordField();
}	

@Test  (enabled = false,priority=3)
public void loginButtonTest1() {
homePage.loginButtonClicked();	
	
}
@Test (enabled = false,priority=4)
public void clickUserIdFielTest1() {
	homePage.clickUserIdField();
}
@Test (enabled = false,priority=5)
public void clickUnlockButtonFieldTest1() {
	homePage.clickUnlockButtonField();
}

@Test (enabled =false,priority=6)
public void clickIAgreeCheckBoxTest() {
	homePage.clickIAgreeCheckBoxField();
}
@Test(enabled =false)
public void UnlonckLinkClickTest2() {
	driver.findElement(By.id("cms-unlock-account")).click();
}

@Test(enabled =false)
public void UserIdClickedTest2() {
driver.findElement(By.xpath("//a[text()='User ID']")).click();	
	
}
@Test(enabled =false)
public void loginButtonClickTest2() {
driver.findElement(By.name("Submit Login")).click();	
}

@Test (enabled =true)
public void passWordFieldclickTest2() {
	WebElement passf=driver.findElement(By.className("cms-login-field ng-pristine ng-invalid ng-touched cms-error-border"));
	passf.click();
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	passf.sendKeys("shkh");
	try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


}

@Test(enabled =false)//
public void applicationSpecificFieldClickTest() {
	driver.findElement(By.linkText("Application Specific:")).click();
}

@Test(enabled =false)//
public void FAQsFieldClickTest() {
	driver.findElement(By.partialLinkText("Application Sp")).click();
}
@Test(enabled =false)
public void iAgreeCheckBoxClickTest() {
driver.findElement(By.cssSelector("label#cms-label-tc")).click();	
}
@Test(enabled =false)
public void newUserRegistrationButtonClickTest() {
	driver.findElement(By.linkText("Application Specifi")).click();
}
	

@Test(enabled =false)//
public void passWordFieldClickTest3() {
	driver.findElement(By.cssSelector("input.cms-login-field.ng-pristine.ng-invalid.cms-error-border.ng-touched")).click();
}
@Test(enabled =false)
public void userIdButtonClickTest3() {
	driver.findElement(By.cssSelector("input[name='user-d']")).click();
}
@Test(enabled =false)
public void homeButtonTest() {
boolean elementdisplayed = driver.findElement(By.xpath("//a[@id='cms-footer-homepage-link']")).isDisplayed();
System.out.println("Is the homebutton displayed?Ans:"+elementdisplayed );
}
@Test(enabled =false)
public void unlockButtonTest3() {
boolean unlockButtonEnabled = driver.findElement(By.id("cms-unlock-account")).isEnabled();
	System.out.print("Isthe unlock button Enable:? Ans"+unlockButtonEnabled);
}


}





