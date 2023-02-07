package ru.yandex.scooter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage1 {

    private final WebDriver driver;

    private By inputName = By.xpath(".//div[@class='Order_Content__bmtHS']//input[1]");
    private By inputSurname = By.xpath(".//input[@placeholder='* Фамилия']");
    private By inputAdress = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    private By inputMetro = By.xpath(".//input[@placeholder='* Станция метро']");
    private By inputTelefon = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    private By furtherButton = By.cssSelector(".Button_Button__ra12g.Button_Middle__1CSJM");
    private By metroName1 = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/div/div[2]/ul/li[1]");
    private By metroName2 = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/div/div[2]/ul/li[2]");

    public OrderPage1(WebDriver driver) {

        this.driver = driver;
    }

    public void fillContactInfo(){
        driver.findElement(inputName).sendKeys("Билли");
        driver.findElement(inputSurname).sendKeys("Рубин");
        driver.findElement(inputAdress).sendKeys("Арбат 25");
        driver.findElement(By.xpath("//*[@id=\"rcc-confirm-button\"]")).click();
        driver.findElement(inputMetro).click();
        driver.findElement(metroName1).click();
        driver.findElement(inputTelefon).sendKeys("+79213456789");
        driver.findElement(furtherButton).click();
    }

    public void fillContactInfo2Variant() {
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
