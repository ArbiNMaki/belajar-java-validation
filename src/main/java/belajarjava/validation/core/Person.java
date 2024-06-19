package belajarjava.validation.core;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Person {

    @NotBlank(message = "First name can't blank!")
    @Size(max = 20, message = "First name length max must 20 characters.")
    private String firstName;

    @NotBlank(message = "Last name can't blank!")
    @Size(max = 20, message = "Last name length max must 20 characters.")
    private String lastName;

    @NotNull(message = "Address Can't Null!")
    @Valid
    private Address address;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
