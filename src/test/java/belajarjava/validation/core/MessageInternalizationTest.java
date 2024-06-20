package belajarjava.validation.core;

import belajarjava.validation.core.group.CreditCardPaymentGroup;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.MessageInterpolator;
import org.hibernate.validator.internal.engine.MessageInterpolatorContext;
import org.hibernate.validator.messageinterpolation.ExpressionLanguageFeatureLevel;
import org.junit.jupiter.api.Test;

import java.util.Locale;
import java.util.Set;

public class MessageInternalizationTest extends AbstractValidatorTest{

    @Test
    void testI18N() {
        Locale.setDefault(Locale.of("in", "ID"));

        Payment payment = new Payment();
        payment.setOrderId("10011110011001A");
        payment.setAmount(50L);

        validateWithGroups(payment, CreditCardPaymentGroup.class);
    }

    @Test
    void testMessageInterpolator() {
        Payment payment = new Payment();
        payment.setOrderId("10011110011001A");
        payment.setAmount(50L);

        MessageInterpolator messageInterpolator = validatorFactory.getMessageInterpolator();

        Set<ConstraintViolation<Object>> violations = validator.validate(payment, CreditCardPaymentGroup.class);
        for (ConstraintViolation<Object> violation : violations) {
            System.out.println(violation.getMessageTemplate());

            MessageInterpolator.Context context = new MessageInterpolatorContext(
                    violation.getConstraintDescriptor(), violation.getInvalidValue(), violation.getRootBeanClass(),
                    violation.getPropertyPath(), violation.getConstraintDescriptor().getAttributes(),
                    violation.getConstraintDescriptor().getAttributes(),
                    ExpressionLanguageFeatureLevel.VARIABLES, true
            );

            System.out.println(messageInterpolator.interpolate(
                    violation.getMessageTemplate(), context, Locale.of("in", "ID")
            ));
        }
    }
}
