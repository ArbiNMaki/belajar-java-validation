package belajarjava.validation.core;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ContainerDataTest extends AbstractValidatorTest {

    @Test
    void testContainerData() {
        Person person = new Person();

        person.setFirstName("Arbi");
        person.setLastName("Kalista");
        person.setAddress(new Address());
        person.getAddress().setCity("Malang");
        person.getAddress().setCountry("Indonesia");
        person.getAddress().setStreet("Peltu Sujono");

        person.setHobbies(new ArrayList<>());
        person.getHobbies().add("");
        person.getHobbies().add("  ");
        person.getHobbies().add("Gaming");

        validate(person);
    }
}
