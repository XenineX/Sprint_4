package ru.yandex.scooter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WantToCreateOrder {
    private final WebDriver driver;
    private By yesButton = By.xpath("//*[@id=\"root\"]/div/div[2]/div[5]/div[2]/button[2]");

    public WantToCreateOrder(WebDriver driver) {
        this.driver = driver;
    }
    public void CreateOrder(){
        driver.findElement(yesButton).click();
    }

}
