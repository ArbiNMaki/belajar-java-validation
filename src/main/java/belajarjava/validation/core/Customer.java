package belajarjava.validation.core;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class Customer {

    @NotBlank(message = "Email must not blank!")
    @Email(message = "Email must valid format!")
    private String email;

    @NotBlank(message = "Name must not blank!")
    private String name;

    public @NotBlank(message = "Email must not blank!") @Email(message = "Email must valid format!") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "Email must not blank!") @Email(message = "Email must valid format!") String email) {
        this.email = email;
    }

    public @NotBlank(message = "Name must not blank!") String getName() {
        return name;
    }

    public void setName(@NotBlank(message = "Name must not blank!") String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
