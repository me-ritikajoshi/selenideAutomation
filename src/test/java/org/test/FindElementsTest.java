package org.test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.ElementsCollection;
import java.util.List;
import org.test.config.BaseUiTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FindElementsTest extends BaseUiTest {

  @Test
  public void findsHomepageLinks() {
    open("/");

    ElementsCollection links = $$("ul li a");
    links.shouldHave(sizeGreaterThan(40));

    List<String> linkTexts = links.texts().stream().filter(text -> !text.isBlank()).toList();
    Assert.assertTrue(linkTexts.contains("A/B Testing"), "Expected a known homepage link");
  }
}
