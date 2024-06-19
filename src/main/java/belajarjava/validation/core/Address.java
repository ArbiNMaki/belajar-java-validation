package belajarjava.validation.core;

import jakarta.validation.constraints.NotBlank;

public class Address {

    @NotBlank(message = "Street Can't Blank!")
    private String street;

    @NotBlank(message = "City Can't Blank!")
    private String city;

    @NotBlank(message = "Country Can't Blank!")
    private String country;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
