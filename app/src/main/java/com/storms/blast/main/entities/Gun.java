package com.storms.blast.main.entities;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;

import com.storms.blast.main.MainActivity;

import static com.storms.blast.main.Constant.GUN_SIDE;
import static com.storms.blast.main.Constant.PLAYER_X;
import static com.storms.blast.main.Constant.PLAYER_Y;

public class Gun {

    private Bitmap bitmap;
    private int frameWidth;
    private int frameHeight;

    private double x;
    private double y;
    private int angle;

    private Storm storm;

    public Gun(Bitmap bitmap) {
        this.bitmap = bitmap;
        x = (int)(PLAYER_X/2 - GUN_SIDE);
        y = (int)(PLAYER_Y + GUN_SIDE/2);
        this.frameWidth = GUN_SIDE;
        this.frameHeight = GUN_SIDE;
    }

    public void update(int x){
        bitmap = rotateGun(bitmap, angle);
        this.x = (int)(x + GUN_SIDE/2);
    }

    public void draw(Canvas canvas){
        Paint paint = new Paint();
        Rect destination = new Rect((int)x, (int)y, (int)(x+frameWidth), (int)(y+frameHeight));
        canvas.drawBitmap(bitmap, null, destination, paint);
    }//рисует

    private Bitmap rotateGun(Bitmap source, float angle)
    {
        Matrix matrix = new Matrix();
        matrix.postRotate(angle);
        return Bitmap.createBitmap(source, 0, 0, source.getWidth(), source.getHeight(), matrix, true);
    } //поворачивает пушку но уменьшает из-за того, что у квадрата высота и ширина при повороте чуть уменьшаются

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

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }
}