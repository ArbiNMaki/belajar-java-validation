package belajarjava.validation.core;

import org.junit.jupiter.api.Test;

public class HibernateValidatorConstraintTest extends AbstractValidatorTest {

    @Test
    void testHibernateValidatorConstraintInvalid() {
        Payment payment = new Payment();

        payment.setAmount(1000L);
        payment.setOrderId("0001");
        payment.setCreditCard("4231");

        validate(payment);
    }

    @Test
    void testHibernateValidatorConstraintValid() {
        Payment payment = new Payment();

        payment.setAmount(100_000L);
        payment.setOrderId("0002");
        payment.setCreditCard("5431111111111111");

        validate(payment);
    }
}
