package belajarjava.validation.core;

import belajarjava.validation.core.group.CreditCardPaymentGroup;
import org.junit.jupiter.api.Test;

public class ConstraintCompositionTest extends AbstractValidatorTest{

    @Test
    void testComposition() {
        Payment payment = new Payment();
        payment.setOrderId("2392928440292020amsnsicnss");

        validateWithGroups(payment, CreditCardPaymentGroup.class);
    }
}
