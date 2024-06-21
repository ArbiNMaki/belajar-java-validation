package belajarjava.validation.core;

import org.junit.jupiter.api.Test;

public class ClassLevelValidationTest extends AbstractValidatorTest{

    @Test
    void testClassLevelError() {
        Register register = new Register();
        register.setUsername("Arbi");
        register.setPassword("Secret");
        register.setRetypePassword("rAHASIA");

        validate(register);
    }

    @Test
    void testClassLevelSuccess() {
        Register register = new Register();
        register.setUsername("Arbi");
        register.setPassword("Secret");
        register.setRetypePassword("Secret");

        validate(register);
    }
}
