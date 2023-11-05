package patterns.templatemethod;

public class OnlineOrderProcessor extends OrderProcessor {

  @Override
  public void verifyOrderDetails() {
    System.out.println("Verifying online order details...");
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
