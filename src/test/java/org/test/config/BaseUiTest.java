package org.test.config;

import static com.codeborne.selenide.Selenide.closeWebDriver;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

public abstract class BaseUiTest {

  @BeforeSuite(alwaysRun = true)
  public void configureSelenide() {
    Configuration.baseUrl = System.getProperty("baseUrl", "https://the-internet.herokuapp.com");
    Configuration.browser = System.getProperty("browser", "chrome");
    Configuration.headless = Boolean.parseBoolean(System.getProperty("headless", "true"));
    Configuration.browserSize = System.getProperty("browserSize", "1920x1080");
    Configuration.timeout = Long.parseLong(System.getProperty("timeoutMs", "10000"));
    Configuration.pageLoadStrategy = System.getProperty("pageLoadStrategy", "eager");
    Configuration.reportsFolder = System.getProperty("reportsFolder", "build/reports/tests");
    Configuration.savePageSource = true;
    Configuration.reopenBrowserOnFail = false;
  }

  @AfterMethod(alwaysRun = true)
  public void closeDriver() {
    closeWebDriver();
  }
}
