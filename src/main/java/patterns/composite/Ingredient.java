package patterns.composite;

import java.math.BigDecimal;

public class Ingredient implements Component {

  private String name;
  private BigDecimal cost;

  public Ingredient(String name, BigDecimal cost) {
    this.name = name;
    this.cost = cost;
  }

  @Override
  public BigDecimal getCost() {
    return cost;
  }

}
