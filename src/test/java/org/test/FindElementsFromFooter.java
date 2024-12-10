package org.test;

import static com.codeborne.selenide.Selenide.*;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.codeborne.selenide.ElementsCollection;

public class FindElementsFromFooter {
	
	@Test
	public void footerTest() {
		open("https://www.freshworks.com/");
		ElementsCollection colls= $$(By.xpath("//footer//ul//li/a"));
		System.out.println(colls.size());
		
		colls.forEach(e -> System.out.println(e.getText()));
		colls.last(10).forEach(e -> System.out.println(e.getText()));
		List<String> footerTextList=colls.texts();
		footerTextList.forEach(e -> System.out.println(e));
		
	}

}
