package com.browserstack.cucumber.pages;

import com.google.common.base.Function;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;
import static org.assertj.core.api.Assertions.assertThat;


@DefaultUrl("http://bs-local.com:45691/check")
public class LocalPage extends PageObject {
    private WebDriver driverInstance;

    public LocalPage(WebDriver driver){
        super(driver);
        driverInstance = driver;
    }

    public void bodyShouldMatch(String matchTitle) {
        assertThat(driverInstance.getPageSource()).containsIgnoringCase(matchTitle);
    }  
}
