package belajarjava.validation.core;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.LuhnCheck;
import org.hibernate.validator.constraints.Range;

public class Payment {

    @NotBlank(message = "Order ID must not blank!")
    private String orderId;

    @NotNull(message = "Amount must not null!")
    @Range(min = 10_000L, max = 100_000_000L, message = "Amount must between 10.000 and 100.000.000")
    private Long amount;

    @NotBlank(message = "Credit Card must not blank!")
    @LuhnCheck(message = "Invalid Credit Card number!")
    private  String creditCard;

    public @NotBlank(message = "Order ID must not blank!") String getOrderId() {
        return orderId;
    }

    public void setOrderId(@NotBlank(message = "Order ID must not blank!") String orderId) {
        this.orderId = orderId;
    }

    public @NotNull(message = "Amount must not null!") @Range(min = 10_000L, max = 100_000_000L, message = "Amount must between 10.000 and 100.000.000") Long getAmount() {
        return amount;
    }

    public void setAmount(@NotNull(message = "Amount must not null!") @Range(min = 10_000L, max = 100_000_000L, message = "Amount must between 10.000 and 100.000.000") Long amount) {
        this.amount = amount;
    }

    public @NotBlank(message = "Credit Card must not blank!") @LuhnCheck(message = "Invalid Credit Card number!") String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(@NotBlank(message = "Credit Card must not blank!") @LuhnCheck(message = "Invalid Credit Card number!") String creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "orderId='" + orderId + '\'' +
                ", amount=" + amount +
                ", creditCard='" + creditCard + '\'' +
                '}';
    }
}
