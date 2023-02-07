package scootertests;

import org.junit.Test;
import ru.yandex.scooter.*;
import org.hamcrest.MatcherAssert;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;


public class MakeNewOrderUsingLowerButton extends BaseTest {

    @Test
    public void positiveOrderScenarioLowerButton() {
        MainPage mainPage = new MainPage(driver);
        OrderPage1 orderPage1 = new OrderPage1(driver);
        OrderPage2 orderPage2 = new OrderPage2(driver);
        WantToCreateOrder wantToCreateOrder = new WantToCreateOrder(driver);
        OrderSuccesfullyCreated orderSuccesfullyCreated = new OrderSuccesfullyCreated(driver);

        mainPage.scrollDownOrderButton();

        mainPage.clickLowerOrderButton();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        orderPage1.fillContactInfo2Variant();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        orderPage2.fillRentInfo2Variant();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        wantToCreateOrder.createOrder();

        MatcherAssert.assertThat("Заказ оформлен", orderSuccesfullyCreated.checkTextOrderCreated().contains("Заказ оформлен"));
    }

}
