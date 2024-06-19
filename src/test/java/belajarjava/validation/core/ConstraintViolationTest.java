package belajarjava.validation.core;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

public class ConstraintViolationTest {

    private ValidatorFactory validatorFactory;
    private Validator validator;

    @BeforeEach
    void setUp() {
        validatorFactory = Validation.buildDefaultValidatorFactory();
        validator = validatorFactory.getValidator();
    }

    @AfterEach
    void tearDown() {
        validatorFactory.close();
    }

    @Test
    void testValidationFailedNotBlank() {
        Person person = new Person();

        Set<ConstraintViolation<Object>> violations = validator.validate(person);
        Assertions.assertEquals(2, violations.size());

        for (ConstraintViolation<Object> violation : violations) {
            System.out.println("Message : " + violation.getMessage());
            System.out.println("Bean : " + violation.getLeafBean());
            System.out.println("Constraint : " + violation.getConstraintDescriptor().getAnnotation());
            System.out.println("Invalid Value : " + violation.getInvalidValue());
            System.out.println("Path : " + violation.getPropertyPath());
        }
    }

    @Test
    void testValidationFailedSize() {
        Person person = new Person();
        person.setFirstName("ArbiArbiArbiArbiArbiArbi");
        person.setLastName("Dwi Wijaya Dwi Wijaya Dwi Wijaya");

        Set<ConstraintViolation<Object>> violations = validator.validate(person);
        Assertions.assertEquals(2, violations.size());

        for (ConstraintViolation<Object> violation : violations) {
            System.out.println("Message : " + violation.getMessage());
            System.out.println("Bean : " + violation.getLeafBean());
            System.out.println("Constraint : " + violation.getConstraintDescriptor().getAnnotation());
            System.out.println("Invalid Value : " + violation.getInvalidValue());
            System.out.println("Path : " + violation.getPropertyPath());
        }
    }
}
