package com.mohs.reuse;

import org.openqa.selenium.WebDriver;

import com.gcr.config.StartBrowser;
import com.gcr.wdcmds.ActionDriver;
import com.mohs.or.HomePage;
import com.mohs.or.LoginPage;

public class CommonFunctions {
	
	public ActionDriver aDriver;
	public WebDriver driver;
	
	public CommonFunctions()
	{
		aDriver = new ActionDriver();
		driver = StartBrowser.driver;
	}
	
	public void login(String userName, String password) throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Login to Application");
		aDriver.navigateToApplication("https://testautomationforum.com/");
		aDriver.click(HomePage.lnkLogin, "Login Link");
		aDriver.type(LoginPage.txtUserName, userName, "UserName text box");
		aDriver.type(LoginPage.txtPassword, password, "Password text box");
		aDriver.click(LoginPage.btnLogin, "Login button");
	}
	
	public void logout() throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Logout of Application");
		aDriver.click(HomePage.lnkLogout, "Logout link");
	}

}
