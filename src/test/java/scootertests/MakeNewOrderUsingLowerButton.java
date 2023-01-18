package scootertests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.scooter.*;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class MakeNewOrderUsingLowerButton {

    private WebDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }

    @Test
    public void PositiveOrderScenarioLowerButton() {
        MainPage mainPage = new MainPage(driver);
        OrderPage1 orderPage1 = new OrderPage1(driver);
        OrderPage2 orderPage2 = new OrderPage2(driver);
        WantToCreateOrder wantToCreateOrder = new WantToCreateOrder(driver);
        OrderSuccesfullyCreated orderSuccesfullyCreated = new OrderSuccesfullyCreated(driver);

        mainPage.ScrollDownOrderButton();

        mainPage.clickLowerOrderButton();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        orderPage1.FillContactInfo2Varianto();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        orderPage2.FillRentInfo2Variant();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        wantToCreateOrder.CreateOrder();

        assertEquals("Заказ оформлен", orderSuccesfullyCreated.checkTextOrderCreated());
    }

    @After
    public void tearDown(){

        driver.quit();
    }

}
