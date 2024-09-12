package com.TestNGDemos;

import org.testng.Assert;
import org.testng.annotations.Test;

public class D09Dependency {
	@Test
	public void login() {
		System.out.println("This is login test");
		Assert.assertTrue(false);
	}

//This method is depending upon successful execution of login method
	@Test(dependsOnMethods = "login")
	public void logout() {
		System.out.println("This is logout test");
	}

}
