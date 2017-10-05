package com.browserstack.cucumber.pages;

import com.google.common.base.Function;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;
import static org.assertj.core.api.Assertions.assertThat;


@DefaultUrl("https://www.google.com/ncr")
public class GooglePage extends PageObject {

    @FindBy(name="q")
    WebElementFacade search;

    @FindBy(name="btnG")
    WebElementFacade searchButton;

    public void searchForString(String searchString) {
        search.sendKeys(searchString, Keys.ENTER);
    }

    public void submitForm() throws Exception {
        searchButton.click();
        Thread.sleep(5000);
    }

    public void titleShouldMatch(String matchTitle) {
        assertThat(this.getTitle()).containsIgnoringCase(matchTitle);
    }
}
