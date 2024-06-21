package belajarjava.validation.core.constraint;

import belajarjava.validation.core.enums.CaseMode;
import belajarjava.validation.core.group.CreditCardPaymentGroup;
import belajarjava.validation.core.group.VirtualAccountPaymentGroup;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.ReportAsSingleViolation;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@CheckCase(groups = {CreditCardPaymentGroup.class, VirtualAccountPaymentGroup.class},
        mode = CaseMode.UPPER, message = "{order.id.upper}")
@NotBlank(message = "{order.id.notblank}",
        groups = {CreditCardPaymentGroup.class, VirtualAccountPaymentGroup.class})
@Size(groups = {CreditCardPaymentGroup.class, VirtualAccountPaymentGroup.class},
        min = 1, max = 10, message = "{order.id.size}")
@Documented
@Constraint(validatedBy = {})
@Target({ FIELD })
@Retention(RUNTIME)
@ReportAsSingleViolation
public @interface CheckOrderId {

    String message() default "Invalid OrderID.";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
