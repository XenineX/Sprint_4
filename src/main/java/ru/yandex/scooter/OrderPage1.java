package ru.yandex.scooter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class OrderPage1 {

    private final WebDriver driver;

    private By inputName = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/input");
    private By inputSurname = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/input");
    private By inputAdress = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/input");
    private By inputMetro = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/div/div/input");
    private By inputTelefon = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[5]/input");
    private By furtherButton = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/button");

    private By metroName1 = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/div/div[2]/ul/li[1]");

    private By metroName2 = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/div/div[2]/ul/li[2]");

    public OrderPage1(WebDriver driver) {
        this.driver = driver;
    }

    public void FillContactInfo(){
        driver.findElement(inputName).sendKeys("Билли");
        driver.findElement(inputSurname).sendKeys("Рубин");
        driver.findElement(inputAdress).sendKeys("Арбат 25");
        driver.findElement(By.xpath("//*[@id=\"rcc-confirm-button\"]")).click();
        driver.findElement(inputMetro).click();
        driver.findElement(metroName1).click();
        driver.findElement(inputTelefon).sendKeys("+79213456789");
        driver.findElement(furtherButton).click();
    }

    public void FillContactInfo2Varianto() {
        driver.findElement(inputName).sendKeys("Анна");
        driver.findElement(inputSurname).sendKeys("Каренина");
        driver.findElement(inputAdress).sendKeys("Вишневского 138");
        driver.findElement(By.xpath("//*[@id=\"rcc-confirm-button\"]")).click();
        driver.findElement(inputMetro).click();
        driver.findElement(metroName2).click();
        driver.findElement(inputTelefon).sendKeys("+79213457890");
        driver.findElement(furtherButton).click();
    }
}
