package org.test;

import static com.codeborne.selenide.Selenide.open;

import org.test.config.BaseUiTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.codeborne.selenide.WebDriverRunner;

public class WebDriverRunnerTest extends BaseUiTest {

  @Test
  public void validatesWebDriverRunnerCapabilities() {
    open("/");

    Assert.assertTrue(WebDriverRunner.hasWebDriverStarted(), "WebDriver should be initialized");
    Assert.assertTrue(WebDriverRunner.url().contains("the-internet.herokuapp.com"));

    WebDriverRunner.getAndCheckWebDriver();
    Assert.assertTrue(WebDriverRunner.supportsJavascript(), "Browser should support JavaScript");

    Assert.assertTrue(
        WebDriverRunner.getBrowserDownloadsFolder().files().size() >= 0,
        "Downloads folder should be readable");
  }
}
