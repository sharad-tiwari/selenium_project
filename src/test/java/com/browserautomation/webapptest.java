package com.browserautomation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class webapptest {

	@Test
	public <App> void testlogin1() {
		webapp myapp = new webapp();
		Assert.assertEquals(0, myapp.userLogin("abc", "abc123"));
	}

	@Test
	public <App> void testloin2() {
		webapp myapp = new webapp();
		Assert.assertEquals(1, myapp.userLogin("abc", "abc@123"));
	}
}
