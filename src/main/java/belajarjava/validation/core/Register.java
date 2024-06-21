package belajarjava.validation.core;

import belajarjava.validation.core.constraint.CheckPassword;
import jakarta.validation.constraints.NotBlank;

@CheckPassword(message = "Password must same with Retype Password.")
public class Register {

    @NotBlank(message = "Username can't blank!")
    private String username;

    @NotBlank(message = "Password can't blank!")
    private String password;

    @NotBlank(message = "Retype Password can't blank!")
    private String retypePassword;

    public @NotBlank(message = "Username can't blank!") String getUsername() {
        return username;
    }

    public void setUsername(@NotBlank(message = "Username can't blank!") String username) {
        this.username = username;
    }

    public @NotBlank(message = "Password can't blank!") String getPassword() {
        return password;
    }

    public void setPassword(@NotBlank(message = "Password can't blank!") String password) {
        this.password = password;
    }

    public @NotBlank(message = "Retype Password can't blank!") String getRetypePassword() {
        return retypePassword;
    }

    public void setRetypePassword(@NotBlank(message = "Retype Password can't blank!") String retypePassword) {
        this.retypePassword = retypePassword;
    }

    @Override
    public String toString() {
        return "Register{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", retypePassword='" + retypePassword + '\'' +
                '}';
    }
}
