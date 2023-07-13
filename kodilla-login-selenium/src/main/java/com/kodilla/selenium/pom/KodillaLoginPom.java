package com.kodilla.selenium.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KodillaLoginPom extends AbstractPom {

    @FindBy(css = "input[type='email']")
    WebElement emailField;

    @FindBy(css = "input[type='password']")
    WebElement passwordField;

    @FindBy(xpath = "//button[contains(text(), 'Log in')]")
    WebElement loginButton;

    public KodillaLoginPom(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public boolean login(String email, String password) {
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        loginButton.click();
        Alert alert = driver.switchTo().alert();
        String message = alert.getText();
        alert.dismiss();
        return message.equals("Jesteś teraz zalogowany!");
    }
}

    /*public static void main(String[] args) {
        //ustawianie sterownika
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        //nowy obiekt chromedriver
        WebDriver driver = new ChromeDriver(chromeOptions);
        //nawigacja do strony
        driver.navigate().to("https://kodilla.com/pl/test/login");
        //inicjalizacja obiektów na stronie
        PageFactory.initElements(driver, KodillaLoginPom.class);
        //podanie danych
        emailField.sendKeys("testuser@gmail.com");
        passwordField.sendKeys("Haslo");
        //zamknięcie przeglądarki
        driver.close();
    }*/
