package belajarjava.validation.core;

import belajarjava.validation.core.group.PaymentGroup;
import org.junit.jupiter.api.Test;

public class GroupSequenceTest extends AbstractValidatorTest {

    @Test
    void testGroupSequence() {
        Payment payment = new Payment();
        payment.setOrderId("0001A");
        payment.setAmount(20_000L);
        payment.setCreditCard("4111111111111111");

        validateWithGroups(payment, PaymentGroup.class);
    }
}
