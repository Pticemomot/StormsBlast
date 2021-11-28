package com.storms.blast.main.control;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import static com.storms.blast.main.Constant.BUTTON_SIDE;

abstract class AbstractButton {

    private Bitmap bitmap;

    private final int x;
    private final int y;

    public AbstractButton(Bitmap bitmap, int positionX, int positionY) {
        this.bitmap = bitmap;
        x = positionX;
        y = positionY;
    }

    public boolean isTouched(int touchX, int touchY){
        return ((touchX >= x)&&(touchX <= x + BUTTON_SIDE))&&((touchY >= y)&&(touchY <= y + BUTTON_SIDE));
    }

    public void draw(Canvas canvas){
        Paint paint = new Paint();
        Rect destination = new Rect(x, y, x+BUTTON_SIDE, y+BUTTON_SIDE);
        canvas.drawBitmap(bitmap, null, destination, paint);
    }
}
