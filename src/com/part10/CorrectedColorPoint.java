package com.part10;

public class CorrectedColorPoint {

    private final Point point;
    private final String color;

    public CorrectedColorPoint(int x, int y, String color){
       point = new Point(x,y);
       this.color = color;
    }

    /**
     * Returns point view of color point
     * @return
     */
    public Point asPoint(){
        return this.point;
    }

    @Override
    public boolean equals(Object o){
        if(!(o instanceof CorrectedColorPoint)){
            return false;
        }

        CorrectedColorPoint ccp = (CorrectedColorPoint)o;
        return (ccp.point.equals(this.point)) && (ccp.color.equals(this.color));

    }

}
