package ru.yandex.scooter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderSuccesfullyCreated {

    private final WebDriver driver;
    private By textOrderCreated = By.xpath("/html/body/div/div/div[2]/div[5]/div[1]");

    public OrderSuccesfullyCreated(WebDriver driver) {
        this.driver = driver;
    }
    public String checkTextOrderCreated(){
        return driver.findElement(textOrderCreated).getText();
    }

}
