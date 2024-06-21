package belajarjava.validation.core.constraint;

import belajarjava.validation.core.enums.CaseMode;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.constraints.NotBlank;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Constraint(validatedBy = {CheckCaseValidator.class})
@Target({ FIELD })
@Retention(RUNTIME)
public @interface CheckCase {

    CaseMode mode();

    String message() default "Invalid case format.";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
