package org.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;




public class FindElementsConcept {
	@Test
	public void elementsTest() {
		open("https://www.amazon.com/");
		ElementsCollection colls= $$(By.tagName("a"));
		System.out.println(colls.size());
		
	}

}
