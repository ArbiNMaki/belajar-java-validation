package belajarjava.validation.core;

import belajarjava.validation.core.service.UserService;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.executable.ExecutableValidator;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.util.Set;

public class CrossParameterConstraintTest extends AbstractValidatorTest{

    @Test
    void testCrossParameterError() throws NoSuchMethodException {
        UserService userService = new UserService();
        Class<? extends UserService> userServiceClass = userService.getClass();
        Method register = userServiceClass.getMethod("register", String.class, String.class, String.class);

        ExecutableValidator executableValidator = validator.forExecutables();
        Set<ConstraintViolation<Object>> violations = executableValidator
                .validateParameters(userService, register, new Object[]{
                        "username", "password", "passwordLagi"
                });

        for (ConstraintViolation<Object> violation : violations) {
            System.out.println(violation.getPropertyPath());
            System.out.println(violation.getMessage());
            System.out.println("===================");
        }
    }

    @Test
    void testCrossParameterSuccess() throws NoSuchMethodException {
        UserService userService = new UserService();
        Class<? extends UserService> userServiceClass = userService.getClass();
        Method register = userServiceClass.getMethod("register", String.class, String.class, String.class);

        ExecutableValidator executableValidator = validator.forExecutables();
        Set<ConstraintViolation<Object>> violations = executableValidator
                .validateParameters(userService, register, new Object[]{
                        "username", "password", "password"
                });

        for (ConstraintViolation<Object> violation : violations) {
            System.out.println(violation.getPropertyPath());
            System.out.println(violation.getMessage());
            System.out.println("===================");
        }
    }
}
