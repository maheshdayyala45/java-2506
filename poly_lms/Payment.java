package poly_lms;

public interface Payment {

    // contract for processing payments
    public void processPayment(double amount);

    // contract for generating receipts
    public void generateReceipt(String transcationId);

}