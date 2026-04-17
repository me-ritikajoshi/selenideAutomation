package org.test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.switchTo;

import org.test.config.BaseUiTest;
import org.testng.annotations.Test;

public class FrameHandlingTest extends BaseUiTest {

  @Test
  public void readsContentInsideIFrame() {
    open("/iframe");

    switchTo().frame("mce_0_ifr");
    $("#tinymce").shouldBe(visible).shouldHave(text("Your content goes here."));

    switchTo().defaultContent();
    $(".example h3").shouldHave(text("An iFrame containing"));
  }
}
