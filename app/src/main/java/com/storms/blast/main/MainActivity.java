package com.storms.blast.main;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.Window;

public class MainActivity extends Activity {

    Game game;
    public static int screenWidth;
    public static int screenHeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //уберает верхную панель
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        screenWidth = size.x;
        screenHeight = size.y;
        //определил размеры экрана
        game = new Game(this);
        setContentView(game);
    }
}