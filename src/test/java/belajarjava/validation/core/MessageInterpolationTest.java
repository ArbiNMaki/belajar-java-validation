package belajarjava.validation.core;

import belajarjava.validation.core.group.VirtualAccountPaymentGroup;
import org.junit.jupiter.api.Test;

public class MessageInterpolationTest extends AbstractValidatorTest {

    @Test
    void testMessage() {
        Payment payment = new Payment();
        payment.setOrderId("001000100001A");
        payment.setVirtualAccount("414141");
        payment.setAmount(10L);

        validateWithGroups(payment, VirtualAccountPaymentGroup.class);
    }
}
