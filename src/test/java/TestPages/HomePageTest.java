package TestPages;

import org.testng.annotations.Test;

import base.BaseClass;

public class HomePageTest extends BaseClass{
	
	@Test(enabled = false,priority=2)
public void logoTest() {
homePage.logoDisplayed();		
		
	}
	
@Test	(enabled = false,priority=1)
public void clickPassWordFieldTest() {
	homePage.clickPassWordField();
}	

@Test  (enabled = false,priority=3)
public void loginButtonTest() {
homePage.loginButtonClicked();	
	
}
@Test (enabled = false,priority=4)
public void clickUserIdFielTest() {
	homePage.clickUserIdField();
}
@Test (enabled = false,priority=5)
public void clickUnlockButtonFieldTest() {
	homePage.clickUnlockButtonField();
}

@Test (enabled = true,priority=6)
public void clickIAgreeCheckBoxTest() {
	homePage.clickIAgreeCheckBoxField();
}



}
