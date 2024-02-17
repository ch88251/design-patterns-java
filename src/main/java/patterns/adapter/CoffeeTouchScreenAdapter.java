package patterns.adapter;

public class CoffeeTouchScreenAdapter implements CoffeeMachineInterface {

  private OldCoffeeMachine coffeeMachine;

  public CoffeeTouchScreenAdapter(OldCoffeeMachine coffeeMachine) {
    this.coffeeMachine = coffeeMachine;
  }

  public void chooseFirstSelection() {
    coffeeMachine.selectA();
  }

  public void chooseSecondSelection() {
    coffeeMachine.selectB();
  }

}