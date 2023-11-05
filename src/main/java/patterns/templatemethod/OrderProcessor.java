package patterns.templatemethod;

public abstract class OrderProcessor {

  abstract void verifyOrderDetails();
  abstract void processPayment();
  abstract void shipOrder();

  // Template method
  public final void processOrder() {
    verifyOrderDetails();
    processPayment();
    shipOrder();
    System.out.println("Order processing completed.");
  }
}
