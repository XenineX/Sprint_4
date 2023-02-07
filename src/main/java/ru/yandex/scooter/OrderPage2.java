package ru.yandex.scooter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class OrderPage2 {
    private final WebDriver driver;

    By inputDateClick = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[1]/div/input");
    By inputDate = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div[7]");
    By inputDate2 = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[6]");
    By inputDaysOfRent = By.className("Dropdown-placeholder");
    By twoDaysOfRent = By.xpath("//div[text()='двое суток']");
    By fourDaysOfRent = By.xpath("//div[text()='четверо суток']");
    By blackColourOfScooter = By.xpath(".//input[@id='black']");
    By greyColourOfScooter = By.xpath(".//input[@id='grey']");
    By toOrderButton = By.xpath(".//div[@class='Order_Buttons__1xGrp']/button[text()='Заказать']");

    public OrderPage2(WebDriver driver) {

        this.driver = driver;
    }

    public void fillRentInfo(){

        driver.findElement(inputDateClick).click();
        driver.findElement(inputDate).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(inputDaysOfRent).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(twoDaysOfRent).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(blackColourOfScooter).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement scroll = driver.findElement(toOrderButton);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", scroll);

        driver.findElement(toOrderButton).click();
    }

    public void fillRentInfo2Variant(){
        driver.findElement(inputDateClick).click();
        driver.findElement(inputDate2).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(inputDaysOfRent).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(fourDaysOfRent).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(greyColourOfScooter).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement scroll = driver.findElement(toOrderButton);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", scroll);

        driver.findElement(toOrderButton).click();
    }

}
