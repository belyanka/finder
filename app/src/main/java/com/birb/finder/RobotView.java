package com.birb.finder;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class RobotView extends View {

    private final int paintColor = Color.BLACK;
    private Path path;
    private RectF mPieBounds = new RectF();
    private Paint mPiePaint;

    public RobotView(Context context){
        super(context);
    }

    public RobotView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.GREEN);
        canvas.drawRect(mPieBounds,mPiePaint);

        mPiePaint.setColor(Color.WHITE);
        path.moveTo(130, 180);
        path.cubicTo(70, 150, 110, 110, 160, 120);
        canvas.drawPath(path,mPiePaint);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);

        // Account for padding
        float xpad = (float)(getPaddingLeft() + getPaddingRight());
        float ypad = (float)(getPaddingTop() + getPaddingBottom());

        float ww = (float)w - xpad;
        float hh = (float)h - ypad;

        float diameter = Math.min(ww, hh);

        mPieBounds = new RectF(
                0.0f,
                0.0f,
                diameter,
                diameter);
        //mPieBounds.offsetTo(getPaddingLeft(), getPaddingTop());


    }

    private void init(){

        path = new Path();
        mPiePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPiePaint.setStyle(Paint.Style.STROKE);
        mPiePaint.setColor(paintColor);
        mPiePaint.setStrokeWidth(3);

    }
}
