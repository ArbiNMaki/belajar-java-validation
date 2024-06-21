package belajarjava.validation.core;

import belajarjava.validation.core.constraint.CheckOrderId;
import belajarjava.validation.core.group.CreditCardPaymentGroup;
import belajarjava.validation.core.group.VirtualAccountPaymentGroup;
import belajarjava.validation.core.payload.EmailErrorPayload;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.groups.ConvertGroup;
import jakarta.validation.groups.Default;
import org.hibernate.validator.constraints.LuhnCheck;
import org.hibernate.validator.constraints.Range;

public class Payment {

    @CheckOrderId(message = "{order.id.invalid}",
            groups = {CreditCardPaymentGroup.class, VirtualAccountPaymentGroup.class})
    private String orderId;

    @NotNull(message = "Amount must not null!", groups = {CreditCardPaymentGroup.class, VirtualAccountPaymentGroup.class})
    @Range(min = 10_000L, max = 100_000_000L, message = "{order.amount.range}", groups = {CreditCardPaymentGroup.class, VirtualAccountPaymentGroup.class})
    private Long amount;

    @NotBlank(message = "Credit Card must not blank!", groups = {CreditCardPaymentGroup.class})
    @LuhnCheck(message = "Invalid Credit Card number!", groups = {CreditCardPaymentGroup.class}, payload = {EmailErrorPayload.class})
    private  String creditCard;

    @NotBlank(message = "Virtual Account must not blank!", groups = {VirtualAccountPaymentGroup.class})
    private String virtualAccount;

    @Valid
    @NotNull(message = "Customer can't null!", groups = {
            VirtualAccountPaymentGroup.class, CreditCardPaymentGroup.class
    })
    @ConvertGroup(from = CreditCardPaymentGroup.class, to = Default.class)
    @ConvertGroup(from = VirtualAccountPaymentGroup.class, to = Default.class)
    private Customer customer;

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

    public @NotBlank(message = "Virtual Account must not blank!", groups = {VirtualAccountPaymentGroup.class}) String getVirtualAccount() {
        return virtualAccount;
    }

    public void setVirtualAccount(@NotBlank(message = "Virtual Account must not blank!", groups = {VirtualAccountPaymentGroup.class}) String virtualAccount) {
        this.virtualAccount = virtualAccount;
    }

    public @Valid @NotNull(message = "Customer can't null!", groups = {
            VirtualAccountPaymentGroup.class, CreditCardPaymentGroup.class
    }) Customer getCustomer() {
        return customer;
    }

    public void setCustomer(@Valid @NotNull(message = "Customer can't null!", groups = {
            VirtualAccountPaymentGroup.class, CreditCardPaymentGroup.class
    }) Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "orderId='" + orderId + '\'' +
                ", amount=" + amount +
                ", creditCard='" + creditCard + '\'' +
                ", virtualAccount='" + virtualAccount + '\'' +
                ", customer=" + customer +
                '}';
    }
}
