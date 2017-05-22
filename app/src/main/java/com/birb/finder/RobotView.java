package com.birb.finder;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

import com.birb.finder.Shapes.BeakShape;
import com.birb.finder.Shapes.BodyShape;

public class RobotView extends View {

    private RectF mBounds = new RectF();
    private ShapeShifter shapeShifter;
    private BodyShape shape;
    private BeakShape beak;

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
        //canvas.drawColor(Color.WHITE);

        float unitX = mBounds.width()/50;
        float unitY = mBounds.height()/50;
        float offsetX = 10*unitX;
        float offsetY = 5*unitY;

        shape = this.shapeShifter.getCurrentBodyShape(unitX,unitY,offsetX,offsetY);
        shape.paint(canvas);

        beak=this.shapeShifter.getCurrentBeakShape(unitX,unitY,shape.getBeakConnection().x*unitX + offsetX, shape.getBeakConnection().y*unitY + offsetY);
        beak.paint(canvas);
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

        mBounds = new RectF(
                0.0f,
                0.0f,
                diameter,
                diameter);
        //mBounds.offsetTo(getPaddingLeft(), getPaddingTop());
    }

    private void init(){
        this.shapeShifter=new ShapeShifter();
    }

    public void changeBodyType(int typeId){
        this.shapeShifter.setBodyType(typeId);
        this.invalidate();
    }

    public void changeBeakType(int typeId){
        this.shapeShifter.setBeakType(typeId);
        this.invalidate();
    }
}
