package org.test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.switchTo;

import org.openqa.selenium.Alert;
import org.test.config.BaseUiTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserActionsTest extends BaseUiTest {

  @Test
  public void hoverDisplaysUserCaption() {
    open("/hovers");

    $$(".figure").first().hover();
    $$(".figcaption").first().shouldBe(visible).shouldHave(text("name: user1"));
  }

  @Test
  public void rightClickShowsContextAlert() {
    open("/context_menu");

    $("#hot-spot").contextClick();

    Alert alert = switchTo().alert();
    Assert.assertEquals(alert.getText(), "You selected a context menu");
    alert.accept();
  }
}
