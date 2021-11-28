package com.storms.blast.main.entities;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

public class Wall {

    private Bitmap bitmap;
    private int frameWidth;
    private int frameHeight;

    private double x;
    private double y;

    public Wall(Bitmap bitmap, double positionX, double positionY, int height, int width) {
        this.bitmap = bitmap;
        x = positionX;
        y = positionY;
        this.frameWidth = width;
        this.frameHeight = height;
    }

    public void draw(Canvas canvas){
        Paint paint = new Paint();
        Rect destination = new Rect((int)x, (int)y, (int)(x+frameWidth), (int)(y+frameHeight));
        canvas.drawBitmap(bitmap, null, destination, paint);
    }

    public Rect getBoundingBoxRect(){
        return new Rect((int)(x), (int)(y), (int)(x+frameWidth), (int)(y+frameHeight));
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public int getFrameWidth() {
        return frameWidth;
    }

    public void setFrameWidth(int frameWidth) {
        this.frameWidth = frameWidth;
    }

    public int getFrameHeight() {
        return frameHeight;
    }

    public void setFrameHeight(int frameHeight) {
        this.frameHeight = frameHeight;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
