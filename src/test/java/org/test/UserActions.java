package org.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;


public class UserActions {
	@Test
	public void moveToElement() throws InterruptedException{
		
		open("https://www.spicejet.com");
		SelenideElement addOn=$(By.xpath("//div[starts-with(text(),'Add-ons')]"));
		
		actions().moveToElement(addOn).build().perform();
		
		SelenideElement visaServices=$(By.xpath("//div[text()='Visa Services']"));
		visaServices.click();
		
		Thread.sleep(3000);
		
	}
	
	@Test
	public void dragAndDrop() throws InterruptedException{
		
		open("https://jqueryui.com/resources/demos/droppable/default.html");
		SelenideElement sourceElement=$(By.id("draggable"));
		SelenideElement targetElement=$(By.id("droppable"));
		
		
//		actions()
//			.clickAndHold(sourceElement)
//				.moveToElement(targetElement)
//					.release()
//						.build()
//							.perform();
		
		actions().dragAndDrop(sourceElement, targetElement).build().perform();
		Thread.sleep(3000);
		
	}
	
	@Test
	public void rightclickTest() throws InterruptedException{
		
		open("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		SelenideElement rightElement =$(By.xpath("//span[.='right click me']"));
		actions().contextClick(rightElement).build().perform();
		
		
	}

}
