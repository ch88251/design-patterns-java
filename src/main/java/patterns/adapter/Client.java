package patterns.adapter;

public class Client {

  public static void main(String[] args) {
    OldCoffeeMachine oldCoffeeMachine = new OldCoffeeMachine();
    CoffeeMachineInterface cmi = new CoffeeTouchScreenAdapter(oldCoffeeMachine);
    cmi.chooseFirstSelection();
    cmi.chooseSecondSelection();
  }

}