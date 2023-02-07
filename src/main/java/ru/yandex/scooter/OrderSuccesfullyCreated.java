package ru.yandex.scooter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderSuccesfullyCreated {

    private final WebDriver driver;
    private By textOrderCreated = By.className("Order_ModalHeader__3FDaJ");

    public OrderSuccesfullyCreated(WebDriver driver) {

        this.driver = driver;
    }
    public String checkTextOrderCreated(){

        return driver.findElement(textOrderCreated).getText();
    }

}
