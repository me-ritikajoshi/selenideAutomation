package org.test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import org.test.config.BaseUiTest;
import org.testng.annotations.Test;

public class AuthPopupTest extends BaseUiTest {

  @Test
  public void validatesFormAuthenticationSuccess() {
    open("/login");

    $("#username").setValue("tomsmith");
    $("#password").setValue("SuperSecretPassword!");
    $("button.radius").click();

    $("#flash").shouldHave(text("You logged into a secure area!"));
  }
}
