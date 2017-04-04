package com.birb.finder;


import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;

public class BeakShape extends Shape {

    @Override
    public void paint(Canvas canvas) {
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);
        canvas.drawPath(contour,paint);
    }

    public void setContour(float unitX, float unitY, int offsetX, int offsetY){
        this.contour = new Path();
        this.contour.moveTo(offsetX+unitX*3.7f,offsetY+unitY*0.2f);
        this.contour.cubicTo(offsetX+unitX*2.5f,offsetY+unitY*0.1f,
                offsetX+unitX*1.3f, offsetY+unitY*0.9f, offsetX+unitX*0.3f, offsetY+unitY*1.5f);
        this.contour.cubicTo(offsetX+unitX*1.6f,offsetY+unitY*1.9f,
                offsetX+unitX*2.2f,offsetY+unitY*2.1f,offsetX+unitX*3.7f,offsetY+unitY*2.5f);
    }
}
