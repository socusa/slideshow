package com.example.lynn.slideshow;

import android.view.MotionEvent;
import android.view.View;

import static com.example.lynn.slideshow.MainActivity.*;

public class MyListener implements View.OnTouchListener {
    public float startX;
    public float endX;

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
            startX = motionEvent.getRawX();
        } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
            endX = motionEvent.getRawX();

            if (endX < startX) {
                index--;
            } else if (endX > startX) {

            }
        }


        return (true);
    }

}
