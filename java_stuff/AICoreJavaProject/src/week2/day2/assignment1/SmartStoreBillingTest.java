package week2.day2.assignment1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SmartStoreBillingTest {

	@Test
    void shouldReturnNoDiscountForAmountBelow1000() {
        double totalAmount = 800.0;
        double expectedDiscount = 0.0;

        double actualDiscount =
                SmartStoreBilling.calculateDiscount(totalAmount);

        assertEquals(expectedDiscount, actualDiscount, 0.001);
    }

    @Test
    void shouldApplyFivePercentDiscountForAmountExactly1000() {
        double totalAmount = 1000.0;
        double expectedDiscount = 50.0;

        double actualDiscount =
                SmartStoreBilling.calculateDiscount(totalAmount);

        assertEquals(expectedDiscount, actualDiscount, 0.001);
    }

    @Test
    void shouldApplyFivePercentDiscountForAmount4999() {
        double totalAmount = 4999.0;
        double expectedDiscount = 249.95;

        double actualDiscount =
                SmartStoreBilling.calculateDiscount(totalAmount);

        assertEquals(expectedDiscount, actualDiscount, 0.001);
    }

    @Test
    void shouldApplyTenPercentDiscountForAmountExactly5000() {
        double totalAmount = 5000.0;
        double expectedDiscount = 500.0;

        double actualDiscount =
                SmartStoreBilling.calculateDiscount(totalAmount);

        assertEquals(expectedDiscount, actualDiscount, 0.001);
    }

    @Test
    void shouldApplyTenPercentDiscountForAmountAbove5000() {
        double totalAmount = 7000.0;
        double expectedDiscount = 700.0;

        double actualDiscount =
                SmartStoreBilling.calculateDiscount(totalAmount);

        assertEquals(expectedDiscount, actualDiscount, 0.001);
    }

}
