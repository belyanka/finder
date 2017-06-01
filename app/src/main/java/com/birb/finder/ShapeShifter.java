package com.birb.finder;


import android.graphics.Path;
import android.graphics.PointF;

import com.birb.finder.Shapes.BeakShape;
import com.birb.finder.Shapes.BodyShape;
import com.birb.finder.Shapes.LegShape;

public class ShapeShifter {

    private BodyShape currentBodyShape;
    private BeakShape currentBeakShape;
    private LegShape currentLegShape;

    public ShapeShifter(){

        currentBodyShape=new BodyShape();
        currentBodyShape.setType(0);
        currentBeakShape=new BeakShape();
        currentBeakShape.setType(0);
        currentLegShape=new LegShape();
        currentLegShape.setType(0);
    }


    public void setBodyType(int type){
        this.currentBodyShape.setType(type);
    }

    public void setBeakType(int type){
        this.currentBeakShape.setType(type);
    }

    public void setLegType(int type){
        this.currentLegShape.setType(type);
    }

    public BodyShape getCurrentBodyShape(float unitX, float unitY, float offsetX, float offsetY){
        switch(currentBodyShape.getType()){
            case 0:
                PointF beakConnection0 = new PointF(12f,14f);
                PointF legConnection0 = new PointF(26f,26.7f);
                Path path0 = new Path();
                path0.moveTo(offsetX + unitX*13.5f, offsetY + unitY*17);
                path0.cubicTo(offsetX + unitX*9f, offsetY + unitY*12.5f,
                        offsetX + unitX*16f, offsetY + unitY*7.5f, offsetX + unitX*21.5f, offsetY + unitY*13f);
                path0.cubicTo(offsetX+unitX*27.5f,offsetY+unitY*14,offsetX+unitX*33.5f,offsetY+unitY*18,
                        offsetX+unitX*36.5f,offsetY+unitY*23.5f);
                path0.cubicTo(offsetX+unitX*25,offsetY+unitY*29.5f,offsetX+unitX*18.5f,offsetY+unitY*26,
                        offsetX+unitX*13.5f,offsetY+unitY*17);
                path0.addCircle(beakConnection0.x*unitX,beakConnection0.y*unitY,5, Path.Direction.CCW);
                //path0.addCircle(13.5f*unitX, 13.5f*unitY,6,Path.Direction.CCW);

                currentBodyShape.setContour(path0);
                currentBodyShape.setBeakConnection(beakConnection0);
                currentBodyShape.setLegConnection(legConnection0);
                break;
            case 1:
                PointF beakConnection1 = new PointF(4.5f,3.6f);
                Path path1 = new Path();
                path1.moveTo(offsetX + unitX*4.5f,offsetY+unitY*3.6f);
                path1.cubicTo(offsetX+unitX*4.5f,offsetY+unitY*3.6f,offsetX+unitX*4.7f,offsetY+unitY*0.9f,
                        offsetX+unitX*9f,offsetY+unitY*2.3f);
                path1.cubicTo(offsetX+unitX*11.3f,offsetY+unitY*4.6f,offsetX+unitX*11.6f,offsetY+unitY*8.9f,
                        offsetX+unitX*10f,offsetY+unitY*14f);
                path1.cubicTo(offsetX+unitX*8.9f,offsetY+unitY*17.3f,offsetX+unitX*3.7f,offsetY+unitY*19.6f,
                        offsetX+unitX*10.2f, offsetY+unitY*20.2f);
                path1.cubicTo(offsetX+unitX*19f,offsetY+unitY*18.3f,offsetX+unitX*22.6f,offsetY+unitY*23.9f,
                        offsetX+unitX*22.9f,offsetY+unitY*24.3f);
                path1.cubicTo(offsetX+unitX*26.5f,offsetY+unitY*29.7f,offsetX+unitX*20.9f,offsetY+unitY*29.7f,
                        offsetX+unitX*17.5f,offsetY+unitY*30f);
                path1.cubicTo(offsetX+unitX*11.4f,offsetY+unitY*29.9f,offsetX+unitX*4.8f,offsetY+unitY*27.9f,
                        offsetX+unitX*2.5f,offsetY+unitY*23.9f);
                path1.cubicTo(offsetX+unitX*0.2f,offsetY+unitY*19.5f,offsetX+unitX*2.3f,offsetY+unitY*17.4f,
                        offsetX+unitX*3.9f,offsetY+unitY*16.4f);
                path1.cubicTo(offsetX+unitX*4.1f,offsetY+unitY*16.3f,offsetX+unitX*10.5f,offsetY+unitY*12.1f,
                        offsetX+unitX*7.9f,offsetY+unitY*5.4f);
                path1.cubicTo(offsetX+unitX*7.6f,offsetY+unitY*4.4f,offsetX+unitX*4.9f,offsetY+unitY*6.2f,
                        offsetX+unitX*4.5f,offsetY+unitY*3.6f);
                path1.addCircle(beakConnection1.x*unitX,beakConnection1.y*unitY,5, Path.Direction.CCW);

                currentBodyShape.setContour(path1);
                currentBodyShape.setBeakConnection(beakConnection1);
                break;
        }
        return currentBodyShape;
    }

    public BeakShape getCurrentBeakShape(float unitX, float unitY, float bodyX, float bodyY){
        switch (currentBeakShape.getType()){
            case 0:
                PointF connectionPoint = new PointF(3.4f, 1f);
                Path path0 = new Path();
                float offsetX = bodyX - connectionPoint.x * unitX;
                float offsetY = bodyY - connectionPoint.y * unitY;
                path0.moveTo(offsetX + unitX * 3.7f, offsetY + unitY * 0.2f);
                path0.cubicTo(offsetX + unitX * 2.5f, offsetY + unitY * 0.1f,
                        offsetX + unitX * 1.3f, offsetY + unitY * 0.9f, offsetX + unitX * 0.3f, offsetY + unitY * 1.5f);
                path0.cubicTo(offsetX + unitX * 1.6f, offsetY + unitY * 1.9f,
                        offsetX + unitX * 2.2f, offsetY + unitY * 2.1f, offsetX + unitX * 3.7f, offsetY + unitY * 2.5f);
                path0.addCircle(offsetX, offsetY, 5, Path.Direction.CCW);

                currentBeakShape.setContour(path0);
                currentBeakShape.setConnectionPoint(connectionPoint);
                break;
        }

        return currentBeakShape;
    }

    public LegShape getCurrentLegShape(float unitX, float unitY, float bodyX, float bodyY){
        switch (currentLegShape.getType()){
            case 0:
                PointF connectionPoint = new PointF(3.3f,0.8f);
                Path path0 = new Path();
                float offsetX = bodyX - connectionPoint.x * unitX;
                float offsetY = bodyY - connectionPoint.y * unitY;
                path0.moveTo(offsetX + unitX*1.8f,offsetY+unitY*0.8f);
                path0.cubicTo(offsetX+unitX*2f,offsetY+unitY*2.8f,offsetX+unitX*4f,offsetY+unitY*4.5f,
                        offsetX+unitX*5f,offsetY+unitY*0.6f);
                path0.moveTo(offsetX + unitX*3f,offsetY+unitY*3f);
                path0.cubicTo(offsetX+unitX*3.3f,offsetY+unitY*5.8f,offsetX+unitX*3.5f,offsetY+unitY*4.7f,
                        offsetX+unitX*3.4f,offsetY+unitY*6.1f);
                path0.cubicTo(offsetX+unitX*2f,offsetY+unitY*6.7f,offsetX+unitX*0.4f,offsetY+unitY*6.4f,
                        offsetX+unitX*0.5f,offsetY+unitY*6.9f);
                path0.moveTo(offsetX+unitX*3.4f,offsetY+unitY*6.1f);
                path0.cubicTo(offsetX+unitX*2.7f,offsetY+unitY*7.4f,offsetX+unitX*1.6f,offsetY+unitY*7.5f,
                        offsetX+unitX*1.7f,offsetY+unitY*8.2f);
                path0.moveTo(offsetX+unitX*3.4f,offsetY+unitY*6.1f);
                path0.cubicTo(offsetX+unitX*3.2f,offsetY+unitY*6.9f,offsetX+unitX*3.9f,offsetY+unitY*7.6f,
                        offsetX+unitX*3.6f,offsetY+unitY*8f);
                path0.moveTo(offsetX+unitX*4.3f,offsetY+unitY*6f);
                path0.cubicTo(offsetX+unitX*4.3f,offsetY+unitY*5.7f,offsetX+unitX*4.1f,offsetY+unitY*6.3f,
                        offsetX+unitX*3.4f,offsetY+unitY*6.2f);
                path0.lineTo(offsetX+unitX*3.7f,offsetY+unitY*3f);

                currentLegShape.setConnectionPoint(connectionPoint);
                currentLegShape.setContour(path0);
                break;
        }
        return currentLegShape;
    }
}
