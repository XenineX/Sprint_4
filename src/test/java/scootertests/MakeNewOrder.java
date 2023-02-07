package scootertests;

import org.hamcrest.MatcherAssert;
import org.junit.Test;
import ru.yandex.scooter.*;

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

        mainPage.clickUpperOrderButton();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        orderPage1.fillContactInfo();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        orderPage2.fillRentInfo();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        wantToCreateOrder.createOrder();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        MatcherAssert.assertThat("Заказ оформлен", orderSuccesfullyCreated.checkTextOrderCreated().contains("Заказ оформлен"));

    }

}
