package com.example.pony.verifycode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;

/**
 * Created by Pony on 2016/5/9.
 */
public class Code {
    Code mCode;
    //defaultSetting
    private static final int DEFAULT_WIDTH = 160, DEFAULT_HEIGHT = 140;
    public Code getInstance(){
        if(null== mCode){
            mCode = new Code();
        }
        return mCode;
    }

    public Bitmap getBitMap(){
        //得到一个空白的bitmap
        Bitmap bitmap =Bitmap.createBitmap(DEFAULT_WIDTH,DEFAULT_HEIGHT, Bitmap.Config.ARGB_8888);
        Canvas  canvas = new Canvas(bitmap);
       canvas.drawColor(Color. RED);
        return bitmap;
    }
}
