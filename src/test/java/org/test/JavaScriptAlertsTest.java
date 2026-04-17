package org.test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.switchTo;

import org.test.config.BaseUiTest;
import org.testng.annotations.Test;

public class JavaScriptAlertsTest extends BaseUiTest {

  @Test
  public void handlesSimpleJsAlert() {
    open("/javascript_alerts");

    $("button[onclick='jsAlert()']").click();
    switchTo().alert().accept();

    $("#result").shouldHave(text("You successfully clicked an alert"));
  }
}
