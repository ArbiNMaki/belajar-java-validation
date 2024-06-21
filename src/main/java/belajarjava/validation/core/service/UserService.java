package belajarjava.validation.core.service;

import belajarjava.validation.core.constraint.CheckPasswordParameter;
import jakarta.validation.constraints.NotBlank;

public class UserService {

    @CheckPasswordParameter(passwordParam = 1, retypePasswordParam = 2)
    public void register(
            @NotBlank(message = "Username can't blank!") String username,
            @NotBlank(message = "Password can't blank!") String password,
            @NotBlank(message = "Retype Password can't blank!") String retypePassword) {
        // Todo register
    }
}
