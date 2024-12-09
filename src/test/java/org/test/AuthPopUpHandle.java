package org.test;

import static com.codeborne.selenide.Selenide.*;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.codeborne.selenide.Configuration;

public class AuthPopUpHandle {
	
	@Test
	public void authPopTest() throws InterruptedException, MalformedURLException  {
		
//		open("https://the-internet.herokuapp.com/basic_auth");
		
//		open("https://the-internet.herokuapp.com/basic_auth","","admin","admin");
		
		System.setProperty("selenide.browser", "edge");
		
		open(new URL("https://the-internet.herokuapp.com/basic_auth"), "", "admin", "admin");
		
		Thread.sleep(5000);
		String text= $(By.cssSelector("div.example")).getText();
		Assert.assertTrue(text.contains("Congratulations"));
		
	}

}
