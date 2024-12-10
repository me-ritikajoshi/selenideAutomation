package org.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;




public class FindElementsConcept {
	@Test
	public void elementsTest() {
		
		//To find all the links using a tag
		open("https://selenide.org/documentation.html");
		ElementsCollection colls= $$(By.tagName("a"));
		System.out.println(colls.size());
		
		//SelenideElement is used instead of WebElement
		// getText()-> to get text and getAttribute()-> gives any specified attribute
//		for(SelenideElement e : colls) {
//			String text=e.getText();
//			String href=e.getAttribute("href");
//			System.out.println(text + "----" + href);
//		}
		
		// CollectionCondition->similar to assertion with condion i.e. shouldHave and size can be less than or mor than or anyvalue
		colls.shouldHave(CollectionCondition.sizeLessThan(100));
		
		//used foreach loop to pass lambda where e gives all the text from the colls
//		colls.forEach(e -> System.out.println(e.getText()));

		//strem returns stream of elements and filter can be applied. Here we have removes empty texts
		colls.stream().filter(e -> !e.getText().isEmpty()).forEach(e -> System.out.println(e.getText()));
		
		//colls.last(value) gives all the last elements
		colls.last(10).forEach(e -> System.out.println(e.getText()));
		
		
		
	}
}
