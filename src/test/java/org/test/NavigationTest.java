package org.test;

import static com.codeborne.selenide.Selenide.back;
import static com.codeborne.selenide.Selenide.forward;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.WebDriverRunner;
import org.test.config.BaseUiTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigationTest extends BaseUiTest {

  @Test
  public void verifiesBackAndForwardNavigation() {
    open("/abtest");
    open("/checkboxes");

    back();
    Assert.assertTrue(WebDriverRunner.url().contains("/abtest"), "Back navigation did not return");

    forward();
    Assert.assertTrue(
        WebDriverRunner.url().contains("/checkboxes"), "Forward navigation did not work");
  }
}
