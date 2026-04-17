package org.test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import org.test.config.BaseUiTest;
import org.testng.annotations.Test;

public class HomePageSmokeTest extends BaseUiTest {

  @Test
  public void validatesHomePageLoads() {
    open("/");

    $("h1.heading").shouldHave(text("Welcome to the-internet"));
    $("#content").shouldHave(text("Available Examples"));
  }
}
