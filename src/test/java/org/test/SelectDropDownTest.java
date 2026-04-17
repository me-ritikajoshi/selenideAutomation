package org.test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import org.test.config.BaseUiTest;
import org.testng.annotations.Test;

public class SelectDropDownTest extends BaseUiTest {

  @Test
  public void dropdownSelectionShouldWork() {
    open("/dropdown");

    $("#dropdown").selectOption("Option 1");
    $("#dropdown option:checked").shouldHave(text("Option 1"));

    $("#dropdown").selectOptionByValue("2");
    $("#dropdown option:checked").shouldHave(text("Option 2"));
  }
}
