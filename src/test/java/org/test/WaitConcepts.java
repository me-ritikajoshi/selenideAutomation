package org.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

import java.time.Duration;


public class WaitConcepts {
	
	@Test
	public void waitTest() {
		
		Configuration.timeout=5000;
		open("https://api.cogmento.com/register/");
		
		$(By.xpath("//a[contains(.,'Log in here')]")).click();
		
		SelenideElement email= $(By.name("email"));
		email.should(Condition.visible,Duration.ofSeconds(10)).sendKeys("riti");	
		
		actions().moveToElement($(By.linkText("Sign Up"))).click().build().perform();
		
		SelenideElement checkBox=$(By.name("terms"));
		checkBox.click();
		checkBox.should(Condition.checked, Duration.ofSeconds(10));
//		checkBox.shouldBe(Condition.checked);
//		checkBox.shouldNotBe(Condition.checked);
		
		
		
	}

}
