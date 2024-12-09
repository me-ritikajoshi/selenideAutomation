package org.test;

import static com.codeborne.selenide.Selenide.*;

import java.io.File;
import java.time.Duration;
import java.util.List;

import static com.codeborne.selenide.Condition.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.codeborne.selenide.WebDriverRunner;

public class WebDriverRunnerTest {
	@Test
	public void mtTest() {
		
		open("https://opensource-demo.orangehrmlive.com/");   //Parent-0

		WebDriverRunner.clearBrowserCache();
		System.out.println(WebDriverRunner.url());
//		if(WebDriverRunner.url().contains("orangehrmlive")) {
//			System.out.println("PASS");
//		}else {
//			System.out.println("FAIL");
//		}
		
		Assert.assertTrue(WebDriverRunner.url().contains("orangehrmlive"));
		
//		System.out.println(WebDriverRunner.source());
		
		WebDriverRunner.getWebDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		System.out.println(WebDriverRunner.isChrome());
		if(WebDriverRunner.isChrome()) {
			System.out.println("Click on button");
		}
		
		WebDriverRunner.getAndCheckWebDriver();
		System.out.println(WebDriverRunner.supportsJavascript());
		
		List<File> fileList=WebDriverRunner.getBrowserDownloadsFolder().files();
		System.out.println(fileList.size());
	
		WebDriverRunner.closeWebDriver();
		
		
		
	}

}
