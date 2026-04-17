package org.test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import org.test.config.BaseUiTest;
import org.testng.annotations.Test;

public class WaitConceptsTest extends BaseUiTest {

  @Test
  public void waitsForDynamicContentWithoutSleep() {
    open("/dynamic_loading/2");

    $("#start button").click();
    $("#loading").shouldBe(visible);
    $("#finish").shouldHave(text("Hello World!"));
  }
}
