package com.birb.finder;


import com.birb.finder.Shapes.BeakShape;
import com.birb.finder.Shapes.BodyShape;

public class ShapeShifter {

    private BodyShape currentBodyShape;

    public ShapeShifter(){
        currentBodyShape=new BodyShape();
    }
    public BodyShape loadInitialBody(float unitX, float unitY, int offsetX, int offsetY){
        currentBodyShape.setContour(unitX,unitY,offsetX,offsetY);
        return currentBodyShape;
    }

    public BeakShape loadInitialBeak(){
        return new BeakShape();
    }

    public void setBodyType(int type){

    }

    public void setBeakType(int type){

    }
}
