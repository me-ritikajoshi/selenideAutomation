package org.test;

import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;

public class closeBrowser {

	@Test
	public void closeBrowserTest() throws InterruptedException {
		
		open("https://opensource-demo.orangehrmlive.com/");   //Parent-0
		System.out.println(title());
		
		$(By.xpath("//a[@href='https://www.youtube.com/c/OrangeHRMInc']")).click(); //Child-1
		
//		switchTo().window(1);
//		System.out.println(title());
//		Thread.sleep(3000);
//		closeWindow();
//		
//		switchTo().window(0);
//		System.out.println(title());
		
		Thread.sleep(3000);

		closeWebDriver();
	
		

		
	}
	
}
