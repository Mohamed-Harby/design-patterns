package patterns.behavioral;


/**
 * The Chain of Responsibility is a behavioral design pattern that allows
 * multiple objects to handle a request without coupling the sender
 * to a specific handler. The request passes through a chain of potential
 * handlers, and each handler decides either to process the request
 * or pass it to the next handler.
 */

/**
 * Key Components:
 * 1. Handler Interface/Abstract Class: Defines a method to handle the request and a reference to the next handler.
 * 2. Concrete Handlers: Implement the handling logic and decide whether to pass the request to the next handler.
 * 3. Client: Initiates the request, which is processed by the chain of handlers.
 */



abstract class PaymentHandler {
    protected PaymentHandler successor; // hidden from the world except its subclasses.

    public void setSuccessor(PaymentHandler successor) {
        this.successor = successor;
    }

    public abstract void handlePayment(double amount);
}


// Concrete Handlers
class CreditCardHandler extends PaymentHandler {
    private boolean isAvailable = false; // Simulate credit card availability

    @Override
    public void handlePayment(double amount) {
        if (isAvailable) {
            System.out.println("Payment of $" + amount + " processed through Credit Card.");
        } else if (successor != null) {
            successor.handlePayment(amount);
        } else {
            System.out.println("Payment failed. No available methods.");
        }
    }
}

class PayPalHandler extends PaymentHandler {
    private boolean isAvailable = false; // Simulate PayPal unavailability

    @Override
    public void handlePayment(double amount) {
        if (isAvailable) {
            System.out.println("Payment of $" + amount + " processed through PayPal.");
        } else if (successor != null) {
            successor.handlePayment(amount);
        } else {
            System.out.println("Payment failed. No available methods.");
        }
    }
}

class CryptoHandler extends PaymentHandler {
    private boolean isAvailable = true; // Simulate crypto availability

    @Override
    public void handlePayment(double amount) {
        if (isAvailable) {
            System.out.println("Payment of $" + amount + " processed through Cryptocurrency.");
        } else if (successor != null) {
            successor.handlePayment(amount);
        } else {
            System.out.println("Payment failed. No available methods.");
        }
    }
}

public class ChainOfResponsibility {
    public static void main(String[] args) {
        // Create payment handlers
        PaymentHandler creditCardHandler = new CreditCardHandler();
        PaymentHandler payPalHandler = new PayPalHandler();
        PaymentHandler cryptoHandler = new CryptoHandler();


        // Build the chain
        creditCardHandler.setSuccessor(payPalHandler);
        payPalHandler.setSuccessor(cryptoHandler);

        // Try to process a payment
        double paymentAmount = 100.00;
        creditCardHandler.handlePayment(paymentAmount);
    }
}


/**
 * Advantages:
 * Decouples Sender and Receiver: The client doesn't need to know which handler will process the request.
 * Flexible Chains: You can dynamically change the chain structure by reordering or adding handlers.
 * Open/Closed Principle: New handlers can be added without modifying existing ones.
 * =====================================================
 * Use Cases:
 * Logging systems with different levels (INFO, DEBUG, ERROR).
 * Validation pipelines where each step validates different aspects of a request.
 * Authorization systems where different roles have different permissions.
 */




