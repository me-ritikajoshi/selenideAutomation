package org.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Selenide.*;


public class JsAlertPopUpHandle  {
	
	@Test
	public void alterTest() throws InterruptedException{
		
		open("https://mail.rediff.com/cgi-bin/login.cgi");
		
		$(By.xpath("//input[@class='signinbtn']")).click();
		Thread.sleep(5000);
		
//		WebDriverRunner.getWebDriver().switchTo().alert();
		
		Alert alert= switchTo().alert();
		String text= alert.getText();
		
		Assert.assertEquals(text, "Please enter a valid user name");
		
		alert.accept();  //yes or ok
//		alert.dismiss();  //decline or no
		
//		alert.sendKeys("onetwo");
//		alert.dismiss();
	}

}
