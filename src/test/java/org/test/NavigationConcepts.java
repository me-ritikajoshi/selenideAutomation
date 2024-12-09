package org.test;

import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class NavigationConcepts {
	
	@Test
	public void navigateTest() throws InterruptedException {
		
		open("https://google.com");
		System.out.println(title());
		
		open("http://www.amazon.com");
		System.out.println(title());
		
		back();
		System.out.println(title());

		forward();
		System.out.println(title());

		back();
		System.out.println(title());
		
		Thread.sleep(5000);
		
		refresh();
		
		
		
	}

}
