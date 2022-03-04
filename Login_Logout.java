package com.mohs.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.gcr.config.StartBrowser;
import com.gcr.wdcmds.ActionDriver;
import com.mohs.or.HomePage;
import com.mohs.reuse.CommonFunctions;

public class Login_Logout extends StartBrowser{
	@Test
	public void Login_LogoutTestCase() throws Exception {
		CommonFunctions cfs = new CommonFunctions();
		ActionDriver ad =  new ActionDriver();
		cfs.login("testingautomation40@gmail.com","Test@111");
		//verify logged in successfully
		boolean status=ad.isElementPresent(HomePage.lnkLogout, "LogoutLink");
		Assert.assertTrue(status);
		cfs.logout();
		boolean status1=ad.isElementPresent(HomePage.lnkLogin, "LogoutLink");
		Assert.assertTrue(status1);
	}
}
