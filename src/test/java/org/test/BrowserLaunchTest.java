package org.test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.WebDriverRunner;
import org.test.config.BaseUiTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrowserLaunchTest extends BaseUiTest {

  @Test
  public void launchesConfiguredBrowser() {
    open("/");

    $("h1.heading").shouldBe(visible);
    Assert.assertTrue(
        WebDriverRunner.url().contains("the-internet.herokuapp.com"),
        "Unexpected URL after launch");
    Assert.assertFalse(
        WebDriverRunner.getWebDriver().getWindowHandles().isEmpty(),
        "Browser session should contain at least one open window");
  }
}
