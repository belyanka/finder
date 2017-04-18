package com.birb.finder.Shapes;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;

public class Shape {

    protected Path contour;
    protected Region touchArea;

    public void paint(Canvas canvas){}

    public boolean touchCheck(int x, int y){
        return touchArea.contains(x,y);
    }

}
