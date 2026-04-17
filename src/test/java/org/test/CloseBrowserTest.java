package org.test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.closeWindow;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.switchTo;

import org.test.config.BaseUiTest;
import org.testng.annotations.Test;

public class CloseBrowserTest extends BaseUiTest {

  @Test
  public void closesChildWindowAndReturnsToParent() {
    open("/windows");

    $("a[href='/windows/new']").click();

    switchTo().window(1);
    $("h3").shouldHave(text("New Window"));
    closeWindow();

    switchTo().window(0);
    $("h3").shouldHave(text("Opening a new window"));
  }
}
