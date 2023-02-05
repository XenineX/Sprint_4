package ru.yandex.scooter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WantToCreateOrder {
    private final WebDriver driver;
    private By yesButton = By.xpath(".//*[text()='Да']");

    public WantToCreateOrder(WebDriver driver) {

        this.driver = driver;
    }

    public void CreateOrder(){

        WebElement scroll = driver.findElement(yesButton);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", scroll);

        driver.findElement(yesButton).click();
    }

}
