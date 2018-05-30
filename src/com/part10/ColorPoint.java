package com.part10;

public class ColorPoint extends Point {

    private String color;

    public ColorPoint(int x,int y, String color){
        super(x,y);
        this.color = color;
    }

    @Override
    public boolean equals(Object o){
        if(!(o instanceof Point)){
            return false;
        }
        if(!(o instanceof ColorPoint)){
            return super.equals(o);
        }
        return super.equals(o) &&  (((ColorPoint)o).color == color);
    }

}
