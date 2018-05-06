package com.pizza;

import java.util.Objects;

public class NyPizza extends Pizza{

    public enum Size {SMALL, MEDIUM , LARGE};
    private final Size size;

    public static class Builder extends Pizza.PizzaBuilder<Builder>{

        private final Size size;

        public  Builder (Size size){
            this.size = Objects.requireNonNull(size);
        }

        @Override
        public NyPizza build(){
            return new NyPizza(this);
        }

        @Override
        Builder self() {
            return this;
        }
    }

    private NyPizza(Builder builder){
        super(builder);
        size= builder.size;
    }




}

