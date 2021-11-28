package com.storms.blast.main;

import static com.storms.blast.main.MainActivity.screenHeight;
import static com.storms.blast.main.MainActivity.screenWidth;

public class Constant {
    public static final int PLAYER_HEIGHT = (int) adaptiveVar(512);
    public static final int PLAYER_WIDTH = (int) adaptiveVar(512);
    public static final int BUTTON_SIDE = (int) adaptiveVar(256);
    public static final int PLAYER_Y = (int) adaptiveVar(800);
    public static final int PLAYER_X = (int) adaptiveVar(256);
    public static final int GUN_SIDE = (int) adaptiveVar(256);
    public static final int WALL_X = (int)(screenWidth/2 - (int)adaptiveVar(128));
    public static final int WALL_Y = (int)(adaptiveVar(512));
    public static final int WALL_HEIGHT = screenHeight;
    public static final int WALL_WIDTH = (int) adaptiveVar(128);
    public static final int BUTTON_LEFT_X = (int)adaptiveVar(2000);
    public static final int BUTTON_LEFT_Y = (int)(adaptiveVar(1164));
    public static final int BUTTON_RIGHT_X = (int)adaptiveVar(2552);
    public static final int BUTTON_RIGHT_Y = (int)(adaptiveVar(1164));
    public static final int BUTTON_UP_X = (int)adaptiveVar(2276);
    public static final int BUTTON_UP_Y = (int)(adaptiveVar(1164));
    public static final int BUTTON_DOWN_X = (int)adaptiveVar(2276);
    public static final int BUTTON_DOWN_Y = (int)(adaptiveVar(888));
    //все эти числа - пиксели для экрана с разрешением 1440 на 2701, но преобразованные для др. экранов

    public static double adaptiveVar(double var) {
        return screenHeight/(1440/var);
    }//функция, которая преобразует все числа в отношение базового экрана и текущего
}
