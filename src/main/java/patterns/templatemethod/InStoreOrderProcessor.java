package patterns.templatemethod;

public class InStoreOrderProcessor extends OrderProcessor {

  @Override
  public void verifyOrderDetails() {
    System.out.println("Verifying in-store order details...");
  }

  @Override
  public void processPayment() {
    System.out.println("Processing payment...");
  }

  @Override
  public void shipOrder() {
    System.out.println("Shipping order...");
  }

}
