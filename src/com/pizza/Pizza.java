package com.pizza;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pizza {

public enum Toppings {CHEESE , PANNEER , JALAPENOS, OLIVES,CORN };
final Set<Toppings> toppingSet;

abstract static class PizzaBuilder<T extends PizzaBuilder<T>>{

      EnumSet<Toppings> toppings = EnumSet.noneOf(Toppings.class);

      public T addTopping(Toppings topping){
          toppings.add(Objects.requireNonNull(topping));
          return self();
      }

      abstract Pizza build();
    /**
     * Overriding class needs to return the specific subtype class.
     * @return
     */
      abstract T self();
    }

    public Pizza(PizzaBuilder<?> builder){
    toppingSet = builder.toppings.clone();
    }

}
