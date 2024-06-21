package belajarjava.validation.core.constraint;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Constraint(validatedBy = {CheckPasswordValidator.class})
@Target({ FIELD, ANNOTATION_TYPE, TYPE })
@Retention(RUNTIME)
public @interface CheckPassword {

    String message() default "Password must same with Retype Password.";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
