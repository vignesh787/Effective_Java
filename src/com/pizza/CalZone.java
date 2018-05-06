package com.pizza;

public class CalZone extends Pizza {

    private final boolean sauzeInside;

    public static class Builder extends Pizza.PizzaBuilder<Builder>{

        private boolean suazeInside;

        public Builder sauzeInside(){
            suazeInside = true;
            return this;
        }

        @Override
        public CalZone build(){
            return new CalZone(this);
        }

        @Override
        Builder self() {
            return this;
        }
    }

    private CalZone(Builder builder){
        super(builder);
        sauzeInside = builder.suazeInside;
    }

}
