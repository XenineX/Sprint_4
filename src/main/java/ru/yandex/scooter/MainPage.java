package ru.yandex.scooter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class MainPage {
    private final WebDriver driver;
    private ArrayList<By> buttonSelectors;
    private ArrayList<By> buttonAnswerSelectors;
    private By lastButtonSelector = By.id("accordion__heading-7");
    private By upperOrderButton = By.xpath(".//div[@class='Header_Nav__AGCXC']/button[@class='Button_Button__ra12g']");
    private By lowerOrderButton = By.className("Button_Middle__1CSJM");

    public MainPage(WebDriver driver){
        this.driver = driver;
    }

    public void findSelectors(){
        buttonSelectors = new ArrayList<By>();
        buttonAnswerSelectors = new ArrayList<By>();
        for(int i = 0; i <8; ++i){
            buttonSelectors.add(By.id(String.format("accordion__heading-%d", i)));
            buttonAnswerSelectors.add(By.id(String.format("accordion__panel-%d", i)));
        }
    }

    public void scrollDown(){
        WebElement lastButton = driver.findElement(lastButtonSelector);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", lastButton);
    }

    public void clickDropListButton(int i){
        driver.findElement(buttonSelectors.get(i)).click();
    }

    public String getTextFromListButton(int i){
        return driver.findElement(buttonAnswerSelectors.get(i)).getText();
    }

    public void clickUpperOrderButton(){

        driver.findElement(upperOrderButton).click();
    }

    public void scrollDownOrderButton(){
        WebElement lowerButton = driver.findElement(lowerOrderButton);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", lowerButton);
    }

    public void clickLowerOrderButton(){

        driver.findElement(lowerOrderButton).click();
    }

}
