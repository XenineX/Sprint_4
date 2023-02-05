package scootertests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.hamcrest.MatcherAssert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.scooter.*;
import org.hamcrest.MatcherAssert;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;

public class MakeNewOrder extends BaseTest {

        @Test
        public void PositiveOrderScenarioUpperButton(){
        MainPage mainPage = new MainPage(driver);
        OrderPage1 orderPage1 = new OrderPage1(driver);
        OrderPage2 orderPage2 = new OrderPage2(driver);
        WantToCreateOrder wantToCreateOrder = new WantToCreateOrder(driver);
        OrderSuccesfullyCreated orderSuccesfullyCreated = new OrderSuccesfullyCreated(driver);

        mainPage.ClickUpperOrderButton();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        orderPage1.FillContactInfo();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        orderPage2.FillRentInfo();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        wantToCreateOrder.CreateOrder();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        MatcherAssert.assertThat("Заказ оформлен", orderSuccesfullyCreated.checkTextOrderCreated().contains("Заказ оформлен"));

    }

}
