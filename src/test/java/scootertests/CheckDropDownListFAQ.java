package scootertests;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.scooter.*;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;


public class CheckDropDownListFAQ extends BaseTest {


    @Test
    public void doCheckList0() {

        MainPage mainPage = new MainPage(driver);

        mainPage.scrollDown();

        mainPage.findSelectors();

        String expected = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";

        mainPage.clickDropListButton(0);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        assertEquals(expected, mainPage.getTextFromListButton(0));
        mainPage.scrollDown();
    }

    @Test
    public void doCheckList1() {

        MainPage mainPage = new MainPage(driver);

        mainPage.scrollDown();

        mainPage.findSelectors();

        String expected = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        mainPage.clickDropListButton(1);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        assertEquals(expected, mainPage.getTextFromListButton(1));
        mainPage.scrollDown();
    }

    @Test
    public void doCheckList2() {

        MainPage mainPage = new MainPage(driver);

        mainPage.scrollDown();

        mainPage.findSelectors();

        String expected = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        mainPage.clickDropListButton(2);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        assertEquals(expected, mainPage.getTextFromListButton(2));
        mainPage.scrollDown();
    }

    @Test
    public void doCheckList3() {

        MainPage mainPage = new MainPage(driver);

        mainPage.scrollDown();

        mainPage.findSelectors();

        String expected = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        mainPage.clickDropListButton(3);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        assertEquals(expected, mainPage.getTextFromListButton(3));
        mainPage.scrollDown();
    }

    @Test
    public void doCheckList4() {

        MainPage mainPage = new MainPage(driver);

        mainPage.scrollDown();

        mainPage.findSelectors();

        String expected = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        mainPage.clickDropListButton(4);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        assertEquals(expected, mainPage.getTextFromListButton(4));
        mainPage.scrollDown();
    }

    @Test
    public void doCheckList5() {

        MainPage mainPage = new MainPage(driver);

        mainPage.scrollDown();

        mainPage.findSelectors();

        String expected = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        mainPage.clickDropListButton(5);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        assertEquals(expected, mainPage.getTextFromListButton(5));
        mainPage.scrollDown();
    }

    @Test
    public void doCheckList6() {

        MainPage mainPage = new MainPage(driver);

        mainPage.scrollDown();

        mainPage.findSelectors();

        String expected = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        mainPage.clickDropListButton(6);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        assertEquals(expected, mainPage.getTextFromListButton(6));
        mainPage.scrollDown();
    }

    @Test
    public void doCheckList7() {

        MainPage mainPage = new MainPage(driver);

        mainPage.scrollDown();

        mainPage.findSelectors();

        String expected = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        mainPage.clickDropListButton(7);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        assertEquals(expected, mainPage.getTextFromListButton(7));
        mainPage.scrollDown();
    }

}
