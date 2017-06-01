package com.birb.finder.Shapes;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;

public class LegShape extends Shape{
    private PointF connectionPoint;

    @Override
    public void paint(Canvas canvas) {
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);
        canvas.drawPath(contour, paint);
    }

    public void setContour(Path path) {
        this.contour = path;
    }

    public void setConnectionPoint(PointF point) {
        this.connectionPoint = point;
    }
}
