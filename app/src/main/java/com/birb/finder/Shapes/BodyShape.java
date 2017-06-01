package com.birb.finder.Shapes;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;

public class BodyShape extends Shape {

    private PointF beakConnection;
    private PointF legConnection;

    @Override
    public void paint(Canvas canvas){
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);
        canvas.drawPath(contour,paint);
    }

    public void setContour(Path path){
        this.contour = path;
    }

    public void setTexture(){

    }

    public PointF getBeakConnection(){
        return beakConnection;
    }

    public void setBeakConnection(PointF point){
        this.beakConnection=point;
    }

    public PointF getLegConnection() {
        return legConnection;
    }

    public void setLegConnection(PointF point){
        this.legConnection=point;
    }


}
