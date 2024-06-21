package belajarjava.validation.core;

import belajarjava.validation.core.group.CreditCardPaymentGroup;
import org.junit.jupiter.api.Test;

public class CustomConstraintTest extends AbstractValidatorTest{

    @Test
    void testCustomConstraint() {
        Payment payment = new Payment();
        payment.setOrderId("id01");

        validateWithGroups(payment, CreditCardPaymentGroup.class);
    }

    @Test
    void testCustomConstraintSuccessUPPERCASE() {
        Payment payment = new Payment();
        payment.setOrderId("ID01");

        validateWithGroups(payment, CreditCardPaymentGroup.class);
    }
}
