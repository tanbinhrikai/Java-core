package bai7;

import java.text.NumberFormat;
import java.util.Locale;

public final class Invoice {

    private final String invoiceId;
    private final String customer;
    private final double total;
    private final boolean paid;

    public Invoice(String invoiceId, String customer, double total, boolean paid) {
        if (total <= 0) {
            throw new IllegalArgumentException("Total must be greater than 0");
        }

        this.invoiceId = invoiceId;
        this.customer = customer;
        this.total = total;
        this.paid = paid;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public String getCustomer() {
        return customer;
    }

    public double getTotal() {
        return total;
    }

    public boolean isPaid() {
        return paid;
    }

    public Invoice withDiscount(double percent) {
        double newTotal = total - (total * percent / 100.0);
        return new Invoice(invoiceId, customer, newTotal, paid);
    }


}