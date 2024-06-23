package belajarjava.validation.core;

import belajarjava.validation.core.container.Data;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class SampleData {

    @NotNull
    private Data<@NotBlank @Size(min = 10) String> data;

    public @NotNull Data<@NotBlank @Size(min = 10) String> getData() {
        return data;
    }

    public void setData(@NotNull Data<@NotBlank @Size(min = 10) String> data) {
        this.data = data;
    }
}