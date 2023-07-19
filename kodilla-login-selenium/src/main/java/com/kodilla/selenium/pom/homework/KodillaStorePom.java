package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


public class KodillaStorePom extends AbstractPom {
    @FindBy(xpath = "//*[@id=\"searchField\"]")
    WebElement searchInput;
    public KodillaStorePom(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public List<WebElement> search (String search) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("span.close-icon"))).click();
        searchInput.sendKeys(search);
        List<WebElement> result = driver.findElements(By.className("element"));
        return result;
    }
}
