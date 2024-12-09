package org.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
public class LaunchBrowsers {
@Test
public void launchBrowserTest() {
	Configuration.browser="chrome";
	Configuration.headless=true;   //chrome doesnot open but tests run
	Configuration.baseUrl="https://www.google.com";
	Configuration.screenshots=true;
//	Configuration.browserBinary="";  //geko driver path 


//	System.setProperty("selenide.browser", "edge");
	
	open("/search?q=youtube");
	$(By.name("q")).setValue("youtube");
	$(By.name("btnK")).click();
	$(By.id("logo")).shouldHave(Condition.appear);
	String header= $(By.xpath("//h3[text()='YouTube']")).getText();
	System.out.println(header);
//	Assert.assertEquals(header, "YouTub");	//for ss -> ss is taken when error and path for ss is given in console
	Assert.assertEquals(header, "YouTube");	

}
}


