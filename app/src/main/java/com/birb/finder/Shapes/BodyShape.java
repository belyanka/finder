package com.birb.finder.Shapes;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;

public class BodyShape extends Shape {

    private PointF beakConnection = new PointF(12f,14f);

    @Override
    public void paint(Canvas canvas){
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);
        canvas.drawPath(contour,paint);
    }

    public void setContour(float unitX, float unitY, int offsetX, int offsetY){
        this.contour = new Path();
        this.contour.moveTo(offsetX + unitX*13.5f, offsetY + unitY*17);
        this.contour.cubicTo((float)offsetX + unitX*9, (float)offsetY + unitY*12.5f,
                (float)offsetX + unitX*16f, (float)offsetY + unitY*7.5f, (float)offsetX + unitX*21.5f, (float)offsetY + unitY*13);
        this.contour.cubicTo(offsetX+unitX*27.5f,offsetY+unitY*14,offsetX+unitX*33.5f,offsetY+unitY*18,
                offsetX+unitX*36.5f,offsetY+unitY*23.5f);
        this.contour.cubicTo(offsetX+unitX*25,offsetY+unitY*29.5f,offsetX+unitX*18.5f,offsetY+unitY*26,
                offsetX+unitX*13.5f,offsetY+unitY*17);
        this.contour.addCircle(beakConnection.x*unitX,beakConnection.y*unitY,5, Path.Direction.CCW);
        this.contour.addCircle(13.5f*unitX, 13.5f*unitY,6,Path.Direction.CCW);
    }

    public void setTexture(){

    }

    public PointF getBeakConnection(){
        return beakConnection;
    }
}
