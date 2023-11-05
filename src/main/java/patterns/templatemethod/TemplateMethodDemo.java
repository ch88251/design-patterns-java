package patterns.templatemethod;

public class TemplateMethodDemo {

    public static void main(String[] args) {
        // Process an online order
        OrderProcessor onlineOrderProcessor = new OnlineOrderProcessor();
        onlineOrderProcessor.processOrder();

        System.out.println("-----------------------------");

        // Process an in-store order
        OrderProcessor inStoreOrderProcessor = new InStoreOrderProcessor();
        inStoreOrderProcessor.processOrder();
    }
}
