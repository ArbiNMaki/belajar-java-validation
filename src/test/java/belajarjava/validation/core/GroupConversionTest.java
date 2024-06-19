package belajarjava.validation.core;

import belajarjava.validation.core.group.CreditCardPaymentGroup;
import org.junit.jupiter.api.Test;

public class GroupConversionTest extends AbstractValidatorTest {

    @Test
    void testGroupConvert() {
        Payment payment = new Payment();

        payment.setOrderId("001A");
        payment.setAmount(20_000L);
        payment.setCreditCard("4111111111111111");
        payment.setCustomer(new Customer());

        validateWithGroups(payment, CreditCardPaymentGroup.class);
    }
}
