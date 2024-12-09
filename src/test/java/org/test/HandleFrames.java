package org.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;


public class HandleFrames {

	@Test
	public void fromTest() throws InterruptedException{
		open("https://allwebco-templates.com/support/S_script_IFrame.htm");
		Thread.sleep(5000);
		
		switchTo().frame($(By.xpath("//iframe[@class='framesample framesample2']")));
		
		$(By.xpath("//img[@src='https://allwebco-templates.com/support/menu-icons/icon-search.png']")).click();
		
		$(By.xpath("(//input[@type='text'])[2]")).sendKeys("Hello");
		$(By.xpath("//input[@class='stbutton']")).click();
		
		switchTo().defaultContent();
		
		String text= $(By.xpath("//span[contains(.,'Sample website in an IFrame page')]")).getText();
		System.out.println(text);
		Assert.assertEquals(text, "Sample website in an IFrame page");
	}
}
