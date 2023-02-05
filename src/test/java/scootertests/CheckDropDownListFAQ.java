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
    public void DoCheckList0() {

        MainPage mainPage = new MainPage(driver);

        mainPage.ScrollDown();

        String expected = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";

        mainPage.ClickDropListButton(0);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        assertEquals(expected, mainPage.GetTextFromListButton(0));
        mainPage.ScrollDown();
    }

    @Test
    public void DoCheckList1() {

        MainPage mainPage = new MainPage(driver);

        mainPage.ScrollDown();

        String expected = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        mainPage.ClickDropListButton(1);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        assertEquals(expected, mainPage.GetTextFromListButton(1));
        mainPage.ScrollDown();
    }

    @Test
    public void DoCheckList2() {

        MainPage mainPage = new MainPage(driver);

        mainPage.ScrollDown();

        String expected = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        mainPage.ClickDropListButton(2);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        assertEquals(expected, mainPage.GetTextFromListButton(2));
        mainPage.ScrollDown();
    }

    @Test
    public void DoCheckList3() {

        MainPage mainPage = new MainPage(driver);

        mainPage.ScrollDown();

        String expected = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        mainPage.ClickDropListButton(3);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        assertEquals(expected, mainPage.GetTextFromListButton(3));
        mainPage.ScrollDown();
    }

    @Test
    public void DoCheckList4() {

        MainPage mainPage = new MainPage(driver);

        mainPage.ScrollDown();

        String expected = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        mainPage.ClickDropListButton(4);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        assertEquals(expected, mainPage.GetTextFromListButton(4));
        mainPage.ScrollDown();
    }

    @Test
    public void DoCheckList5() {

        MainPage mainPage = new MainPage(driver);

        mainPage.ScrollDown();

        String expected = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        mainPage.ClickDropListButton(5);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        assertEquals(expected, mainPage.GetTextFromListButton(5));
        mainPage.ScrollDown();
    }

    @Test
    public void DoCheckList6() {

        MainPage mainPage = new MainPage(driver);

        mainPage.ScrollDown();

        String expected = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        mainPage.ClickDropListButton(6);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        assertEquals(expected, mainPage.GetTextFromListButton(6));
        mainPage.ScrollDown();
    }

    @Test
    public void DoCheckList7() {

        MainPage mainPage = new MainPage(driver);

        mainPage.ScrollDown();

        String expected = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        mainPage.ClickDropListButton(7);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        assertEquals(expected, mainPage.GetTextFromListButton(7));
        mainPage.ScrollDown();
    }

}
