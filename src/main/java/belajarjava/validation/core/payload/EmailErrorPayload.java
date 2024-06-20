package belajarjava.validation.core.payload;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Payload;

public class EmailErrorPayload implements Payload {

    public void sendEmail(ConstraintViolation<?> constraintViolation) {
        System.out.println("Send email error, because : " + constraintViolation.getMessage());
    }
}
