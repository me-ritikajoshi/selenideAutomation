package org.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;




public class FindElementsConcept {
	@Test
	public void elementsTest() {
		open("https://selenide.org/documentation.html");
		ElementsCollection colls= $$(By.tagName("a"));
		System.out.println(colls.size());
		
		for(SelenideElement e : colls) {
			String text=e.getText();
			String href=e.getAttribute("href");
			System.out.println(text + "----" + href);
		}
		
	}

}
