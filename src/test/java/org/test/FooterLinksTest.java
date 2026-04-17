package org.test;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.ElementsCollection;
import org.test.config.BaseUiTest;
import org.testng.annotations.Test;

public class FooterLinksTest extends BaseUiTest {

  @Test
  public void validatesFooterLinks() {
    open("/");

    ElementsCollection footerLinks = $$("#page-footer a");
    footerLinks.shouldHave(size(1));
    footerLinks.first().shouldHave(text("Elemental Selenium"));
  }
}
